package com.example.finalproject

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Share
import androidx.compose.material.icons.rounded.Email
import androidx.compose.material.icons.rounded.Phone
import androidx.compose.material.icons.rounded.Share
import androidx.compose.material.icons.sharp.Phone
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.finalproject.ui.theme.FinalProjectTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FinalProjectTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    ComposableAndroid()
                }
            }
        }
    }
}




@Composable
fun ComposableAndroid(){

    Column (
        Modifier
            .fillMaxSize()
            .background(Color(210, 232, 212)),
        verticalArrangement = Arrangement.Center,
    ){

        Box(modifier = Modifier
            .weight(3f)
        ){
            Column(
                Modifier
                    .fillMaxWidth()
                    .padding(bottom = 10.dp, top = 2.dp)
                    .align(Alignment.Center),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally,
            ) {
                Image(
                    painter = painterResource(id = R.drawable.android_logo),
                    contentDescription = null,
                    Modifier
                        .padding(horizontal = 100.dp)
                        .background(Color(6, 49, 66))
                        .height(120.dp)
                        .width(120.dp)
                )
                Text(
                    text = stringResource(R.string.nombre),
                    color = Color.Black,
                    fontSize = 35.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier
                )
                Text(
                    text = stringResource(R.string.slogan),
                    color = Color(0, 109, 56),
                    fontSize = 15.sp,
                    fontWeight = FontWeight.Bold,
                )
            }
        }


        Box(
            modifier = Modifier
                .weight(1f)
        ){
            Column (
                modifier = Modifier
                    .padding(15.dp)
                    .align(Alignment.CenterEnd),
            ){
                InfoCard(imageVector = Icons.Sharp.Phone, texto = "+51 989739186")

                InfoCard(imageVector = Icons.Rounded.Share, texto = "@mamz1303")

                InfoCard(imageVector = Icons.Rounded.Email, texto = "mamz1303@gmail.com")
            }
        }
    }
}



@Composable
fun InfoCard(imageVector: ImageVector, texto: String){
    Row (
        modifier = Modifier
            .fillMaxWidth(1f)
            .padding(horizontal = 5.dp, vertical = 5.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center,
    ){
        Icon(
            imageVector = imageVector,
            contentDescription = null,
            tint = Color( 0, 109, 56),
            modifier = Modifier
                .padding(horizontal = 2.dp, vertical = 1.dp)
        )
        Text(
            text = texto,
            textAlign = TextAlign.Start,
            modifier = Modifier
                .width(200.dp)
                .padding(horizontal = 5.dp),
            color = Color.Black
        )
    }
}







@Preview(showBackground = true)
@Composable
fun Preview() {
    FinalProjectTheme {
        ComposableAndroid()
    }
}