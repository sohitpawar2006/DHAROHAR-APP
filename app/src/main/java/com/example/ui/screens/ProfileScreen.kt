package com.example.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.CheckCircle
import androidx.compose.material.icons.filled.MilitaryTech
import androidx.compose.material.icons.filled.Place
import androidx.compose.material.icons.filled.Shield
import androidx.compose.material.icons.filled.ThumbUp
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.Icon
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.data.CulturalRepository
import com.example.data.UserContribution
import com.example.ui.theme.CreamBackground
import com.example.ui.theme.CreamSurface
import com.example.ui.theme.DeepCharcoal
import com.example.ui.theme.GoldAccent
import com.example.ui.theme.MustardLight
import com.example.ui.theme.MustardYellow
import com.example.ui.theme.PeacockGreen
import com.example.ui.theme.PreservationBg
import com.example.ui.theme.PreservationTeal
import com.example.ui.theme.RoyalRed
import com.example.ui.theme.SaffronOrange
import com.example.ui.theme.SoftBrown

@Composable
fun ProfileScreen(
    userContributions: List<UserContribution>,
    onOpenContribute: () -> Unit,
    modifier: Modifier = Modifier
) {
    var points by remember { mutableIntStateOf(1450) }

    LazyColumn(
        modifier = modifier
            .fillMaxSize()
            .background(CreamBackground)
            .padding(16.dp)
            .testTag("screen_profile"),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        // User Profile Header
        item {
            ElevatedCard(
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(20.dp),
                colors = CardDefaults.elevatedCardColors(containerColor = CreamSurface)
            ) {
                Column(modifier = Modifier.padding(20.dp)) {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Surface(
                            shape = CircleShape,
                            color = SaffronOrange,
                            modifier = Modifier.size(64.dp)
                        ) {
                            Box(contentAlignment = Alignment.Center) {
                                Text("🇮🇳", fontSize = 28.sp)
                            }
                        }
                        Spacer(Modifier.width(16.dp))
                        Column(modifier = Modifier.weight(1f)) {
                            Row(verticalAlignment = Alignment.CenterVertically) {
                                Text(
                                    text = "Aarav Patel",
                                    fontSize = 20.sp,
                                    fontWeight = FontWeight.Bold,
                                    color = DeepCharcoal
                                )
                                Spacer(Modifier.width(6.dp))
                                Icon(Icons.Default.CheckCircle, contentDescription = null, tint = PeacockGreen, modifier = Modifier.size(16.dp))
                            }
                            Text(
                                text = "Cultural Guardian • Level 4",
                                fontSize = 13.sp,
                                fontWeight = FontWeight.SemiBold,
                                color = SaffronOrange
                            )
                            Text(
                                text = "Smart India Hackathon Student Innovator",
                                fontSize = 11.sp,
                                color = SoftBrown
                            )
                        }
                    }

                    Spacer(Modifier.height(16.dp))

                    // Dharohar Points Card
                    Surface(
                        shape = RoundedCornerShape(14.dp),
                        color = MustardLight,
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(14.dp),
                            horizontalArrangement = Arrangement.SpaceBetween,
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Column {
                                Text(
                                    text = "Dharohar Cultural Points",
                                    fontSize = 12.sp,
                                    color = SoftBrown
                                )
                                Text(
                                    text = "🌟 $points Points",
                                    fontSize = 22.sp,
                                    fontWeight = FontWeight.Bold,
                                    color = DeepCharcoal
                                )
                            }
                            Surface(
                                shape = RoundedCornerShape(8.dp),
                                color = SaffronOrange
                            ) {
                                Text(
                                    text = "Top 5% Guardian",
                                    fontSize = 11.sp,
                                    fontWeight = FontWeight.Bold,
                                    color = Color.White,
                                    modifier = Modifier.padding(horizontal = 8.dp, vertical = 4.dp)
                                )
                            }
                        }
                    }

                    Spacer(Modifier.height(14.dp))

                    // Progress Bar
                    Column {
                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.SpaceBetween
                        ) {
                            Text("India Explored", fontSize = 12.sp, color = DeepCharcoal, fontWeight = FontWeight.Medium)
                            Text("42% of Cultural Map", fontSize = 12.sp, color = PeacockGreen, fontWeight = FontWeight.Bold)
                        }
                        Spacer(Modifier.height(6.dp))
                        LinearProgressIndicator(
                            progress = { 0.42f },
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(8.dp)
                                .clip(RoundedCornerShape(4.dp)),
                            color = PeacockGreen,
                            trackColor = Color(0xFFE2E8F0)
                        )
                    }
                }
            }
        }

        // Cultural Badges
        item {
            Text(
                text = "Earned Cultural Badges",
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold,
                color = DeepCharcoal
            )
        }

        item {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .horizontalScroll(rememberScrollState()),
                horizontalArrangement = Arrangement.spacedBy(10.dp)
            ) {
                BadgeItem(emoji = "🏛️", title = "Heritage Explorer", desc = "14 UNESCO Sites")
                BadgeItem(emoji = "🍛", title = "Rasoi Master", desc = "12 Regional Dishes")
                BadgeItem(emoji = "💃", title = "Dance Connoisseur", desc = "8 Classical Dances")
                BadgeItem(emoji = "🛡️", title = "Living Lore Guardian", desc = "3 Stories Saved")
                BadgeItem(emoji = "✈️", title = "Bharat Yatri", desc = "4 Full Itineraries")
            }
        }

        // Contribute CTA Banner
        item {
            Card(
                shape = RoundedCornerShape(18.dp),
                colors = CardDefaults.cardColors(containerColor = PreservationBg),
                border = androidx.compose.foundation.BorderStroke(1.dp, Color(0xFF99F6E4)),
                modifier = Modifier.fillMaxWidth()
            ) {
                Column(modifier = Modifier.padding(18.dp)) {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Text("🇮🇳", fontSize = 22.sp)
                        Spacer(Modifier.width(8.dp))
                        Text(
                            text = "Help Preserve India's Living Heritage",
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Bold,
                            color = DeepCharcoal
                        )
                    }
                    Spacer(Modifier.height(6.dp))
                    Text(
                        text = "Do you know a hidden temple, endangered folk song, dying handicraft, or heirloom recipe? Add it to India's cultural map.",
                        fontSize = 13.sp,
                        color = DeepCharcoal
                    )
                    Spacer(Modifier.height(12.dp))
                    Button(
                        onClick = onOpenContribute,
                        colors = ButtonDefaults.buttonColors(containerColor = PreservationTeal),
                        shape = RoundedCornerShape(12.dp),
                        modifier = Modifier.testTag("btn_profile_contribute")
                    ) {
                        Icon(Icons.Default.Add, contentDescription = null, modifier = Modifier.size(16.dp))
                        Spacer(Modifier.width(6.dp))
                        Text("Add Cultural Story (+50 Pts)", fontWeight = FontWeight.Bold, fontSize = 13.sp)
                    }
                }
            }
        }

        // Community Contributed Stories
        item {
            Text(
                text = "Community Stories from India's Keepers",
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold,
                color = DeepCharcoal
            )
        }

        items(userContributions) { story ->
            CommunityStoryCard(story = story)
        }

        item { Spacer(Modifier.height(30.dp)) }
    }
}

