@file:OptIn(ExperimentalMaterial3Api::class)

package com.example.myapplication

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.myapplication.R
import androidx.compose.ui.text.style.TextDecoration


@Composable
fun ImageDetail(navController: NavController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(12.dp)
    ) {
        CenterAlignedTopAppBar(
            title = {
                Text(
                    "Text Detail",
                    color = Color(0xFF00CAFF),
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
        Image(
            painter = painterResource(id = R.drawable.uth1),
            contentDescription = "Image 1",
            modifier = Modifier
                .fillMaxWidth()
                .height(180.dp)
        )
        //  Link bên dưới hình
        Text(
            text = "https://portal.ut.edu.vn/dashboard",
            color = Color.Black,
            style = MaterialTheme.typography.bodyMedium.copy(
                textDecoration = TextDecoration.Underline
            ),
            modifier = Modifier.padding(start = 10.dp)
        )

        Image(
            painter = painterResource(id = R.drawable.uth2),
            contentDescription = "Image 2",
            modifier = Modifier
                .fillMaxWidth()
                .height(180.dp)
        )
        Text("Trường Đại học Giao Thông Vận Tải TP.HCM", fontWeight = FontWeight.Bold)
    }
}
