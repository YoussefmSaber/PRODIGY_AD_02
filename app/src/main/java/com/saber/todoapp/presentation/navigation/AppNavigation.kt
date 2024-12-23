package com.saber.todoapp.presentation.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigation

@Composable
fun ApplicationNavigation(navController: NavHostController) {
    NavHost(navController, startDestination = Auth) {
        navigation<Auth>(startDestination = Onboarding) {
            composable<Onboarding> {
                navController.navigate(Login)
            }
            composable<Login> {
                navController.navigate(Register)
                navController.navigate(ForgotPassword)
                navController.navigate(App)
            }
            composable<Register> {
                navController.navigate(Login)
            }
            composable<ForgotPassword> {
                navController.popBackStack()
                navController.navigate(VerifyEmail)
            }
            composable<VerifyEmail> {
                navController.popBackStack()
                navController.navigate(ResetPassword)
            }
            composable<ResetPassword> {
                navController.popBackStack()
                navController.navigate(Login)
            }
        }
        navigation<App>(startDestination = TaskList) {
            composable<TaskList> {
                navController.navigate(TaskDetails("1"))
                navController.navigate(Settings)
            }
            composable<TaskDetails> {
                navController.popBackStack()
            }
            composable<Settings> {
                navController.popBackStack()
            }
            composable<EditTask> {
                navController.popBackStack()
            }
        }
    }
}