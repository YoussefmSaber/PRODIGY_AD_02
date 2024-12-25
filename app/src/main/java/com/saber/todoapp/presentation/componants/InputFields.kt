package com.saber.todoapp.presentation.componants

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color.Companion.Black
import androidx.compose.ui.graphics.Color.Companion.Gray
import androidx.compose.ui.graphics.Color.Companion.White
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun CustomOutlinedTextField(
    label: String,
    placeholder: String,
    icon: ImageVector? = null,
    inputValue: String,
    minLines: Int = 1,
    onValueChange: (String) -> Unit,
) {
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
            value = inputValue, // Ensure this value is correctly bound to the state
            minLines = minLines,
            onValueChange = { newText ->
                onValueChange(newText) // Update the state in the parent composable
            },
            leadingIcon = {
                if (icon != null) {
                    Icon(
                        imageVector = icon,
                        contentDescription = "$label icon"
                    )
                }
            },
            shape = RoundedCornerShape(12.dp),
            colors = OutlinedTextFieldDefaults.colors(
                focusedBorderColor = Gray,
                unfocusedBorderColor = Gray,
                focusedLabelColor = Black,
                unfocusedTextColor = Black,
                unfocusedLeadingIconColor = Gray,
                focusedLeadingIconColor = Gray,
                focusedTextColor = Black,
                focusedContainerColor = White,
                unfocusedContainerColor = White
            ),
            textStyle = TextStyle(
                fontSize = 16.sp,
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
            modifier = Modifier.fillMaxWidth(),
        )
    }
}