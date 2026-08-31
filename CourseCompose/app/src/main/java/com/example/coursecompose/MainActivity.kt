package com.example.coursecompose

import android.app.appsearch.SearchSpec
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.key
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.example.coursecompose.ui.ProfileScreen
import com.example.coursecompose.ui.ProfileViewModel
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation3.runtime.NavEntry
import androidx.navigation3.ui.NavDisplay

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            /**
             * mutableStateListOf<String>() 元素的增删改 都会被Compose感知 并触发Compose重组
             * backStack会存储和管理当前加入的页面标识 并展示最后一项标识对应的页面
             * 所以 backStack务必存在一个默认元素
             */
            val backStack = remember { mutableStateListOf<String>("A") }
            NavDisplay(backStack) { key ->
               when (key) {
                   "A" -> NavEntry(key) { ScreenA { backStack.add("B")} } // 将标识"A" 和 页面ScreenA 进行绑定
                   "B" -> NavEntry(key) { ScreenB() }
                   else -> NavEntry(key) { }
               }
            }
        }
    }
}

@Composable
fun ScreenA(modifier: Modifier = Modifier, onClick: ()-> Unit) {
    Box(modifier.fillMaxSize().background(Color.Yellow).clickable{ onClick() })
}

@Composable
fun ScreenB(modifier: Modifier = Modifier) {
    Box(modifier.fillMaxSize().background(Color.Green))
}