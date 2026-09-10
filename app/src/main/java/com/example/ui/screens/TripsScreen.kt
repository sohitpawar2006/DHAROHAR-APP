package com.example.ui.screens

import androidx.compose.animation.AnimatedVisibility
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
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.CalendarMonth
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.FlightTakeoff
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material.icons.filled.KeyboardArrowUp
import androidx.compose.material.icons.filled.Place
import androidx.compose.material.icons.filled.Restaurant
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.FilterChip
import androidx.compose.material3.FilterChipDefaults
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateListOf
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
import com.example.data.SavedTrip
import com.example.data.TripDayPlan
import com.example.ui.theme.CreamBackground
import com.example.ui.theme.CreamSurface
import com.example.ui.theme.DeepCharcoal
import com.example.ui.theme.MustardLight
import com.example.ui.theme.MustardYellow
import com.example.ui.theme.PeacockGreen
import com.example.ui.theme.PreservationBg
import com.example.ui.theme.RoyalRed
import com.example.ui.theme.SaffronOrange
import com.example.ui.theme.SoftBrown

@Composable
fun TripsScreen(
    modifier: Modifier = Modifier
) {
    val tripsList = remember { mutableStateListOf<SavedTrip>().apply { addAll(CulturalRepository.sampleTrips) } }
    var showPlanDialog by remember { mutableStateOf(false) }

    LazyColumn(
        modifier = modifier
            .fillMaxSize()
            .background(CreamBackground)
            .padding(16.dp)
            .testTag("screen_trips"),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        item {
            // Header Banner
            Surface(
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(20.dp),
                color = PeacockGreen
            ) {
                Column(modifier = Modifier.padding(20.dp)) {
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Column {
                            Text(
                                text = "✈️ CULTURAL ITINERARY PLANNER",
                                fontSize = 11.sp,
                                fontWeight = FontWeight.Bold,
                                color = PreservationBg
                            )
                            Spacer(Modifier.height(4.dp))
                            Text(
                                text = "My Next Trips Across India",
                                fontSize = 22.sp,
                                fontWeight = FontWeight.Bold,
                                color = Color.White
                            )
                        }

                        Button(
                            onClick = { showPlanDialog = true },
                            colors = ButtonDefaults.buttonColors(containerColor = SaffronOrange),
                            shape = RoundedCornerShape(12.dp),
                            modifier = Modifier.testTag("btn_plan_new_trip")
                        ) {
                            Icon(Icons.Default.Add, contentDescription = null, modifier = Modifier.size(16.dp))
                            Spacer(Modifier.width(4.dp))
                            Text("New Trip", fontWeight = FontWeight.Bold, fontSize = 12.sp)
                        }
                    }

                    Spacer(Modifier.height(6.dp))
                    Text(
                        text = "Curate immersive 3 to 5-day cultural journeys with monuments, dining spots, and folk performances.",
                        fontSize = 12.sp,
                        color = Color.White.copy(alpha = 0.9f)
                    )
                }
            }
        }

        item {
            Text(
                text = "${tripsList.size} Saved Cultural Itineraries",
                fontSize = 15.sp,
                fontWeight = FontWeight.Bold,
                color = DeepCharcoal
            )
        }

        items(tripsList) { trip ->
            TripItineraryCard(trip = trip)
        }

        item { Spacer(Modifier.height(30.dp)) }
    }

    if (showPlanDialog) {
        PlanNewTripDialog(
            onDismiss = { showPlanDialog = false },
            onAddTrip = { newTrip ->
                tripsList.add(0, newTrip)
                showPlanDialog = false
            }
        )
    }
}

