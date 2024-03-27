package com.example.aminah_rashid_193_20_0003_lab_exam

import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument

@Composable
fun NavGraph() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "Home") {
        composable(route = "Home") {
            CitySelectionScreen(navController)
        }

        composable(route = "Details/{city}", arguments = listOf(navArgument(name = "city") {
            type = NavType.StringType
            defaultValue = "Karachi"
            nullable = true
        }) {
            backstackEntry -> backstackEntry.arguments?.getString("name")?.let { city ->
                WeatherDetailsScreen(city)
            }
        }
    }

}