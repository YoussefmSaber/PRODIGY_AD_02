package com.saber.todoapp.presentation.componants

import android.util.Log
import androidx.compose.animation.AnimatedContent
import androidx.compose.animation.core.tween
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.animation.togetherWith
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color.Companion.Black
import androidx.compose.ui.graphics.Color.Companion.Gray
import androidx.compose.ui.graphics.Color.Companion.Green
import androidx.compose.ui.graphics.Color.Companion.White
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.saber.todoapp.common.assets.Iconly
import com.saber.todoapp.common.assets.icons.Hide
import com.saber.todoapp.common.assets.icons.Message
import com.saber.todoapp.common.assets.icons.Password
import com.saber.todoapp.common.assets.icons.Profile
import com.saber.todoapp.common.assets.icons.`Search-outline`
import com.saber.todoapp.common.assets.icons.Show

@Composable
fun CustomOutlinedTextField(
    label: String,
    placeholder: String,
    icon: ImageVector,
    inputValue: String,
    onValueChange: (String) -> Unit,
    isPassword: Boolean = false,
) {
    // State to manage password visibility
    val isPasswordVisible = remember { mutableStateOf(isPassword) }

    Column {
        Text(
            text = label,
            fontSize = 14.sp,
            color = Black,
            fontWeight = FontWeight.Normal,
            modifier = Modifier.padding(start = 8.dp)
        )
        Spacer(Modifier.height(8.dp))
        OutlinedTextField(
            value = inputValue,
            onValueChange = {
                onValueChange(it)
            },
            leadingIcon = { Icon(imageVector = icon, contentDescription = "$label icon") },
            trailingIcon = {
                if (isPassword) {
                    AnimatedContent(
                        targetState = isPasswordVisible.value, label = "",
                        transitionSpec = {
                            (fadeIn(animationSpec = tween(300))).togetherWith(
                                fadeOut(
                                    animationSpec = tween(
                                        300
                                    )
                                )
                            )
                        }) { targetState ->
                        IconButton(
                            onClick = {
                                isPasswordVisible.value = !isPasswordVisible.value
                            },
                        ) {
                            Icon(
                                imageVector = if (targetState) Iconly.Hide else Iconly.Show,
                                contentDescription = if (targetState) "Hide password" else "Show password",
                            )
                        }
                    }
                }
            },
            shape = RoundedCornerShape(25),
            colors = OutlinedTextFieldDefaults.colors(
                focusedBorderColor = Green,
                unfocusedBorderColor = Gray,
                focusedLabelColor = Black,
                unfocusedTextColor = Black,
                unfocusedLeadingIconColor = Gray,
                focusedLeadingIconColor = Green,
                focusedTextColor = Black
            ),
            textStyle = TextStyle(
                fontSize = 12.sp,
                fontWeight = FontWeight.Normal,
                color = Black
            ),
            placeholder = {
                Text(
                    text = placeholder,
                    fontSize = 12.sp,
                    fontWeight = FontWeight.Normal,
                    color = Gray
                )
            },
            modifier = Modifier
                .fillMaxWidth()
                .background(White, shape = RoundedCornerShape(25)),
            singleLine = true,
            visualTransformation =
            if (isPasswordVisible.value) PasswordVisualTransformation() else VisualTransformation.None
        )
    }
}

@Composable
fun SignupInputFields(
    nameState: MutableState<String>,
    emailState: MutableState<String>,
    passwordState: MutableState<String>,
    confPasswordState: MutableState<String>,
) {
    CustomOutlinedTextField(
        label = "Name",
        placeholder = "Enter Name",
        icon = Iconly.Profile,
        inputValue = nameState.value,
        onValueChange = { nameState.value = it },
        isPassword = false
    )
    CustomOutlinedTextField(
        label = "Email",
        placeholder = "Enter Email",
        icon = Iconly.Message,
        inputValue = emailState.value,
        onValueChange = { emailState.value = it },
        isPassword = false
    )
    CustomOutlinedTextField(
        label = "Password",
        placeholder = "Enter Password",
        icon = Iconly.Password,
        inputValue = passwordState.value,
        onValueChange = { passwordState.value = it },
        isPassword = true
    )
    CustomOutlinedTextField(
        label = "Confirm Password",
        placeholder = "Retype Password",
        icon = Iconly.Password,
        inputValue = confPasswordState.value,
        onValueChange = {
            confPasswordState.value = it
            if (confPasswordState.value != passwordState.value) {
                Log.d("TAG", "Passwords do not match")
            }
        },
        isPassword = true
    )
}

@Composable
fun LoginInputFields(
    emailState: MutableState<String>,
    passwordState: MutableState<String>,
) {
    CustomOutlinedTextField(
        label = "Email",
        placeholder = "Enter Email",
        icon = Iconly.Message,
        inputValue = emailState.value,
        onValueChange = { emailState.value = it },
        isPassword = false
    )
    CustomOutlinedTextField(
        label = "Password",
        placeholder = "Enter Password",
        icon = Iconly.Password,
        inputValue = passwordState.value,
        onValueChange = { passwordState.value = it },
        isPassword = true
    )
}