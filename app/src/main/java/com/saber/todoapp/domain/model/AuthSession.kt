package com.saber.todoapp.domain.model

data class AuthSession (
    val token: String,
    val refreshToken: String,
    val expiresAt: Long
)