package com.luoyang.composeapplication

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Todo() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight(), contentAlignment = Alignment.Center
    ) {
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Image(
                painter = painterResource(id = R.drawable.ic_task_completed),
                contentDescription = null
            )
            Text(
                text = "All tasks completed",
                fontSize = 24.sp,
                modifier = Modifier.padding(top = 24.dp, bottom = 8.dp),
            )
            Text(text = "Nice work!", fontSize = 16.sp)
        }
    }
}

@Preview
@Composable
fun PreviewTodo() {
    Todo()
}