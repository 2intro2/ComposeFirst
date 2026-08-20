package com.example.coursecompose.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.lifecycle.viewmodel.compose.viewModel

// 个人信息页面
@Composable
fun ProfileScreen(viewModel: ProfileViewModel = viewModel()) {
    viewModel.userState.collectAsState()
    Column{
        Header() // 等价于HeaderView
        FriendList()
    }
}

@Composable
fun FriendList() {
}

@Composable
fun Header() {
    Row {
        Avatar() // 等价于AvatarView
        UserInfo()
    }
}

@Composable
fun UserInfo() {
}

@Composable
fun Avatar() {
}