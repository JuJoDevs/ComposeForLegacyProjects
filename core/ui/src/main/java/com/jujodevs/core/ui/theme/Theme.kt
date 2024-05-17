package com.jujodevs.core.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.graphics.Color
import com.jujodevs.core.ui.Dimensions
import com.jujodevs.core.ui.LocalSpacing

private val DarkColorScheme = darkColorScheme(
    primary = BrightGreen,
    onPrimary = Color.White,
    primaryContainer = DarkGreen,
    onPrimaryContainer = TextWhite,
    secondary = Orange,
    onSecondary = Color.White,
    secondaryContainer = Orange,
    onSecondaryContainer = TextWhite,
    background = MediumGray,
    onBackground = TextWhite,
    surface = LightGray,
    onSurface = TextWhite,
    surfaceVariant = DarkGray,
    onSurfaceVariant = LightGray,
    outline = DarkGray,
)

private val LightColorScheme = lightColorScheme(
    primary = BrightGreen,
    onPrimary = Color.White,
    primaryContainer = DarkGreen,
    onPrimaryContainer = TextWhite,
    secondary = Orange,
    onSecondary = Color.White,
    secondaryContainer = Orange,
    onSecondaryContainer = TextWhite,
    background = Color.White,
    onBackground = DarkGray,
    surface = Color.White,
    onSurface = DarkGray,
    surfaceVariant = LightGray,
    onSurfaceVariant = DarkGray,
    outline = DarkGray,
)

@Composable
fun ComposeTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit,
) {
    val colorScheme = when {
        darkTheme -> DarkColorScheme
        else -> LightColorScheme
    }

    CompositionLocalProvider(LocalSpacing provides Dimensions()) {
        MaterialTheme(
            colorScheme = colorScheme,
            shapes = Shapes,
            typography = Typography,
            content = content
        )
    }

}