@Composable
private fun BadgeItem(emoji: String, title: String, desc: String) {
    Card(
        shape = RoundedCornerShape(14.dp),
        colors = CardDefaults.cardColors(containerColor = CreamSurface),
        modifier = Modifier.width(130.dp)
    ) {
        Column(
            modifier = Modifier.padding(12.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Surface(
                shape = CircleShape,
                color = MustardLight,
                modifier = Modifier.size(44.dp)
            ) {
                Box(contentAlignment = Alignment.Center) {
                    Text(emoji, fontSize = 20.sp)
                }
            }
            Spacer(Modifier.height(8.dp))
            Text(
                text = title,
                fontSize = 12.sp,
                fontWeight = FontWeight.Bold,
                color = DeepCharcoal,
                textAlign = androidx.compose.ui.text.style.TextAlign.Center
            )
            Text(
                text = desc,
                fontSize = 10.sp,
                color = SoftBrown,
                textAlign = androidx.compose.ui.text.style.TextAlign.Center
            )
        }
    }
}

@Composable
private fun CommunityStoryCard(story: UserContribution) {
    var likesCount by remember { mutableIntStateOf(story.upvotes) }
    var hasLiked by remember { mutableStateOf(false) }

    ElevatedCard(
        modifier = Modifier.fillMaxWidth().testTag("card_story_${story.id}"),
        shape = RoundedCornerShape(16.dp),
        colors = CardDefaults.elevatedCardColors(containerColor = CreamSurface)
    ) {
        Column(modifier = Modifier.padding(16.dp)) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Surface(
                        shape = CircleShape,
                        color = MustardLight,
                        modifier = Modifier.size(32.dp)
                    ) {
                        Box(contentAlignment = Alignment.Center) {
                            Text("👤", fontSize = 16.sp)
                        }
                    }
                    Spacer(Modifier.width(8.dp))
                    Column {
                        Text(
                            text = story.author,
                            fontSize = 13.sp,
                            fontWeight = FontWeight.Bold,
                            color = DeepCharcoal
                        )
                        Text(
                            text = story.timeAgo,
                            fontSize = 11.sp,
                            color = SoftBrown
                        )
                    }
                }

                Surface(
                    shape = RoundedCornerShape(6.dp),
                    color = MustardLight
                ) {
                    Text(
                        text = "📍 ${story.state}",
                        fontSize = 11.sp,
                        fontWeight = FontWeight.Bold,
                        color = SaffronOrange,
                        modifier = Modifier.padding(horizontal = 8.dp, vertical = 3.dp)
                    )
                }
            }

            Spacer(Modifier.height(10.dp))
            Text(
                text = story.title,
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold,
                color = DeepCharcoal
            )
            Text(
                text = "${story.category} • ${story.place}, ${story.city}",
                fontSize = 12.sp,
                color = PeacockGreen,
                fontWeight = FontWeight.Medium
            )
            Spacer(Modifier.height(6.dp))
            Text(
                text = story.storyText,
                fontSize = 13.sp,
                lineHeight = 20.sp,
                color = DeepCharcoal
            )
            Spacer(Modifier.height(10.dp))

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Row(
                    modifier = Modifier.clickable {
                        if (!hasLiked) {
                            likesCount++
                            hasLiked = true
                        } else {
                            likesCount--
                            hasLiked = false
                        }
                    },
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Icon(
                        Icons.Default.ThumbUp,
                        contentDescription = "Upvote",
                        tint = if (hasLiked) SaffronOrange else SoftBrown,
                        modifier = Modifier.size(16.dp)
                    )
                    Spacer(Modifier.width(6.dp))
                    Text(
                        text = "$likesCount Upvotes",
                        fontSize = 12.sp,
                        fontWeight = FontWeight.SemiBold,
                        color = if (hasLiked) SaffronOrange else SoftBrown
                    )
                }

                Surface(
                    shape = RoundedCornerShape(6.dp),
                    color = PreservationBg
                ) {
                    Text(
                        text = "🛡️ Verified Living Lore",
                        fontSize = 11.sp,
                        fontWeight = FontWeight.Bold,
                        color = PreservationTeal,
                        modifier = Modifier.padding(horizontal = 8.dp, vertical = 4.dp)
                    )
                }
            }
        }
    }
}
