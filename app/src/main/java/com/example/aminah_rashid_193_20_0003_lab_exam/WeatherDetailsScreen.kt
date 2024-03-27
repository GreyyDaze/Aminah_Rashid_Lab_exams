package com.example.aminah_rashid_193_20_0003_lab_exam

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.toLowerCase
import androidx.compose.ui.unit.dp
import java.util.Locale

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun WeatherDetailsScreen(name: String?) {
    var cityName = name?.lowercase(Locale.getDefault())
    var cityWeatherInfo = "weather_info_${cityName}"
    val context = LocalContext.current

    val resources = context.resources
    val arrayId = resources.getIdentifier(cityWeatherInfo, "array", context.packageName)
    val weatherInfo = resources.getStringArray(arrayId)
    val city = weatherInfo[0]
    val temperature = weatherInfo[1]
    val humidity = weatherInfo[2]
    val weatherCondition = weatherInfo[3]


    Scaffold(topBar = {
        TopAppBar(title = {
            Text(text = "Weather Details")
        })
    }) { contentPadding ->
        Column(
            modifier = Modifier
                .padding(contentPadding)
                .fillMaxSize(),
            verticalArrangement = Arrangement.Center,
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.Center,
            ) {
                Text(text = "City Name: $city")
            }
            Spacer(modifier = Modifier.height(16.dp))
            Column(
                modifier = Modifier.fillMaxWidth(),
            ) {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.spacedBy(16.dp),
                ) {
                    Icon(
                        painterResource(id = R.drawable.baseline_thermostat_24),
                        contentDescription = "temperature",
                        modifier = Modifier.size(70.dp)
                    )
                    Column {
                        Text(text = "Temperature")
                        Text(text = "$temperature C")
                    }
                }
                Spacer(modifier = Modifier.height(20.dp))
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.spacedBy(16.dp),
                ) {
                    Icon(
                        painterResource(id = R.drawable.baseline_wind_power_24),
                        contentDescription = "humidity",
                        modifier = Modifier . size (70.dp)
                    )
                    Column {
                        Text(text = "Humidity")
                        Text(text = "$humidity %")
                    }
                }
                Spacer(modifier = Modifier.height(20.dp))
                Row(

                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.spacedBy(16.dp),
                ) {
                    Icon(
                        painterResource(id = R.drawable.baseline_sunny_24),
                        contentDescription = "condition",
                        modifier = Modifier.size(70.dp)
                    )
                    Column {
                        Text(text = "Condition")
                        Text(text = "$weatherCondition")
                    }
                }
            }
        }
    }
}


