package com.saber.cookbookcomposepractice.cookbook

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview

class RecipesActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            Column(Modifier.fillMaxSize()) {
                TopAppBar(title = { Text(text = "Compose Practice") })
                RecipeList(defaultRecipes)
            }
        }
    }

    @Preview
    @Composable
    fun Greeting() {
        Column {
            Text(text = "Hello, World!", style = TextStyle(color = Color.Red))
            Text("Hello, Second World!", style = TextStyle(color = Color.Red))
            Text("Hello, Third World!", style = TextStyle(color = Color.Red))
        }
    }
}