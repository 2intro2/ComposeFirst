package com.example.coursecompose

import android.content.res.Configuration
import android.content.res.Resources
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.LocalActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.animation.core.Spring
import androidx.compose.animation.core.animateDpAsState
import androidx.compose.animation.core.spring
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Switch
import androidx.compose.material3.SwitchDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.Wallpapers
import androidx.compose.ui.unit.dp
import androidx.lifecycle.lifecycleScope
import com.example.coursecompose.ui.theme.CourseComposeTheme
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material3.ColorScheme
import androidx.compose.runtime.rememberCoroutineScope
import com.example.coursecompose.ui.theme.DarkColorScheme
import com.example.coursecompose.ui.theme.LightColorScheme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AnimatedButton()
        }
    }
}

@Preview
@Composable
private fun AnimatedButton() {
    CourseComposeTheme {
        Card(Modifier.size(200.dp)) {
            var paddingX by remember { mutableStateOf(0.dp) }
            val animatePaddingX by animateDpAsState(paddingX, spring(Spring.DampingRatioHighBouncy))
            Button({
               if (paddingX == 100.dp) paddingX = 0.dp else paddingX = 100.dp
            }, Modifier.padding(start = animatePaddingX)) {
                Text("lhk")
            }
        }
    }
}

