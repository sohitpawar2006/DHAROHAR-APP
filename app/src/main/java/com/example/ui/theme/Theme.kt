package com.example.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

private val DharoharColorScheme = lightColorScheme(
    primary = SaffronOrange,
    onPrimary = Color.White,
    primaryContainer = MustardLight,
    onPrimaryContainer = RoyalRedDark,
    secondary = PeacockGreen,
    onSecondary = Color.White,
    secondaryContainer = PreservationBg,
    onSecondaryContainer = PeacockGreenDark,
    tertiary = RoyalRed,
    onTertiary = Color.White,
    tertiaryContainer = Color(0xFFFEE2E2),
    onTertiaryContainer = RoyalRedDark,
    background = CreamBackground,
    onBackground = DeepCharcoal,
    surface = CreamSurface,
    onSurface = DeepCharcoal,
    surfaceVariant = CreamSurfaceVariant,
    onSurfaceVariant = EarthBrown,
    outline = CardBorder,
    outlineVariant = Sandstone,
)

@Composable
fun DharoharTheme(
    content: @Composable () -> Unit
) {
    // Keep custom Dharohar authentic Indian palette consistent across devices
    MaterialTheme(
        colorScheme = DharoharColorScheme,
        typography = Typography,
        content = content
    )
}
