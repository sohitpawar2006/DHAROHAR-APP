package com.example.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.border
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
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.Bookmark
import androidx.compose.material.icons.filled.BookmarkBorder
import androidx.compose.material.icons.filled.CalendarMonth
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.MusicNote
import androidx.compose.material.icons.filled.Pause
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.material.icons.filled.Restaurant
import androidx.compose.material.icons.filled.Share
import androidx.compose.material.icons.filled.Shield
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.FilterChip
import androidx.compose.material3.FilterChipDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import com.example.data.DanceItem
import com.example.data.FoodDish
import com.example.data.IndianState
import com.example.data.MusicItem
import com.example.data.Place
import com.example.data.RestaurantSpot
import com.example.data.Tradition
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
fun StateExperienceScreen(
    state: IndianState,
    onBack: () -> Unit,
    onSelectPlace: (Place) -> Unit,
    onContributeClick: (IndianState) -> Unit,
    onSaveTrip: (IndianState) -> Unit,
    modifier: Modifier = Modifier
) {
    var selectedSection by remember { mutableStateOf("All") }
    val sections = listOf("All", "🏛️ Places", "🎭 Traditions", "💃 Dances", "🎵 Music", "🍛 Food", "📍 Food Spots", "🛡️ Preservation")

    var isTripSaved by remember { mutableStateOf(false) }

    Column(
        modifier = modifier
            .fillMaxSize()
            .background(CreamBackground)
            .verticalScroll(rememberScrollState())
            .testTag("screen_state_experience_${state.id}")
    ) {
        // Hero Banner
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(280.dp)
        ) {
            AsyncImage(
                model = state.heroImageUrl,
                contentDescription = state.name,
                contentScale = ContentScale.Crop,
                modifier = Modifier.fillMaxSize()
            )

            // Scrim
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .background(
                        Brush.verticalGradient(
                            colors = listOf(
                                Color.Black.copy(alpha = 0.5f),
                                Color.Transparent,
                                Color.Black.copy(alpha = 0.85f)
                            )
                        )
                    )
            )

            // Top navigation
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                IconButton(
                    onClick = onBack,
                    modifier = Modifier
                        .background(Color.Black.copy(alpha = 0.5f), CircleShape)
                        .size(42.dp)
                        .testTag("btn_back_from_state")
                ) {
                    Icon(Icons.AutoMirrored.Filled.ArrowBack, contentDescription = "Back", tint = Color.White)
                }

                Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                    IconButton(
                        onClick = {
                            isTripSaved = !isTripSaved
                            onSaveTrip(state)
                        },
                        modifier = Modifier
                            .background(Color.Black.copy(alpha = 0.5f), CircleShape)
                            .size(42.dp)
                            .testTag("btn_save_state_trip")
                    ) {
                        Icon(
                            if (isTripSaved) Icons.Default.Bookmark else Icons.Default.BookmarkBorder,
                            contentDescription = "Save Trip",
                            tint = if (isTripSaved) MustardYellow else Color.White
                        )
                    }
                }
            }

            // Bottom Hero Content
            Column(
                modifier = Modifier
                    .align(Alignment.BottomStart)
                    .padding(20.dp)
            ) {
                Surface(
                    shape = RoundedCornerShape(10.dp),
                    color = SaffronOrange
                ) {
                    Text(
                        text = "${state.region} India • ${state.heritageCount} Heritage Treasures",
                        fontSize = 12.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color.White,
                        modifier = Modifier.padding(horizontal = 10.dp, vertical = 4.dp)
                    )
                }
                Spacer(Modifier.height(6.dp))
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Text(
                        text = state.name,
                        fontSize = 28.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color.White
                    )
                    Spacer(Modifier.width(10.dp))
                    Text(
                        text = state.hindiName,
                        fontSize = 22.sp,
                        fontWeight = FontWeight.SemiBold,
                        color = MustardYellow
                    )
                }
                Text(
                    text = state.tagline,
                    fontSize = 14.sp,
                    color = Color.White.copy(alpha = 0.9f),
                    fontStyle = androidx.compose.ui.text.font.FontStyle.Italic
                )
            }
        }

        // Section Tabs
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .horizontalScroll(rememberScrollState())
                .padding(horizontal = 16.dp, vertical = 12.dp),
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            sections.forEach { sec ->
                val isSelected = selectedSection == sec
                FilterChip(
                    selected = isSelected,
                    onClick = { selectedSection = sec },
                    label = { Text(sec, fontSize = 13.sp, fontWeight = if (isSelected) FontWeight.Bold else FontWeight.Normal) },
                    colors = FilterChipDefaults.filterChipColors(
                        selectedContainerColor = SaffronOrange,
                        selectedLabelColor = Color.White
                    )
                )
            }
        }

        // State Description Card
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp, vertical = 6.dp),
            shape = RoundedCornerShape(18.dp),
            colors = CardDefaults.cardColors(containerColor = CreamSurface)
        ) {
            Column(modifier = Modifier.padding(16.dp)) {
                Text(
                    text = "About ${state.name}",
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold,
                    color = DeepCharcoal
                )
                Spacer(Modifier.height(6.dp))
                Text(
                    text = state.description,
                    fontSize = 14.sp,
                    lineHeight = 22.sp,
                    color = DeepCharcoal
                )
            }
        }

        // Section 1: Places & Monuments
        if (selectedSection == "All" || selectedSection == "🏛️ Places") {
            CategoryHeader(
                emoji = "🏛️",
                title = "Heritage & Famous Places",
                subtitle = "Monuments, forts, and historic landmarks"
            )
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp),
                verticalArrangement = Arrangement.spacedBy(14.dp)
            ) {
                state.places.forEach { place ->
                    PlaceCard(place = place, onSelect = { onSelectPlace(place) })
                }
            }
        }

        // Section 2: Living Traditions
        if (selectedSection == "All" || selectedSection == "🎭 Traditions") {
            CategoryHeader(
                emoji = "🎭",
                title = "Living Traditions & Crafts",
                subtitle = "Centuries of folk knowledge and handcrafted arts"
            )
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp),
                verticalArrangement = Arrangement.spacedBy(12.dp)
            ) {
                state.traditions.forEach { tradition ->
                    TraditionCard(tradition = tradition)
                }
            }
        }

        // Section 3: Dances
        if (selectedSection == "All" || selectedSection == "💃 Dances") {
            CategoryHeader(
                emoji = "💃",
                title = "India in Motion: Traditional Dances",
                subtitle = "Classical and folk choreography of ${state.name}"
            )
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp),
                verticalArrangement = Arrangement.spacedBy(12.dp)
            ) {
                state.dances.forEach { dance ->
                    DanceCard(dance = dance)
                }
            }
        }

        // Section 4: Music & Sounds
        if (selectedSection == "All" || selectedSection == "🎵 Music") {
            CategoryHeader(
                emoji = "🎵",
                title = "Sounds of India: Music & Melodies",
                subtitle = "Oral lineages, classical ragas, and folk beats"
            )
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp),
                verticalArrangement = Arrangement.spacedBy(12.dp)
            ) {
                state.music.forEach { music ->
                    MusicCard(music = music)
                }
            }
        }

        // Section 5: Food & Regional Specialties
        if (selectedSection == "All" || selectedSection == "🍛 Food") {
            CategoryHeader(
                emoji = "🍛",
                title = "Taste India: Regional Specialties",
                subtitle = "Iconic flavors, ancient recipes, and heritage sweets"
            )
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp),
                verticalArrangement = Arrangement.spacedBy(12.dp)
            ) {
                state.foods.forEach { food ->
                    FoodCard(food = food)
                }
            }
        }

        // Section 6: Where Should We Eat? (Restaurants)
        if (selectedSection == "All" || selectedSection == "📍 Food Spots") {
            CategoryHeader(
                emoji = "📍",
                title = "Where Should We Eat in ${state.name}?",
                subtitle = "Legendary culinary stops and authentic kitchens"
            )
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp),
                verticalArrangement = Arrangement.spacedBy(12.dp)
            ) {
                state.restaurants.forEach { spot ->
                    RestaurantCard(spot = spot)
                }
            }
        }

        // Section 7: Stories Worth Preserving (SIH Problem Statement Focus)
        if (selectedSection == "All" || selectedSection == "🛡️ Preservation") {
            CategoryHeader(
                emoji = "🛡️",
                title = "Stories Worth Preserving",
                subtitle = "SIH 26197 Innovation: safeguarding endangered arts"
            )
            PreservationCard(
                story = state.preservationStory,
                stateName = state.name,
                onContribute = { onContributeClick(state) }
            )
        }

        Spacer(Modifier.height(30.dp))
    }
}

