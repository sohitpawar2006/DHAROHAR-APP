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
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material.icons.filled.Place
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Shield
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import com.example.data.CulturalRepository
import com.example.data.IndianState
import com.example.data.Place
import com.example.ui.components.InteractiveIndiaMap
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

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(
    selectedState: IndianState?,
    onStateSelect: (IndianState) -> Unit,
    onEnterState: (IndianState) -> Unit,
    onSelectPlace: (Place) -> Unit,
    onOpenSearch: () -> Unit,
    onOpenContribute: () -> Unit,
    modifier: Modifier = Modifier
) {
    val states = remember { CulturalRepository.states }
    val featuredPlaces = remember { CulturalRepository.getAllPlaces().take(6) }
    var homeRegionFilter by remember { mutableStateOf("All") }
    val homeFilteredStates = remember(homeRegionFilter) {
        if (homeRegionFilter == "All") states else states.filter { it.region.equals(homeRegionFilter, ignoreCase = true) }
    }

    Column(
        modifier = modifier
            .fillMaxSize()
            .background(CreamBackground)
            .verticalScroll(rememberScrollState())
            .testTag("screen_home")
    ) {
        // App Top Bar
        Surface(
            color = SaffronOrange,
            modifier = Modifier.fillMaxWidth()
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp, vertical = 12.dp),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Surface(
                        shape = CircleShape,
                        color = Color.White.copy(alpha = 0.2f),
                        modifier = Modifier.size(40.dp)
                    ) {
                        Box(contentAlignment = Alignment.Center) {
                            Text("🪔", fontSize = 20.sp)
                        }
                    }
                    Spacer(Modifier.width(10.dp))
                    Column {
                        Row(verticalAlignment = Alignment.CenterVertically) {
                            Text(
                                text = "DHAROHAR",
                                fontSize = 18.sp,
                                fontWeight = FontWeight.Bold,
                                color = Color.White,
                                letterSpacing = 1.sp
                            )
                            Spacer(Modifier.width(6.dp))
                            Text(
                                text = "धरोहर",
                                fontSize = 14.sp,
                                fontWeight = FontWeight.Bold,
                                color = MustardLight
                            )
                        }
                        Text(
                            text = "SIH 26197 • Cultural Heritage of India",
                            fontSize = 11.sp,
                            color = Color.White.copy(alpha = 0.9f),
                            fontWeight = FontWeight.Medium
                        )
                    }
                }

                Row(horizontalArrangement = Arrangement.spacedBy(6.dp)) {
                    IconButton(
                        onClick = onOpenSearch,
                        modifier = Modifier
                            .background(Color.White.copy(alpha = 0.2f), CircleShape)
                            .size(38.dp)
                            .testTag("btn_top_search")
                    ) {
                        Icon(Icons.Default.Search, contentDescription = "Search", tint = Color.White)
                    }

                    Button(
                        onClick = onOpenContribute,
                        colors = ButtonDefaults.buttonColors(containerColor = PeacockGreen),
                        shape = RoundedCornerShape(18.dp),
                        modifier = Modifier.height(38.dp).testTag("btn_top_contribute")
                    ) {
                        Icon(Icons.Default.Add, contentDescription = null, modifier = Modifier.size(16.dp))
                        Spacer(Modifier.width(4.dp))
                        Text("Add Story", fontSize = 11.sp, fontWeight = FontWeight.Bold)
                    }
                }
            }
        }

        Spacer(Modifier.height(12.dp))

        // Hero Tagline
        Column(modifier = Modifier.padding(horizontal = 16.dp)) {
            Text(
                text = "Explore India. Discover its Culture. Experience its Heritage.",
                fontSize = 17.sp,
                fontWeight = FontWeight.Bold,
                color = DeepCharcoal,
                lineHeight = 24.sp
            )
            Text(
                text = "Interactive digital museum & living cultural atlas",
                fontSize = 12.sp,
                color = SoftBrown
            )
        }

        Spacer(Modifier.height(8.dp))

        // Interactive India Map Section
        InteractiveIndiaMap(
            selectedState = selectedState,
            onStateSelect = onStateSelect,
            onEnterState = onEnterState
        )

        Spacer(Modifier.height(18.dp))

        // Section: Featured Heritage Wonders
        SectionTitle(
            title = "Featured Wonders of India",
            subtitle = "Iconic architectural and spiritual landmarks"
        )

        LazyRow(
            modifier = Modifier.fillMaxWidth(),
            contentPadding = androidx.compose.foundation.layout.PaddingValues(horizontal = 16.dp),
            horizontalArrangement = Arrangement.spacedBy(14.dp)
        ) {
            items(featuredPlaces) { place ->
                FeaturedPlaceItemCard(place = place, onClick = { onSelectPlace(place) })
            }
        }

        Spacer(Modifier.height(20.dp))

        // Section: Cultural Spotlight of the Day
        Surface(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp),
            shape = RoundedCornerShape(18.dp),
            color = MustardLight
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text("✨", fontSize = 28.sp)
                Spacer(Modifier.width(14.dp))
                Column(modifier = Modifier.weight(1f)) {
                    Text(
                        text = "Cultural Spotlight of the Day",
                        fontSize = 11.sp,
                        fontWeight = FontWeight.Bold,
                        color = SaffronOrange
                    )
                    Text(
                        text = "The Fire & Grace of Ghoomar & Dal Baati",
                        fontSize = 15.sp,
                        fontWeight = FontWeight.Bold,
                        color = DeepCharcoal
                    )
                    Text(
                        text = "Step inside Rajasthan's desert palaces and living traditions.",
                        fontSize = 12.sp,
                        color = DeepCharcoal
                    )
                }
                IconButton(
                    onClick = {
                        val raj = states.find { it.name == "Rajasthan" }
                        if (raj != null) onEnterState(raj)
                    }
                ) {
                    Icon(Icons.Default.ArrowForward, contentDescription = "Explore", tint = SaffronOrange)
                }
            }
        }

        Spacer(Modifier.height(20.dp))

        // Section: SIH 26197 Preservation Banner
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp),
            shape = RoundedCornerShape(18.dp),
            colors = CardDefaults.cardColors(containerColor = PreservationBg),
            border = androidx.compose.foundation.BorderStroke(1.dp, Color(0xFF99F6E4))
        ) {
            Column(modifier = Modifier.padding(18.dp)) {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Icon(Icons.Default.Shield, contentDescription = null, tint = PreservationTeal, modifier = Modifier.size(24.dp))
                    Spacer(Modifier.width(8.dp))
                    Text(
                        text = "Preserve India's Endangered Traditions",
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Bold,
                        color = DeepCharcoal
                    )
                }
                Spacer(Modifier.height(6.dp))
                Text(
                    text = "Hundreds of folk arts, tribal dance forms, and oral recipes are fading. SIH 26197 empowers students and citizens to document and protect living heritage.",
                    fontSize = 12.sp,
                    lineHeight = 18.sp,
                    color = DeepCharcoal
                )
                Spacer(Modifier.height(10.dp))
                Button(
                    onClick = onOpenContribute,
                    colors = ButtonDefaults.buttonColors(containerColor = PreservationTeal),
                    shape = RoundedCornerShape(10.dp)
                ) {
                    Text("Contribute a Folk Tradition (+50 Pts) 🇮🇳", fontWeight = FontWeight.Bold, fontSize = 12.sp)
                }
            }
        }

        Spacer(Modifier.height(20.dp))

        // Section: Browse All 32 States & UTs
        SectionTitle(
            title = "Explore All 32 States & UTs of India",
            subtitle = "Living cultural encyclopedias: North, West, East, South & Northeast"
        )

        // Region Filter Chips
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .horizontalScroll(rememberScrollState())
                .padding(horizontal = 16.dp, vertical = 6.dp),
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            listOf("All", "North", "West", "East", "South", "Northeast").forEach { reg ->
                val isSelected = homeRegionFilter == reg
                val count = if (reg == "All") states.size else states.count { it.region.equals(reg, ignoreCase = true) }
                androidx.compose.material3.FilterChip(
                    selected = isSelected,
                    onClick = { homeRegionFilter = reg },
                    label = {
                        Text(
                            text = if (reg == "All") "🇮🇳 All ($count)" else "$reg ($count)",
                            fontWeight = if (isSelected) FontWeight.Bold else FontWeight.Normal,
                            fontSize = 12.sp
                        )
                    },
                    colors = androidx.compose.material3.FilterChipDefaults.filterChipColors(
                        selectedContainerColor = SaffronOrange,
                        selectedLabelColor = Color.White
                    )
                )
            }
        }

        Spacer(Modifier.height(6.dp))

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp),
            verticalArrangement = Arrangement.spacedBy(10.dp)
        ) {
            homeFilteredStates.forEach { st ->
                StateListSummaryRow(state = st, onClick = { onEnterState(st) })
            }
        }

        Spacer(Modifier.height(30.dp))
    }
}

