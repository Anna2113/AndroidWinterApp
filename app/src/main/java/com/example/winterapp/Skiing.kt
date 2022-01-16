package com.example.winterapp

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class Skiing : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skiing)
        textAboutAlpineSkiing
        textAboutClassicSkiing
        textAboutFreeride
        textAboutFreestyle
    }

    private val textAboutAlpineSkiing: Unit
         get() {
            val firstTitle = findViewById<TextView>(R.id.firstTitle)
            val alpineSkiing = findViewById<TextView>(R.id.textViewTextAboutAlpineSkiing)
            val intentOne = intent
            val kind = intentOne.getStringExtra("narciarstwoAlpejskie")
            val describeKind = intentOne.getStringExtra("opisAlpejskie")
            firstTitle.text = kind
            alpineSkiing.text = describeKind
        }
    private val textAboutClassicSkiing: Unit
         get() {
            val secondTitle = findViewById<TextView>(R.id.secondTitle)
            val classicSkiing = findViewById<TextView>(R.id.textViewTextAboutClassicSkiing)
            val intentTwo = intent
            val kind = intentTwo.getStringExtra("narciarstwoKlasyczne")
            val describeKind = intentTwo.getStringExtra("opisKlasyczne")
            secondTitle.text = kind
            classicSkiing.text = describeKind
        }
    private val textAboutFreeride: Unit
         get() {
            val thirdTitle = findViewById<TextView>(R.id.thirdTitle)
            val freeride = findViewById<TextView>(R.id.textViewTextAboutFreeride)
            val intentThree = intent
            val kind = intentThree.getStringExtra("freeride")
            val describeKind = intentThree.getStringExtra("opisFreeride")
            thirdTitle.text = kind
            freeride.text = describeKind
        }
    private val textAboutFreestyle: Unit
         get() {
            val fourthTitle = findViewById<TextView>(R.id.fourthTitle)
            val freestyle = findViewById<TextView>(R.id.textViewTextAboutFreestyle)
            val intentFour = intent
            val kind = intentFour.getStringExtra("freestyle")
            val describeKind = intentFour.getStringExtra("opisFreestyle")
            fourthTitle.text = kind
            freestyle.text = describeKind
        }
}