package com.example.ui.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.Dialog
import com.example.data.CulturalRepository
import com.example.data.DanceItem
import com.example.data.FoodDish
import com.example.data.IndianState
import com.example.data.Place
import com.example.data.Tradition
import com.example.ui.theme.CreamBackground
import com.example.ui.theme.DeepCharcoal
import com.example.ui.theme.PeacockGreen
import com.example.ui.theme.SaffronOrange
import com.example.ui.theme.SoftBrown

sealed class SearchResultItem {
    data class StateResult(val state: IndianState) : SearchResultItem()
    data class PlaceResult(val place: Place) : SearchResultItem()
    data class FoodResult(val food: FoodDish) : SearchResultItem()
    data class DanceResult(val dance: DanceItem) : SearchResultItem()
    data class TraditionResult(val tradition: Tradition) : SearchResultItem()
}

@Composable
fun GlobalSearchDialog(
    onDismiss: () -> Unit,
    onSelectState: (IndianState) -> Unit,
    onSelectPlace: (Place) -> Unit
) {
    var searchQuery by remember { mutableStateOf("") }

    val results = remember(searchQuery) {
        if (searchQuery.isBlank()) {
            emptyList()
        } else {
            val q = searchQuery.trim().lowercase()
            val list = mutableListOf<SearchResultItem>()

            // Match states
            CulturalRepository.states.filter {
                it.name.lowercase().contains(q) || it.hindiName.lowercase().contains(q)
            }.forEach { list.add(SearchResultItem.StateResult(it)) }

            // Match places
            CulturalRepository.getAllPlaces().filter {
                it.name.lowercase().contains(q) || it.city.lowercase().contains(q) || it.state.lowercase().contains(q)
            }.forEach { list.add(SearchResultItem.PlaceResult(it)) }

            // Match foods
            CulturalRepository.getAllFoods().filter {
                it.name.lowercase().contains(q) || it.flavorProfile.lowercase().contains(q)
            }.forEach { list.add(SearchResultItem.FoodResult(it)) }

            // Match dances
            CulturalRepository.getAllDances().filter {
                it.name.lowercase().contains(q) || it.state.lowercase().contains(q)
            }.forEach { list.add(SearchResultItem.DanceResult(it)) }

            // Match traditions
            CulturalRepository.getAllTraditions().filter {
                it.name.lowercase().contains(q) || it.description.lowercase().contains(q)
            }.forEach { list.add(SearchResultItem.TraditionResult(it)) }

            list.take(15)
        }
    }

    Dialog(onDismissRequest = onDismiss) {
        Surface(
            modifier = Modifier
                .fillMaxWidth()
                .height(520.dp)
                .testTag("dialog_global_search"),
            shape = RoundedCornerShape(20.dp),
            color = CreamBackground,
            shadowElevation = 8.dp
        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp)
            ) {
                // Search Input Field
                OutlinedTextField(
                    value = searchQuery,
                    onValueChange = { searchQuery = it },
                    placeholder = { Text("Search places, dances, foods, traditions...") },
                    leadingIcon = { Icon(Icons.Default.Search, contentDescription = null, tint = SaffronOrange) },
                    trailingIcon = {
                        IconButton(onClick = onDismiss) {
                            Icon(Icons.Default.Close, contentDescription = "Close", tint = SoftBrown)
                        }
                    },
                    modifier = Modifier.fillMaxWidth().testTag("input_search_query"),
                    shape = RoundedCornerShape(14.dp),
                    singleLine = true
                )

                Spacer(Modifier.height(12.dp))

                if (searchQuery.isBlank()) {
                    // Suggested queries
                    Text(
                        text = "Popular Searches",
                        fontSize = 13.sp,
                        fontWeight = FontWeight.Bold,
                        color = SoftBrown,
                        modifier = Modifier.padding(vertical = 6.dp)
                    )
                    val quickSuggestions = listOf("Taj Mahal", "Bhangra", "Dal Baati", "Kerala Backwaters", "Kathakali", "Amber Fort", "Garba", "Mysore Pak")
                    Column(verticalArrangement = Arrangement.spacedBy(8.dp)) {
                        quickSuggestions.forEach { sug ->
                            Row(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .clickable { searchQuery = sug }
                                    .padding(vertical = 6.dp),
                                verticalAlignment = Alignment.CenterVertically
                            ) {
                                Icon(Icons.Default.Search, contentDescription = null, tint = SoftBrown, modifier = Modifier.size(16.dp))
                                Spacer(Modifier.width(10.dp))
                                Text(sug, fontSize = 14.sp, color = DeepCharcoal)
                            }
                        }
                    }
                } else {
                    Text(
                        text = "${results.size} Cultural Results",
                        fontSize = 12.sp,
                        color = SoftBrown,
                        fontWeight = FontWeight.Medium
                    )
                    Spacer(Modifier.height(8.dp))

                    LazyColumn(
                        modifier = Modifier.fillMaxWidth(),
                        verticalArrangement = Arrangement.spacedBy(8.dp)
                    ) {
                        items(results) { res ->
                            when (res) {
                                is SearchResultItem.StateResult -> {
                                    SearchResultRow(
                                        emoji = "🏛️",
                                        title = "${res.state.name} (${res.state.hindiName})",
                                        subtitle = "State • ${res.state.iconicHighlight}",
                                        onClick = {
                                            onDismiss()
                                            onSelectState(res.state)
                                        }
                                    )
                                }
                                is SearchResultItem.PlaceResult -> {
                                    SearchResultRow(
                                        emoji = "📍",
                                        title = res.place.name,
                                        subtitle = "${res.place.city}, ${res.place.state}",
                                        onClick = {
                                            onDismiss()
                                            onSelectPlace(res.place)
                                        }
                                    )
                                }
                                is SearchResultItem.FoodResult -> {
                                    SearchResultRow(
                                        emoji = "🍛",
                                        title = res.food.name,
                                        subtitle = "Regional Cuisine • ${res.food.state}",
                                        onClick = {
                                            val st = CulturalRepository.states.find { it.name.equals(res.food.state, true) }
                                            if (st != null) {
                                                onDismiss()
                                                onSelectState(st)
                                            }
                                        }
                                    )
                                }
                                is SearchResultItem.DanceResult -> {
                                    SearchResultRow(
                                        emoji = "💃",
                                        title = res.dance.name,
                                        subtitle = "Traditional Dance • ${res.dance.state}",
                                        onClick = {
                                            val st = CulturalRepository.states.find { it.name.equals(res.dance.state, true) }
                                            if (st != null) {
                                                onDismiss()
                                                onSelectState(st)
                                            }
                                        }
                                    )
                                }
                                is SearchResultItem.TraditionResult -> {
                                    SearchResultRow(
                                        emoji = "🛡️",
                                        title = res.tradition.name,
                                        subtitle = "${res.tradition.category} • ${res.tradition.state}",
                                        onClick = {
                                            val st = CulturalRepository.states.find { it.name.equals(res.tradition.state, true) }
                                            if (st != null) {
                                                onDismiss()
                                                onSelectState(st)
                                            }
                                        }
                                    )
                                }
                            }
                            HorizontalDivider(color = Color(0xFFF1F5F9))
                        }
                    }
                }
            }
        }
    }
}

@Composable
private fun SearchResultRow(
    emoji: String,
    title: String,
    subtitle: String,
    onClick: () -> Unit
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .clickable(onClick = onClick)
            .padding(vertical = 8.dp, horizontal = 4.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(emoji, fontSize = 20.sp)
        Spacer(Modifier.width(12.dp))
        Column(modifier = Modifier.weight(1f)) {
            Text(
                text = title,
                fontSize = 14.sp,
                fontWeight = FontWeight.SemiBold,
                color = DeepCharcoal
            )
            Text(
                text = subtitle,
                fontSize = 12.sp,
                color = SoftBrown,
                maxLines = 1
            )
        }
        Icon(Icons.Default.ArrowForward, contentDescription = null, tint = SoftBrown, modifier = Modifier.size(16.dp))
    }
}
