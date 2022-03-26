package net.nevardreik.jetpackcomposebase.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable

@Composable
fun JetpackComposeBaseTheme(darkTheme: Boolean = isSystemInDarkTheme(), content: @Composable () -> Unit) {
    val colors = if (darkTheme) {
		darkColors(
			primary = MaterialTheme.colors.primary,
			primaryVariant = MaterialTheme.colors.primaryVariant,
			secondary = MaterialTheme.colors.secondary
		)
    } else {
		lightColors(
			primary = MaterialTheme.colors.primary,
			primaryVariant = MaterialTheme.colors.primaryVariant,
			secondary = MaterialTheme.colors.secondary
		)
    }

    MaterialTheme(
        colors = colors,
        typography = Typography,
        shapes = Shapes,
        content = content
    )
}