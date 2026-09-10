package com.example.ui.screens

import androidx.compose.foundation.background
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
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Bookmark
import androidx.compose.material.icons.filled.BookmarkBorder
import androidx.compose.material.icons.filled.Place
import androidx.compose.material.icons.filled.Restaurant
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
import androidx.compose.material3.Tab
import androidx.compose.material3.TabRow
import androidx.compose.material3.TabRowDefaults
import androidx.compose.material3.TabRowDefaults.tabIndicatorOffset
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
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import com.example.data.CulturalRepository
import com.example.data.FoodDish
import com.example.data.RestaurantSpot
import com.example.ui.theme.CreamBackground
import com.example.ui.theme.CreamSurface
import com.example.ui.theme.DeepCharcoal
import com.example.ui.theme.GoldAccent
import com.example.ui.theme.MustardLight
import com.example.ui.theme.MustardYellow
import com.example.ui.theme.PeacockGreen
import com.example.ui.theme.RoyalRed
import com.example.ui.theme.SaffronOrange
import com.example.ui.theme.SoftBrown

@Composable
fun FoodExplorerScreen(
    onSaveFoodSpot: (String) -> Unit,
    modifier: Modifier = Modifier
) {
    var selectedTab by remember { mutableIntStateOf(0) } // 0: Dishes, 1: Where to Eat
    var selectedStateFilter by remember { mutableStateOf("All") }
    var selectedDietFilter by remember { mutableStateOf("All") }

    val allDishes = remember { CulturalRepository.getAllFoods() }
    val allRestaurants = remember { CulturalRepository.getAllRestaurants() }

    val stateList = listOf("All") + CulturalRepository.states.map { it.name }

    val filteredDishes = remember(selectedStateFilter, selectedDietFilter) {
        allDishes.filter { dish ->
            val matchState = selectedStateFilter == "All" || dish.state.equals(selectedStateFilter, true)
            val matchDiet = when (selectedDietFilter) {
                "Pure Veg" -> dish.isVeg
                "Specialties" -> !dish.isVeg
                else -> true
            }
            matchState && matchDiet
        }
    }

    val filteredRestaurants = remember(selectedStateFilter) {
        if (selectedStateFilter == "All") allRestaurants else allRestaurants.filter { it.state.equals(selectedStateFilter, true) }
    }

    Column(
        modifier = modifier
            .fillMaxSize()
            .background(CreamBackground)
            .testTag("screen_food_explorer")
    ) {
        // Top Header
        Surface(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp, vertical = 8.dp),
            shape = RoundedCornerShape(18.dp),
            color = MustardLight
        ) {
            Column(modifier = Modifier.padding(16.dp)) {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Text("🍛", fontSize = 24.sp)
                    Spacer(Modifier.width(8.dp))
                    Text(
                        text = "Taste India: Flavors & Culinary Heritage",
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Bold,
                        color = DeepCharcoal
                    )
                }
                Text(
                    text = "Discover signature regional dishes, secret family recipes, and iconic legendary eateries.",
                    fontSize = 12.sp,
                    color = DeepCharcoal
                )
            }
        }

        // Tabs: Signature Dishes vs Where to Eat
        TabRow(
            selectedTabIndex = selectedTab,
            containerColor = CreamBackground,
            contentColor = SaffronOrange,
            indicator = { tabPositions ->
                TabRowDefaults.SecondaryIndicator(
                    Modifier.tabIndicatorOffset(tabPositions[selectedTab]),
                    color = SaffronOrange
                )
            }
        ) {
            Tab(
                selected = selectedTab == 0,
                onClick = { selectedTab = 0 },
                text = {
                    Text(
                        "Signature Dishes",
                        fontWeight = if (selectedTab == 0) FontWeight.Bold else FontWeight.Normal,
                        fontSize = 14.sp
                    )
                }
            )
            Tab(
                selected = selectedTab == 1,
                onClick = { selectedTab = 1 },
                text = {
                    Text(
                        "Where Should We Eat? 📍",
                        fontWeight = if (selectedTab == 1) FontWeight.Bold else FontWeight.Normal,
                        fontSize = 14.sp
                    )
                }
            )
        }

        // State filter chips row
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .horizontalScroll(rememberScrollState())
                .padding(horizontal = 16.dp, vertical = 8.dp),
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            stateList.forEach { st ->
                val isSelected = selectedStateFilter == st
                FilterChip(
                    selected = isSelected,
                    onClick = { selectedStateFilter = st },
                    label = { Text(st, fontSize = 12.sp) },
                    colors = FilterChipDefaults.filterChipColors(
                        selectedContainerColor = SaffronOrange,
                        selectedLabelColor = Color.White
                    )
                )
            }
        }

        if (selectedTab == 0) {
            // Diet filters
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp, vertical = 4.dp),
                horizontalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                listOf("All", "Pure Veg", "Specialties").forEach { diet ->
                    val isSelected = selectedDietFilter == diet
                    FilterChip(
                        selected = isSelected,
                        onClick = { selectedDietFilter = diet },
                        label = {
                            Text(
                                text = when (diet) {
                                    "Pure Veg" -> "🟢 Pure Veg"
                                    "Specialties" -> "🔴 Regional Specialties"
                                    else -> "🍽️ All Dishes"
                                },
                                fontSize = 12.sp
                            )
                        },
                        colors = FilterChipDefaults.filterChipColors(
                            selectedContainerColor = PeacockGreen,
                            selectedLabelColor = Color.White
                        )
                    )
                }
            }

            // Dishes list
            LazyColumn(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(horizontal = 16.dp),
                verticalArrangement = Arrangement.spacedBy(12.dp)
            ) {
                items(filteredDishes) { dish ->
                    FoodDishItemCard(dish = dish)
                }
                item { Spacer(Modifier.height(20.dp)) }
            }
        } else {
            // Where Should We Eat list
            LazyColumn(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(horizontal = 16.dp),
                verticalArrangement = Arrangement.spacedBy(12.dp)
            ) {
                item {
                    Text(
                        text = "Legendary Heritage Restaurants & Dhabas",
                        fontSize = 14.sp,
                        fontWeight = FontWeight.Bold,
                        color = SoftBrown,
                        modifier = Modifier.padding(vertical = 4.dp)
                    )
                }
                items(filteredRestaurants) { spot ->
                    RestaurantSpotItemCard(spot = spot, onSave = { onSaveFoodSpot(spot.name) })
                }
                item { Spacer(Modifier.height(20.dp)) }
            }
        }
    }
}

