package com.example.ui.screens

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.animateColorAsState
import androidx.compose.animation.core.RepeatMode
import androidx.compose.animation.core.animateFloat
import androidx.compose.animation.core.infiniteRepeatable
import androidx.compose.animation.core.rememberInfiniteTransition
import androidx.compose.animation.core.tween
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.animation.scaleIn
import androidx.compose.animation.scaleOut
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.gestures.detectTapGestures
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Bookmark
import androidx.compose.material.icons.filled.BookmarkBorder
import androidx.compose.material.icons.filled.ChatBubbleOutline
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material.icons.filled.GraphicEq
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material.icons.filled.KeyboardArrowUp
import androidx.compose.material.icons.filled.MusicNote
import androidx.compose.material.icons.filled.Pause
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.FilterChip
import androidx.compose.material3.FilterChipDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateMapOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.data.CulturalRepository
import com.example.data.ReelItem
import com.example.ui.theme.CreamBackground
import com.example.ui.theme.DeepCharcoal
import com.example.ui.theme.MustardYellow
import com.example.ui.theme.PeacockGreen
import com.example.ui.theme.RoyalRed
import com.example.ui.theme.SaffronOrange

@OptIn(ExperimentalLayoutApi::class)
@Composable
fun ReelsScreen(
    onShareReel: (String) -> Unit,
    modifier: Modifier = Modifier
) {
    val reels = remember { CulturalRepository.sampleReels }
    var currentReelIndex by remember { mutableIntStateOf(0) }
    var selectedCategory by remember { mutableStateOf("All") }

    val categories = listOf("All", "Rituals", "Dance", "Food", "Preservation")

    val filteredReels = remember(selectedCategory) {
        if (selectedCategory == "All") reels else reels.filter { it.category.equals(selectedCategory, true) }
    }

    // Likes state map
    val likesMap = remember { mutableStateMapOf<String, Boolean>() }
    val savedMap = remember { mutableStateMapOf<String, Boolean>() }
    var isPlaying by remember { mutableStateOf(true) }
    var showBigHeart by remember { mutableStateOf(false) }

    val currentReel = if (filteredReels.isNotEmpty()) filteredReels[currentReelIndex % filteredReels.size] else reels[0]

    // Audio animation equalizer
    val infiniteTransition = rememberInfiniteTransition(label = "audio_eq")
    val waveHeight by infiniteTransition.animateFloat(
        initialValue = 0.6f,
        targetValue = 1.3f,
        animationSpec = infiniteRepeatable(
            animation = tween(600),
            repeatMode = RepeatMode.Reverse
        ),
        label = "wave"
    )

    Column(
        modifier = modifier
            .fillMaxSize()
            .background(Color.Black)
            .testTag("screen_reels")
    ) {
        // Category Filter Header
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .horizontalScroll(rememberScrollState())
                .padding(horizontal = 16.dp, vertical = 8.dp),
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            categories.forEach { cat ->
                val isSelected = selectedCategory == cat
                FilterChip(
                    selected = isSelected,
                    onClick = {
                        selectedCategory = cat
                        currentReelIndex = 0
                    },
                    label = {
                        Text(
                            text = cat,
                            color = if (isSelected) Color.White else Color.White.copy(alpha = 0.8f),
                            fontSize = 12.sp
                        )
                    },
                    colors = FilterChipDefaults.filterChipColors(
                        selectedContainerColor = SaffronOrange,
                        containerColor = Color.White.copy(alpha = 0.15f)
                    )
                )
            }
        }

        // Active Reel Video Card (Simulated Player)
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f)
                .padding(horizontal = 12.dp, vertical = 4.dp)
                .clip(RoundedCornerShape(20.dp))
                .background(
                    Brush.verticalGradient(
                        colors = listOf(
                            Color(currentReel.bgGradientColorHex),
                            Color.Black
                        )
                    )
                )
                .pointerInput(Unit) {
                    detectTapGestures(
                        onDoubleTap = {
                            likesMap[currentReel.id] = true
                            showBigHeart = true
                        },
                        onTap = {
                            isPlaying = !isPlaying
                        }
                    )
                }
                .testTag("reel_card_${currentReel.id}")
        ) {
            // Simulated video content graphics
            Column(
                modifier = Modifier
                    .align(Alignment.Center)
                    .padding(24.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Surface(
                    shape = CircleShape,
                    color = Color.White.copy(alpha = 0.15f),
                    modifier = Modifier.size(90.dp)
                ) {
                    Box(contentAlignment = Alignment.Center) {
                        Text(currentReel.creatorAvatar, fontSize = 42.sp)
                    }
                }
                Spacer(Modifier.height(14.dp))
                Text(
                    text = currentReel.title,
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.White,
                    textAlign = androidx.compose.ui.text.style.TextAlign.Center
                )
                Spacer(Modifier.height(8.dp))
                Surface(
                    shape = RoundedCornerShape(20.dp),
                    color = Color.White.copy(alpha = 0.2f)
                ) {
                    Row(
                        modifier = Modifier.padding(horizontal = 12.dp, vertical = 6.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Icon(
                            Icons.Default.GraphicEq,
                            contentDescription = null,
                            tint = MustardYellow,
                            modifier = Modifier.size(18.dp).scale(if (isPlaying) waveHeight else 1f)
                        )
                        Spacer(Modifier.width(6.dp))
                        Text(
                            text = "Original Audio • Folk Heritage Track",
                            fontSize = 12.sp,
                            color = Color.White,
                            fontWeight = FontWeight.Medium
                        )
                    }
                }
            }

            // Big heart double-tap animation
            androidx.compose.animation.AnimatedVisibility(
                visible = showBigHeart,
                enter = scaleIn() + fadeIn(),
                exit = scaleOut() + fadeOut(),
                modifier = Modifier.align(Alignment.Center)
            ) {
                Icon(
                    Icons.Default.Favorite,
                    contentDescription = null,
                    tint = RoyalRed,
                    modifier = Modifier.size(100.dp)
                )
            }

            // Right Action Controls (Like, Comment, Save, Share)
            val isLiked = likesMap[currentReel.id] ?: false
            val isSaved = savedMap[currentReel.id] ?: false

            Column(
                modifier = Modifier
                    .align(Alignment.BottomEnd)
                    .padding(end = 16.dp, bottom = 24.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.spacedBy(16.dp)
            ) {
                // Like Button
                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    IconButton(
                        onClick = {
                            likesMap[currentReel.id] = !isLiked
                        },
                        modifier = Modifier
                            .background(Color.Black.copy(alpha = 0.4f), CircleShape)
                            .size(46.dp)
                            .testTag("btn_like_reel")
                    ) {
                        Icon(
                            if (isLiked) Icons.Default.Favorite else Icons.Default.FavoriteBorder,
                            contentDescription = "Like",
                            tint = if (isLiked) RoyalRed else Color.White,
                            modifier = Modifier.size(24.dp)
                        )
                    }
                    Text(
                        text = "${currentReel.likesCount + if (isLiked) 1 else 0}",
                        fontSize = 12.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color.White
                    )
                }

                // Comment Button
                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    IconButton(
                        onClick = { /* Comments dialog */ },
                        modifier = Modifier
                            .background(Color.Black.copy(alpha = 0.4f), CircleShape)
                            .size(46.dp)
                    ) {
                        Icon(Icons.Default.ChatBubbleOutline, contentDescription = "Comment", tint = Color.White, modifier = Modifier.size(22.dp))
                    }
                    Text(
                        text = "${currentReel.commentsCount}",
                        fontSize = 12.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color.White
                    )
                }

                // Save Bookmark
                IconButton(
                    onClick = { savedMap[currentReel.id] = !isSaved },
                    modifier = Modifier
                        .background(Color.Black.copy(alpha = 0.4f), CircleShape)
                        .size(46.dp)
                        .testTag("btn_bookmark_reel")
                ) {
                    Icon(
                        if (isSaved) Icons.Default.Bookmark else Icons.Default.BookmarkBorder,
                        contentDescription = "Save",
                        tint = if (isSaved) MustardYellow else Color.White,
                        modifier = Modifier.size(22.dp)
                    )
                }

                // Share Button
                IconButton(
                    onClick = { onShareReel(currentReel.title) },
                    modifier = Modifier
                        .background(Color.Black.copy(alpha = 0.4f), CircleShape)
                        .size(46.dp)
                ) {
                    Icon(Icons.Default.Share, contentDescription = "Share", tint = Color.White, modifier = Modifier.size(22.dp))
                }
            }

            // Bottom Reel Metadata
            Column(
                modifier = Modifier
                    .align(Alignment.BottomStart)
                    .fillMaxWidth(0.8f)
                    .padding(start = 16.dp, bottom = 20.dp),
                verticalArrangement = Arrangement.spacedBy(6.dp)
            ) {
                // Creator pill
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Text(
                        text = "@${currentReel.creator}",
                        fontSize = 14.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color.White
                    )
                    Spacer(Modifier.width(6.dp))
                    Surface(
                        shape = RoundedCornerShape(4.dp),
                        color = SaffronOrange
                    ) {
                        Text(
                            text = "🇮🇳 Keeper",
                            fontSize = 10.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color.White,
                            modifier = Modifier.padding(horizontal = 4.dp, vertical = 2.dp)
                        )
                    }
                }

                // Location tag
                Surface(
                    shape = RoundedCornerShape(8.dp),
                    color = Color.Black.copy(alpha = 0.45f)
                ) {
                    Text(
                        text = "📍 ${currentReel.location}, ${currentReel.state}",
                        fontSize = 11.sp,
                        fontWeight = FontWeight.Medium,
                        color = MustardYellow,
                        modifier = Modifier.padding(horizontal = 8.dp, vertical = 4.dp)
                    )
                }

                // Caption
                Text(
                    text = currentReel.caption,
                    fontSize = 12.sp,
                    color = Color.White,
                    lineHeight = 18.sp
                )

                // Hashtags
                FlowRow(horizontalArrangement = Arrangement.spacedBy(6.dp)) {
                    currentReel.hashtags.forEach { tag ->
                        Text(
                            text = tag,
                            fontSize = 11.sp,
                            fontWeight = FontWeight.SemiBold,
                            color = Color(0xFF93C5FD)
                        )
                    }
                }
            }
        }

        // Reel Switcher Bar (Previous / Next)
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp, vertical = 8.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            IconButton(
                onClick = {
                    if (currentReelIndex > 0) currentReelIndex--
                    showBigHeart = false
                },
                enabled = currentReelIndex > 0,
                modifier = Modifier
                    .background(Color.White.copy(alpha = 0.15f), CircleShape)
                    .testTag("btn_prev_reel")
            ) {
                Icon(Icons.Default.KeyboardArrowUp, contentDescription = "Previous Reel", tint = Color.White)
            }

            Text(
                text = "${(currentReelIndex % filteredReels.size) + 1} of ${filteredReels.size} Cultural Reels",
                fontSize = 12.sp,
                fontWeight = FontWeight.Bold,
                color = Color.White.copy(alpha = 0.8f)
            )

            IconButton(
                onClick = {
                    currentReelIndex++
                    showBigHeart = false
                },
                modifier = Modifier
                    .background(Color.White.copy(alpha = 0.15f), CircleShape)
                    .testTag("btn_next_reel")
            ) {
                Icon(Icons.Default.KeyboardArrowDown, contentDescription = "Next Reel", tint = Color.White)
            }
        }
    }
}
