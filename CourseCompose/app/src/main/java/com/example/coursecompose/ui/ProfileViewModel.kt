package com.example.coursecompose.ui

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.StateFlow

class ProfileViewModel : ViewModel() {
    val userState: StateFlow<String> = TODO()
    var user by mutableStateOf("lhk")

}