@Composable
private fun SectionTitle(title: String, subtitle: String) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp, vertical = 6.dp)
    ) {
        Text(
            text = title,
            fontSize = 18.sp,
            fontWeight = FontWeight.Bold,
            color = DeepCharcoal
        )
        Text(
            text = subtitle,
            fontSize = 12.sp,
            color = SoftBrown
        )
    }
}

@Composable
private fun FeaturedPlaceItemCard(place: Place, onClick: () -> Unit) {
    ElevatedCard(
        modifier = Modifier
            .width(220.dp)
            .clickable(onClick = onClick)
            .testTag("featured_place_${place.id}"),
        shape = RoundedCornerShape(16.dp),
        colors = CardDefaults.elevatedCardColors(containerColor = CreamSurface)
    ) {
        Column {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(130.dp)
            ) {
                AsyncImage(
                    model = place.imageUrl,
                    contentDescription = place.name,
                    contentScale = ContentScale.Crop,
                    modifier = Modifier.fillMaxSize()
                )
                Surface(
                    modifier = Modifier
                        .align(Alignment.TopEnd)
                        .padding(8.dp),
                    shape = RoundedCornerShape(6.dp),
                    color = Color.Black.copy(alpha = 0.65f)
                ) {
                    Row(
                        modifier = Modifier.padding(horizontal = 6.dp, vertical = 2.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Icon(Icons.Default.Star, contentDescription = null, tint = GoldAccent, modifier = Modifier.size(12.dp))
                        Spacer(Modifier.width(3.dp))
                        Text(
                            text = "${place.rating}",
                            fontSize = 11.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color.White
                        )
                    }
                }
            }

            Column(modifier = Modifier.padding(12.dp)) {
                Text(
                    text = place.name,
                    fontSize = 15.sp,
                    fontWeight = FontWeight.Bold,
                    color = DeepCharcoal,
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis
                )
                Text(
                    text = "${place.city}, ${place.state}",
                    fontSize = 11.sp,
                    color = SaffronOrange,
                    fontWeight = FontWeight.SemiBold
                )
                Spacer(Modifier.height(4.dp))
                Text(
                    text = place.description,
                    fontSize = 11.sp,
                    color = DeepCharcoal,
                    maxLines = 2,
                    overflow = TextOverflow.Ellipsis
                )
            }
        }
    }
}

