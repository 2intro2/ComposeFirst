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
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.adaptive.navigationsuite.NavigationSuiteScaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocal
import androidx.compose.runtime.key
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalWindowInfo
import androidx.compose.ui.unit.dp
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
             * 通常来讲 宽度超过600dp 就已经属于中等尺寸了 可以使用600dp作为分界线
             * 当前App占用窗口尺寸变化的时候 LocalWindowInfo的值就会改变(例如折叠屏开合的时候)
             * 从而触发Composable函数重组 让界面刷新
             */
            //
            if (LocalWindowInfo.current.containerDpSize.width >= 600.dp) {
                //  页面级Composable函数
            } else {
                //  页面级Composable函数
            }
        }
//
//        NavigationSuiteScaffold() {
//
//        }
    }
}