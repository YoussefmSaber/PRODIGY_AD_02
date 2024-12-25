package com.saber.todoapp.common

import com.saber.todoapp.data.data_source.db.Task

object Constants {
    const val ADD_TASK_SCREEN = "ADD_TASK_SCREEN"
    const val TASK_TITLE = "TASK_TITLE"
    const val TASK_DESCRIPTION = "TASK_DESCRIPTION"
    const val TASK_STATUS = "TASK_STATUS"
    val EMPTY_TASK = Task(0, "", "", "", "", false)
}