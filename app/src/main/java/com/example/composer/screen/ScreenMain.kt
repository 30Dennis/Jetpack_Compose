package com.example.composer.screen

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.compose.screen.LoginPage
import com.example.composer.Route

@Composable
fun ScreenMain(){
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = Route.Login.route) {

        composable(Route.Login.route) {
            LoginPage(navController = navController)
        }
    }
}