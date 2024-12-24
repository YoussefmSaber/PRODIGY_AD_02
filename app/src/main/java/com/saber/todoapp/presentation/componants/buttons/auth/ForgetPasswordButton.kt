package com.example.foodrecipe.presentation.componants.buttons.auth

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color.Companion.Yellow
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun ForgetPasswordButton(onForgetClick: () -> Unit) {
    TextButton(
        onClick = onForgetClick,
        contentPadding = PaddingValues(0.dp),
    ) {
        Text(
            "Forget Password?",
            color = Yellow,
            fontSize = 14.sp,
            fontWeight = FontWeight.Normal,
        )
    }
}
