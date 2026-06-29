package com.example.wecompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.annotation.DrawableRes
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.selection.selectable
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocal
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.wecompose.ui.theme.WeComposeTheme
import com.example.wecompose.ui.theme.black
import com.example.wecompose.ui.theme.green3
import com.example.wecompose.ui.theme.white1

class MainActivity : ComponentActivity() {
    var selectedTab by mutableIntStateOf(0)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            WeComposeTheme {
                Column (
                    modifier = Modifier.fillMaxSize(),
                    verticalArrangement = Arrangement.Bottom
                ) {
                    WeNavigationBar(selectedTab) { selectedTab = it}
                }
            }
        }
    }
}

@Composable
private fun WeNavigationBar(selected: Int, onSelected: (Int) -> Unit) {
    Row (Modifier.background(WeComposeTheme.colors.bottomBar)) {
        TabItem(
            if (selected == 0) R.drawable.ic_chat_filled else R.drawable.ic_chat_outlined,
            "聊天",
            if (selected == 0) WeComposeTheme.colors.iconCurrent else WeComposeTheme.colors.icon,
            Modifier.weight(1f).clickable { onSelected(0)}
            )
        TabItem(
            if (selected == 1) R.drawable.ic_contacts_filled else R.drawable.ic_contacts_outlined,
            "通讯录",
            if (selected == 1) WeComposeTheme.colors.iconCurrent else WeComposeTheme.colors.icon,
            Modifier.weight(1f).clickable { onSelected(1)}
        )
        TabItem(
            if (selected == 2) R.drawable.ic_discovery_filled else R.drawable.ic_discovery_outlined,
            "发现",
            if (selected == 2) WeComposeTheme.colors.iconCurrent else WeComposeTheme.colors.icon,
            Modifier.weight(1f).clickable { onSelected(2)}
        )
        TabItem(
            if (selected == 3) R.drawable.ic_me_filled else R.drawable.ic_me_outlined,
            "我",
            if (selected == 3) WeComposeTheme.colors.iconCurrent else WeComposeTheme.colors.icon,
            Modifier.weight(1f).clickable { onSelected(3)}
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun WeNavigationBarPreview() {
    var selectedTab by remember { mutableIntStateOf(0) }
    WeComposeTheme {
        WeNavigationBar(selectedTab) { selectedTab = it }
    }
}

@Preview(showBackground = true)
@Composable
private fun WeNavigationBarDarkPreview() {
    var selectedTab by remember { mutableIntStateOf(0) }
    WeComposeTheme(WeComposeTheme.Theme.Dark) {
        WeNavigationBar(selectedTab) { selectedTab = it }
    }
}

@Preview(showBackground = true)
@Composable
private fun WeNavigationBarNewYearPreview() {
    var selectedTab by remember { mutableIntStateOf(0) }
    WeComposeTheme(WeComposeTheme.Theme.NewYear) {
        WeNavigationBar(selectedTab, { tab: Int ->
            selectedTab = tab
        })
    }
}

@Composable
private fun TabItem(@DrawableRes iconId: Int, title: String, tint: Color, modifier: Modifier = Modifier) {
    Column (
        modifier.padding(top= 10.dp, bottom = 6.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Icon(painterResource(iconId), title, Modifier.size(24.dp), tint = tint)
        Text (title, fontSize = 11.sp, color = tint)
    }
}

@Preview(showBackground = true)
@Composable
private fun TabItemPreview() {
    TabItem(R.drawable.ic_chat_outlined, "聊天", WeComposeTheme.colors.icon)
}
