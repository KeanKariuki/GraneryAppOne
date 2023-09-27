package com.example.granery_app_one.ui.theme.pages.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.granery_app_one.R
import com.example.granery_app_one.navigation.ROUTE_ADD_PRODUCTS
import com.example.granery_app_one.navigation.ROUTE_LOGIN
import com.example.granery_app_one.navigation.ROUTE_SIGNUP
import com.example.granery_app_one.navigation.ROUTE_VIEW_PRODUCTS
import com.example.granery_app_one.ui.theme.Granery_App_OneTheme

@Composable
fun HomeScreen(navController:NavHostController) {


    Column(modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,) {
        Image(
            painter = painterResource(R.drawable.wheat),
            contentDescription =null,
            Modifier.size(350.dp

        )
        )



        Text(
            text = "GRANERY",
            color = Color.White,
            fontSize = 40.sp,
        )

        Spacer(modifier = Modifier.height(20.dp))

        Text(
            text = "Home Screen",
            color =Color.Cyan,
            fontSize = 25.sp,
            fontFamily = FontFamily.Monospace,
            textAlign = TextAlign.Center
        )
        Spacer(modifier = Modifier.height(20.dp))





        Spacer(modifier = Modifier.height(20.dp))

        Button(
            onClick = {navController.navigate(ROUTE_ADD_PRODUCTS)},
            modifier = Modifier.fillMaxWidth(),
            colors = ButtonDefaults.buttonColors(Color.Red),
        ) {
            Text(text = "Add Products",
                color = Color.White,
                fontSize = 20.sp,
                modifier =  Modifier.padding()) }
        Spacer(modifier = Modifier.height(20.dp))
        Button(
            onClick = {navController.navigate(ROUTE_VIEW_PRODUCTS)},
            modifier = Modifier.fillMaxWidth(),
            colors = ButtonDefaults.buttonColors(Color.Red),
        ) {
            Text(text = "View Products",
                color = Color.White,
                fontSize = 20.sp,
                modifier =  Modifier.padding()) }

        Divider(
            color = Color.White,
            thickness = 2.dp,
            modifier = Modifier.padding(10.dp)
        )


        Spacer(modifier = Modifier.height(20.dp))



    }
}



@Preview
@Composable
fun HomeScreenPreview() {
    Granery_App_OneTheme {
        HomeScreen(rememberNavController())
    }
}