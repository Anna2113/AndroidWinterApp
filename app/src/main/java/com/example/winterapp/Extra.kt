package com.example.winterapp

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class Extra : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_extra)
        initListeners()
    }

    private fun initListeners() {
        val check = findViewById<Button>(R.id.IdButtonCheck)
        check.setOnClickListener(buttonCheckListener)

        val back = findViewById<Button>(R.id.IdBackBTN)
        back.setOnClickListener(buttonBackListener)
    }

    private val buttonCheckListener = View.OnClickListener {
        showResult()
    }

    private val buttonBackListener = View.OnClickListener {
        back();
    }
    private fun showResult() {
        val swimline = findViewById<EditText>(R.id.IdValue)
        val length = findViewById<EditText>(R.id.IdLengthSwimlineValue)

        val metersIntent = Intent(this, Result::class.java)

        if(swimline.text.toString() == "" || length.text.toString() == ""){
            Toast.makeText(this,"Nie wprowadzono danych!", Toast.LENGTH_LONG).show()
        }else if(length.text.toString().toInt() != 25 && length.text.toString().toInt() != 50){
            Toast.makeText(this, "Wprowadź poprawną wartość długości basenu!", Toast.LENGTH_LONG).show()
        }else{
            metersIntent.putExtra("result", swimline.text.toString())
            metersIntent.putExtra("meters", length.text.toString())
            startActivity(metersIntent)
        }
    }

    private fun back(){
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }
}
