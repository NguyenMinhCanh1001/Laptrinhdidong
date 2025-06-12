package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.myapplication.pages.Confirm
import com.example.myapplication.pages.Email
import com.example.myapplication.pages.Password
import com.example.myapplication.pages.Verify

import com.example.myapplication.ui.theme.MyApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            NavData()
        }
    }
}



@Composable
fun NavData(){
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "email"){
        composable("email") { Email(navController)}
        composable("verify/{email}") { backStackEntry ->
            val email = backStackEntry.arguments?.getString("email") ?: ""
            Verify(navController, email)
        }

        composable("password/{email}/{otp}") { backStackEntry ->
            val email = backStackEntry.arguments?.getString("email") ?: ""
            val otp = backStackEntry.arguments?.getString("otp") ?: ""
            Password(navController, email, otp)
        }

        composable("confirm/{email}/{otp}/{password}") { backStackEntry ->
            val email = backStackEntry.arguments?.getString("email") ?: ""
            val otp = backStackEntry.arguments?.getString("otp") ?: ""
            val password = backStackEntry.arguments?.getString("password") ?: ""
            Confirm(navController, email, otp, password)
        }

    }
}