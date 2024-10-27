package com.example.nexus.viewmodel

import androidx.lifecycle.ViewModel
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.setValue

class MainViewModel: ViewModel() {

    var currentScreen by mutableStateOf("home");

    val items = mutableStateListOf(
        CheckboxItem("Caminar más", false),
        CheckboxItem("Leer más", false),
        CheckboxItem("Comer mejor", false),
        CheckboxItem("Viajar", false),
        CheckboxItem("Aprender un nuevo idioma", false)
    )

    fun toggleItemSelected(index: Int) {
        items[index] = items[index].copy(isSelected = !items[index].isSelected)
    }
}

data class CheckboxItem(val title: String, val isSelected: Boolean)