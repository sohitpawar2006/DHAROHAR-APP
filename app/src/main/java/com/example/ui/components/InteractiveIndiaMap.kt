package com.example.ui.components

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.animateColorAsState
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.animation.slideInVertically
import androidx.compose.animation.slideOutVertically
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.gestures.detectTapGestures
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.Column
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
import androidx.compose.material.icons.automirrored.filled.ArrowForward
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.BookmarkBorder
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.Place
import androidx.compose.material.icons.filled.Refresh
import androidx.compose.material.icons.filled.Remove
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.FilterChip
import androidx.compose.material3.FilterChipDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.IconButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableFloatStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.geometry.CornerRadius
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.graphics.drawscope.DrawScope
import androidx.compose.ui.graphics.drawscope.Fill
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.data.CulturalRepository
import com.example.data.IndianState
import com.example.ui.theme.CreamSurface
import com.example.ui.theme.DeepCharcoal
import com.example.ui.theme.GoldAccent
import com.example.ui.theme.MustardLight
import com.example.ui.theme.MustardYellow
import com.example.ui.theme.PeacockGreen
import com.example.ui.theme.RoyalRed
import com.example.ui.theme.SaffronOrange
import com.example.ui.theme.SoftBrown
import kotlin.math.pow
import kotlin.math.sqrt

