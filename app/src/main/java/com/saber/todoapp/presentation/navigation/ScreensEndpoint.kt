package com.saber.todoapp.presentation.navigation

import kotlinx.serialization.Serializable

@Serializable
object Auth

@Serializable
object Onboarding

@Serializable
object Login

@Serializable
object Register

@Serializable
object ForgotPassword

@Serializable
object ResetPassword

@Serializable
object VerifyEmail

@Serializable
object App

@Serializable
data class TaskDetails(val taskId: String)

@Serializable
object TaskList

@Serializable
object Settings

@Serializable
data class EditTask(val taskId: String)