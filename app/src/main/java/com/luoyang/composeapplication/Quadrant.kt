package com.luoyang.composeapplication

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun Quadrant() {
    Column(Modifier.fillMaxWidth()) {
        Row(Modifier.weight(1f)) {
            Box(Modifier.weight(1f)) {
                QCard(
                    backgroundColor = Color.Green,
                    title = stringResource(R.string.q_card_1_title),
                    content = stringResource(R.string.q_card_1_content)
                )
            }
            Box(Modifier.weight(1f)) {
                QCard(
                    backgroundColor = Color.Yellow,
                    title = stringResource(R.string.q_card_2_title),
                    content = stringResource(R.string.q_card_2_content)
                )
            }
        }
        Row(Modifier.weight(1f)) {
            Box(Modifier.weight(1f)) {
                QCard(
                    backgroundColor = Color.Cyan,
                    title = stringResource(R.string.q_card_3_title),
                    content = stringResource(R.string.q_card_3_content)
                )
            }
            Box(Modifier.weight(1f)) {
                QCard(
                    backgroundColor = Color.LightGray,
                    title = stringResource(R.string.q_card_4_title),
                    content = stringResource(R.string.q_card_4_content)
                )
            }
        }
    }
}

@Preview
@Composable
fun PreviewQuadrant() {
    Quadrant()
}

@Composable
fun QCard(backgroundColor: Color, title: String, content: String) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier
            .fillMaxSize()
            .background(backgroundColor)
            .padding(16.dp),
    ) {
        Text(
            text = title,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(bottom = 16.dp),
            textAlign = TextAlign.Justify
        )
        Text(text = content, textAlign = TextAlign.Justify)
    }
}

@Preview
@Composable
fun PreviewQCard() {
    QCard(
        backgroundColor = Color.Green,
        title = stringResource(R.string.q_card_1_title),
        content = stringResource(R.string.q_card_1_content)
    )
}