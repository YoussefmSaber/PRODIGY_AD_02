package com.saber.todoapp.data.repository

import com.saber.todoapp.domain.model.AuthSession

interface AuthRepository {
    // Example function
   suspend fun login(userEmail: String, userPassword: String)
   suspend fun register(userEmail: String, userPassword: String, name: String)
   suspend fun logout()
}