@Composable
fun InteractiveIndiaMap(
    selectedState: IndianState?,
    onStateSelect: (IndianState) -> Unit,
    onEnterState: (IndianState) -> Unit,
    modifier: Modifier = Modifier
) {
    var zoomScale by remember { mutableFloatStateOf(1f) }
    var selectedRegion by remember { mutableStateOf("All") }
    val regions = listOf("All", "North", "West", "South", "East", "Northeast")

    val states = CulturalRepository.states
    val filteredStates = remember(selectedRegion) {
        if (selectedRegion == "All") states else states.filter { it.region.equals(selectedRegion, ignoreCase = true) }
    }

    Column(modifier = modifier.fillMaxWidth()) {
        // Region Filter Chips
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .horizontalScroll(rememberScrollState())
                .padding(horizontal = 16.dp, vertical = 6.dp),
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            regions.forEach { region ->
                val isSelected = selectedRegion == region
                FilterChip(
                    selected = isSelected,
                    onClick = {
                        selectedRegion = region
                    },
                    label = {
                        Text(
                            text = if (region == "All") "🇮🇳 All India" else region,
                            fontWeight = if (isSelected) FontWeight.Bold else FontWeight.Normal,
                            fontSize = 13.sp
                        )
                    },
                    colors = FilterChipDefaults.filterChipColors(
                        selectedContainerColor = SaffronOrange,
                        selectedLabelColor = Color.White
                    ),
                    modifier = Modifier.testTag("filter_region_$region")
                )
            }
        }

        // Map Canvas Box
        BoxWithConstraints(
            modifier = Modifier
                .fillMaxWidth()
                .height(340.dp)
                .padding(horizontal = 16.dp)
                .clip(RoundedCornerShape(20.dp))
                .background(
                    Brush.verticalGradient(
                        colors = listOf(
                            Color(0xFFFFFBEB), // Warm sunlight top
                            Color(0xFFFEF3C7), // Light sandstone
                            Color(0xFFF1F5F9)  // Ocean coastal mist
                        )
                    )
                )
                .border(1.5.dp, Color(0xFFFDE68A), RoundedCornerShape(20.dp))
        ) {
            val canvasWidth = constraints.maxWidth.toFloat()
            val canvasHeight = constraints.maxHeight.toFloat()

            // Main Map Canvas
            Canvas(
                modifier = Modifier
                    .fillMaxSize()
                    .pointerInput(filteredStates, zoomScale) {
                        detectTapGestures { tapOffset ->
                            // Find nearest state within tap radius
                            var closestState: IndianState? = null
                            var minDistance = Float.MAX_VALUE

                            filteredStates.forEach { st ->
                                val stX = st.mapX * canvasWidth
                                val stY = st.mapY * canvasHeight
                                val dist = sqrt((tapOffset.x - stX).pow(2) + (tapOffset.y - stY).pow(2))
                                if (dist < 48.dp.toPx() && dist < minDistance) {
                                    minDistance = dist
                                    closestState = st
                                }
                            }
                            if (closestState != null) {
                                onStateSelect(closestState!!)
                            }
                        }
                    }
                    .testTag("interactive_india_canvas")
            ) {
                // 1. Draw Subcontinent Outline Silhouette
                drawSubcontinentOutline(size.width, size.height)

                // 2. Draw Cultural Heritage Flow Curves
                drawHeritageCurrents(size.width, size.height)

                // 3. Draw State Nodes and Hotspots
                filteredStates.forEach { state ->
                    val isStateSelected = selectedState?.id == state.id
                    val nodeX = state.mapX * size.width
                    val nodeY = state.mapY * size.height
                    val stateColor = Color(state.colorHex)

                    // Glow circle if selected
                    if (isStateSelected) {
                        drawCircle(
                            color = SaffronOrange.copy(alpha = 0.25f),
                            radius = 32.dp.toPx() * zoomScale,
                            center = Offset(nodeX, nodeY)
                        )
                        drawCircle(
                            color = SaffronOrange.copy(alpha = 0.45f),
                            radius = 22.dp.toPx() * zoomScale,
                            center = Offset(nodeX, nodeY)
                        )
                    }

                    // Outer halo
                    drawCircle(
                        color = stateColor.copy(alpha = if (isStateSelected) 0.8f else 0.35f),
                        radius = (if (isStateSelected) 16.dp else 12.dp).toPx() * zoomScale,
                        center = Offset(nodeX, nodeY)
                    )

                    // Inner core marker
                    drawCircle(
                        color = if (isStateSelected) Color.White else stateColor,
                        radius = (if (isStateSelected) 9.dp else 7.dp).toPx() * zoomScale,
                        center = Offset(nodeX, nodeY)
                    )

                    if (isStateSelected) {
                        drawCircle(
                            color = SaffronOrange,
                            radius = 4.5.dp.toPx() * zoomScale,
                            center = Offset(nodeX, nodeY)
                        )
                    }
                }
            }

            // Floating Map Controls (Zoom In, Zoom Out, Reset)
            Column(
                modifier = Modifier
                    .align(Alignment.TopEnd)
                    .padding(12.dp),
                verticalArrangement = Arrangement.spacedBy(6.dp)
            ) {
                Surface(
                    shape = RoundedCornerShape(12.dp),
                    color = Color.White.copy(alpha = 0.95f),
                    shadowElevation = 3.dp
                ) {
                    Column {
                        IconButton(
                            onClick = { zoomScale = (zoomScale + 0.15f).coerceAtMost(1.5f) },
                            modifier = Modifier.size(36.dp).testTag("btn_zoom_in")
                        ) {
                            Icon(Icons.Default.Add, contentDescription = "Zoom In", tint = DeepCharcoal)
                        }
                        IconButton(
                            onClick = { zoomScale = (zoomScale - 0.15f).coerceAtLeast(0.85f) },
                            modifier = Modifier.size(36.dp).testTag("btn_zoom_out")
                        ) {
                            Icon(Icons.Default.Remove, contentDescription = "Zoom Out", tint = DeepCharcoal)
                        }
                        IconButton(
                            onClick = { zoomScale = 1f },
                            modifier = Modifier.size(36.dp).testTag("btn_zoom_reset")
                        ) {
                            Icon(Icons.Default.Refresh, contentDescription = "Reset Zoom", tint = SoftBrown)
                        }
                    }
                }
            }

            // Quick instructions badge
            Surface(
                modifier = Modifier
                    .align(Alignment.TopStart)
                    .padding(12.dp),
                shape = RoundedCornerShape(20.dp),
                color = Color.White.copy(alpha = 0.9f),
                shadowElevation = 2.dp
            ) {
                Row(
                    modifier = Modifier.padding(horizontal = 10.dp, vertical = 6.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Icon(
                        Icons.Default.Place,
                        contentDescription = null,
                        tint = SaffronOrange,
                        modifier = Modifier.size(16.dp)
                    )
                    Spacer(Modifier.width(4.dp))
                    Text(
                        text = "Tap any state node to explore",
                        fontSize = 11.sp,
                        fontWeight = FontWeight.Medium,
                        color = DeepCharcoal
                    )
                }
            }
        }

        Spacer(Modifier.height(10.dp))

        // Selected State Cultural Highlight Card
        AnimatedVisibility(
            visible = selectedState != null,
            enter = fadeIn() + slideInVertically { it / 2 },
            exit = fadeOut() + slideOutVertically { it / 2 }
        ) {
            selectedState?.let { state ->
                ElevatedCard(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 16.dp)
                        .testTag("card_state_preview_${state.id}"),
                    shape = RoundedCornerShape(18.dp),
                    colors = CardDefaults.elevatedCardColors(
                        containerColor = CreamSurface
                    ),
                    elevation = CardDefaults.elevatedCardElevation(defaultElevation = 4.dp)
                ) {
                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(16.dp)
                    ) {
                        // Header: Name, Hindi, Region
                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.SpaceBetween,
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Column {
                                Row(verticalAlignment = Alignment.CenterVertically) {
                                    Text(
                                        text = state.name,
                                        fontSize = 20.sp,
                                        fontWeight = FontWeight.Bold,
                                        color = DeepCharcoal
                                    )
                                    Spacer(Modifier.width(8.dp))
                                    Text(
                                        text = state.hindiName,
                                        fontSize = 16.sp,
                                        fontWeight = FontWeight.SemiBold,
                                        color = SaffronOrange
                                    )
                                }
                                Text(
                                    text = state.tagline,
                                    fontSize = 12.sp,
                                    color = SoftBrown,
                                    fontStyle = androidx.compose.ui.text.font.FontStyle.Italic
                                )
                            }

                            Surface(
                                shape = RoundedCornerShape(12.dp),
                                color = Color(state.colorHex).copy(alpha = 0.12f)
                            ) {
                                Text(
                                    text = state.region + " India",
                                    fontSize = 11.sp,
                                    fontWeight = FontWeight.Bold,
                                    color = Color(state.colorHex),
                                    modifier = Modifier.padding(horizontal = 10.dp, vertical = 4.dp)
                                )
                            }
                        }

                        Spacer(Modifier.height(10.dp))

                        // Highlight Strip
                        Surface(
                            shape = RoundedCornerShape(12.dp),
                            color = MustardLight,
                            modifier = Modifier.fillMaxWidth()
                        ) {
                            Row(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .padding(horizontal = 12.dp, vertical = 8.dp),
                                verticalAlignment = Alignment.CenterVertically
                            ) {
                                Text(
                                    text = "✨",
                                    fontSize = 14.sp
                                )
                                Spacer(Modifier.width(6.dp))
                                Text(
                                    text = state.iconicHighlight,
                                    fontSize = 13.sp,
                                    fontWeight = FontWeight.Medium,
                                    color = DeepCharcoal,
                                    maxLines = 1,
                                    overflow = TextOverflow.Ellipsis
                                )
                            }
                        }

                        Spacer(Modifier.height(10.dp))

                        // Quick Badges: Capital, Dance, Dish
                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.SpaceBetween
                        ) {
                            CulturalBadgeItem(label = "Capital", value = state.capital, emoji = "🏛️")
                            CulturalBadgeItem(label = "Folk Dance", value = state.danceHighlight.split("&").first().trim(), emoji = "💃")
                            CulturalBadgeItem(label = "Famous Food", value = state.foodHighlight.split("&").first().trim(), emoji = "🍛")
                        }

                        Spacer(Modifier.height(12.dp))

                        // Enter State Experience Button
                        Button(
                            onClick = { onEnterState(state) },
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(46.dp)
                                .testTag("btn_enter_state_${state.id}"),
                            shape = RoundedCornerShape(14.dp),
                            colors = ButtonDefaults.buttonColors(
                                containerColor = SaffronOrange,
                                contentColor = Color.White
                            )
                        ) {
                            Row(
                                verticalAlignment = Alignment.CenterVertically,
                                horizontalArrangement = Arrangement.Center
                            ) {
                                Text(
                                    text = "Enter ${state.name} Experience",
                                    fontWeight = FontWeight.Bold,
                                    fontSize = 14.sp
                                )
                                Spacer(Modifier.width(8.dp))
                                Icon(
                                    Icons.AutoMirrored.Filled.ArrowForward,
                                    contentDescription = null,
                                    modifier = Modifier.size(18.dp)
                                )
                            }
                        }
                    }
                }
            }
        }
    }
}

