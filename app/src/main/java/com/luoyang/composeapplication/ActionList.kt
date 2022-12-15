package com.luoyang.composeapplication

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringArrayResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.luoyang.composeapplication.ui.theme.ComposeApplicationTheme


@Composable
fun ActionList(actions: Array<String>, actionTo: (name: String) -> Unit) {
    LazyColumn() {
        items(actions) { action ->
            Button(
                onClick = { actionTo(action) },
                modifier = Modifier
                    .padding(horizontal = 4.dp)
                    .fillMaxWidth(),
            ) {
                Text(
                    text = action,
                    fontSize = 16.sp,
                    fontStyle = FontStyle.Italic,
                )
            }
        }
    }
}

@Preview
@Composable
fun ActionListPreview() {
    ComposeApplicationTheme {
        ActionList(actions = stringArrayResource(id = R.array.actions), actionTo = { })
    }
}