@Composable
private fun CategoryHeader(emoji: String, title: String, subtitle: String) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 16.dp, end = 16.dp, top = 20.dp, bottom = 10.dp)
    ) {
        Row(verticalAlignment = Alignment.CenterVertically) {
            Text(emoji, fontSize = 20.sp)
            Spacer(Modifier.width(8.dp))
            Text(
                text = title,
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold,
                color = DeepCharcoal
            )
        }
        Text(
            text = subtitle,
            fontSize = 12.sp,
            color = SoftBrown
        )
    }
}

@Composable
private fun PlaceCard(place: Place, onSelect: () -> Unit) {
    ElevatedCard(
        modifier = Modifier
            .fillMaxWidth()
            .clickable(onClick = onSelect)
            .testTag("card_place_${place.id}"),
        shape = RoundedCornerShape(16.dp),
        colors = CardDefaults.elevatedCardColors(containerColor = CreamSurface)
    ) {
        Column {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(170.dp)
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
                        .padding(12.dp),
                    shape = RoundedCornerShape(10.dp),
                    color = Color.Black.copy(alpha = 0.65f)
                ) {
                    Row(
                        modifier = Modifier.padding(horizontal = 8.dp, vertical = 4.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Icon(Icons.Default.Star, contentDescription = null, tint = GoldAccent, modifier = Modifier.size(14.dp))
                        Spacer(Modifier.width(4.dp))
                        Text(
                            text = "${place.rating}",
                            fontSize = 12.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color.White
                        )
                    }
                }
            }

            Column(modifier = Modifier.padding(14.dp)) {
                Text(
                    text = place.name,
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold,
                    color = DeepCharcoal
                )
                Text(
                    text = "${place.city}, ${place.state}",
                    fontSize = 12.sp,
                    color = SaffronOrange,
                    fontWeight = FontWeight.SemiBold
                )
                Spacer(Modifier.height(6.dp))
                Text(
                    text = place.description,
                    fontSize = 13.sp,
                    color = DeepCharcoal,
                    maxLines = 2,
                    overflow = TextOverflow.Ellipsis
                )
                Spacer(Modifier.height(8.dp))
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(
                        text = "🏛️ ${place.tags.firstOrNull() ?: "Heritage"}",
                        fontSize = 12.sp,
                        color = SoftBrown
                    )
                    Text(
                        text = "View Details →",
                        fontSize = 13.sp,
                        fontWeight = FontWeight.Bold,
                        color = SaffronOrange
                    )
                }
            }
        }
    }
}

