package com.example.nexus.ui.screens


import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Button
import androidx.compose.material3.Checkbox
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import com.example.nexus.viewmodel.MainViewModel

@Composable
fun HomeScreen(navController: NavController, viewModel: MainViewModel = viewModel()) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        // Título
        Text(
            text = "Me propongo:",
            fontWeight = FontWeight.Bold,
            style = androidx.compose.material3.MaterialTheme.typography.headlineSmall,
            modifier = Modifier.padding(bottom = 16.dp)
        )

        // Lista de elementos con Checkboxes
        LazyColumn {
            items(viewModel.items.size) { index ->
                val item = viewModel.items[index]

                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(vertical = 8.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Checkbox(
                        checked = item.isSelected,
                        onCheckedChange = { viewModel.toggleItemSelected(index) }
                    )
                    Spacer(modifier = Modifier.width(8.dp))
                    Text(text = item.title)
                }
            }
        }

        Spacer(modifier = Modifier.height(16.dp))

        // Botón de navegación
        Button(
            onClick = { navController.navigate("second") },
            modifier = Modifier.align(Alignment.CenterHorizontally)
        ) {
            Text("Go to Second Screen")
        }
    }
}