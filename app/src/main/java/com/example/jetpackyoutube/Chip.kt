package com.example.jetpackyoutube

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Done
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.AssistChip
import androidx.compose.material3.AssistChipDefaults
import androidx.compose.material3.FilterChip
import androidx.compose.material3.FilterChipDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@Preview(showSystemUi = true)
@Composable
fun Chips(modifier: Modifier = Modifier) {
    Column (
        modifier = Modifier
            .padding(10.dp)
    ){
        AssistChip(
            onClick = {},
            label = {
                Text(
                    text = "Settings"
                )
            },
            leadingIcon = {
                Icon(
                    imageVector = Icons.Default.Settings,
                    contentDescription = "null"
                )
            },
            border = BorderStroke(2.dp, Color.Blue),
            colors = AssistChipDefaults.assistChipColors(
                containerColor = Color.Gray,
                leadingIconContentColor = Color.Green
            )
        )

        Row (
            modifier = Modifier
                .background(color = Color.DarkGray),
            horizontalArrangement = Arrangement.spacedBy(5.dp)
        ){
            var selectedChip by remember { mutableStateOf("All") }
            FilterChip(
                onClick = {selectedChip = "High"},
                selected = selectedChip == "All",
                label = { Text("All")},
                leadingIcon = {
                    if (selectedChip == "All"){
                        Icon(imageVector = Icons.Default.Done, contentDescription = "")
                    }
                },

                border = BorderStroke(2.dp, Color.Blue),
                colors = FilterChipDefaults.filterChipColors(
                    containerColor = Color.LightGray,
                    labelColor = Color.Green
                )
            )


            FilterChip(
                onClick = {selectedChip = "High"},
                selected = selectedChip == "High",
                label = { Text("High")},
                leadingIcon = {
                    if (selectedChip == "High"){
                        Icon(imageVector = Icons.Default.Done, contentDescription = "")
                    }
                },

                border = BorderStroke(2.dp, Color.Blue),
                colors = FilterChipDefaults.filterChipColors(
                    containerColor = Color.Red,
                    labelColor = Color.Black
                )
            )

            FilterChip(
                onClick = {selectedChip = "Medium"},
                selected = selectedChip == "Medium",
                label = { Text("Medium")},
                leadingIcon = {
                    if (selectedChip == "Medium"){
                        Icon(imageVector = Icons.Default.Done, contentDescription = "")
                    }
                },

                border = BorderStroke(2.dp, Color.Blue),
                colors = FilterChipDefaults.filterChipColors(
                    containerColor = Color.Yellow,
                    labelColor = Color.Black
                )
            )


            FilterChip(
                onClick = {selectedChip = "Low"},
                selected = selectedChip == "Low",
                label = { Text("Low")},
                leadingIcon = {
                    if (selectedChip == "Low"){
                        Icon(imageVector = Icons.Default.Done, contentDescription = "")
                    }
                },

                border = BorderStroke(2.dp, Color.Blue),
                colors = FilterChipDefaults.filterChipColors(
                    containerColor = Color.Green,
                    labelColor = Color.Black
                )
            )
        }
    }
}