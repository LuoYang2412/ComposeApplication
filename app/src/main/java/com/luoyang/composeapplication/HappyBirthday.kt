package com.luoyang.composeapplication

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.luoyang.composeapplication.ui.theme.ComposeApplicationTheme

@Composable
fun HappyBirthday() {
    BirthdayGreetingWithImage()
    BirthdayGreetingWithText(
        stringResource(R.string.happy_birthday_text),
        stringResource(R.string.signature_text)
    )
}


@Composable
fun BirthdayGreetingWithText(message: String, form: String) {
    Column {
        Text(
            text = message,
            fontSize = 36.sp,
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentWidth(Alignment.CenterHorizontally)
                .padding(start = 16.dp, top = 16.dp)
        )
        Text(
            text = form,
            fontSize = 24.sp,
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentWidth(Alignment.CenterHorizontally)
                .padding(start = 16.dp, end = 16.dp)
        )
    }
}

@Composable
fun BirthdayGreetingWithImage() {
    val image = painterResource(R.drawable.androidparty)
    Box {
        Image(
            painter = image,
            contentDescription = null,
            modifier = Modifier
                .fillMaxHeight()
                .fillMaxWidth(),
            contentScale = ContentScale.Crop
        )
    }
}

@Preview
@Composable
fun BirthdayCardPreview() {
    ComposeApplicationTheme {
        HappyBirthday()
    }
}