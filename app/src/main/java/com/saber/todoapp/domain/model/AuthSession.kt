package com.saber.todoapp.domain.model

import kotlinx.serialization.Serializable

@Serializable
data class AuthSession (
    val token: String,
    val refreshToken: String,
    val expiresAt: Long
)