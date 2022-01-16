package com.example.winterapp

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class Result : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)
        initListeners();

        val pool = findViewById<TextView>(R.id.IdIloscBasenow)
        val length = findViewById<TextView>(R.id.IdLengthValue)
        val intent = intent
        val amount = intent.getStringExtra("result")
        val metre = intent.getStringExtra("meters")
        pool.text = amount
        length.text = metre
    }

    private fun initListeners(){
        val distance = findViewById<Button>(R.id.IdCountDistance)
        val clear = findViewById<Button>(R.id.clearButton)

        distance.setOnClickListener(buttonDistanceListener)
        clear.setOnClickListener(buttonClearListener)

    }

    private val buttonDistanceListener = View.OnClickListener {
        countDistance()
    }

    private val buttonClearListener = View.OnClickListener {
        clearData()
    }

    private fun countDistance() {
        val inputAmount = findViewById<TextView>(R.id.IdIloscBasenow)
        val inputLength = findViewById<TextView>(R.id.IdLengthValue)
        val meters = findViewById<TextView>(R.id.IdMetersValue)
        val kilometers = findViewById<TextView>(R.id.IdKilomitersValue)

        val amount = inputAmount.text.toString().toInt()
        val length = inputLength.text.toString().toInt()
        val metre = amount * length
        val kilometre = amount * length / 1000
        val m = metre.toString()
        val km = kilometre.toString()
        meters.text = m
        kilometers.text = km
    }

    private fun clearData(){
        val intent = Intent(this, Extra::class.java)
        startActivity(intent)
    }
}