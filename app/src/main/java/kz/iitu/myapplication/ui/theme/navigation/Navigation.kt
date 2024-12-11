package kz.iitu.myapplication.ui.theme.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import kz.iitu.myapplication.ui.theme.screens.CanvasDrawingScreen
import kz.iitu.myapplication.ui.theme.screens.CustomButtonScreen
import kz.iitu.myapplication.ui.theme.screens.GestureHandlingScreen


@Composable
fun Navigation() {
    val navController: NavHostController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = "custom_button"
    ) {
        composable("custom_button") { CustomButtonScreen(navController) }
        composable("gesture_handling") { GestureHandlingScreen(navController) }
        composable("canvas_drawing") { CanvasDrawingScreen(navController) }
    }
}