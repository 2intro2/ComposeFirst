package com.example.coursecompose

import android.app.appsearch.SearchSpec
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {

        }
    }
}


@Composable
fun MyTextField(modifier: Modifier = Modifier) {
 var isFocused by remember { mutableStateOf(false) }
}


@Composable
fun MyTextField(isFocused: Boolean) {

}

@Composable
fun SearchBar(query: String, modifier: Modifier = Modifier) {
}

@Composable
fun ContentList(query: String, modifier: Modifier = Modifier) {

}

@Composable
fun SearchPage(modifier: Modifier = Modifier) {
    var query by remember { mutableStateOf("") }
    Column {
        SearchBar(query)
        ContentList(query)

    }
}