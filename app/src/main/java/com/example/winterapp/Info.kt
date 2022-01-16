package com.example.winterapp

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class Info : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_info)
        textAboutOlympicMedal
        textAboutThePeopleWhoHaveTheMostOlympicMedals
        textAboutOlympicFlag
    }

    private val textAboutOlympicMedal: Unit
         get() {
            val titleOne = findViewById<TextView>(R.id.IdFirstTitleInfo)
            val info1 = findViewById<TextView>(R.id.IdFirstInfo)
            val intentOne = intent
            val title = intentOne.getStringExtra("firstTitle")
            val text = intentOne.getStringExtra("firstInfo")
            titleOne.text = title
            info1.text = text
        }
    private val textAboutThePeopleWhoHaveTheMostOlympicMedals: Unit
         get() {
            val titleTwo = findViewById<TextView>(R.id.IdSecondTitleInfo)
            val info2 = findViewById<TextView>(R.id.IdSecondInfo)
            val intentTwo = intent
            val title = intentTwo.getStringExtra("secondTitle")
            val text = intentTwo.getStringExtra("secondInfo")
            titleTwo.text = title
            info2.text = text
        }
    private val textAboutOlympicFlag: Unit
         get() {
            val titleThree = findViewById<TextView>(R.id.IdThirdTitleInfo)
            val info3 = findViewById<TextView>(R.id.IdThirdInfo)
            val intentThree = intent
            val title = intentThree.getStringExtra("thirdTitle")
            val text = intentThree.getStringExtra("thirdInfo")
            titleThree.text = title
            info3.text = text
        }
}