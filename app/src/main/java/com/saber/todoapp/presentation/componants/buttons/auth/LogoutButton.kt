package com.saber.todoapp.presentation.componants.buttons.auth

import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color.Companion.Red
import com.saber.todoapp.common.assets.Iconly
import com.saber.todoapp.common.assets.icons.Logout
import com.saber.todoapp.common.assets.icons.`Share-outline`

@Composable
fun LogoutButton(onLogoutClickable: () -> Unit) =
    IconButton(onClick = onLogoutClickable, content = {
        Icon(
            imageVector = Iconly.Logout,
            contentDescription = "Share icon",
            tint = Red,
        )
    })