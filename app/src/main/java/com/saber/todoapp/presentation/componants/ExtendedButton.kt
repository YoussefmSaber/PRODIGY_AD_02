package com.saber.todoapp.presentation.componants

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.KeyboardArrowDown
import androidx.compose.material.icons.outlined.KeyboardArrowUp
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ExposedDropdownMenuBox
import androidx.compose.material3.ExposedDropdownMenuDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MenuAnchorType
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.saber.todoapp.common.assets.Iconly

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun PriorityDropDown() {
    val priorityList = listOf("Low", "Medium", "High")
    val selectedOption = remember { mutableStateOf("") }
    val isExpanded = remember { mutableStateOf(false) }
    ExposedDropdownMenuBox(
        expanded = isExpanded.value,
        onExpandedChange = { isExpanded.value = !isExpanded.value }

    ) {
        TextField(
            value = selectedOption.value,
            modifier = Modifier.menuAnchor(
                type = MenuAnchorType.PrimaryNotEditable,
                enabled = true
            ),
            shape = RoundedCornerShape(12.dp),
            onValueChange = {},
            readOnly = true,
            trailingIcon = {
                Icon(
                    if (isExpanded.value) Icons.Outlined.KeyboardArrowUp else Icons.Outlined.KeyboardArrowDown,
                    contentDescription = "Drop down icon"
                )
            },
            colors = TextFieldDefaults.colors(
                focusedIndicatorColor = Color.Transparent,
                unfocusedIndicatorColor = Color.Transparent

            )
        )
        ExposedDropdownMenu(expanded = isExpanded.value,
            onDismissRequest = { isExpanded.value = false }) {
            priorityList.forEachIndexed { _, text ->
                DropdownMenuItem(text = { Text(text) },
                    onClick = {
                        selectedOption.value = text
                        isExpanded.value = false
                    })
            }
        }
    }
}