@Composable
private fun FoodDishItemCard(dish: FoodDish) {
    ElevatedCard(
        modifier = Modifier.fillMaxWidth(),
        shape = RoundedCornerShape(16.dp),
        colors = CardDefaults.elevatedCardColors(containerColor = CreamSurface)
    ) {
        Column {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(150.dp)
            ) {
                AsyncImage(
                    model = dish.imageUrl,
                    contentDescription = dish.name,
                    contentScale = ContentScale.Crop,
                    modifier = Modifier.fillMaxSize()
                )
                Surface(
                    modifier = Modifier
                        .align(Alignment.TopStart)
                        .padding(10.dp),
                    shape = RoundedCornerShape(8.dp),
                    color = Color.Black.copy(alpha = 0.65f)
                ) {
                    Text(
                        text = if (dish.isVeg) "🟢 Pure Veg" else "🔴 Heritage Specialty",
                        fontSize = 11.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color.White,
                        modifier = Modifier.padding(horizontal = 8.dp, vertical = 4.dp)
                    )
                }
                Surface(
                    modifier = Modifier
                        .align(Alignment.TopEnd)
                        .padding(10.dp),
                    shape = RoundedCornerShape(8.dp),
                    color = SaffronOrange
                ) {
                    Text(
                        text = dish.state,
                        fontSize = 11.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color.White,
                        modifier = Modifier.padding(horizontal = 8.dp, vertical = 4.dp)
                    )
                }
            }

            Column(modifier = Modifier.padding(14.dp)) {
                Text(
                    text = dish.name,
                    fontSize = 17.sp,
                    fontWeight = FontWeight.Bold,
                    color = DeepCharcoal
                )
                Spacer(Modifier.height(4.dp))
                Text(
                    text = dish.description,
                    fontSize = 13.sp,
                    color = DeepCharcoal
                )
                Spacer(Modifier.height(8.dp))
                Surface(
                    shape = RoundedCornerShape(8.dp),
                    color = Color(0xFFFEF3C7),
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Text(
                        text = "👅 Flavor: ${dish.flavorProfile}",
                        fontSize = 11.sp,
                        color = DeepCharcoal,
                        modifier = Modifier.padding(horizontal = 10.dp, vertical = 6.dp)
                    )
                }
                Spacer(Modifier.height(6.dp))
                Text(
                    text = "📍 Recommended spot: ${dish.whereToTry}",
                    fontSize = 12.sp,
                    fontWeight = FontWeight.SemiBold,
                    color = SaffronOrange
                )
            }
        }
    }
}

