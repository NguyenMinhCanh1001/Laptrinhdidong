package com.example.myapplication

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.myapplication.R

@Composable
fun SplashScreen(navController: NavController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(24.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        // Logo
        Image(
            painter = painterResource(id = R.drawable.jetpack),
            contentDescription = "App Logo",
            modifier = Modifier
                .size(300.dp) // có thể chỉnh kích thước
                .padding(bottom = 16.dp)
        )

        //  Tiêu đề
        Text(
            text = "Jetpack Compose",
            fontSize = 24.sp
        )

        Spacer(modifier = Modifier.height(16.dp))

        //  Nút
        Button(onClick = { navController.navigate("components") }) {
            Text("I'm ready")
        }
    }
}
