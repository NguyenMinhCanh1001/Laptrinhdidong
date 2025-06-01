package com.example.myapplication

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.*
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.Alignment
import androidx.navigation.NavController

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TextDetailScreen(navController: NavController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        // Sử dụng CenterAlignedTopAppBar để căn giữa tiêu đề và có icon ở trái
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

        Spacer(modifier = Modifier.height(300.dp)) // tạo khoảng cách với title

        // Văn bản mô tả có style đa dạng
//        Text(
//            buildAnnotatedString {
//                append("The ")
//                withStyle(SpanStyle(textDecoration = TextDecoration.LineThrough)) {
//                    append("quick ")
//                }
//                withStyle(
//                    SpanStyle(
//                        color = Color(0xFFB8860B),
//                        fontWeight = FontWeight.Bold
//                    )
//                ) {
//                    append("Brown ")
//                }
//                append("\nfox j u m p s ")
//                withStyle(
//                    SpanStyle(
//                        fontWeight = FontWeight.Bold,
//                        fontStyle = FontStyle.Italic
//                    )
//                ) {
//                    append("over ")
//                }
//                withStyle(SpanStyle(textDecoration = TextDecoration.Underline)) {
//                    append("the ")
//                }
//                withStyle(SpanStyle(fontStyle = FontStyle.Italic)) {
//                    append("lazy ")
//                }
//                append("dog")
//            },
//            fontSize = 30.sp,
//            textAlign = TextAlign.Center,
//            modifier = Modifier.fillMaxWidth()
//        )
        Spacer(modifier = Modifier.height(32.dp))

        Button(
            onClick = { navController.navigateUp() },
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF00CAFF))
        ) {
            Text("Back", color = Color.White)
        }

    }
}