@Composable
private fun TraditionCard(tradition: Tradition) {
    Card(
        modifier = Modifier.fillMaxWidth(),
        shape = RoundedCornerShape(16.dp),
        colors = CardDefaults.cardColors(containerColor = CreamSurface)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(12.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            AsyncImage(
                model = tradition.imageUrl,
                contentDescription = tradition.name,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .size(90.dp)
                    .clip(RoundedCornerShape(14.dp))
            )
            Spacer(Modifier.width(14.dp))
            Column(modifier = Modifier.weight(1f)) {
                if (tradition.isEndangered) {
                    Surface(
                        shape = RoundedCornerShape(6.dp),
                        color = Color(0xFFFEE2E2),
                        modifier = Modifier.padding(bottom = 4.dp)
                    ) {
                        Text(
                            text = "⚠️ Endangered Living Art",
                            fontSize = 10.sp,
                            fontWeight = FontWeight.Bold,
                            color = RoyalRed,
                            modifier = Modifier.padding(horizontal = 6.dp, vertical = 2.dp)
                        )
                    }
                }
                Text(
                    text = tradition.name,
                    fontSize = 15.sp,
                    fontWeight = FontWeight.Bold,
                    color = DeepCharcoal
                )
                Text(
                    text = tradition.category,
                    fontSize = 12.sp,
                    color = PeacockGreen,
                    fontWeight = FontWeight.SemiBold
                )
                Spacer(Modifier.height(4.dp))
                Text(
                    text = tradition.description,
                    fontSize = 12.sp,
                    color = SoftBrown,
                    maxLines = 2,
                    overflow = TextOverflow.Ellipsis
                )
            }
        }
    }
}

