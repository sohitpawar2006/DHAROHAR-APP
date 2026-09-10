package com.example.ui.components

import android.graphics.Paint
import android.graphics.Typeface
import androidx.compose.animation.AnimatedVisibility
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
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowForward
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Clear
import androidx.compose.material.icons.filled.GridView
import androidx.compose.material.icons.filled.Map
import androidx.compose.material.icons.filled.Place
import androidx.compose.material.icons.filled.Refresh
import androidx.compose.material.icons.filled.Remove
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.FilterChip
import androidx.compose.material3.FilterChipDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Tab
import androidx.compose.material3.TabRow
import androidx.compose.material3.TabRowDefaults
import androidx.compose.material3.TabRowDefaults.tabIndicatorOffset
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableFloatStateOf
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.graphics.drawscope.DrawScope
import androidx.compose.ui.graphics.drawscope.Fill
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.graphics.nativeCanvas
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
import com.example.ui.theme.MustardLight
import com.example.ui.theme.MustardYellow
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
    var viewModeTab by remember { mutableIntStateOf(0) } // 0: Interactive Map, 1: All States Grid
    var searchQuery by remember { mutableStateOf("") }
    var showHindiNames by remember { mutableStateOf(false) }
    var showStateNames by remember { mutableStateOf(true) }

    val allStates = CulturalRepository.states
    val regions = listOf("All", "North", "West", "East", "South", "Northeast")

    val filteredStates = remember(selectedRegion, searchQuery) {
        allStates.filter { state ->
            val matchesRegion = selectedRegion == "All" || state.region.equals(selectedRegion, ignoreCase = true)
            val matchesSearch = searchQuery.isBlank() ||
                    state.name.contains(searchQuery, ignoreCase = true) ||
                    state.hindiName.contains(searchQuery, ignoreCase = true) ||
                    state.capital.contains(searchQuery, ignoreCase = true)
            matchesRegion && matchesSearch
        }
    }

    Column(modifier = modifier.fillMaxWidth()) {
        // View Mode Switch Tabs (Interactive Map vs All 32 States Directory)
        Surface(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp),
            shape = RoundedCornerShape(14.dp),
            color = Color(0xFFF1F5F9)
        ) {
            TabRow(
                selectedTabIndex = viewModeTab,
                containerColor = Color.Transparent,
                contentColor = SaffronOrange,
                indicator = { tabPositions ->
                    TabRowDefaults.SecondaryIndicator(
                        Modifier.tabIndicatorOffset(tabPositions[viewModeTab]),
                        color = SaffronOrange,
                        height = 3.dp
                    )
                }
            ) {
                Tab(
                    selected = viewModeTab == 0,
                    onClick = { viewModeTab = 0 },
                    text = {
                        Row(verticalAlignment = Alignment.CenterVertically) {
                            Icon(Icons.Default.Map, contentDescription = null, modifier = Modifier.size(16.dp))
                            Spacer(Modifier.width(6.dp))
                            Text("Interactive Map", fontWeight = FontWeight.Bold, fontSize = 13.sp)
                        }
                    },
                    modifier = Modifier.testTag("tab_interactive_map")
                )
                Tab(
                    selected = viewModeTab == 1,
                    onClick = { viewModeTab = 1 },
                    text = {
                        Row(verticalAlignment = Alignment.CenterVertically) {
                            Icon(Icons.Default.GridView, contentDescription = null, modifier = Modifier.size(16.dp))
                            Spacer(Modifier.width(6.dp))
                            Text("All 32 States (${allStates.size})", fontWeight = FontWeight.Bold, fontSize = 13.sp)
                        }
                    },
                    modifier = Modifier.testTag("tab_all_states_grid")
                )
            }
        }

        Spacer(Modifier.height(8.dp))

        // Region Filter Chips
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .horizontalScroll(rememberScrollState())
                .padding(horizontal = 16.dp, vertical = 4.dp),
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            regions.forEach { region ->
                val isSelected = selectedRegion == region
                val count = if (region == "All") allStates.size else allStates.count { it.region.equals(region, ignoreCase = true) }
                FilterChip(
                    selected = isSelected,
                    onClick = {
                        selectedRegion = region
                    },
                    label = {
                        Text(
                            text = if (region == "All") "🇮🇳 All India ($count)" else "$region ($count)",
                            fontWeight = if (isSelected) FontWeight.Bold else FontWeight.Normal,
                            fontSize = 12.sp
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

        // Quick Search Field when looking for any state
        OutlinedTextField(
            value = searchQuery,
            onValueChange = { searchQuery = it },
            placeholder = { Text("Search any state (e.g. Sikkim, Bihar, Kerala, Punjab...)", fontSize = 12.sp) },
            leadingIcon = { Icon(Icons.Default.Search, contentDescription = null, tint = SoftBrown, modifier = Modifier.size(18.dp)) },
            trailingIcon = {
                if (searchQuery.isNotEmpty()) {
                    IconButton(onClick = { searchQuery = "" }) {
                        Icon(Icons.Default.Clear, contentDescription = "Clear", modifier = Modifier.size(16.dp))
                    }
                }
            },
            singleLine = true,
            shape = RoundedCornerShape(14.dp),
            colors = OutlinedTextFieldDefaults.colors(
                focusedBorderColor = SaffronOrange,
                unfocusedBorderColor = Color(0xFFE2E8F0),
                focusedContainerColor = Color.White,
                unfocusedContainerColor = Color.White
            ),
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp, vertical = 4.dp)
                .height(50.dp)
                .testTag("map_search_field")
        )

        // Horizontal State Quick Selection Carousel
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .horizontalScroll(rememberScrollState())
                .padding(horizontal = 16.dp, vertical = 4.dp),
            horizontalArrangement = Arrangement.spacedBy(6.dp)
        ) {
            filteredStates.forEach { st ->
                val isCurrent = selectedState?.id == st.id
                Surface(
                    shape = RoundedCornerShape(16.dp),
                    color = if (isCurrent) SaffronOrange else Color.White,
                    shadowElevation = if (isCurrent) 3.dp else 1.dp,
                    border = androidx.compose.foundation.BorderStroke(
                        1.dp,
                        if (isCurrent) SaffronOrange else Color(0xFFE2E8F0)
                    ),
                    modifier = Modifier
                        .clickable {
                            onStateSelect(st)
                        }
                        .testTag("chip_state_${st.id}")
                ) {
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier.padding(horizontal = 10.dp, vertical = 5.dp)
                    ) {
                        Box(
                            modifier = Modifier
                                .size(8.dp)
                                .clip(CircleShape)
                                .background(Color(st.colorHex))
                        )
                        Spacer(Modifier.width(6.dp))
                        Text(
                            text = st.name,
                            fontSize = 11.sp,
                            fontWeight = if (isCurrent) FontWeight.Bold else FontWeight.Medium,
                            color = if (isCurrent) Color.White else DeepCharcoal
                        )
                    }
                }
            }
        }

        Spacer(Modifier.height(6.dp))

        if (viewModeTab == 0) {
            // VIEW MODE 0: Interactive India Canvas Map with Real State Boundaries & Names
            BoxWithConstraints(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(480.dp)
                    .padding(horizontal = 16.dp)
                    .clip(RoundedCornerShape(22.dp))
                    .background(
                        Brush.verticalGradient(
                            colors = listOf(
                                Color(0xFFFFFBEB), // Himalayan sunlit amber
                                Color(0xFFFEF3C7), // Gangetic plains gold
                                Color(0xFFF0FDF4), // Malabar & Coromandel emerald mist
                                Color(0xFFE0F2FE)  // Indian Ocean azure
                            )
                        )
                    )
                    .border(1.5.dp, Color(0xFFFDE68A), RoundedCornerShape(22.dp))
            ) {
                val canvasWidth = constraints.maxWidth.toFloat()
                val canvasHeight = constraints.maxHeight.toFloat()

                // Main Map Canvas with state boundaries and name labels
                Canvas(
                    modifier = Modifier
                        .fillMaxSize()
                        .pointerInput(filteredStates, zoomScale) {
                            detectTapGestures { tapOffset ->
                                // 1. Check point-in-polygon for every state boundary
                                var tappedBoundary: StateBoundaryGeo? = null
                                for (boundary in IndiaMapBoundaries.allBoundaries) {
                                    if (IndiaMapBoundaries.isPointInPolygon(
                                            tapOffset.x,
                                            tapOffset.y,
                                            boundary.points,
                                            canvasWidth,
                                            canvasHeight
                                        )
                                    ) {
                                        tappedBoundary = boundary
                                        break
                                    }
                                }

                                // 2. If tap is near state center/label, fallback to closest
                                if (tappedBoundary == null) {
                                    var minDistance = Float.MAX_VALUE
                                    for (boundary in IndiaMapBoundaries.allBoundaries) {
                                        val bx = boundary.labelX * canvasWidth
                                        val by = boundary.labelY * canvasHeight
                                        val dist = sqrt((tapOffset.x - bx).pow(2) + (tapOffset.y - by).pow(2))
                                        if (dist < 42.dp.toPx() && dist < minDistance) {
                                            minDistance = dist
                                            tappedBoundary = boundary
                                        }
                                    }
                                }

                                if (tappedBoundary != null) {
                                    val matched = allStates.find { it.id == tappedBoundary.id }
                                    if (matched != null) {
                                        onStateSelect(matched)
                                    }
                                }
                            }
                        }
                        .testTag("interactive_india_canvas")
                ) {
                    // 1. Draw Geographic Waterbody & Directional Markers
                    drawOceanAesthetics(canvasWidth, canvasHeight)

                    // 2. Draw Subcontinent Outline Backdrop
                    drawCompleteIndiaOutline(canvasWidth, canvasHeight)

                    // 3. Draw All Individual State Boundaries (Filled Polygons with crisp borders)
                    IndiaMapBoundaries.allBoundaries.forEach { boundary ->
                        val isStateSelected = selectedState?.id == boundary.id
                        val isRegionMatched = selectedRegion == "All" ||
                                boundary.region.equals(selectedRegion, ignoreCase = true)

                        val statePath = Path().apply {
                            boundary.points.forEachIndexed { index, pt ->
                                val px = pt.x * canvasWidth
                                val py = pt.y * canvasHeight
                                if (index == 0) moveTo(px, py) else lineTo(px, py)
                            }
                            close()
                        }

                        // State Territory Fill
                        val baseColor = Color(boundary.colorHex)
                        val fillColor = when {
                            isStateSelected -> SaffronOrange.copy(alpha = 0.55f)
                            isRegionMatched -> baseColor.copy(alpha = 0.32f)
                            else -> baseColor.copy(alpha = 0.10f)
                        }
                        drawPath(path = statePath, color = fillColor, style = Fill)

                        // State Boundary Stroke Line (Border)
                        val borderColor = when {
                            isStateSelected -> SaffronOrange
                            isRegionMatched -> Color(0xFF334155).copy(alpha = 0.90f)
                            else -> Color(0xFF94A3B8).copy(alpha = 0.40f)
                        }
                        val strokeThickness = if (isStateSelected) 3.5.dp.toPx() * zoomScale else 1.4.dp.toPx()
                        drawPath(path = statePath, color = borderColor, style = Stroke(width = strokeThickness))
                    }

                    // 4. Draw Andaman & Nicobar, Lakshadweep Island Groups
                    drawIndianIslands(canvasWidth, canvasHeight)

                    // 5. Draw Cultural River Currents (Ganga, Brahmaputra, Narmada, Kaveri)
                    drawHeritageCurrents(canvasWidth, canvasHeight)

                    // 6. Draw State Names directly onto every state territory
                    if (showStateNames) {
                        val baseTextSize = 22f * zoomScale
                        val textStrokePaint = Paint().apply {
                            style = Paint.Style.STROKE
                            strokeWidth = 4f
                            color = android.graphics.Color.WHITE
                            textAlign = Paint.Align.CENTER
                            textSize = baseTextSize
                            isAntiAlias = true
                            typeface = Typeface.create(Typeface.DEFAULT, Typeface.BOLD)
                        }

                        val textFillPaint = Paint().apply {
                            style = Paint.Style.FILL
                            color = android.graphics.Color.parseColor("#0F172A")
                            textAlign = Paint.Align.CENTER
                            textSize = baseTextSize
                            isAntiAlias = true
                            typeface = Typeface.create(Typeface.DEFAULT, Typeface.BOLD)
                        }

                        val selectedTextFillPaint = Paint().apply {
                            style = Paint.Style.FILL
                            color = android.graphics.Color.parseColor("#9A3412")
                            textAlign = Paint.Align.CENTER
                            textSize = (baseTextSize + 2f)
                            isAntiAlias = true
                            typeface = Typeface.create(Typeface.DEFAULT, Typeface.BOLD)
                        }

                        IndiaMapBoundaries.allBoundaries.forEach { boundary ->
                            val isStateSelected = selectedState?.id == boundary.id
                            val isRegionMatched = selectedRegion == "All" ||
                                    boundary.region.equals(selectedRegion, ignoreCase = true)

                            if (isRegionMatched || isStateSelected) {
                                val lx = boundary.labelX * canvasWidth
                                val ly = boundary.labelY * canvasHeight

                                val label = if (showHindiNames) boundary.hindiName else boundary.name

                                // Center anchor dot
                                drawCircle(
                                    color = if (isStateSelected) SaffronOrange else Color(boundary.colorHex),
                                    radius = (if (isStateSelected) 4.5.dp else 2.5.dp).toPx() * zoomScale,
                                    center = Offset(lx, ly - 10f)
                                )

                                // Text halo outline + text fill
                                drawContext.canvas.nativeCanvas.drawText(label, lx, ly + 6f, textStrokePaint)
                                drawContext.canvas.nativeCanvas.drawText(
                                    label,
                                    lx,
                                    ly + 6f,
                                    if (isStateSelected) selectedTextFillPaint else textFillPaint
                                )
                            }
                        }
                    }

                    // 7. Selected State Pulsing Halo & Locator Pin
                    selectedState?.let { st ->
                        val matchingBoundary = IndiaMapBoundaries.allBoundaries.find { it.id == st.id }
                        val pinX = (matchingBoundary?.labelX ?: st.mapX) * canvasWidth
                        val pinY = (matchingBoundary?.labelY ?: st.mapY) * canvasHeight

                        // Outer glowing aura
                        drawCircle(
                            color = SaffronOrange.copy(alpha = 0.25f),
                            radius = 26.dp.toPx() * zoomScale,
                            center = Offset(pinX, pinY)
                        )
                        drawCircle(
                            color = SaffronOrange.copy(alpha = 0.50f),
                            radius = 16.dp.toPx() * zoomScale,
                            center = Offset(pinX, pinY)
                        )
                        drawCircle(
                            color = Color.White,
                            radius = 6.dp.toPx() * zoomScale,
                            center = Offset(pinX, pinY)
                        )
                        drawCircle(
                            color = SaffronOrange,
                            radius = 4.dp.toPx() * zoomScale,
                            center = Offset(pinX, pinY)
                        )
                    }
                }

                // Floating Map Controls (Zoom, Reset, Language Toggle, Name Toggle)
                Column(
                    modifier = Modifier
                        .align(Alignment.TopEnd)
                        .padding(10.dp),
                    verticalArrangement = Arrangement.spacedBy(6.dp)
                ) {
                    // Zoom Controls
                    Surface(
                        shape = RoundedCornerShape(12.dp),
                        color = Color.White.copy(alpha = 0.95f),
                        shadowElevation = 3.dp
                    ) {
                        Column {
                            IconButton(
                                onClick = { zoomScale = (zoomScale + 0.15f).coerceAtMost(1.5f) },
                                modifier = Modifier.size(34.dp).testTag("btn_zoom_in")
                            ) {
                                Icon(Icons.Default.Add, contentDescription = "Zoom In", tint = DeepCharcoal, modifier = Modifier.size(16.dp))
                            }
                            IconButton(
                                onClick = { zoomScale = (zoomScale - 0.15f).coerceAtLeast(0.85f) },
                                modifier = Modifier.size(34.dp).testTag("btn_zoom_out")
                            ) {
                                Icon(Icons.Default.Remove, contentDescription = "Zoom Out", tint = DeepCharcoal, modifier = Modifier.size(16.dp))
                            }
                            IconButton(
                                onClick = { zoomScale = 1f },
                                modifier = Modifier.size(34.dp).testTag("btn_zoom_reset")
                            ) {
                                Icon(Icons.Default.Refresh, contentDescription = "Reset Zoom", tint = SoftBrown, modifier = Modifier.size(16.dp))
                            }
                        }
                    }

                    // Language Toggle (English / हिंदी)
                    Surface(
                        shape = RoundedCornerShape(10.dp),
                        color = if (showHindiNames) SaffronOrange else Color.White.copy(alpha = 0.95f),
                        shadowElevation = 2.dp,
                        modifier = Modifier
                            .clickable { showHindiNames = !showHindiNames }
                            .testTag("btn_toggle_map_language")
                    ) {
                        Text(
                            text = if (showHindiNames) "हिंदी" else "EN",
                            fontSize = 11.sp,
                            fontWeight = FontWeight.Bold,
                            color = if (showHindiNames) Color.White else DeepCharcoal,
                            modifier = Modifier.padding(horizontal = 8.dp, vertical = 6.dp)
                        )
                    }

                    // Names On/Off Toggle
                    Surface(
                        shape = RoundedCornerShape(10.dp),
                        color = if (showStateNames) MustardYellow else Color.White.copy(alpha = 0.95f),
                        shadowElevation = 2.dp,
                        modifier = Modifier
                            .clickable { showStateNames = !showStateNames }
                            .testTag("btn_toggle_map_labels")
                    ) {
                        Text(
                            text = if (showStateNames) "Names" else "Borders",
                            fontSize = 10.sp,
                            fontWeight = FontWeight.Bold,
                            color = DeepCharcoal,
                            modifier = Modifier.padding(horizontal = 6.dp, vertical = 5.dp)
                        )
                    }
                }

                // Header Info: State Boundaries & Selection Status Badge
                Surface(
                    modifier = Modifier
                        .align(Alignment.TopStart)
                        .padding(10.dp),
                    shape = RoundedCornerShape(16.dp),
                    color = Color.White.copy(alpha = 0.92f),
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
                            modifier = Modifier.size(15.dp)
                        )
                        Spacer(Modifier.width(6.dp))
                        Column {
                            Text(
                                text = "🇮🇳 32 States & UTs with Boundaries",
                                fontSize = 11.sp,
                                fontWeight = FontWeight.Bold,
                                color = DeepCharcoal
                            )
                            Text(
                                text = if (selectedState != null) "Selected: ${selectedState.name} (${selectedState.hindiName})" else "Tap any state boundary to explore",
                                fontSize = 10.sp,
                                color = if (selectedState != null) SaffronOrange else SoftBrown,
                                fontWeight = if (selectedState != null) FontWeight.SemiBold else FontWeight.Normal
                            )
                        }
                    }
                }
            }
        } else {
            // VIEW MODE 1: Complete 32 States & UTs Directory Grid
            LazyVerticalGrid(
                columns = GridCells.Fixed(2),
                modifier = Modifier
                    .fillMaxWidth()
                    .height(390.dp)
                    .padding(horizontal = 16.dp),
                horizontalArrangement = Arrangement.spacedBy(10.dp),
                verticalArrangement = Arrangement.spacedBy(10.dp)
            ) {
                items(filteredStates) { state ->
                    val isSelected = selectedState?.id == state.id
                    Card(
                        modifier = Modifier
                            .fillMaxWidth()
                            .clickable {
                                onStateSelect(state)
                            }
                            .testTag("state_grid_item_${state.id}"),
                        shape = RoundedCornerShape(14.dp),
                        colors = CardDefaults.cardColors(
                            containerColor = if (isSelected) CreamSurface else Color.White
                        ),
                        border = androidx.compose.foundation.BorderStroke(
                            1.dp,
                            if (isSelected) SaffronOrange else Color(0xFFE2E8F0)
                        ),
                        elevation = CardDefaults.cardElevation(defaultElevation = if (isSelected) 4.dp else 1.dp)
                    ) {
                        Column(modifier = Modifier.padding(12.dp)) {
                            Row(
                                modifier = Modifier.fillMaxWidth(),
                                horizontalArrangement = Arrangement.SpaceBetween,
                                verticalAlignment = Alignment.CenterVertically
                            ) {
                                Box(
                                    modifier = Modifier
                                        .size(10.dp)
                                        .clip(CircleShape)
                                        .background(Color(state.colorHex))
                                )
                                Text(
                                    text = state.region,
                                    fontSize = 10.sp,
                                    fontWeight = FontWeight.Bold,
                                    color = Color(state.colorHex)
                                )
                            }
                            Spacer(Modifier.height(4.dp))
                            Text(
                                text = state.name,
                                fontSize = 14.sp,
                                fontWeight = FontWeight.Bold,
                                color = DeepCharcoal,
                                maxLines = 1,
                                overflow = TextOverflow.Ellipsis
                            )
                            Text(
                                text = state.hindiName,
                                fontSize = 12.sp,
                                fontWeight = FontWeight.SemiBold,
                                color = SaffronOrange
                            )
                            Spacer(Modifier.height(4.dp))
                            Text(
                                text = "🏛️ ${state.capital}",
                                fontSize = 11.sp,
                                color = SoftBrown,
                                maxLines = 1,
                                overflow = TextOverflow.Ellipsis
                            )
                            Spacer(Modifier.height(6.dp))
                            Button(
                                onClick = {
                                    onStateSelect(state)
                                    onEnterState(state)
                                },
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .height(30.dp),
                                shape = RoundedCornerShape(8.dp),
                                contentPadding = androidx.compose.foundation.layout.PaddingValues(vertical = 2.dp, horizontal = 6.dp),
                                colors = ButtonDefaults.buttonColors(
                                    containerColor = if (isSelected) SaffronOrange else Color(0xFFF1F5F9),
                                    contentColor = if (isSelected) Color.White else DeepCharcoal
                                )
                            ) {
                                Text("Explore ➔", fontSize = 10.sp, fontWeight = FontWeight.Bold)
                            }
                        }
                    }
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
                            Column(modifier = Modifier.weight(1f)) {
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
                                    fontStyle = androidx.compose.ui.text.font.FontStyle.Italic,
                                    maxLines = 1,
                                    overflow = TextOverflow.Ellipsis
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
                                    fontSize = 12.sp,
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
            fontSize = 10.sp,
            color = SoftBrown
        )
        Text(
            text = value,
            fontSize = 11.sp,
            fontWeight = FontWeight.SemiBold,
            color = DeepCharcoal,
            maxLines = 1,
            overflow = TextOverflow.Ellipsis
        )
    }
}

// Complete and recognizable geographic outline of the Indian Subcontinent
private fun DrawScope.drawCompleteIndiaOutline(w: Float, h: Float) {
    val mapPath = Path().apply {
        // Northern Crown of India (Jammu & Kashmir, Ladakh)
        moveTo(w * 0.38f, h * 0.04f) // Siachen / Karakoram Northern Apex
        lineTo(w * 0.44f, h * 0.05f) // Northern Ladakh
        lineTo(w * 0.48f, h * 0.10f) // Eastern Ladakh Plateau
        lineTo(w * 0.50f, h * 0.16f) // Himachal Pradesh & Uttarakhand High Himalaya
        lineTo(w * 0.54f, h * 0.20f) // Western Nepal Border
        lineTo(w * 0.64f, h * 0.25f) // Eastern Nepal Border
        // Sikkim Crest
        lineTo(w * 0.67f, h * 0.23f) // Kangchenjunga Peak
        lineTo(w * 0.70f, h * 0.27f) // Bhutan Western Border
        lineTo(w * 0.76f, h * 0.25f) // Bhutan Eastern Border
        // Arunachal Pradesh & The Northeast Frontier
        lineTo(w * 0.82f, h * 0.21f) // Tawang & West Kameng
        lineTo(w * 0.89f, h * 0.19f) // Upper Siang / Dibang Valley (Easternmost Indian Arc)
        lineTo(w * 0.94f, h * 0.26f) // Anjaw Eastern Border with Tibet/Myanmar
        lineTo(w * 0.93f, h * 0.34f) // Patkai Hills & Nagaland
        lineTo(w * 0.90f, h * 0.41f) // Manipur Border
        lineTo(w * 0.86f, h * 0.49f) // Mizoram Southern Tip
        lineTo(w * 0.80f, h * 0.45f) // Tripura Border
        lineTo(w * 0.74f, h * 0.38f) // Meghalaya Plateau
        lineTo(w * 0.70f, h * 0.46f) // West Bengal Sundarbans Delta
        // Eastern Coastline along Bay of Bengal
        lineTo(w * 0.64f, h * 0.55f) // Odisha Coast & Chilika Lake
        lineTo(w * 0.55f, h * 0.69f) // Andhra Pradesh Godavari/Krishna Delta
        lineTo(w * 0.47f, h * 0.82f) // Tamil Nadu Coromandel Coast
        lineTo(w * 0.39f, h * 0.94f) // Cape Comorin (Kanyakumari Southern Apex)
        // Western Coastline along Arabian Sea
        lineTo(w * 0.35f, h * 0.87f) // Kerala Malabar Coast
        lineTo(w * 0.32f, h * 0.74f) // Karnataka Coast
        lineTo(w * 0.30f, h * 0.63f) // Goa & Konkan Coast
        lineTo(w * 0.28f, h * 0.54f) // Mumbai & Maharashtra Coast
        lineTo(w * 0.22f, h * 0.52f) // Gulf of Khambhat
        lineTo(w * 0.16f, h * 0.48f) // Kathiawar / Saurashtra Peninsula
        lineTo(w * 0.12f, h * 0.42f) // Gulf of Kutch & Great Rann of Kutch
        // Northwestern Desert & Border (Rajasthan, Punjab, Jammu)
        lineTo(w * 0.18f, h * 0.34f) // Thar Desert / Jaisalmer Border
        lineTo(w * 0.25f, h * 0.21f) // Punjab Border
        lineTo(w * 0.31f, h * 0.12f) // Jammu & Kashmir Pir Panjal Ridge
        close()
    }

    // Landmass Fill with warm gradient
    drawPath(
        path = mapPath,
        brush = Brush.radialGradient(
            colors = listOf(
                Color(0xFFFFFBEB),
                Color(0xFFFED7AA).copy(alpha = 0.65f),
                Color(0xFFE2E8F0).copy(alpha = 0.80f)
            ),
            center = Offset(w * 0.45f, h * 0.48f),
            radius = w * 0.65f
        ),
        style = Fill
    )

    // Subcontinent Border Stroke
    drawPath(
        path = mapPath,
        color = SaffronOrange.copy(alpha = 0.65f),
        style = Stroke(width = 2.2.dp.toPx())
    )

    // State Internal Division Guides (Stylized subtle lines)
    drawInternalDivisionLines(w, h)
}

// Subtle internal geographic separation lines for regional depth
private fun DrawScope.drawInternalDivisionLines(w: Float, h: Float) {
    val dividerColor = Color(0xFFD97706).copy(alpha = 0.18f)
    val strokeStyle = Stroke(width = 1.dp.toPx())

    // Vindhya / Satpura line (dividing North & South)
    val vindhyaPath = Path().apply {
        moveTo(w * 0.24f, h * 0.50f)
        quadraticTo(w * 0.45f, h * 0.52f, w * 0.66f, h * 0.53f)
    }
    drawPath(vindhyaPath, dividerColor, style = strokeStyle)

    // Deccan Western Ghats ridge
    val ghatsPath = Path().apply {
        moveTo(w * 0.29f, h * 0.56f)
        lineTo(w * 0.33f, h * 0.72f)
        lineTo(w * 0.36f, h * 0.85f)
    }
    drawPath(ghatsPath, Color(0xFF15803D).copy(alpha = 0.20f), style = strokeStyle)
}

// Draw Andaman & Nicobar and Lakshadweep Island Groups
private fun DrawScope.drawIndianIslands(w: Float, h: Float) {
    val islandColor = Color(0xFF0D9488)
    val islandStroke = Color(0xFF0F766E)

    // Andaman & Nicobar Group (Southeast in Bay of Bengal)
    val andamanPoints = listOf(
        Offset(w * 0.86f, h * 0.72f), // North Andaman
        Offset(w * 0.87f, h * 0.76f), // Middle Andaman
        Offset(w * 0.88f, h * 0.80f), // South Andaman (Port Blair)
        Offset(w * 0.89f, h * 0.85f), // Little Andaman
        Offset(w * 0.90f, h * 0.90f)  // Great Nicobar (Indira Point)
    )
    andamanPoints.forEach { pt ->
        drawCircle(color = islandColor.copy(alpha = 0.8f), radius = 3.5.dp.toPx(), center = pt)
        drawCircle(color = islandStroke, radius = 3.5.dp.toPx(), center = pt, style = Stroke(1.dp.toPx()))
    }

    // Lakshadweep Group (Southwest in Arabian Sea)
    val lakshadweepPoints = listOf(
        Offset(w * 0.24f, h * 0.75f), // Amindivi Islands
        Offset(w * 0.23f, h * 0.79f), // Kavaratti / Agatti
        Offset(w * 0.25f, h * 0.84f), // Suheli Par
        Offset(w * 0.26f, h * 0.89f)  // Minicoy Island
    )
    lakshadweepPoints.forEach { pt ->
        drawCircle(color = Color(0xFF0284C7).copy(alpha = 0.8f), radius = 3.dp.toPx(), center = pt)
        drawCircle(color = Color(0xFF0369A1), radius = 3.dp.toPx(), center = pt, style = Stroke(1.dp.toPx()))
    }
}

// Ocean atmosphere & compass aesthetics
private fun DrawScope.drawOceanAesthetics(w: Float, h: Float) {
    val paint = Paint().apply {
        color = android.graphics.Color.parseColor("#0284C7")
        alpha = 75
        textSize = 22f
        isAntiAlias = true
        typeface = Typeface.create(Typeface.DEFAULT, Typeface.ITALIC)
    }

    drawContext.canvas.nativeCanvas.drawText("ARABIAN SEA", w * 0.08f, h * 0.70f, paint)
    drawContext.canvas.nativeCanvas.drawText("BAY OF BENGAL", w * 0.68f, h * 0.68f, paint)
    drawContext.canvas.nativeCanvas.drawText("INDIAN OCEAN", w * 0.36f, h * 0.98f, paint)
}

// River currents symbolizing cultural flow
private fun DrawScope.drawHeritageCurrents(w: Float, h: Float) {
    val riverColor = Color(0xFF60A5FA).copy(alpha = 0.35f)
    val riverStroke = Stroke(width = 1.8.dp.toPx())

    // Ganges Flow (Uttarakhand -> UP -> Bihar -> Bengal)
    val gangaPath = Path().apply {
        moveTo(w * 0.44f, h * 0.18f)
        quadraticTo(w * 0.50f, h * 0.28f, w * 0.58f, h * 0.34f)
        quadraticTo(w * 0.64f, h * 0.38f, w * 0.70f, h * 0.46f)
    }
    drawPath(gangaPath, riverColor, style = riverStroke)

    // Brahmaputra Flow (Tibet -> Arunachal -> Assam Valley -> Delta)
    val brahmaPath = Path().apply {
        moveTo(w * 0.91f, h * 0.22f)
        quadraticTo(w * 0.86f, h * 0.29f, w * 0.80f, h * 0.33f)
        quadraticTo(w * 0.75f, h * 0.36f, w * 0.71f, h * 0.46f)
    }
    drawPath(brahmaPath, Color(0xFF0D9488).copy(alpha = 0.35f), style = riverStroke)

    // Narmada Flow (Madhya Pradesh -> Gujarat Gulf)
    val narmadaPath = Path().apply {
        moveTo(w * 0.48f, h * 0.47f)
        lineTo(w * 0.36f, h * 0.48f)
        lineTo(w * 0.24f, h * 0.51f)
    }
    drawPath(narmadaPath, riverColor, style = Stroke(width = 1.4.dp.toPx()))

    // Kaveri Flow (Karnataka -> Tamil Nadu)
    val kaveriPath = Path().apply {
        moveTo(w * 0.36f, h * 0.76f)
        quadraticTo(w * 0.42f, h * 0.80f, w * 0.47f, h * 0.84f)
    }
    drawPath(kaveriPath, riverColor, style = Stroke(width = 1.4.dp.toPx()))
}
