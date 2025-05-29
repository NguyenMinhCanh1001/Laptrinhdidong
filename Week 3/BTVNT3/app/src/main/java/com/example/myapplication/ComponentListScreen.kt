package com.example.myapplication

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.Alignment
import androidx.navigation.NavController
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ComponentListScreen(navController: NavController) {
    val componentSections = mapOf(
        "Display" to listOf("Text", "Image"),
        "Input" to listOf("TextField", "PasswordField"),
        "Layout" to listOf("Column", "Row")
    )

    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        // Top app bar
        TopAppBar(
            title = {
                Text(
                    "UI Components List",
                    color = Color(0xFF00CAFF),
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.fillMaxWidth(),
                    textAlign = TextAlign.Center
                )
            }
        )

        Spacer(modifier = Modifier.height(8.dp))

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(horizontal = 16.dp)
        ) {
            componentSections.forEach { (sectionTitle, components) ->
                // Section title
                Text(
                    text = sectionTitle,
                    style = MaterialTheme.typography.titleMedium,
                    color = Color.Black,
                    modifier = Modifier.padding(top = 16.dp, bottom = 8.dp)
                )

                // Components list
                components.forEach { component ->
                    Surface(
                        shape = RoundedCornerShape(8.dp),
                        border = BorderStroke(1.dp, Color(0xFF005886)),
                        color = Color(0xFFE0F7FA),
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(vertical = 4.dp)
                            .clickable {
                                when (component) {
                                    "Text" -> navController.navigate("textDetail")
                                    "Image" -> navController.navigate("imageDetail")
                                    "Column", "Row" -> navController.navigate("layoutScreen")
                                    "TextField" -> navController.navigate("TextFieldScreen")
                                    // Add other navigations if needed
                                }
                            }
                    ) {
                        Column(
                            modifier = Modifier.padding(12.dp)
                        ) {
                            Text(
                                text = component,
                                style = MaterialTheme.typography.bodyLarge,
                                color = Color.Black
                            )
                            Spacer(modifier = Modifier.height(4.dp))
                            Text(
                                text = when (component) {
                                    "Text" -> "Displays text"
                                    "Image" -> "Displays an image"
                                    "TextField" -> "Input field for text"
                                    "PasswordField" -> "Input field for passwords"
                                    "Column" -> "Arranges elements vertically"
                                    "Row" -> "Arranges elements horizontally"
                                    else -> ""
                                },
                                style = MaterialTheme.typography.bodyMedium,
                                color = Color.Black
                            )
                        }
                    }
                }
            }
        }
    }
}
