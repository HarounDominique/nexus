package com.example.nexus.viewmodel

import androidx.lifecycle.ViewModel
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue

class MainViewModel: ViewModel() {

    var currentScreen by mutableStateOf("home");


}