package com.example.granery_app_one.ui.theme.pages.Splash

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.granery_app_one.R
import com.example.granery_app_one.navigation.ROUTE_HOME
import com.example.granery_app_one.ui.theme.Granery_App_OneTheme
import kotlinx.coroutines.delay

@Composable
fun Splash(navController: NavHostController) {
    LaunchedEffect(key1 =true){
        delay(2000L)
        navController.navigate(ROUTE_HOME)
    }

    Box(modifier = Modifier.fillMaxSize()) {
        Image(
            painterResource(id = R.drawable.wheat),
            contentDescription = "Background",
            contentScale = ContentScale.FillBounds,
            modifier = Modifier.matchParentSize()
        )
    }
    Column (
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {


        Text(
            text = "" ,
            color = Color.Black,
            fontSize = 50.sp,
        )
        Spacer(modifier = Modifier.height(200.dp))

    }
    Spacer(modifier = Modifier.height(200.dp))

    Text(
        text = "By Kean Kariuki",
        color = Color.Black,
        fontSize = 20.sp
    )

}

@Preview
@Composable
fun SplashPreview() {
    Granery_App_OneTheme {
        Splash(rememberNavController())
    }

}