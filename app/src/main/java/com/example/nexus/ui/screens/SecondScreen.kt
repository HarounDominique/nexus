package com.example.nexus.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import com.example.nexus.viewmodel.MainViewModel

@Composable
fun SecondScreen(navController: NavController, viewModel: MainViewModel = viewModel()) {
    val selectedItems = viewModel.items.filter { it.isSelected }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        if (selectedItems.isNotEmpty()) {
            Text("You have selected:")

            Spacer(modifier = Modifier.height(8.dp))

            selectedItems.forEach { item ->
                Text(
                    text = "- ${item.title}",
                    modifier = Modifier.padding(4.dp)
                )
            }

            Spacer(modifier = Modifier.height(16.dp))

            if (selectedItems.any { it.title == "Caminar más" }) {
                Button(onClick = { /* Acción específica */ }) {
                    Text("Open Book Suggestions")
                }
            }

            if (selectedItems.any { it.title == "Leer más" }) {
                Button(onClick = { /* Acción específica */ }) {
                    Text("Start Workout Routine")
                }
            }

            if (selectedItems.any { it.title == "Comer mejor" }) {
                Button(onClick = { /* Acción específica */ }) {
                    Text("Open Meditation Guide")
                }
            }

            if (selectedItems.any { it.title == "Viajar" }) {
                Button(onClick = { /* Acción específica */ }) {
                    Text("Open Meditation Guide")
                }
            }

            if (selectedItems.any { it.title == "Aprender un nuevo idioma" }) {
                Button(onClick = { /* Acción específica */ }) {
                    Text("Open Meditation Guide")
                }
            }

            // Puedes agregar más botones para otras opciones seleccionadas
        } else {
            Text("No items selected.")
        }

        Spacer(modifier = Modifier.height(16.dp))

        // Botón de regreso
        Button(
            onClick = { navController.navigateUp() },
            modifier = Modifier.align(Alignment.CenterHorizontally)
        ) {
            Text("Back to Home")
        }
    }
}