@Composable
private fun DanceCard(dance: DanceItem) {
    Card(
        modifier = Modifier.fillMaxWidth(),
        shape = RoundedCornerShape(16.dp),
        colors = CardDefaults.cardColors(containerColor = CreamSurface)
    ) {
        Column(modifier = Modifier.padding(14.dp)) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Column {
                    Text(
                        text = dance.name,
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Bold,
                        color = DeepCharcoal
                    )
                    Text(
                        text = "Origin: ${dance.origin}",
                        fontSize = 12.sp,
                        color = SaffronOrange
                    )
                }
                Surface(
                    shape = RoundedCornerShape(10.dp),
                    color = MustardLight
                ) {
                    Text(
                        text = "💃 Classical / Folk",
                        fontSize = 11.sp,
                        fontWeight = FontWeight.Bold,
                        color = SaffronOrange,
                        modifier = Modifier.padding(horizontal = 8.dp, vertical = 4.dp)
                    )
                }
            }
            Spacer(Modifier.height(6.dp))
            Text(
                text = dance.description,
                fontSize = 13.sp,
                color = DeepCharcoal
            )
            Spacer(Modifier.height(8.dp))
            Surface(
                shape = RoundedCornerShape(10.dp),
                color = Color(0xFFF1F5F9),
                modifier = Modifier.fillMaxWidth()
            ) {
                Column(modifier = Modifier.padding(8.dp)) {
                    Text(text = "👗 Costume: ${dance.costume}", fontSize = 11.sp, color = DeepCharcoal)
                    Text(text = "🥁 Accompaniment: ${dance.accompaniment}", fontSize = 11.sp, color = DeepCharcoal)
                }
            }
        }
    }
}

@Composable
private fun MusicCard(music: MusicItem) {
    var isPlaying by remember { mutableStateOf(false) }

    Card(
        modifier = Modifier.fillMaxWidth(),
        shape = RoundedCornerShape(16.dp),
        colors = CardDefaults.cardColors(containerColor = CreamSurface)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(14.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            IconButton(
                onClick = { isPlaying = !isPlaying },
                modifier = Modifier
                    .background(if (isPlaying) PeacockGreen else SaffronOrange, CircleShape)
                    .size(46.dp)
            ) {
                Icon(
                    if (isPlaying) Icons.Default.Pause else Icons.Default.PlayArrow,
                    contentDescription = "Play/Pause",
                    tint = Color.White
                )
            }
            Spacer(Modifier.width(14.dp))
            Column(modifier = Modifier.weight(1f)) {
                Text(
                    text = music.title,
                    fontSize = 15.sp,
                    fontWeight = FontWeight.Bold,
                    color = DeepCharcoal
                )
                Text(
                    text = "Instruments: ${music.instruments}",
                    fontSize = 12.sp,
                    color = SaffronOrange,
                    maxLines = 1
                )
                Text(
                    text = music.description,
                    fontSize = 12.sp,
                    color = SoftBrown,
                    maxLines = 2,
                    overflow = TextOverflow.Ellipsis
                )
            }
            Spacer(Modifier.width(8.dp))
            Text(
                text = music.audioDuration,
                fontSize = 12.sp,
                fontWeight = FontWeight.Bold,
                color = SoftBrown
            )
        }
    }
}

