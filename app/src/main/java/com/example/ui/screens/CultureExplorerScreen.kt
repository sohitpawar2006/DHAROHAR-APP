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
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.BookmarkBorder
import androidx.compose.material.icons.filled.FilterList
import androidx.compose.material.icons.filled.MusicNote
import androidx.compose.material.icons.filled.Pause
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.material.icons.filled.Shield
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.FilterChip
import androidx.compose.material3.FilterChipDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
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
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import com.example.data.CulturalRepository
import com.example.data.DanceItem
import com.example.data.IndianState
import com.example.data.MusicItem
import com.example.data.Tradition
import com.example.ui.theme.CreamBackground
import com.example.ui.theme.CreamSurface
import com.example.ui.theme.DeepCharcoal
import com.example.ui.theme.MustardLight
import com.example.ui.theme.MustardYellow
import com.example.ui.theme.PeacockGreen
import com.example.ui.theme.PreservationBg
import com.example.ui.theme.PreservationTeal
import com.example.ui.theme.RoyalRed
import com.example.ui.theme.SaffronOrange
import com.example.ui.theme.SoftBrown

@Composable
fun CultureExplorerScreen(
    onSelectState: (IndianState) -> Unit,
    modifier: Modifier = Modifier
) {
    var selectedCategory by remember { mutableStateOf("All") }
    val categories = listOf("All", "💃 Dances", "🎵 Sounds", "🎭 Living Crafts", "🛡️ Endangered")

    val allDances = remember { CulturalRepository.getAllDances() }
    val allTraditions = remember { CulturalRepository.getAllTraditions() }
    val allMusic = remember { CulturalRepository.states.flatMap { it.music } }

    LazyColumn(
        modifier = modifier
            .fillMaxSize()
            .background(CreamBackground)
            .padding(bottom = 16.dp)
            .testTag("screen_culture_explorer"),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        item {
            // Header Banner
            Surface(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp, vertical = 10.dp),
                shape = RoundedCornerShape(20.dp),
                color = SaffronOrange
            ) {
                Column(modifier = Modifier.padding(20.dp)) {
                    Text(
                        text = "🎭 CULTURAL ENCYCLOPEDIA",
                        fontSize = 12.sp,
                        fontWeight = FontWeight.Bold,
                        color = MustardLight
                    )
                    Spacer(Modifier.height(4.dp))
                    Text(
                        text = "Living Traditions & Performing Arts",
                        fontSize = 22.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color.White
                    )
                    Spacer(Modifier.height(6.dp))
                    Text(
                        text = "Experience India's classical dances, indigenous handicrafts, ancient melodies, and endangered oral heritages.",
                        fontSize = 13.sp,
                        color = Color.White.copy(alpha = 0.9f)
                    )
                }
            }
        }

        // Category Filter Chips
        item {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .horizontalScroll(rememberScrollState())
                    .padding(horizontal = 16.dp),
                horizontalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                categories.forEach { cat ->
                    val isSelected = selectedCategory == cat
                    FilterChip(
                        selected = isSelected,
                        onClick = { selectedCategory = cat },
                        label = { Text(cat, fontSize = 13.sp, fontWeight = if (isSelected) FontWeight.Bold else FontWeight.Normal) },
                        colors = FilterChipDefaults.filterChipColors(
                            selectedContainerColor = SaffronOrange,
                            selectedLabelColor = Color.White
                        )
                    )
                }
            }
        }

        // Section: Dances of India
        if (selectedCategory == "All" || selectedCategory == "💃 Dances") {
            item {
                SectionTitle(
                    title = "India in Motion: Dances",
                    subtitle = "Classical and folk dances rooted in temple traditions and harvest joy"
                )
            }
            items(allDances) { dance ->
                CultureDanceCard(dance = dance, onStateClick = {
                    val st = CulturalRepository.states.find { it.name.equals(dance.state, true) }
                    if (st != null) onSelectState(st)
                })
            }
        }

        // Section: Sounds & Music
        if (selectedCategory == "All" || selectedCategory == "🎵 Sounds") {
            item {
                SectionTitle(
                    title = "Sounds of India: Melodies & Ragas",
                    subtitle = "Oral lineages, sufi poetry, and temple percussion rhythms"
                )
            }
            items(allMusic) { music ->
                CultureMusicItem(music = music)
            }
        }

        // Section: Endangered Folk Arts & Living Crafts
        if (selectedCategory == "All" || selectedCategory == "🎭 Living Crafts" || selectedCategory == "🛡️ Endangered") {
            val displayedTraditions = if (selectedCategory == "🛡️ Endangered") {
                allTraditions.filter { it.isEndangered }
            } else allTraditions

            item {
                SectionTitle(
                    title = if (selectedCategory == "🛡️ Endangered") "🛡️ Endangered Arts Requiring Preservation" else "Living Crafts & Folk Art",
                    subtitle = "Handicrafts, textiles, and traditions safeguarded across generations"
                )
            }
            items(displayedTraditions) { tradition ->
                CultureTraditionCard(tradition = tradition, onStateClick = {
                    val st = CulturalRepository.states.find { it.name.equals(tradition.state, true) }
                    if (st != null) onSelectState(st)
                })
            }
        }
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
private fun CultureDanceCard(dance: DanceItem, onStateClick: () -> Unit) {
    ElevatedCard(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp),
        shape = RoundedCornerShape(16.dp),
        colors = CardDefaults.elevatedCardColors(containerColor = CreamSurface)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(12.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            AsyncImage(
                model = dance.imageUrl,
                contentDescription = dance.name,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .size(90.dp)
                    .clip(RoundedCornerShape(14.dp))
            )
            Spacer(Modifier.width(12.dp))
            Column(modifier = Modifier.weight(1f)) {
                Surface(
                    shape = RoundedCornerShape(6.dp),
                    color = MustardLight,
                    modifier = Modifier.clickable(onClick = onStateClick)
                ) {
                    Text(
                        text = "📍 ${dance.state}",
                        fontSize = 11.sp,
                        fontWeight = FontWeight.Bold,
                        color = SaffronOrange,
                        modifier = Modifier.padding(horizontal = 6.dp, vertical = 2.dp)
                    )
                }
                Spacer(Modifier.height(4.dp))
                Text(
                    text = dance.name,
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold,
                    color = DeepCharcoal
                )
                Text(
                    text = dance.description,
                    fontSize = 12.sp,
                    color = DeepCharcoal,
                    maxLines = 2,
                    overflow = TextOverflow.Ellipsis
                )
                Spacer(Modifier.height(4.dp))
                Text(
                    text = "🥁 ${dance.accompaniment}",
                    fontSize = 11.sp,
                    color = SoftBrown,
                    maxLines = 1
                )
            }
        }
    }
}

