package com.example

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.BackHandler
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.animation.AnimatedContent
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.animation.togetherWith
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Bookmark
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Place
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.material.icons.filled.Restaurant
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.SnackbarHost
import androidx.compose.material3.SnackbarHostState
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.data.CulturalRepository
import com.example.data.IndianState
import com.example.data.Place
import com.example.data.UserContribution
import com.example.ui.components.ContributeDialog
import com.example.ui.components.GlobalSearchDialog
import com.example.ui.components.PlaceDetailDialog
import com.example.ui.screens.CultureExplorerScreen
import com.example.ui.screens.FoodExplorerScreen
import com.example.ui.screens.HomeScreen
import com.example.ui.screens.ProfileScreen
import com.example.ui.screens.ReelsScreen
import com.example.ui.screens.StateExperienceScreen
import com.example.ui.screens.TripsScreen
import com.example.ui.theme.CreamBackground
import com.example.ui.theme.CreamSurface
import com.example.ui.theme.DeepCharcoal
import com.example.ui.theme.DharoharTheme
import com.example.ui.theme.MustardLight
import com.example.ui.theme.PeacockGreen
import com.example.ui.theme.SaffronOrange
import kotlinx.coroutines.launch

enum class AppTab(val title: String, val icon: ImageVector) {
    EXPLORE("Explore", Icons.Default.Place),
    CULTURE("Culture", Icons.Default.Star),
    TASTE("Taste", Icons.Default.Restaurant),
    REELS("Reels", Icons.Default.PlayArrow),
    TRIPS("Trips", Icons.Default.Bookmark),
    PROFILE("Profile", Icons.Default.Person)
}

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            DharoharTheme {
                DharoharApp()
            }
        }
    }
}

@Composable
fun DharoharApp() {
    val coroutineScope = rememberCoroutineScope()
    val snackbarHostState = remember { SnackbarHostState() }

    // Navigation and screen states
    var currentTab by remember { mutableStateOf(AppTab.EXPLORE) }
    var selectedMapState by remember { mutableStateOf<IndianState?>(CulturalRepository.states[0]) } // Default to Rajasthan
    var activeStateExperience by remember { mutableStateOf<IndianState?>(null) }
    var activePlaceDetail by remember { mutableStateOf<Place?>(null) }
    var showContributeDialog by remember { mutableStateOf(false) }
    var showSearchDialog by remember { mutableStateOf(false) }

    // Dynamic community contributions
    val userContributions = remember {
        mutableStateListOf<UserContribution>().apply {
            addAll(CulturalRepository.sampleContributions)
        }
    }

    // Handle back button when inside a state experience
    BackHandler(enabled = activeStateExperience != null) {
        activeStateExperience = null
    }

    Scaffold(
        modifier = Modifier.fillMaxSize(),
        containerColor = CreamBackground,
        snackbarHost = { SnackbarHost(snackbarHostState) },
        bottomBar = {
            if (activeStateExperience == null) {
                NavigationBar(
                    containerColor = CreamSurface,
                    contentColor = DeepCharcoal,
                    tonalElevation = 8.dp,
                    modifier = Modifier.navigationBarsPadding().testTag("bottom_navigation_bar")
                ) {
                    AppTab.entries.forEach { tab ->
                        val isSelected = currentTab == tab
                        NavigationBarItem(
                            selected = isSelected,
                            onClick = { currentTab = tab },
                            icon = {
                                Icon(
                                    tab.icon,
                                    contentDescription = tab.title,
                                    modifier = Modifier.size(22.dp)
                                )
                            },
                            label = {
                                Text(
                                    text = tab.title,
                                    fontSize = 10.sp,
                                    fontWeight = if (isSelected) FontWeight.Bold else FontWeight.Normal
                                )
                            },
                            colors = NavigationBarItemDefaults.colors(
                                selectedIconColor = SaffronOrange,
                                selectedTextColor = SaffronOrange,
                                indicatorColor = MustardLight,
                                unselectedIconColor = DeepCharcoal.copy(alpha = 0.6f),
                                unselectedTextColor = DeepCharcoal.copy(alpha = 0.6f)
                            ),
                            modifier = Modifier.testTag("tab_${tab.name.lowercase()}")
                        )
                    }
                }
            }
        }
    ) { innerPadding ->
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
        ) {
            // Main Screen Content
            if (activeStateExperience != null) {
                StateExperienceScreen(
                    state = activeStateExperience!!,
                    onBack = { activeStateExperience = null },
                    onSelectPlace = { activePlaceDetail = it },
                    onContributeClick = {
                        showContributeDialog = true
                    },
                    onSaveTrip = { st ->
                        coroutineScope.launch {
                            snackbarHostState.showSnackbar("Saved ${st.name} cultural route to My Next Trips! ✈️")
                        }
                    }
                )
            } else {
                AnimatedContent(
                    targetState = currentTab,
                    transitionSpec = { fadeIn() togetherWith fadeOut() },
                    label = "tab_animation"
                ) { tab ->
                    when (tab) {
                        AppTab.EXPLORE -> {
                            HomeScreen(
                                selectedState = selectedMapState,
                                onStateSelect = { selectedMapState = it },
                                onEnterState = { activeStateExperience = it },
                                onSelectPlace = { activePlaceDetail = it },
                                onOpenSearch = { showSearchDialog = true },
                                onOpenContribute = { showContributeDialog = true }
                            )
                        }
                        AppTab.CULTURE -> {
                            CultureExplorerScreen(
                                onSelectState = { activeStateExperience = it }
                            )
                        }
                        AppTab.TASTE -> {
                            FoodExplorerScreen(
                                onSaveFoodSpot = { spotName ->
                                    coroutineScope.launch {
                                        snackbarHostState.showSnackbar("Saved $spotName to your food bucket list! 🍛")
                                    }
                                }
                            )
                        }
                        AppTab.REELS -> {
                            ReelsScreen(
                                onShareReel = { title ->
                                    coroutineScope.launch {
                                        snackbarHostState.showSnackbar("Sharing link for \"$title\" 🇮🇳")
                                    }
                                }
                            )
                        }
                        AppTab.TRIPS -> {
                            TripsScreen()
                        }
                        AppTab.PROFILE -> {
                            ProfileScreen(
                                userContributions = userContributions,
                                onOpenContribute = { showContributeDialog = true }
                            )
                        }
                    }
                }
            }

            // Dialogs
            activePlaceDetail?.let { place ->
                PlaceDetailDialog(
                    place = place,
                    onDismiss = { activePlaceDetail = null },
                    onAddToTrip = {
                        coroutineScope.launch {
                            snackbarHostState.showSnackbar("Added ${place.name} to your trip bucket list! 📍")
                        }
                    }
                )
            }

            if (showContributeDialog) {
                ContributeDialog(
                    initialStateName = activeStateExperience?.name ?: selectedMapState?.name,
                    onDismiss = { showContributeDialog = false },
                    onSubmitSuccess = { contribution ->
                        userContributions.add(0, contribution)
                        coroutineScope.launch {
                            snackbarHostState.showSnackbar("Dhanyavaad! Story saved to Cultural Map (+50 Pts) 🇮🇳")
                        }
                    }
                )
            }

            if (showSearchDialog) {
                GlobalSearchDialog(
                    onDismiss = { showSearchDialog = false },
                    onSelectState = { st ->
                        selectedMapState = st
                        activeStateExperience = st
                    },
                    onSelectPlace = { place ->
                        activePlaceDetail = place
                    }
                )
            }
        }
    }
}
