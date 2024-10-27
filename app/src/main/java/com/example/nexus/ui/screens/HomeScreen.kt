package com.example.nexus.ui.screens

import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavController

@Composable
fun HomeScreen(navController: NavController) {
    Button(onClick = { navController.navigate("second") }) {
        Text("Go to Second Screen")
    }
}