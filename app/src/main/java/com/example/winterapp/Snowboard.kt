package com.example.winterapp

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class Snowboard : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_snowboard)
        textAboutFreestyleSnowboard
        textAboutAlpineStyleSnowboard
        textAboutFreerideSnowboard
        textAboutSnowcrossSnowboard
    }

    private val textAboutFreestyleSnowboard: Unit
         get() {
            val firstTitleSnow = findViewById<TextView>(R.id.firstTitleSnow)
            val freestyleSnowboard =
                findViewById<TextView>(R.id.textViewTextAboutFreestyleSnowboard)
            val intentOne = intent
            val style = intentOne.getStringExtra("freestyleSnowboard")
            val describeStyle = intentOne.getStringExtra("opisFreestyleSnowboard")
            firstTitleSnow.text = style
            freestyleSnowboard.text = describeStyle
        }
    private val textAboutAlpineStyleSnowboard: Unit
         get() {
            val secondTitleSnow = findViewById<TextView>(R.id.secondTitleSnow)
            val alpineStyleSnowboard =
                findViewById<TextView>(R.id.textViewTextAboutAlpineStyleSnowboard)
            val intentTwo = intent
            val style = intentTwo.getStringExtra("alpineStyleSnowboard")
            val describeStyle = intentTwo.getStringExtra("opisAlpejskiStylSnowboard")
            secondTitleSnow.text = style
            alpineStyleSnowboard.text = describeStyle
        }
    private val textAboutFreerideSnowboard: Unit
         get() {
            val thirdTitleSnow = findViewById<TextView>(R.id.thirdTitleSnow)
            val freerideSnowboard = findViewById<TextView>(R.id.textViewTextAboutFreerideSnowboard)
            val intentThree = intent
            val style = intentThree.getStringExtra("freerideSnowborad")
            val describeStyle = intentThree.getStringExtra("opisFreerideSnowboard")
            thirdTitleSnow.text = style
            freerideSnowboard.text = describeStyle
        }
    private val textAboutSnowcrossSnowboard: Unit
         get() {
            val fourthTitleSnow = findViewById<TextView>(R.id.fourthTitleSnow)
            val snowcrossSnowboard =
                findViewById<TextView>(R.id.textViewTextAboutSnowcrossSnowboard)
            val intentFourth = intent
            val style = intentFourth.getStringExtra("snowcrossSnowboard")
            val describeStyle = intentFourth.getStringExtra("opisSnowcrossSnowboard")
            fourthTitleSnow.text = style
            snowcrossSnowboard.text = describeStyle
        }
}