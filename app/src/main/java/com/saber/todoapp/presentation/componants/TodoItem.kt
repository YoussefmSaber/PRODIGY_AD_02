package com.saber.todoapp.presentation.componants

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.saber.todoapp.data.data_source.db.Task
import com.saber.todoapp.ui.theme.AppColors

/**
 * A composable function that displays a to-do item with a title, description, status, and priority.
 *
 * @param task The task retried from the database.
 * @param navigateToTaskDetails Lambda function to navigate the user to the task details screen.
 */
@Preview
@Composable
fun TodoItem(
    navigateToTaskDetails: (Task) -> Unit = {},
    task: Task = Task(0, "", "", "", "", false)
) {
    // Determine the color based on the task status
    val statusColor = when (task.status) {
        "Pending" -> AppColors.statusPending
        "In Progress" -> AppColors.statusInProgress
        "Completed" -> AppColors.statusCompleted
        else -> AppColors.TextSecondary
    }

    // Determine the color based on the task priority
    val priorityColor = when (task.priority) {
        "Low" -> AppColors.priorityLow
        "Medium" -> AppColors.priorityMedium
        "High" -> AppColors.priorityHigh
        else -> AppColors.TextSecondary
    }
    // Create a card to display the to-do item
    Card(
        shape = RoundedCornerShape(12.dp), // Rounded corners for the card
        colors = CardDefaults.cardColors(
            containerColor = AppColors.Palette10, // Background color of the card
        ),
        elevation = CardDefaults.elevatedCardElevation(4.dp), // Elevation of the card
        modifier = Modifier.fillMaxWidth(), // Fill the maximum width
        onClick = { navigateToTaskDetails(task) }
    ) {
        // Create a row to arrange the content horizontally
        Row(
            horizontalArrangement = Arrangement.SpaceBetween, // Space between the elements
            modifier = Modifier.fillMaxWidth(), // Fill the maximum width
        ) {
            // Create a column to arrange the title and description vertically
            Column(
                Modifier
                    .padding(16.dp)
                    .weight(1f)
            ) {
                // Display the title of the to-do item
                Text(
                    task.title,
                    color = AppColors.TextSecondary, // Text color
                    maxLines = 1,// Maximum number of lines
                    fontSize = 18.sp // Font size
                )
                Spacer(modifier = Modifier.height(8.dp)) // Spacer for vertical spacing
                // Display the description of the to-do item
                task.description?.let {
                    Text(
                        it,
                        color = AppColors.Palette7, // Text color
                        fontSize = 14.sp, // Font size
                        maxLines = 1, // Maximum number of lines
                        overflow = TextOverflow.Ellipsis // Ellipsis for overflow text
                    )
                }
            }

            // Create a row to arrange the status and priority vertically
            Row(
                verticalAlignment = Alignment.Bottom, // Align the elements at the bottom
            ) {
                // Display the status of the to-do item
                Box(modifier = Modifier.padding(vertical = 16.dp)) {
                    Text(task.status, color = statusColor, fontSize = 12.sp)
                }
                Spacer(modifier = Modifier.width(8.dp)) // Spacer for horizontal spacing

                // Display the priority color
                Card(
                    colors = CardDefaults.cardColors(
                        containerColor = priorityColor // Background color based on priority
                    ),
                    shape = RoundedCornerShape(
                        topEnd = 12.dp,
                        bottomEnd = 12.dp
                    ), // Rounded corners for the card
                    modifier = Modifier
                        .height(95.dp) // Height of the card
                        .width(20.dp) // Width of the card
                ) {
                    // Empty card for priority color
                }
            }
        }
    }
}