@Composable
private fun StateListSummaryRow(state: IndianState, onClick: () -> Unit) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .clickable(onClick = onClick)
            .testTag("state_row_${state.id}"),
        shape = RoundedCornerShape(14.dp),
        colors = CardDefaults.cardColors(containerColor = CreamSurface)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(12.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Surface(
                shape = RoundedCornerShape(10.dp),
                color = Color(state.colorHex).copy(alpha = 0.15f),
                modifier = Modifier.size(44.dp)
            ) {
                Box(contentAlignment = Alignment.Center) {
                    Text(
                        text = state.name.take(2).uppercase(),
                        fontWeight = FontWeight.Bold,
                        color = Color(state.colorHex),
                        fontSize = 15.sp
                    )
                }
            }
            Spacer(Modifier.width(12.dp))
            Column(modifier = Modifier.weight(1f)) {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Text(
                        text = state.name,
                        fontSize = 15.sp,
                        fontWeight = FontWeight.Bold,
                        color = DeepCharcoal
                    )
                    Spacer(Modifier.width(6.dp))
                    Text(
                        text = state.hindiName,
                        fontSize = 13.sp,
                        color = SaffronOrange,
                        fontWeight = FontWeight.SemiBold
                    )
                }
                Text(
                    text = "${state.region} • ${state.iconicHighlight}",
                    fontSize = 12.sp,
                    color = SoftBrown,
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis
                )
            }
            Icon(Icons.Default.ArrowForward, contentDescription = null, tint = SoftBrown, modifier = Modifier.size(16.dp))
        }
    }
}
