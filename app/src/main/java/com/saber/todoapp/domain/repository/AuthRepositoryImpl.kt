package com.saber.todoapp.domain.repository

import android.util.Log
import com.saber.todoapp.data.repository.AuthRepository
import com.saber.todoapp.domain.model.AuthSession
import io.github.jan.supabase.SupabaseClient
import io.github.jan.supabase.auth.auth
import io.github.jan.supabase.auth.providers.builtin.Email
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.put
import javax.inject.Inject

class AuthRepositoryImpl @Inject constructor(
    private val authApiService: SupabaseClient
) : AuthRepository {
    override suspend fun login(userEmail: String, userPassword: String) {
        val session = authApiService.auth.signInWith(Email) {
            email = userEmail
            password = userPassword
        }
        Log.d("Login: ", "login: $session")
    }

    override suspend fun register(userEmail: String, userPassword: String, name: String) {
        val session = authApiService.auth.signUpWith(Email) {
            email = userEmail
            password = userPassword
            data = buildJsonObject {
                put("name", name)
            }
        }
        Log.d("Register: ", "register: $session")
    }

    override suspend fun logout() {
        authApiService.auth.signOut()
    }
}