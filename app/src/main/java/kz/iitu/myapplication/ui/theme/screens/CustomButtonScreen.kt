package kz.iitu.myapplication.ui.theme.screens

import androidx.compose.foundation.layout.Box
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import kz.iitu.myapplication.ui.theme.components.CustomButton

@Composable

fun CustomButtonScreen(navController: NavHostController) {

    CustomButton(onClick = { /* Handle click */ }, text = "Click Me")
}

@Composable
fun CustomButton (text: String, onClick: () -> Unit){
    Box()
}