@Composable
private fun CulturalBadgeItem(label: String, value: String, emoji: String) {
    Column(
        horizontalAlignment = Alignment.Start,
        modifier = Modifier.width(100.dp)
    ) {
        Text(
            text = "$emoji $label",
            fontSize = 11.sp,
            color = SoftBrown
        )
        Text(
            text = value,
            fontSize = 12.sp,
            fontWeight = FontWeight.SemiBold,
            color = DeepCharcoal,
            maxLines = 1,
            overflow = TextOverflow.Ellipsis
        )
    }
}

// Soft Subcontinent geographic boundary visualization
private fun DrawScope.drawSubcontinentOutline(w: Float, h: Float) {
    val mapPath = Path().apply {
        // Stylized recognizable India peninsular contours
        moveTo(w * 0.38f, h * 0.08f) // Kashmir apex
        lineTo(w * 0.44f, h * 0.12f) // Ladakh / Himachal
        lineTo(w * 0.52f, h * 0.22f) // Uttarakhand
        lineTo(w * 0.60f, h * 0.26f) // Nepal border
        lineTo(w * 0.70f, h * 0.28f) // Sikkim
        lineTo(w * 0.88f, h * 0.26f) // Arunachal Pradesh
        lineTo(w * 0.92f, h * 0.35f) // Nagaland / Manipur
        lineTo(w * 0.82f, h * 0.42f) // Assam / Meghalaya
        lineTo(w * 0.72f, h * 0.46f) // West Bengal / Sundarbans
        lineTo(w * 0.65f, h * 0.58f) // Odisha coast
        lineTo(w * 0.56f, h * 0.72f) // Andhra coast
        lineTo(w * 0.48f, h * 0.85f) // Tamil Nadu coast
        lineTo(w * 0.40f, h * 0.95f) // Kanyakumari cape apex
        lineTo(w * 0.35f, h * 0.86f) // Kerala coast
        lineTo(w * 0.33f, h * 0.75f) // Karnataka coast
        lineTo(w * 0.31f, h * 0.62f) // Goa / Maharashtra coast
        lineTo(w * 0.26f, h * 0.52f) // Gujarat Gulf of Khambhat
        lineTo(w * 0.15f, h * 0.46f) // Kutch peninsula
        lineTo(w * 0.22f, h * 0.36f) // Rajasthan Thar desert
        lineTo(w * 0.30f, h * 0.22f) // Punjab
        close()
    }

    // Landmass fill with warm cream tint
    drawPath(
        path = mapPath,
        brush = Brush.radialGradient(
            colors = listOf(
                Color(0xFFFFF7ED),
                Color(0xFFFED7AA).copy(alpha = 0.55f),
                Color(0xFFE2E8F0).copy(alpha = 0.75f)
            ),
            center = Offset(w * 0.45f, h * 0.50f),
            radius = w * 0.6f
        ),
        style = Fill
    )

    // Subcontinent border
    drawPath(
        path = mapPath,
        color = SaffronOrange.copy(alpha = 0.45f),
        style = Stroke(width = 2.dp.toPx())
    )
}

// Gentle decorative lines indicating the flow of rivers / cultural threads
private fun DrawScope.drawHeritageCurrents(w: Float, h: Float) {
    // Sacred Ganges Flow (North -> East)
    val gangaPath = Path().apply {
        moveTo(w * 0.42f, h * 0.25f)
        quadraticTo(w * 0.52f, h * 0.36f, w * 0.70f, h * 0.48f)
    }
    drawPath(
        path = gangaPath,
        color = Color(0xFF60A5FA).copy(alpha = 0.35f),
        style = Stroke(width = 1.8.dp.toPx())
    )

    // Kaveri Flow (South)
    val kaveriPath = Path().apply {
        moveTo(w * 0.36f, h * 0.75f)
        quadraticTo(w * 0.42f, h * 0.80f, w * 0.48f, h * 0.84f)
    }
    drawPath(
        path = kaveriPath,
        color = Color(0xFF60A5FA).copy(alpha = 0.35f),
        style = Stroke(width = 1.5.dp.toPx())
    )
}
