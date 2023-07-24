package com.kyutypes.app.presentation.ui.screen

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Tab
import androidx.compose.material3.TabRow
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.tooling.preview.Preview

@Preview
@Composable
fun ConvertScreenPreview() {
    TabLayout()
}

@Composable
fun TabLayout() {
    val tabs = listOf("TimeZone", "Region")
    var selectedTabIndex by remember { mutableStateOf(0) }

    Column {
        TabRow(selectedTabIndex = selectedTabIndex) {
            tabs.forEachIndexed { index, title ->
                Tab(
                    text = { Text(title) },
                    selected = selectedTabIndex == index,
                    onClick = { selectedTabIndex = index }
                )
            }
        }

        when(selectedTabIndex) {
            0 -> LayoutTimeZone()
            1 -> LayoutRegion()
        }
    }
}

@Composable
fun LayoutTimeZone() {
    Text("This is TimeZone Tab")
}

@Composable
fun LayoutRegion() {
    Text("This is Region Tab")
}