@Composable
private fun TripItineraryCard(trip: SavedTrip) {
    var isExpanded by remember { mutableStateOf(false) }

    ElevatedCard(
        modifier = Modifier.fillMaxWidth().testTag("card_trip_${trip.id}"),
        shape = RoundedCornerShape(18.dp),
        colors = CardDefaults.elevatedCardColors(containerColor = CreamSurface)
    ) {
        Column(modifier = Modifier.padding(16.dp)) {
            // Header Row
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Column {
                    Surface(
                        shape = RoundedCornerShape(6.dp),
                        color = MustardLight
                    ) {
                        Text(
                            text = "${trip.durationDays} Days • ${trip.state}",
                            fontSize = 11.sp,
                            fontWeight = FontWeight.Bold,
                            color = SaffronOrange,
                            modifier = Modifier.padding(horizontal = 8.dp, vertical = 3.dp)
                        )
                    }
                    Spacer(Modifier.height(4.dp))
                    Text(
                        text = trip.destination,
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Bold,
                        color = DeepCharcoal
                    )
                }

                IconButton(onClick = { isExpanded = !isExpanded }) {
                    Icon(
                        if (isExpanded) Icons.Default.KeyboardArrowUp else Icons.Default.KeyboardArrowDown,
                        contentDescription = "Expand",
                        tint = DeepCharcoal
                    )
                }
            }

            Spacer(Modifier.height(8.dp))

            // Highlight chips
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                Surface(
                    shape = RoundedCornerShape(8.dp),
                    color = Color(0xFFF1F5F9),
                    modifier = Modifier.weight(1f)
                ) {
                    Text(
                        text = "🏛️ ${trip.highlightMonument}",
                        fontSize = 11.sp,
                        color = DeepCharcoal,
                        maxLines = 1,
                        modifier = Modifier.padding(horizontal = 8.dp, vertical = 5.dp)
                    )
                }
                Surface(
                    shape = RoundedCornerShape(8.dp),
                    color = Color(0xFFFEF3C7),
                    modifier = Modifier.weight(1f)
                ) {
                    Text(
                        text = "🍛 ${trip.foodToTry}",
                        fontSize = 11.sp,
                        color = DeepCharcoal,
                        maxLines = 1,
                        modifier = Modifier.padding(horizontal = 8.dp, vertical = 5.dp)
                    )
                }
            }

            // Expanded Day-by-day Itinerary
            AnimatedVisibility(visible = isExpanded) {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 14.dp),
                    verticalArrangement = Arrangement.spacedBy(12.dp)
                ) {
                    HorizontalDivider(color = Color(0xFFE2E8F0))
                    Text(
                        text = "Detailed Day-by-Day Cultural Route",
                        fontSize = 14.sp,
                        fontWeight = FontWeight.Bold,
                        color = PeacockGreen
                    )

                    trip.itinerary.forEach { day ->
                        DayPlanBlock(day = day)
                    }
                }
            }
        }
    }
}

@Composable
private fun DayPlanBlock(day: TripDayPlan) {
    Card(
        shape = RoundedCornerShape(12.dp),
        colors = CardDefaults.cardColors(containerColor = Color.White),
        border = androidx.compose.foundation.BorderStroke(1.dp, Color(0xFFE2E8F0)),
        modifier = Modifier.fillMaxWidth()
    ) {
        Column(modifier = Modifier.padding(12.dp)) {
            Text(
                text = "Day ${day.dayNumber}",
                fontSize = 14.sp,
                fontWeight = FontWeight.Bold,
                color = SaffronOrange
            )
            Spacer(Modifier.height(4.dp))
            Text(text = "🌅 Morning: ${day.morning}", fontSize = 12.sp, color = DeepCharcoal)
            Text(text = "☀️ Afternoon: ${day.afternoon}", fontSize = 12.sp, color = DeepCharcoal)
            Text(text = "🌙 Evening: ${day.evening}", fontSize = 12.sp, color = DeepCharcoal)
            Spacer(Modifier.height(4.dp))
            Surface(
                shape = RoundedCornerShape(6.dp),
                color = Color(0xFFFFF7ED),
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(
                    text = "🍴 Dining Tip: ${day.foodSpot}",
                    fontSize = 11.sp,
                    fontWeight = FontWeight.SemiBold,
                    color = SaffronOrange,
                    modifier = Modifier.padding(horizontal = 8.dp, vertical = 4.dp)
                )
            }
        }
    }
}

