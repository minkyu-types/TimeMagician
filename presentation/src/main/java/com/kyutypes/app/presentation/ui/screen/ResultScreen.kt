package com.kyutypes.app.presentation.ui.screen

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LayoutResult() {
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(text = "Time Magician")
                },
                actions = {
                    IconButton(onClick = { doSomething() }) {
                        Icon(Icons.Filled.Favorite, contentDescription = null)
                    }
                }
            )
        }
    ) { a ->
        a.calculateBottomPadding()
    }
}

fun doSomething() {

}
