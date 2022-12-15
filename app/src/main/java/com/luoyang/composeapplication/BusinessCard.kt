package com.luoyang.composeapplication

import android.graphics.drawable.Icon
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Divider
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material.icons.filled.Share
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.graphics.ColorUtils

@Composable
fun BusinessCard() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xff072f42))
    ) {
        Column(
            Modifier
                .weight(1f)
                .fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Image(
                painter = painterResource(id = R.drawable.android_logo),
                contentDescription = null,
                modifier = Modifier
                    .width(160.dp)
                    .height(100.dp),
                contentScale = ContentScale.FillHeight
            )
            Text(
                text = "Jennifer Doe",
                color = Color.White,
                fontSize = 48.sp
            )
            Text(
                text = "Android Developer Extraordinaire",
                color = Color(0xFF3ddc84),
                fontWeight = FontWeight.Bold
            )
        }
        Divider(color = Color(0xff536e7c))
        Column(
            Modifier
                .fillMaxWidth()
        ) {
            InfoRow(icon = Icons.Default.Phone, info = "＋11(123)444555666")
            Divider(color = Color(0xff536e7c))
            InfoRow(icon = Icons.Default.Share, info = "@AndroidDev")
            Divider(color = Color(0xff536e7c))
            InfoRow(icon = Icons.Default.Email, info = "jen.doe@android.com")
            Spacer(modifier = Modifier.height(20.dp))
        }
    }
}

@Composable
fun InfoRow(icon: ImageVector, info: String) {
    Row(
        modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Icon(
            imageVector = icon,
            contentDescription = null,
            tint = Color(0xFF3ddc84),
            modifier = Modifier
                .padding(start = 16.dp)
                .size(24.dp)
        )
        Text(
            text = info,
            Modifier.padding(start = 16.dp),
            color = Color.White,
            fontSize = 18.sp
        )
    }
}

@Preview
@Composable
fun PreviewBusinessCard() {
    BusinessCard()
}