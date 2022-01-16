package com.example.winterapp

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import android.widget.Spinner



class SnowSkiEquipment : AppCompatActivity(), AdapterView.OnItemSelectedListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_snow_ski_equipment)
        initListeners()

        val levelSpinner = findViewById<Spinner>(R.id.IdSpinnerLevel)
        val levelAdapter = ArrayAdapter.createFromResource(
            this, R.array.chooseLevel, android.R.layout.simple_spinner_item
        )
        levelAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        levelSpinner.adapter = levelAdapter
        levelSpinner.onItemSelectedListener = this

        //..........................................................................................
        val typeSpinner = findViewById<Spinner>(R.id.IdSpinnerTypeOfDriving)
        val typeAdapter = ArrayAdapter.createFromResource(
            this, R.array.chooseTypeOfDriving, android.R.layout.simple_spinner_item
        )
        typeAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        typeSpinner.adapter = typeAdapter
        typeSpinner.onItemSelectedListener = this

        //..........................................................................................
        val sportSpinner = findViewById<Spinner>(R.id.IdSpinnerSport)
        val sportAdapter = ArrayAdapter.createFromResource(
            this, R.array.chooseSport, android.R.layout.simple_spinner_item
        )
        sportAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        sportSpinner.adapter = sportAdapter
        sportSpinner.onItemSelectedListener = this
    }

    override fun onItemSelected(parent: AdapterView<*>?, view: View, position: Int, id: Long) {}
    override fun onNothingSelected(parent: AdapterView<*>?) {}

    private fun initListeners() {
        val buttonCheck = findViewById<Button>(R.id.IdCheckButton)
        val buttonClear = findViewById<Button>(R.id.IdClearBTN)

        buttonCheck.setOnClickListener(buttonCheckListener)
        buttonClear.setOnClickListener(buttonClearListener)
    }

    private val buttonCheckListener = View.OnClickListener {
        returnMatchedEquipment()
    }

    private val buttonClearListener = View.OnClickListener {
        clearForm()
    }

    private fun returnMatchedEquipment() {
        val nameEditText = findViewById<EditText>(R.id.editTextName)
        val surnameEditText = findViewById<EditText>(R.id.editTextSurname)
        val ageEditText = findViewById<EditText>(R.id.editTextAge)
        val genderEditText = findViewById<EditText>(R.id.editTextGender)
        val heightEditText = findViewById<EditText>(R.id.editTextHeight)
        val weightEditText = findViewById<EditText>(R.id.editTextWeight)
        val footLengthEditText = findViewById<EditText>(R.id.editTextFootLength)
        val sportSpinner = findViewById<Spinner>(R.id.IdSpinnerSport)
        val levelSpinner = findViewById<Spinner>(R.id.IdSpinnerLevel)
        val typeSpinner = findViewById<Spinner>(R.id.IdSpinnerTypeOfDriving)

        val intent = Intent()

        if (nameEditText.text.toString().isEmpty() ||
            surnameEditText.text.toString().isEmpty() ||
            ageEditText.text.toString().isEmpty() ||
            genderEditText.text.toString().isEmpty() ||
            heightEditText.text.toString().isEmpty() ||
            weightEditText.text.toString().isEmpty() ||
            footLengthEditText.text.toString().isEmpty() ||
            sportSpinner.selectedItem.toString().isEmpty() ||
            levelSpinner.selectedItem.toString().isEmpty() ||
            typeSpinner.selectedItem.toString().isEmpty())
            {
            setResult(RESULT_CANCELED, intent)
        } else {
            intent.putExtra("nameResult", nameEditText.text.toString())
            intent.putExtra("surnameResult", surnameEditText.text.toString())
            intent.putExtra("ageResult", ageEditText.text.toString())
            intent.putExtra("genderResult", genderEditText.text.toString())
            intent.putExtra("heightResult", heightEditText.text.toString())
            intent.putExtra("weightResult", weightEditText.text.toString())
            intent.putExtra("footLengthResult", footLengthEditText.text.toString())
            intent.putExtra("sportResult", sportSpinner.selectedItem.toString())
            intent.putExtra("levelResult", levelSpinner.selectedItem.toString())
            intent.putExtra("typeResult", typeSpinner.selectedItem.toString())
            setResult(RESULT_OK, intent)
        }
        finish()
    }

    fun clearForm(){

        val name = findViewById<EditText>(R.id.editTextName)
        name.setText("")

        val surname = findViewById<EditText>(R.id.editTextSurname)
        surname.setText("")

        val age = findViewById<EditText>(R.id.editTextAge)
        age.setText("")

        val gender = findViewById<EditText>(R.id.editTextGender)
        gender.setText("")

        val height = findViewById<EditText>(R.id.editTextHeight)
        height.setText("")

        val weight = findViewById<EditText>(R.id.editTextWeight)
        weight.setText("")

        val footLength = findViewById<EditText>(R.id.editTextFootLength)
        footLength.setText("")

        val sport = findViewById<Spinner>(R.id.IdSpinnerSport)
        sport.setSelection(0)

        val level = findViewById<Spinner>(R.id.IdSpinnerLevel)
        level.setSelection(0)

        val type = findViewById<Spinner>(R.id.IdSpinnerTypeOfDriving)
        type.setSelection(0)

    }


    fun addUser(view: View){
        val userName = findViewById<EditText>(R.id.editTextName)
        val userSurname = findViewById<EditText>(R.id.editTextSurname)
        val userAge = findViewById<EditText>(R.id.editTextAge)
        val userGender = findViewById<EditText>(R.id.editTextGender)
        val userHeight = findViewById<EditText>(R.id.editTextHeight)
        val userWeight = findViewById<EditText>(R.id.editTextWeight)
        val userFoot = findViewById<EditText>(R.id.editTextFootLength)
        val userSport = findViewById<Spinner>(R.id.IdSpinnerSport)
        val userLevel = findViewById<Spinner>(R.id.IdSpinnerLevel)
        val userType = findViewById<Spinner>(R.id.IdSpinnerTypeOfDriving)

        val dataBaseHelper = DataBaseHelper(this, null, null, 1)
        val user = User(
            userName.text.toString(),
            userSurname.text.toString(),
            userAge.text.toString().toInt(),
            userGender.text.toString(),
            userHeight.text.toString().toDouble(),
            userWeight.text.toString().toDouble(),
            userFoot.text.toString().toDouble(),
            userSport.selectedItem.toString(),
            userLevel.selectedItem.toString(),
            userType.selectedItem.toString()
        )

        dataBaseHelper.addUser(user)
        Toast.makeText(this, "Użytkownik został dodany! \n Kliknij przycisk \"Zatwierdź'\"", Toast.LENGTH_LONG).show()

    }


    fun showUser(view: View){
        val userName = findViewById<EditText>(R.id.editTextName)
        val userSurname = findViewById<EditText>(R.id.editTextSurname)
        val userAge = findViewById<EditText>(R.id.editTextAge)
        val userGender = findViewById<EditText>(R.id.editTextGender)
        val userHeight = findViewById<EditText>(R.id.editTextHeight)
        val userWeight = findViewById<EditText>(R.id.editTextWeight)
        val userFoot = findViewById<EditText>(R.id.editTextFootLength)

        val dataBaseHelper = DataBaseHelper(this, null, null,1)

        val user = dataBaseHelper.findUser(userName.text.toString(), userSurname.text.toString(),
            userAge.text.toString().toInt())

        if(user != null){
            userGender.setText(user.gender)
            userHeight.setText(user.height.toString())
            userWeight.setText(user.weight.toString())
            userFoot.setText(user.foot.toString())

            Toast.makeText(this, "Dane użytkownika zostały wyświetlone!", Toast.LENGTH_LONG).show()
        }else
            Toast.makeText(this, "Uwaga! Nieznany użytkownik!", Toast.LENGTH_LONG).show()
    }


    fun deleteUser(view: View){
        val userName = findViewById<EditText>(R.id.editTextName)
        val userSurname = findViewById<EditText>(R.id.editTextSurname)
        val userAge = findViewById<EditText>(R.id.editTextAge)

        val dataBaseHelper = DataBaseHelper(this, null,null, 1)

        val result = dataBaseHelper.deleteUser(userName.text.toString(), userSurname.text.toString(),
            userAge.text.toString().toInt())

        if(result){
            Toast.makeText(this, "Użytkownik został usunięty!", Toast.LENGTH_LONG).show()
        }else{
            Toast.makeText(this, "Uwaga! Nieznany użytkownik!", Toast.LENGTH_LONG).show()
        }
    }

}