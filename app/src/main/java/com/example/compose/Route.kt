package com.example.composer

sealed class Route(val route: String) {
    object Login : Route("Login")
}