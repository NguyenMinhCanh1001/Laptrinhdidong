@file:OptIn(ExperimentalMaterial3Api::class)

package com.example.myapplication

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun LayoutScreen(navController: NavController) {


    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        CenterAlignedTopAppBar(
            title = {
                Text(
                    "Row Layout",
                    color = Color(0xFF00CAFF),
                    style = MaterialTheme.typography.headlineSmall,
                    fontWeight = FontWeight.Bold
                )
            },
            navigationIcon = {
                IconButton(onClick = { navController.navigateUp() }) {
                    Icon(
                        imageVector = Icons.Filled.ArrowBack,
                        contentDescription = "Back",
                        tint = Color(0xFF00CAFF)
                    )
                }
            }
        )

        Spacer(modifier = Modifier.height(16.dp))

        Column {
            repeat(4) { rowIndex ->
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceEvenly
                ) {
                    repeat(3) { boxIndex ->
                        val bgColor = if (boxIndex == 1) Color(0xFF64B5F6) else Color(0xFFBBDEFB)
                        Box(
                            modifier = Modifier
                                .size(100.dp)
                                .padding(10.dp)
                                .background(bgColor, RoundedCornerShape(6.dp))
                        )
                    }
                }
            }
        }
    }
}
