package com.saber.todoapp.presentation.componants.buttons.auth

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.Green
import androidx.compose.ui.graphics.Color.Companion.White
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.saber.todoapp.common.assets.Iconly
import com.saber.todoapp.common.assets.icons.`Arrow-right-outline`
import com.saber.todoapp.common.assets.icons.`Plus-outline`

@Composable
fun IconButton(
    text: String, onClick: () -> Unit,
    color: Color
) {
    Button(
        onClick = onClick,
        shape = RoundedCornerShape(25),
        colors = ButtonDefaults.buttonColors(containerColor = color),
        modifier = Modifier.fillMaxWidth()
    ) {
        Row(
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.padding(vertical = 8.dp, horizontal = 16.dp)
        ) {
            Text(text, color = White, fontSize = 16.sp)
            Spacer(Modifier.width(4.dp))
            Image(
                imageVector = Iconly.`Plus-outline`,
                contentDescription = "Arrow",
                colorFilter = ColorFilter.tint(White),
                modifier = Modifier.size(20.dp)
            )
        }
    }
}