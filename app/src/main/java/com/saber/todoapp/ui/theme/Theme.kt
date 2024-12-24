package com.saber.todoapp.ui.theme

import android.app.Activity
import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.ColorScheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext

@Composable
fun TodoAppTheme(
    content: @Composable () -> Unit
) {
    MaterialTheme(
        colorScheme = lightColorScheme(
            primary = AppColors.Palette4,
            surfaceVariant = AppColors.Palette1,
            secondary = AppColors.Palette2,
            background = AppColors.background,
            onPrimary = AppColors.TextPrimary,
            onSecondary = AppColors.TextSecondary,
            onBackground = AppColors.TextSecondary,
            onSurface = AppColors.TextSecondary,
            error = Color.Red,
            onError = AppColors.TextPrimary,
        ),
        content = content,
        typography = Typography
    )
}