@Composable
private fun PlanNewTripDialog(
    onDismiss: () -> Unit,
    onAddTrip: (SavedTrip) -> Unit
) {
    var destination by remember { mutableStateOf("") }
    var selectedState by remember { mutableStateOf("Rajasthan") }
    var durationDays by remember { mutableStateOf("3") }
    var highlightPlace by remember { mutableStateOf("") }
    var signatureFood by remember { mutableStateOf("") }

    val stateList = CulturalRepository.states.map { it.name }

    Dialog(onDismissRequest = onDismiss) {
        Surface(
            modifier = Modifier
                .fillMaxWidth()
                .padding(12.dp)
                .testTag("dialog_plan_trip"),
            shape = RoundedCornerShape(20.dp),
            color = CreamBackground,
            shadowElevation = 8.dp
        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(20.dp),
                verticalArrangement = Arrangement.spacedBy(12.dp)
            ) {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(
                        text = "Plan New Cultural Trip",
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Bold,
                        color = DeepCharcoal
                    )
                    IconButton(onClick = onDismiss) {
                        Icon(Icons.Default.Close, contentDescription = "Close", tint = SoftBrown)
                    }
                }

                OutlinedTextField(
                    value = destination,
                    onValueChange = { destination = it },
                    label = { Text("Trip Title / Destination") },
                    placeholder = { Text("e.g. 3 Days in Amritsar & Wagah") },
                    modifier = Modifier.fillMaxWidth().testTag("input_trip_destination"),
                    shape = RoundedCornerShape(12.dp)
                )

                Column {
                    Text("Select State", fontSize = 12.sp, fontWeight = FontWeight.SemiBold, color = DeepCharcoal)
                    Spacer(Modifier.height(4.dp))
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .horizontalScroll(rememberScrollState()),
                        horizontalArrangement = Arrangement.spacedBy(6.dp)
                    ) {
                        stateList.forEach { st ->
                            val isSel = selectedState == st
                            FilterChip(
                                selected = isSel,
                                onClick = { selectedState = st },
                                label = { Text(st, fontSize = 12.sp) },
                                colors = FilterChipDefaults.filterChipColors(
                                    selectedContainerColor = SaffronOrange,
                                    selectedLabelColor = Color.White
                                )
                            )
                        }
                    }
                }

                Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                    OutlinedTextField(
                        value = highlightPlace,
                        onValueChange = { highlightPlace = it },
                        label = { Text("Monument") },
                        placeholder = { Text("e.g. Golden Temple") },
                        modifier = Modifier.weight(1f),
                        shape = RoundedCornerShape(12.dp)
                    )
                    OutlinedTextField(
                        value = signatureFood,
                        onValueChange = { signatureFood = it },
                        label = { Text("Food to Try") },
                        placeholder = { Text("e.g. Amritsari Kulcha") },
                        modifier = Modifier.weight(1f),
                        shape = RoundedCornerShape(12.dp)
                    )
                }

                Button(
                    onClick = {
                        val days = durationDays.toIntOrNull() ?: 3
                        val generatedDays = (1..days).map { dNum ->
                            TripDayPlan(
                                dayNumber = dNum,
                                morning = "Explore primary heritage marvels of $selectedState.",
                                afternoon = "Tour traditional artisan bazaar and local handicraft workshops.",
                                evening = "Sunset panoramic view followed by authentic regional dinner.",
                                foodSpot = signatureFood.ifBlank { "Local heritage street dhaba" }
                            )
                        }

                        val newTrip = SavedTrip(
                            id = "trip_${System.currentTimeMillis()}",
                            destination = destination.ifBlank { "Cultural Tour of $selectedState" },
                            state = selectedState,
                            durationDays = days,
                            highlightMonument = highlightPlace.ifBlank { "State Heritage Center" },
                            foodToTry = signatureFood.ifBlank { "Signature Thali" },
                            culturalExperience = "Folk dance & oral history discovery",
                            itinerary = generatedDays
                        )
                        onAddTrip(newTrip)
                    },
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(48.dp)
                        .testTag("btn_confirm_trip_creation"),
                    colors = ButtonDefaults.buttonColors(containerColor = PeacockGreen),
                    shape = RoundedCornerShape(12.dp)
                ) {
                    Text("Save to My Itineraries 🇮🇳", fontWeight = FontWeight.Bold)
                }
            }
        }
    }
}
