package com.example.foodrecipe.presentation.componants.buttons.auth

import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color.Companion.Red
import com.saber.todoapp.common.assets.Iconly
import com.saber.todoapp.common.assets.icons.`Share-outline`

// TODO: Implement LogoutButton
@Composable
fun LogoutButton(onLogoutClickable: () -> Unit) =
    IconButton(onClick = onLogoutClickable, content = {
        Icon(
            imageVector = Iconly.`Share-outline`,
            contentDescription = "Share icon",
            tint = Red,
        )
    })