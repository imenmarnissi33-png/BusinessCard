package com.example.businesscard



import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            BusinessCard()
        }
    }
}

@Composable
fun BusinessCard() {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {

        // Logo
        Image(
            painter = painterResource(id = R.drawable.android_logo),
            contentDescription = "Android logo",
            modifier = Modifier.size(120.dp)
        )

        Spacer(modifier = Modifier.height(16.dp))

        // Name
        Text(
            text = "Narjess",
            fontSize = 28.sp,
            fontWeight = FontWeight.Bold,
            color = Color(0xFF3DDC84)
        )

        // Job title
        Text(
            text = "Android Developer",
            fontSize = 18.sp
        )

        Spacer(modifier = Modifier.height(32.dp))

        // Phone
        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(
                imageVector = Icons.Default.Phone,
                contentDescription = "Phone"
            )

            Spacer(modifier = Modifier.size(8.dp))

            Text(
                text = "+216 54 894 142"
            )
        }

        Spacer(modifier = Modifier.height(12.dp))

        // Email
        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(
                imageVector = Icons.Default.Email,
                contentDescription = "Email"
            )

            Spacer(modifier = Modifier.size(8.dp))

            Text(
                text = "narjessmaoui374@gmail.com"
            )
        }

        Spacer(modifier = Modifier.height(12.dp))

        // Social
        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(
                imageVector = Icons.Default.Share,
                contentDescription = "Social media"
            )

            Spacer(modifier = Modifier.size(8.dp))

            Text(
                text = "NMAOUI"
            )
        }
    }

}
@Preview(showBackground = true)
@Composable
fun BusinessCardPreview() {
    BusinessCard()
}