@Composable
private fun FoodCard(food: FoodDish) {
    Card(
        modifier = Modifier.fillMaxWidth(),
        shape = RoundedCornerShape(16.dp),
        colors = CardDefaults.cardColors(containerColor = CreamSurface)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(12.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            AsyncImage(
                model = food.imageUrl,
                contentDescription = food.name,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .size(85.dp)
                    .clip(RoundedCornerShape(14.dp))
            )
            Spacer(Modifier.width(12.dp))
            Column(modifier = Modifier.weight(1f)) {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Text(
                        text = if (food.isVeg) "🟢 Pure Veg" else "🔴 Regional Specialty",
                        fontSize = 10.sp,
                        fontWeight = FontWeight.Bold,
                        color = if (food.isVeg) PeacockGreen else RoyalRed
                    )
                }
                Text(
                    text = food.name,
                    fontSize = 15.sp,
                    fontWeight = FontWeight.Bold,
                    color = DeepCharcoal
                )
                Text(
                    text = food.description,
                    fontSize = 12.sp,
                    color = DeepCharcoal,
                    maxLines = 2,
                    overflow = TextOverflow.Ellipsis
                )
                Spacer(Modifier.height(4.dp))
                Text(
                    text = "📍 Try at: ${food.whereToTry}",
                    fontSize = 11.sp,
                    fontWeight = FontWeight.SemiBold,
                    color = SaffronOrange
                )
            }
        }
    }
}

@Composable
private fun RestaurantCard(spot: RestaurantSpot) {
    Card(
        modifier = Modifier.fillMaxWidth(),
        shape = RoundedCornerShape(16.dp),
        colors = CardDefaults.cardColors(containerColor = CreamSurface)
    ) {
        Column(modifier = Modifier.padding(14.dp)) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Column {
                    Text(
                        text = spot.name,
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Bold,
                        color = DeepCharcoal
                    )
                    Text(
                        text = "${spot.cuisine} • ${spot.city}",
                        fontSize = 12.sp,
                        color = SoftBrown
                    )
                }
                Surface(
                    shape = RoundedCornerShape(8.dp),
                    color = MustardLight
                ) {
                    Row(
                        modifier = Modifier.padding(horizontal = 8.dp, vertical = 4.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Icon(Icons.Default.Star, contentDescription = null, tint = GoldAccent, modifier = Modifier.size(13.dp))
                        Spacer(Modifier.width(3.dp))
                        Text(
                            text = "${spot.rating} (${spot.priceIndicator})",
                            fontSize = 11.sp,
                            fontWeight = FontWeight.Bold,
                            color = DeepCharcoal
                        )
                    }
                }
            }
            Spacer(Modifier.height(6.dp))
            Text(
                text = spot.description,
                fontSize = 13.sp,
                color = DeepCharcoal
            )
            Spacer(Modifier.height(8.dp))
            Surface(
                shape = RoundedCornerShape(8.dp),
                color = Color(0xFFFFF7ED),
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(
                    text = "⭐ Must Try: ${spot.mustTryDish}",
                    fontSize = 12.sp,
                    fontWeight = FontWeight.SemiBold,
                    color = SaffronOrange,
                    modifier = Modifier.padding(horizontal = 10.dp, vertical = 6.dp)
                )
            }
        }
    }
}

@Composable
private fun PreservationCard(
    story: com.example.data.PreservationStory,
    stateName: String,
    onContribute: () -> Unit
) {
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
                Icon(Icons.Default.Shield, contentDescription = null, tint = PreservationTeal, modifier = Modifier.size(22.dp))
                Spacer(Modifier.width(8.dp))
                Text(
                    text = story.title,
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold,
                    color = DeepCharcoal
                )
            }
            Spacer(Modifier.height(8.dp))
            Text(
                text = "Craft: ${story.craftOrTradition}",
                fontSize = 13.sp,
                fontWeight = FontWeight.SemiBold,
                color = PreservationTeal
            )
            Text(
                text = "Community: ${story.community}",
                fontSize = 12.sp,
                color = DeepCharcoal
            )
            Spacer(Modifier.height(6.dp))
            Text(
                text = "The Threat: ${story.challenge}",
                fontSize = 12.sp,
                color = RoyalRed,
                lineHeight = 18.sp
            )
            Spacer(Modifier.height(6.dp))
            Text(
                text = "Action: ${story.preservationAction}",
                fontSize = 12.sp,
                color = DeepCharcoal,
                lineHeight = 18.sp
            )
            Spacer(Modifier.height(14.dp))
            Button(
                onClick = onContribute,
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(12.dp),
                colors = ButtonDefaults.buttonColors(containerColor = PreservationTeal)
            ) {
                Text(
                    text = "Contribute a Story for $stateName (+50 Pts) 🇮🇳",
                    fontWeight = FontWeight.Bold,
                    fontSize = 13.sp
                )
            }
        }
    }
}
