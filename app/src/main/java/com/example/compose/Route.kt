package com.example.compose

sealed class Route (val route: String) {
    object Login : Route("Login")
}
