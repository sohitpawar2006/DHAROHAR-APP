package com.example.ui.components

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.background
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.CheckCircle
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.FilterChip
import androidx.compose.material3.FilterChipDefaults
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
import com.example.data.UserContribution
import com.example.ui.theme.CreamBackground
import com.example.ui.theme.CreamSurface
import com.example.ui.theme.DeepCharcoal
import com.example.ui.theme.MustardLight
import com.example.ui.theme.PeacockGreen
import com.example.ui.theme.PreservationBg
import com.example.ui.theme.SaffronOrange
import com.example.ui.theme.SoftBrown

@Composable
fun ContributeDialog(
    initialStateName: String? = null,
    onDismiss: () -> Unit,
    onSubmitSuccess: (UserContribution) -> Unit
) {
    var title by remember { mutableStateOf("") }
    var selectedState by remember { mutableStateOf(initialStateName ?: "Rajasthan") }
    var city by remember { mutableStateOf("") }
    var place by remember { mutableStateOf("") }
    var category by remember { mutableStateOf("Endangered Folk Art") }
    var storyText by remember { mutableStateOf("") }
    var authorName by remember { mutableStateOf("") }
    var isSuccess by remember { mutableStateOf(false) }

    val categories = listOf(
        "Endangered Folk Art",
        "Living Tradition",
        "Traditional Recipe",
        "Oral Folklore",
        "Sacred Festival"
    )

    val stateNames = CulturalRepository.states.map { it.name }

    Dialog(onDismissRequest = onDismiss) {
        Surface(
            modifier = Modifier
                .fillMaxWidth()
                .padding(12.dp)
                .testTag("dialog_contribute"),
            shape = RoundedCornerShape(24.dp),
            color = CreamBackground,
            shadowElevation = 8.dp
        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(20.dp)
                    .verticalScroll(rememberScrollState()),
                verticalArrangement = Arrangement.spacedBy(14.dp)
            ) {
                // Header
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Column {
                        Row(verticalAlignment = Alignment.CenterVertically) {
                            Text("🇮🇳", fontSize = 22.sp)
                            Spacer(Modifier.width(6.dp))
                            Text(
                                text = "Preserve India's Story",
                                fontSize = 18.sp,
                                fontWeight = FontWeight.Bold,
                                color = DeepCharcoal
                            )
                        }
                        Text(
                            text = "SIH 26197 Cultural Guardian Portal",
                            fontSize = 12.sp,
                            color = PeacockGreen,
                            fontWeight = FontWeight.Medium
                        )
                    }

                    IconButton(onClick = onDismiss) {
                        Icon(Icons.Default.Close, contentDescription = "Close", tint = SoftBrown)
                    }
                }

                if (isSuccess) {
                    // Success View
                    Card(
                        shape = RoundedCornerShape(16.dp),
                        colors = CardDefaults.cardColors(containerColor = PreservationBg),
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        Column(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(20.dp),
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            Icon(
                                Icons.Default.CheckCircle,
                                contentDescription = null,
                                tint = PeacockGreen,
                                modifier = Modifier.size(54.dp)
                            )
                            Spacer(Modifier.height(10.dp))
                            Text(
                                text = "Story Added to Cultural Map!",
                                fontSize = 18.sp,
                                fontWeight = FontWeight.Bold,
                                color = DeepCharcoal
                            )
                            Spacer(Modifier.height(6.dp))
                            Text(
                                text = "You earned +50 Dharohar Points for helping preserve living traditions! 🪔✨",
                                fontSize = 13.sp,
                                color = DeepCharcoal,
                                textAlign = androidx.compose.ui.text.style.TextAlign.Center
                            )
                            Spacer(Modifier.height(16.dp))
                            Button(
                                onClick = onDismiss,
                                colors = ButtonDefaults.buttonColors(containerColor = PeacockGreen),
                                shape = RoundedCornerShape(12.dp)
                            ) {
                                Text("Continue Exploring", fontWeight = FontWeight.Bold)
                            }
                        }
                    }
                } else {
                    // Form fields
                    OutlinedTextField(
                        value = title,
                        onValueChange = { title = it },
                        label = { Text("Title of Tradition or Folk Tale") },
                        placeholder = { Text("e.g. My grandmother's brass vessel") },
                        modifier = Modifier.fillMaxWidth().testTag("input_story_title"),
                        shape = RoundedCornerShape(12.dp)
                    )

                    OutlinedTextField(
                        value = authorName,
                        onValueChange = { authorName = it },
                        label = { Text("Your Name / Contributor Handle") },
                        placeholder = { Text("e.g. Rahul Sharma") },
                        modifier = Modifier.fillMaxWidth().testTag("input_author_name"),
                        shape = RoundedCornerShape(12.dp)
                    )

                    // State selector chips
                    Column {
                        Text(
                            text = "Select State",
                            fontSize = 13.sp,
                            fontWeight = FontWeight.SemiBold,
                            color = DeepCharcoal
                        )
                        Spacer(Modifier.height(6.dp))
                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .horizontalScroll(rememberScrollState()),
                            horizontalArrangement = Arrangement.spacedBy(6.dp)
                        ) {
                            stateNames.forEach { stName ->
                                val isSelected = selectedState == stName
                                FilterChip(
                                    selected = isSelected,
                                    onClick = { selectedState = stName },
                                    label = { Text(stName, fontSize = 12.sp) },
                                    colors = FilterChipDefaults.filterChipColors(
                                        selectedContainerColor = SaffronOrange,
                                        selectedLabelColor = Color.White
                                    )
                                )
                            }
                        }
                    }

                    // City & Place Row
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.spacedBy(10.dp)
                    ) {
                        OutlinedTextField(
                            value = city,
                            onValueChange = { city = it },
                            label = { Text("City / Town") },
                            placeholder = { Text("e.g. Bundi") },
                            modifier = Modifier.weight(1f).testTag("input_city"),
                            shape = RoundedCornerShape(12.dp)
                        )
                        OutlinedTextField(
                            value = place,
                            onValueChange = { place = it },
                            label = { Text("Specific Place") },
                            placeholder = { Text("e.g. Stepwell") },
                            modifier = Modifier.weight(1f).testTag("input_place"),
                            shape = RoundedCornerShape(12.dp)
                        )
                    }

                    // Category
                    Column {
                        Text(
                            text = "Preservation Category",
                            fontSize = 13.sp,
                            fontWeight = FontWeight.SemiBold,
                            color = DeepCharcoal
                        )
                        Spacer(Modifier.height(6.dp))
                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .horizontalScroll(rememberScrollState()),
                            horizontalArrangement = Arrangement.spacedBy(6.dp)
                        ) {
                            categories.forEach { cat ->
                                val isSelected = category == cat
                                FilterChip(
                                    selected = isSelected,
                                    onClick = { category = cat },
                                    label = { Text(cat, fontSize = 11.sp) },
                                    colors = FilterChipDefaults.filterChipColors(
                                        selectedContainerColor = PeacockGreen,
                                        selectedLabelColor = Color.White
                                    )
                                )
                            }
                        }
                    }

                    // Story Narrative
                    OutlinedTextField(
                        value = storyText,
                        onValueChange = { storyText = it },
                        label = { Text("Describe the Lore, Craft or Tradition") },
                        placeholder = { Text("Tell why this culture matters, how it is made, or what oral story was passed down...") },
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(110.dp)
                            .testTag("input_story_text"),
                        shape = RoundedCornerShape(12.dp),
                        maxLines = 5
                    )

                    // Submit Button
                    Button(
                        onClick = {
                            val newContribution = UserContribution(
                                id = "user_cont_${System.currentTimeMillis()}",
                                title = title.ifBlank { "Oral Folk Tale of $selectedState" },
                                author = authorName.ifBlank { "Heritage Explorer" },
                                state = selectedState,
                                city = city.ifBlank { "Local Heritage" },
                                place = place.ifBlank { "Cultural Landmark" },
                                category = category,
                                storyText = storyText.ifBlank { "A treasured local tradition documented by community youth for SIH 26197." },
                                timeAgo = "Just now",
                                upvotes = 1,
                                isVerifiedHeritage = true
                            )
                            isSuccess = true
                            onSubmitSuccess(newContribution)
                        },
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(48.dp)
                            .testTag("btn_submit_contribution"),
                        shape = RoundedCornerShape(14.dp),
                        colors = ButtonDefaults.buttonColors(containerColor = SaffronOrange)
                    ) {
                        Row(verticalAlignment = Alignment.CenterVertically) {
                            Text(
                                text = "Submit Story (+50 Pts) 🇮🇳",
                                fontWeight = FontWeight.Bold,
                                fontSize = 14.sp
                            )
                        }
                    }
                }
            }
        }
    }
}
