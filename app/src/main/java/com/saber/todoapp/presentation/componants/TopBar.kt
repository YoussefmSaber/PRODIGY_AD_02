package com.saber.todoapp.presentation.componants

import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color.Companion.Black
import androidx.compose.ui.graphics.Color.Companion.Transparent
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.sp
import com.saber.todoapp.presentation.componants.buttons.auth.LogoutButton
import com.saber.todoapp.presentation.componants.buttons.BackArrowButton

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun GeneralTopBar(
    title: String,
    isNavigationIcon: Boolean = false,
    isLogoutIcon: Boolean = false,
    onCLickCallBack: () -> Unit = {},
) {
    CenterAlignedTopAppBar(
        colors = TopAppBarDefaults.topAppBarColors(
            scrolledContainerColor = Transparent,
            titleContentColor = Black,
            containerColor = Transparent,
            navigationIconContentColor = Black
        ),
        title = {
            Text(
                title,
                maxLines = 1,
                fontSize = 25.sp,
                overflow = TextOverflow.Ellipsis
            )
        },
        navigationIcon = {
            if (isNavigationIcon) BackArrowButton(
                onClick = onCLickCallBack,
                modifier = Modifier
            )
        },
        actions = {
            if (isLogoutIcon) {
                LogoutButton(onLogoutClickable = {

                })
            }
        }
    )
}

