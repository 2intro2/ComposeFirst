package com.example.coursecompose

import android.content.res.Configuration
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
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

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MaterialTheme {
            }
        }
    }
}

//@Preview(
//    name = "Red",
//    wallpaper = Wallpapers.RED_DOMINATED_EXAMPLE
//)
//@Preview(
//    name="Green",
//    wallpaper = Wallpapers.GREEN_DOMINATED_EXAMPLE
//)
//@Preview(
//    name="Red Dark",
//    wallpaper = Wallpapers.RED_DOMINATED_EXAMPLE,
//    uiMode = Configuration.UI_MODE_NIGHT_YES
//)
//@Preview(
//    name="Green Dark",
//    wallpaper = Wallpapers.GREEN_DOMINATED_EXAMPLE,
//    uiMode = Configuration.UI_MODE_NIGHT_YES
//)
//@Composable
//private fun DemoPreview() {
//    CourseComposeTheme {
//        Card {
//            Button({}, Modifier.padding(16.dp)) {
//                Text("wepie.com")
//            }
//
//        }
//    }
//}

@Preview
@Composable
private fun SwitchPreview() {
    CourseComposeTheme {
        var checked by remember { mutableStateOf(false) }
        Switch(checked, { checked=it }, thumbContent = {
            if (checked) {
                Icon(
                    imageVector = Icons.Filled.Check,
                    contentDescription = null,
                    modifier = Modifier.size(SwitchDefaults.IconSize)
                )
            }
        })
    }
}