@Composable
private fun CultureMusicItem(music: MusicItem) {
    var isPlaying by remember { mutableStateOf(false) }

    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp),
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
                    .size(44.dp)
            ) {
                Icon(
                    if (isPlaying) Icons.Default.Pause else Icons.Default.PlayArrow,
                    contentDescription = "Play",
                    tint = Color.White
                )
            }
            Spacer(Modifier.width(12.dp))
            Column(modifier = Modifier.weight(1f)) {
                Text(
                    text = music.title,
                    fontSize = 15.sp,
                    fontWeight = FontWeight.Bold,
                    color = DeepCharcoal
                )
                Text(
                    text = "${music.state} • ${music.region}",
                    fontSize = 12.sp,
                    color = SaffronOrange,
                    fontWeight = FontWeight.Medium
                )
                Text(
                    text = "Instruments: ${music.instruments}",
                    fontSize = 12.sp,
                    color = SoftBrown,
                    maxLines = 1
                )
            }
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
private fun CultureTraditionCard(tradition: Tradition, onStateClick: () -> Unit) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp),
        shape = RoundedCornerShape(16.dp),
        colors = CardDefaults.cardColors(containerColor = CreamSurface)
    ) {
        Column(modifier = Modifier.padding(14.dp)) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Surface(
                    shape = RoundedCornerShape(8.dp),
                    color = if (tradition.isEndangered) Color(0xFFFEE2E2) else MustardLight
                ) {
                    Text(
                        text = if (tradition.isEndangered) "⚠️ Endangered Art" else tradition.category,
                        fontSize = 11.sp,
                        fontWeight = FontWeight.Bold,
                        color = if (tradition.isEndangered) RoyalRed else SaffronOrange,
                        modifier = Modifier.padding(horizontal = 8.dp, vertical = 3.dp)
                    )
                }

                Surface(
                    shape = RoundedCornerShape(6.dp),
                    color = Color(0xFFF1F5F9),
                    modifier = Modifier.clickable(onClick = onStateClick)
                ) {
                    Text(
                        text = "📍 ${tradition.state} →",
                        fontSize = 11.sp,
                        fontWeight = FontWeight.Bold,
                        color = DeepCharcoal,
                        modifier = Modifier.padding(horizontal = 8.dp, vertical = 3.dp)
                    )
                }
            }

            Spacer(Modifier.height(8.dp))

            Row(verticalAlignment = Alignment.CenterVertically) {
                AsyncImage(
                    model = tradition.imageUrl,
                    contentDescription = tradition.name,
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .size(75.dp)
                        .clip(RoundedCornerShape(12.dp))
                )
                Spacer(Modifier.width(12.dp))
                Column(modifier = Modifier.weight(1f)) {
                    Text(
                        text = tradition.name,
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Bold,
                        color = DeepCharcoal
                    )
                    Spacer(Modifier.height(4.dp))
                    Text(
                        text = tradition.description,
                        fontSize = 12.sp,
                        color = DeepCharcoal,
                        maxLines = 2,
                        overflow = TextOverflow.Ellipsis
                    )
                    Spacer(Modifier.height(4.dp))
                    Text(
                        text = "🛡️ ${tradition.preservationStatus}",
                        fontSize = 11.sp,
                        fontWeight = FontWeight.SemiBold,
                        color = PreservationTeal
                    )
                }
            }
        }
    }
}
