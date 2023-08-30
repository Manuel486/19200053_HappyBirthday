package com.example.a19200053_happybirthday

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.Card
import androidx.compose.material3.CardColors
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.a19200053_happybirthday.ui.theme._19200053_HappyBirthdayTheme
import com.example.happybirthday.R

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            _19200053_HappyBirthdayTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    // GreetingText(stringResource(R.string.happy_birthday_text), stringResource(R.string.from_txt))
                    /*GreetingImage(message = getString(R.string.happy_birthday_text), from = getString(
                        R.string.from_txt
                    ))*/
                    /*Article(title = stringResource(R.string.article_title_txt), article1 = stringResource(R.string.article_content1_txt), article2 = stringResource(
                        R.string.article_content2_txt
                    ) )*/
                }
            }
        }
    }
}

@Composable
fun GreetingText(message: String,from: String,modifier: Modifier = Modifier) {
    Column(
        verticalArrangement = Arrangement.Center,
        modifier = modifier.padding(8.dp)) {
        Text(
            text = message,
            fontSize = 100.sp,
            lineHeight = 116.sp,
            textAlign = TextAlign.Center
        )
        Text(
            text = from,
            fontSize = 36.sp,
            modifier = Modifier
                .padding(16.dp)
                .align(alignment = Alignment.End)
        )
    }
}


@Composable
fun GreetingImage(message: String, from: String, modifier: Modifier = Modifier) {
    val image = painterResource(R.drawable.androidparty)
    //Step 3 create a box to overlap image and texts
    Box {
        Image(
            painter = image,
            contentDescription = null,
            contentScale = ContentScale.Crop,
            alpha = 0.5F
        )
        GreetingText(
            message = message,
            from = from,
            modifier = Modifier
                .fillMaxSize()
                .padding(8.dp)
        )
    }
}

@Composable
fun Article(title: String,article1: String, article2: String){
    val image = painterResource(R.drawable.bg_compose_background)
    Column {
        Image(painter = image, contentDescription = null)
        Text(text = title, Modifier.padding(16.dp) ,fontSize = 24.sp)
        Text(text = article1,  Modifier.padding(16.dp), textAlign = TextAlign.Justify)
        Text(text = article2,  Modifier.padding(16.dp), textAlign = TextAlign.Justify)
    }
}

@Composable
fun TaskManager(title: String,message: String){
    val image = painterResource(R.drawable.ic_task_completed)
    Column(  verticalArrangement = Arrangement.Center ) {
        Image(painter = image, contentDescription = null)
        Text(text = title,
            fontWeight = FontWeight.Bold,
            modifier = Modifier
                .padding(
                    top = 24.dp,
                    bottom = 8.dp
                )
                .align(alignment = Alignment.CenterHorizontally))

        Text(text = message, fontSize = 16.sp ,  modifier = Modifier
            .align(alignment = Alignment.CenterHorizontally))
    }
}



@Composable
fun Quadrant(modifier: Modifier = Modifier, title: String, description: String, color: Color) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(color)
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(text = title, fontWeight = FontWeight.Bold, textAlign = TextAlign.Center , fontSize = 20.sp, modifier = Modifier.padding(bottom = 16.dp))
        Text(text = description, fontSize = 14.sp, textAlign = TextAlign.Justify)
    }
}

@Composable
fun FourQuadrantScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f)
        ) {
            Quadrant(
                modifier = Modifier.weight(1f),
                title = "Text composable",
                description = "Displays text and follows the recommended Material Design guidelines.",
                color = Color(0xFFEADDFF)
            )
            Quadrant(
                modifier = Modifier.weight(1f),
                title = "Image composable",
                description = "Creates a composable that lays out and draws a given Painter class object.",
                color = Color(0xFFD0BCFF)
            )
        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f)
        ) {
            Quadrant(
                modifier = Modifier.weight(1f),
                title = "Row composable",
                description = "A layout composable that places its children in a horizontal sequence.",
                color = Color(0xFFB69DF8)
            )
            Quadrant(
                modifier = Modifier.weight(1f),
                title = "Column composable",
                description = "A layout composable that places its children in a vertical sequence.",
                color = Color(0xFFF6EDFF)
            )
        }
    }
}

@Composable
fun BusinessCard() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFD2E8D4)),
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp),
            verticalArrangement = Arrangement.Bottom,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            ProfileImage()
            Spacer(modifier = Modifier.height(200.dp))
            ContactInfo("jen.doe@android.com", "+11 (123) 444 555 666","@AndroidDev")
        }
    }
}

@Composable
fun ProfileImage() {
    val image = painterResource(R.drawable.android_logo);
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(painter = painterResource(R.drawable.android_logo), contentDescription = null, modifier = Modifier.size(100.dp).background(Color(0xFF073042)))
        Text("Jennifer Doe", fontSize = 40.sp, fontWeight = FontWeight.Light)
        Text("Android Developer Extraordinarie",color = Color(0xFF19794A), fontWeight = FontWeight.Bold, fontSize = 12.sp)
    }
}

@Composable
fun ContactInfo(email: String, phoneNumber: String, shareInfo: String) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        verticalArrangement = Arrangement.Bottom,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        CenteredRow(Icons.Default.Phone, "Phone", phoneNumber)
        Spacer(modifier = Modifier.height(5.dp))
        CenteredRow(Icons.Default.Share, "Share", shareInfo)
        Spacer(modifier = Modifier.height(5.dp))
        CenteredRow(Icons.Default.Email, "Email", email)
    }

}

@Composable
fun CenteredRow(icon: ImageVector, contentDescription: String, text: String) {
    Row(
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier.fillMaxWidth()
    ) {
        Icon(imageVector = icon, contentDescription = contentDescription, tint = Color(0xFF19794A))
        Spacer(modifier = Modifier.width(10.dp))
        Text(
            text,
            modifier = Modifier
                .padding(vertical = 4.dp)
                .align(Alignment.CenterVertically)
                .width(180.dp)
        )
    }
}


@Preview(showBackground = true)
@Composable
fun BirthdayCardPreview(){
    _19200053_HappyBirthdayTheme {
        // GreetingText(stringResource(R.string.happy_birthday_text), stringResource(R.string.from_txt))
        // GreetingImage(stringResource(R.string.happy_birthday_text), stringResource(R.string.from_txt))
        /* Article(title = stringResource(R.string.article_title_txt), article1 = stringResource(R.string.article_content1_txt), article2 = stringResource(
            R.string.article_content2_txt
        )) */
        // TaskManager(title = "All tasks completed", message = "Nice work!")
        // FourQuadrantScreen()
        BusinessCard()
    }
}