@Composable
private fun RestaurantSpotItemCard(spot: RestaurantSpot, onSave: () -> Unit) {
    var isSaved by remember { mutableStateOf(false) }

    Card(
        modifier = Modifier.fillMaxWidth(),
        shape = RoundedCornerShape(16.dp),
        colors = CardDefaults.cardColors(containerColor = CreamSurface)
    ) {
        Column(modifier = Modifier.padding(16.dp)) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.Top
            ) {
                Column(modifier = Modifier.weight(1f)) {
                    Text(
                        text = spot.name,
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Bold,
                        color = DeepCharcoal
                    )
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Icon(Icons.Default.Place, contentDescription = null, tint = SaffronOrange, modifier = Modifier.size(14.dp))
                        Spacer(Modifier.width(4.dp))
                        Text(
                            text = "${spot.city}, ${spot.state}",
                            fontSize = 13.sp,
                            color = SoftBrown
                        )
                    }
                }

                IconButton(
                    onClick = {
                        isSaved = !isSaved
                        onSave()
                    }
                ) {
                    Icon(
                        if (isSaved) Icons.Default.Bookmark else Icons.Default.BookmarkBorder,
                        contentDescription = "Save",
                        tint = if (isSaved) SaffronOrange else SoftBrown
                    )
                }
            }

            Spacer(Modifier.height(8.dp))

            Row(
                horizontalArrangement = Arrangement.spacedBy(8.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Surface(
                    shape = RoundedCornerShape(8.dp),
                    color = MustardLight
                ) {
                    Row(
                        modifier = Modifier.padding(horizontal = 8.dp, vertical = 4.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Icon(Icons.Default.Star, contentDescription = null, tint = GoldAccent, modifier = Modifier.size(14.dp))
                        Spacer(Modifier.width(4.dp))
                        Text(
                            text = "${spot.rating}",
                            fontSize = 12.sp,
                            fontWeight = FontWeight.Bold,
                            color = DeepCharcoal
                        )
                    }
                }

                Surface(
                    shape = RoundedCornerShape(8.dp),
                    color = Color(0xFFE2E8F0)
                ) {
                    Text(
                        text = spot.priceIndicator,
                        fontSize = 12.sp,
                        fontWeight = FontWeight.Bold,
                        color = DeepCharcoal,
                        modifier = Modifier.padding(horizontal = 8.dp, vertical = 4.dp)
                    )
                }

                Text(
                    text = spot.cuisine,
                    fontSize = 12.sp,
                    color = SoftBrown,
                    fontWeight = FontWeight.Medium
                )
            }

            Spacer(Modifier.height(8.dp))
            Text(
                text = spot.description,
                fontSize = 13.sp,
                color = DeepCharcoal
            )
            Spacer(Modifier.height(10.dp))
            Surface(
                shape = RoundedCornerShape(10.dp),
                color = Color(0xFFFFF7ED),
                modifier = Modifier.fillMaxWidth()
            ) {
                Row(
                    modifier = Modifier.padding(10.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text("⭐", fontSize = 14.sp)
                    Spacer(Modifier.width(8.dp))
                    Column {
                        Text(
                            text = "Must-Order Dish:",
                            fontSize = 11.sp,
                            color = SoftBrown
                        )
                        Text(
                            text = spot.mustTryDish,
                            fontSize = 13.sp,
                            fontWeight = FontWeight.Bold,
                            color = SaffronOrange
                        )
                    }
                }
            }
        }
    }
}
