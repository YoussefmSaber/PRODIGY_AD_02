package com.saber.todoapp.data.repository

import com.saber.todoapp.domain.model.AuthSession

interface AuthRepository {
    // Example function
    suspend fun authenticate(username: String, password: String): AuthSession
}