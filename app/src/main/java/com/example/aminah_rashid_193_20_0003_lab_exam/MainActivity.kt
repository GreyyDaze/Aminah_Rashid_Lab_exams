package com.example.aminah_rashid_193_20_0003_lab_exam

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import com.example.aminah_rashid_193_20_0003_lab_exam.ui.theme.Aminah_Rashid_193_20_0003_Lab_examTheme
import kotlinx.coroutines.delay

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Aminah_Rashid_193_20_0003_Lab_examTheme {
                // A surface container using the 'background' color from the theme
                LaunchedEffect(Unit) {
                    val intent = Intent(this@MainActivity, SplashActivity::class.java)
                    startActivity(intent)
                    delay(3000)
                }

            }
        }
    }
}



