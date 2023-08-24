package com.example.a19200053_happybirthday

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
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
            Modifier
                .padding(
                top = 24.dp,
                bottom = 8.dp
                )
                .align(alignment = Alignment.CenterHorizontally))

        Text(text = message, Modifier
            .align(alignment = Alignment.CenterHorizontally))
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
        TaskManager(title = "All tasks completed", message = "Nice work!")
    }
}