package com.luoyang.composeapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringArrayResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.luoyang.composeapplication.ui.theme.ComposeApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeApplicationTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(), color = MaterialTheme.colors.background
                ) {
                    InitNavController()
                }
            }
        }
    }
}

@Composable
fun InitNavController() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "ActionList") {
        composable("ActionList") {
            ActionList(stringArrayResource(id = R.array.actions),
                actionTo = { name -> navController.navigate(name) })
        }
        composable("HappyBirthday") { HappyBirthday() }
        composable("Article") { Article() }
        composable("TodoMgt") { Todo() }
        composable("Quadrant") { Quadrant() }
        composable("BusinessCard") { BusinessCard() }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun DefaultPreview() {
    ComposeApplicationTheme {
        ActionList(actions = stringArrayResource(id = R.array.actions), actionTo = { })
    }
}