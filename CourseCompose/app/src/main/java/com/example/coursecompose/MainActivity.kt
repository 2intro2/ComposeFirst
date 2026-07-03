package com.example.coursecompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeContentPadding
import androidx.compose.foundation.layout.safeDrawingPadding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.VerticalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.layoutId
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.lifecycleScope
import com.example.coursecompose.ui.theme.CourseComposeTheme
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        val nums = (1..100).toList()
        setContent {
            Column(Modifier.safeDrawingPadding()
                .verticalScroll(rememberScrollState())
            ) {

                Text(
                    "头部",
                    Modifier.background(Color.Yellow),
                    fontSize = 28.sp
                )

                for (num in nums) {
                    Text("第 $num 项")
                }

                Text(
                    "底部 ",
                    Modifier.background(Color.Yellow),
                    fontSize = 42.sp
                )

            }

//            LazyColumn(
//                Modifier
//                    .safeDrawingPadding()
//                    .background(Color.Green)
//                    .height(200.dp)
//            ) {
//                item {
//                    Text(
//                        "头部",
//                        Modifier.background(Color.Yellow),
//                        fontSize = 28.sp
//                    )
//                }
//                items(nums) {
//                    Text("第 $it 项")
//                }
//                item {
//                    Text(
//                        "底部 ",
//                        Modifier.background(Color.Yellow),
//                        fontSize = 42.sp
//                    )
//                }
//            }
//            Box (
//                Modifier.safeDrawingPadding()
//            ) {
//                var name by remember { mutableStateOf("lhk") }
//                Text(
//                    name,
//                    Modifier.background(Color.Yellow),
//                    fontSize = 28.sp,
//                    fontWeight = FontWeight.Black
//                )
//
//                Image(
//                    painterResource(R.drawable.ic_launcher_foreground),
//                    "头像"
//                )
//
//                var buttonText by remember { mutableStateOf("点我") }
//                Button(
//                    {
//                    buttonText = "点了!"
//                }
//                ) {
//                    Text(buttonText)
//                }
//            }
        }
    }

}
