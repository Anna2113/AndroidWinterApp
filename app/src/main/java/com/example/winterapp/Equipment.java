package com.example.winterapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Equipment extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_equipment);
        initListeners();

    }

    private void initListeners() {
        Button buttonSnowSkiEquipment = findViewById(R.id.IdEquipmentSnowSki);
        Button buttonShowResult = findViewById(R.id.IdResult);
        Button buttonClear = findViewById(R.id.IdClearButton);

        buttonSnowSkiEquipment.setOnClickListener(buttonSnowSkiEquipmentListener);
        buttonShowResult.setOnClickListener(buttonShowResultListener);
        buttonClear.setOnClickListener(buttonClearListener);
    }

    private View.OnClickListener buttonSnowSkiEquipmentListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            addValueSnowSkiEquipment();
        }
    };

    private View.OnClickListener buttonShowResultListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            showResult();
        }
    };

    private View.OnClickListener buttonClearListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            clearData();
        }
    };


    private void addValueSnowSkiEquipment() {
        Intent snowboardIntent = new Intent(this, SnowSkiEquipment.class);
        startActivityForResult(snowboardIntent, 2);
    }

    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        String nameResult = "";
        String surnameResult = "";
        String ageResult = "";
        String genderResult = "";
        String heightResult = "";
        String weightResult = "";
        String footLengthResult = "";
        String sportResult = "";
        String levelResult = "";
        String typeResult = "";


        if (requestCode == 2) {
            if (resultCode == RESULT_OK) {
                nameResult = data.getStringExtra("nameResult");
                surnameResult = data.getStringExtra("surnameResult");
                ageResult = data.getStringExtra("ageResult");
                genderResult = data.getStringExtra("genderResult");
                heightResult = data.getStringExtra("heightResult");
                weightResult = data.getStringExtra("weightResult");
                footLengthResult = data.getStringExtra("footLengthResult");
                sportResult = data.getStringExtra("sportResult");
                levelResult = data.getStringExtra("levelResult");
                typeResult = data.getStringExtra("typeResult");


                Toast.makeText(this,"Wszystkie parametry zosta??y uzupe??nione \n" +
                                "Kliknij przycisk 'TW??J SPRZ??T'.",
                        Toast.LENGTH_LONG).show();

            } else if (resultCode == RESULT_CANCELED) {
                nameResult = "No data";
                surnameResult = "No data";
                ageResult = "No data";
                genderResult = "No data";
                heightResult = "No data";
                weightResult = "No data";
                footLengthResult = "No data";
                sportResult = "No data";
                levelResult = "No data";
                typeResult = "No data";

                Toast.makeText(this,"Nie wprowadzono wszytskich danych \n" +
                                "Kliknij przycisk 'Wyczy????', a nastepnie spr??buj jeszcze " +
                                "raz wpisa?? potrzebne parametry.",
                        Toast.LENGTH_LONG).show();

            }
        }

        TextView nameTextView = findViewById(R.id.IdNameFromInput);
        nameTextView.setText(nameResult);

        TextView surnameTextView = findViewById(R.id.IdSurnameFromInput);
        surnameTextView.setText(surnameResult);

        TextView ageTextView = findViewById(R.id.IdAgeFromInput);
        ageTextView.setText(ageResult);

        TextView genderTextView = findViewById(R.id.IdGenderFromSpinner);
        genderTextView.setText(genderResult);

        TextView heightTextView = findViewById(R.id.IdHeightFromInput);
        heightTextView.setText(heightResult);

        TextView weightTextView = findViewById(R.id.IdWeightFromInput);
        weightTextView.setText(weightResult);

        TextView footLengthTextView = findViewById(R.id.IdFootLengthFromInput);
        footLengthTextView.setText(footLengthResult);

        TextView sportTextView = findViewById(R.id.IdSportFromSpinner);
        sportTextView.setText(sportResult);

        TextView levelTextView = findViewById(R.id.IdLevelFromSpinner);
        levelTextView.setText(levelResult);

        TextView typeOfDrivingTextView = findViewById(R.id.IdTypeFromSpinner);
        typeOfDrivingTextView.setText(typeResult);

    }



    private void showResult() {

        TextView lengthBoard = findViewById(R.id.IdLengthBoardDescribe);
        TextView bootSize = findViewById(R.id.IdBootSizeDescribe);
        TextView plec = findViewById(R.id.IdGenderFromSpinner);
        TextView waga = findViewById(R.id.IdWeightFromInput);
        TextView wzrost = findViewById(R.id.IdHeightFromInput);
        TextView rozmiar = findViewById(R.id.IdFootLengthFromInput);
        TextView lengthEquipment = findViewById(R.id.IdLengthBoard);
        TextView sizeShoe = findViewById(R.id.IdBootSize);
        TextView typeSport = findViewById(R.id.IdSportFromSpinner);
        TextView levelSkill = findViewById(R.id.IdLevelYourSkill);
        TextView poziom = findViewById(R.id.IdLevelFromSpinner);
        TextView levelDescribe = findViewById(R.id.IdlevelDescribe);
        TextView styl = findViewById(R.id.IdTypeFromSpinner);


        double weight = Double.parseDouble(waga.getText().toString());
        double height = Double.parseDouble(wzrost.getText().toString());
        double size = Double.parseDouble(rozmiar.getText().toString());
        String sport = typeSport.getText().toString();
        String gender = plec.getText().toString();
        String level = poziom.getText().toString();
        String style = styl.getText().toString();

        if (sport.equals("Snowboarding") || sport.equals("Das Snowboard")) {
            if (gender.equals("kobieta") || gender.equals("Kobieta") || gender.equals("woman") || gender.equals("Woman") ||
                    gender.equals("die Frau") || gender.equals("Die Frau")) {
                if (weight < 40) {
                    if (height >=145 && height < 155) {
                        lengthBoard.setText("D??ugo???? deski do 140cm.");
                    } else if (height >= 155 && height < 160) {
                        lengthBoard.setText("D??ugo???? deski od 140cm do 142cm.");
                    } else if (height >= 160 && height < 165) {
                        lengthBoard.setText("D??ugo???? deski od 142cm do 144cm.");
                    } else if (height >= 165 && height < 175) {
                        lengthBoard.setText("D??ugo???? deski od 144cm do 146cm.");
                    } else {
                        lengthBoard.setText("Deska na zam??wienie.");
                    }
                } else if (weight >= 40 && weight < 50) {
                    if (height >= 145 && height < 155) {
                        lengthBoard.setText("D??ugo???? deski od 139cm do 143cm.");
                    } else if (height >= 155 && height < 160) {
                        lengthBoard.setText("D??ugo???? deski od 140cm do 144cm.");
                    } else if (height >= 160 && height < 165) {
                        lengthBoard.setText("D??ugo???? deski od 143cm do 145cm.");
                    } else if (height >= 165 && height < 175) {
                        lengthBoard.setText("D??ugo???? deski od 144cm do 147cm.");
                    } else {
                        lengthBoard.setText("Deska na zam??wnienie");
                    }
                } else if (weight >= 50 && weight < 60) {
                    if (height >= 145 && height < 155) {
                        lengthBoard.setText("D??ugo???? deski od 142cm do 145cm.");
                    } else if (height >= 155 && height < 160) {
                        lengthBoard.setText("D??ugo???? deski od 143cm do 147cm.");
                    } else if (height >= 160 && height < 165) {
                        lengthBoard.setText("D??ugo???? deski od 145cm do 148cm.");
                    } else if (height >= 165 && height < 175) {
                        lengthBoard.setText("D??ugo???? deski od 146cm do 150cm.");
                    } else {
                        lengthBoard.setText("Deska na zam??wienie.");
                    }
                } else if (weight >= 60 && weight < 70) {
                    if (height >= 145 && height < 155) {
                        lengthBoard.setText("D??ugo???? deski od 144cm do 147cm.");
                    } else if (height >= 155 && height < 160) {
                        lengthBoard.setText("D??ugo???? deski od 145cm do 149cm.");
                    } else if (height >= 160 && height < 165) {
                        lengthBoard.setText("D??ugo???? deski od 147cm do 150cm..");
                    } else if (height >= 165 && height < 175) {
                        lengthBoard.setText("D??ugo???? deski od 149cm do 152cm");
                    } else {
                        lengthBoard.setText("Deska na zam??wienie");
                    }
                } else if (weight >= 70 && weight < 80) {
                    if (height >= 145 && height < 155) {
                        lengthBoard.setText("D??ugo???? deski od 146cm do 149cm.");
                    } else if (height >= 155 && height < 160) {
                        lengthBoard.setText("D??ugo???? deski od 148cm do 150cm.");
                    } else if (height >= 160 && height < 165) {
                        lengthBoard.setText("D??ugo???? deski od 149cm do 152cm.");
                    } else if (height >= 165 && height < 175) {
                        lengthBoard.setText("D??ugo???? deski od 150cm do 153cm.");
                    }
                } else lengthBoard.setText("Deska na zam??wienie.");
                //M????CZYZNA
            } else if (gender.equals("mezczyzna") || gender.equals("Mezczyzna") || gender.equals("man") || gender.equals("Man")
                    || gender.equals("der Mann") || gender.equals("Der Mann")) {
                if (height >= 145 && weight < 40) {
                    if (height < 155) {
                        lengthBoard.setText("D??ugo???? deski do 145cm.");
                    } else if (height >= 155 && height < 170) {
                        lengthBoard.setText("D??ugo???? deski od 145cm do 150cm.");
                    }
                } else if (weight >= 40 && weight < 60) {
                    if (height >= 145 && height < 155) {
                        lengthBoard.setText("D??ugo???? deski od 145cm do 150cm.");
                    } else if (height >= 155 && height < 170) {
                        lengthBoard.setText("D??ugo???? deski od 149cm do 154cm.");
                    } else if (height >= 170 && height < 180) {
                        lengthBoard.setText("D??ugo???? deski do 155cm.");
                    } else if (height >= 180 && height < 185) {
                        lengthBoard.setText("D??ugo???? deski do 157cm.");
                    } else if (height >= 185 && height < 190) {
                        lengthBoard.setText("D??ugo???? deski do 158cm.");
                    }else {
                        lengthBoard.setText("Deska na zam??wienie");
                    }
                } else if (weight >= 60 && weight < 70) {
                    if (height >= 145 && height < 155) {
                        lengthBoard.setText("D??ugo???? deski od 149cm do 154cm.");
                    } else if (height >= 155 && height < 170) {
                        lengthBoard.setText("D??ugo???? deski od 153cm do 156cm.");
                    } else if (height >= 170 && height < 180) {
                        lengthBoard.setText("D??ugo???? deski od 154cm do 158cm.");
                    } else if (height >= 180 && height < 185) {
                        lengthBoard.setText("D??ugo???? deski od 156cm do 159cm.");
                    } else if (height >= 185 && height < 190) {
                        lengthBoard.setText("D??ugo???? deski od 157 do 160cm.");
                    } else if (height >= 190) {
                        lengthBoard.setText("D??ugo???? deski do 160cm.");
                    }else{
                        lengthBoard.setText("Deska na zam??wienie");
                    }
                } else if (weight >= 70 && weight < 80) {
                    if (height >= 145 && height < 155) {
                        lengthBoard.setText("D??ugo???? deski od 153cm do 156cm.");
                    } else if (height >= 155 && height < 170) {
                        lengthBoard.setText("D??ugo???? deski od 155cm do 159cm.");
                    } else if (height >= 170 && height < 180) {
                        lengthBoard.setText("D??ugo???? deski od 156cm do 160cm.");
                    } else if (height >= 180 && height < 185) {
                        lengthBoard.setText("D??ugo???? deski od 158cm do 161cm.");
                    } else if (height >= 185 && height < 190) {
                        lengthBoard.setText("D??ugo???? deski od 160 do 162cm.");
                    } else if (height >= 190) {
                        lengthBoard.setText("D??ugo???? deski od 161 do 164cm");
                    }else {
                        lengthBoard.setText("Deska na zam??ienie");
                    }
                } else if (weight >= 80 && weight < 90) {
                    if (height >= 145 && height < 155) {
                        lengthBoard.setText("D??ugo???? deski od 155cm do 159cm.");
                    } else if (height >= 155 && height < 170) {
                        lengthBoard.setText("D??ugo???? deski od 158cm do 161cm.");
                    } else if (height >= 170 && height < 180) {
                        lengthBoard.setText("D??ugo???? deski od 159cm do 162cm.");
                    } else if (height >= 180 && height < 185) {
                        lengthBoard.setText("D??ugo???? deski od 160cm do 162cm.");
                    } else if (height >= 185 && height < 190) {
                        lengthBoard.setText("D??ugo???? deski od 162 do 164cm.");
                    } else if (height >= 190) {
                        lengthBoard.setText("D??ugo???? deski od 164 do 166cm.");
                    }else {
                        lengthBoard.setText("Deska na zam??wienie");
                    }
                } else if (weight >= 90) {
                    if (height >= 145 && height < 155) {
                        lengthBoard.setText("D??ugo???? deski od 158cm.");
                    } else if (height >= 155 && height < 170) {
                        lengthBoard.setText("D??ugo???? deski od 160cm.");
                    } else if (height >= 170 && height < 180) {
                        lengthBoard.setText("D??ugo???? deski od 161.");
                    } else if (height >= 180 && height < 185) {
                        lengthBoard.setText("D??ugo???? deski od 162cm.");
                    } else if (height >= 185 && height < 190) {
                        lengthBoard.setText("D??ugo???? deski od 164cm");
                    } else if (height >= 190) {
                        lengthBoard.setText("D??ugo???? deski od 166cm.");
                    }else{
                        lengthBoard.setText("Deska na zam??wienie");
                    }
                }
            }
            lengthEquipment.setText("D??ugo???? deski");

        } else if (sport.equals("Narciarstwo") || sport.equals("Skiing") || sport.equals("Das Skifahren")) {
            if (gender.equals("kobieta") || gender.equals("Kobieta") || gender.equals("woman") || gender.equals("Woman")
                    || gender.equals("die Frau") || gender.equals("Die Frau")) {
                if (level.equals("Pocz??tkuj??cy") || level.equals("Beginner") || level.equals("Der Anf??nger ")) {
                    if (weight <= 45) {
                        if (height >= 140 && height <= 145) {
                            lengthBoard.setText("D??ugo???? nart to od 132cm do 140cm");
                        } else if (height > 145 && height < 165) {
                            lengthBoard.setText("D??ugo???? nart to od 140cm do 152cm");
                        } else if (height >= 165 && height < 175) {
                            lengthBoard.setText("D??ugo???? nart to od 155cm do 160cm");
                        } else if (height >= 175 && height < 185) {
                            lengthBoard.setText("D??ugo???? nart to 160cm do 165cm");
                        } else if (height >= 185) {
                            lengthBoard.setText("D??ugo???? nart wi??ksza od 165cm");
                        }else {
                            lengthBoard.setText("Narty na zam??wienie");
                        }
                    } else if (weight > 45 && weight < 100) {
                        if (height >= 140 && height <= 145) {
                            lengthBoard.setText("D??ugo???? nart to od 132cm do 140cm");
                        } else if (height > 145 && height < 165) {
                            lengthBoard.setText("D??ugo???? nart to od 140cm do 152cm");
                        } else if (height >= 165 && height < 175) {
                            lengthBoard.setText("D??ugo???? nart to od 155cm do 165cm");
                        } else if (height >= 175 && height < 185) {
                            lengthBoard.setText("D??ugo???? nart to 168cm do 170cm");
                        } else if (height >= 185) {
                            lengthBoard.setText("D??ugo???? nart wi??ksza od 170cm");
                        }else{
                            lengthBoard.setText("Narty na zam??wienie");
                        }
                    } else {
                        lengthBoard.setText("Narty na zam??wienie");
                    }
                } else if (level.equals("??redniozaawansowany") || level.equals("Intermediate") || level.equals("Die Mittelstufe")) {
                    if (weight <= 45) {
                        if (height >= 140 && height <= 145) {
                            lengthBoard.setText("D??ugo???? nart to od 132cm do 140cm");
                        } else if (height > 145 && height < 165) {
                            lengthBoard.setText("D??ugo???? nart to od 140cm do 152cm");
                        } else if (height >= 165 && height < 175) {
                            lengthBoard.setText("D??ugo???? nart to od 155cm do 165cm");
                        } else if (height >= 175 && height < 185) {
                            lengthBoard.setText("D??ugo???? nart to 168cm do 170cm");
                        } else if (height >= 185) {
                            lengthBoard.setText("D??ugo???? nart wi??ksza od 170cm");
                        }else{
                            lengthBoard.setText("Narty na zam??wnienie");
                        }
                    } else if (weight > 45 && weight < 100) {
                        if (height >= 140 && height <= 145) {
                            lengthBoard.setText("D??ugo???? nart to od 142cm do 146cm");
                        } else if (height > 145 && height < 165) {
                            lengthBoard.setText("D??ugo???? nart to od 146cm do 152cm");
                        } else if (height >= 165 && height < 175) {
                            lengthBoard.setText("D??ugo???? nart to od 155cm do 165cm");
                        } else if (height >= 175 && height < 185) {
                            lengthBoard.setText("D??ugo???? nart to 168cm do 182cm");
                        } else if (height >= 185) {
                            lengthBoard.setText("D??ugo???? nart wi??ksza od 182cm");
                        }else{
                            lengthBoard.setText("Narty na zam??wienie");
                        }
                    } else {
                        lengthBoard.setText("Narty na zam??wienie");
                    }
                } else if (level.equals("Zaawansowany") || level.equals("Advanced") || level.equals("Die Oberstufe")) {
                    if (weight <= 45) {
                        if (height >= 140 && height <= 145) {
                            lengthBoard.setText("D??ugo???? nart to od 132cm do 140cm");
                        } else if (height > 145 && height < 165) {
                            lengthBoard.setText("D??ugo???? nart to od 140cm do 160cm");
                        } else if (height >= 165 && height < 175) {
                            lengthBoard.setText("D??ugo???? nart to od 160cm do 165cm");
                        } else if (height >= 175 && height < 185) {
                            lengthBoard.setText("D??ugo???? nart to 168cm do 170cm");
                        } else if (height >= 185) {
                            lengthBoard.setText("D??ugo???? nart wi??ksza od 170cm");
                        }else{
                            lengthBoard.setText("Narty na zam??wienie");
                        }
                    } else if (weight > 45 && weight < 100) {
                        if (height >= 140 && height <= 145) {
                            lengthBoard.setText("D??ugo???? nart to od 142cm do 146cm");
                        } else if (height > 145 && height < 165) {
                            lengthBoard.setText("D??ugo???? nart to od 146cm do 160cm");
                        } else if (height >= 165 && height < 175) {
                            lengthBoard.setText("D??ugo???? nart to od 160cm do 165cm");
                        } else if (height >= 175 && height < 185) {
                            lengthBoard.setText("D??ugo???? nart to 168cm do 182cm");
                        } else if (height >= 185) {
                            lengthBoard.setText("D??ugo???? nart wi??ksza od 182cm");
                        }else{
                            lengthBoard.setText("narty na zam??wienie");
                        }
                    } else {
                        lengthBoard.setText("Narty na zam??wienie");
                    }
                }
            } else if (gender.equals("mezczyzna") || gender.equals("Mezczyzna") || gender.equals("man") || gender.equals("Man")
                    || gender.equals("der Mann") || gender.equals("Der Mann")) {
                if (level.equals("Pocz??tkuj??cy") || level.equals("Beginner") || level.equals("Der Anf??nger")) {
                    if (weight <= 45) {
                        if (height >= 140 && height <= 145) {
                            lengthBoard.setText("D??ugo???? nart to od 132cm do 140cm");
                        } else if (height > 145 && height < 165) {
                            lengthBoard.setText("D??ugo???? nart to od 140cm do 152cm");
                        } else if (height >= 165 && height < 175) {
                            lengthBoard.setText("D??ugo???? nart to od 155cm do 160cm");
                        } else if (height >= 175 && height < 185) {
                            lengthBoard.setText("D??ugo???? nart to 160cm do 165cm");
                        } else if (height >= 185) {
                            lengthBoard.setText("D??ugo???? nart wi??ksza od 168cm");
                        }else{
                            lengthBoard.setText("Narty na zam??wienie");
                        }
                    } else if (weight > 45 && weight < 100) {
                        if (height >= 140 && height <= 145) {
                            lengthBoard.setText("D??ugo???? nart to od 132cm do 140cm");
                        } else if (height > 145 && height < 165) {
                            lengthBoard.setText("D??ugo???? nart to od 140cm do 152cm");
                        } else if (height >= 165 && height < 175) {
                            lengthBoard.setText("D??ugo???? nart to od 155cm do 165cm");
                        } else if (height >= 175 && height < 185) {
                            lengthBoard.setText("D??ugo???? nart to 168cm do 170cm");
                        } else if (height >= 185) {
                            lengthBoard.setText("D??ugo???? nart wi??ksza od 176cm");
                        }else{
                            lengthBoard.setText("Narty na zam??wienie");
                        }
                    } else {
                        lengthBoard.setText("Narty na zam??wienie");
                    }
                } else if (level.equals("??redniozaawansowany") || level.equals("Intermediate") || level.equals("Die Mittelstufe")) {
                    if (weight <= 45) {
                        if (height >= 140 && height <= 145) {
                            lengthBoard.setText("D??ugo???? nart to od 132cm do 140cm");
                        } else if (height > 145 && height < 165) {
                            lengthBoard.setText("D??ugo???? nart to od 140cm do 152cm");
                        } else if (height >= 165 && height < 175) {
                            lengthBoard.setText("D??ugo???? nart to od 155cm do 165cm");
                        } else if (height >= 175 && height < 185) {
                            lengthBoard.setText("D??ugo???? nart to 168cm do 170cm");
                        } else if (height >= 185) {
                            lengthBoard.setText("D??ugo???? nart wi??ksza od 176cm");
                        }else{
                            lengthBoard.setText("Narty na zam??wienie");
                        }
                    } else if (weight > 45 && weight < 100) {
                        if (height >= 140 && height <= 145) {
                            lengthBoard.setText("D??ugo???? nart to od 142cm do 146cm");
                        } else if (height > 145 && height < 165) {
                            lengthBoard.setText("D??ugo???? nart to od 146cm do 160cm");
                        } else if (height >= 165 && height < 175) {
                            lengthBoard.setText("D??ugo???? nart to od 160cm do 165cm");
                        } else if (height >= 175 && height < 185) {
                            lengthBoard.setText("D??ugo???? nart to 168cm do 182cm");
                        } else if (height >= 185) {
                            lengthBoard.setText("D??ugo???? nart wi??ksza od 182cm");
                        }else{
                            lengthBoard.setText("Narty na zam??wienie");
                        }
                    } else {
                        lengthBoard.setText("Narty na zam??wienie");
                    }
                } else if (level.equals("Zaawansowany") || level.equals("Advanced") || level.equals("Die Oberstufe")) {
                    if (weight <= 45) {
                        if (height >= 140 && height <= 145) {
                            lengthBoard.setText("D??ugo???? nart to od 132cm do 140cm");
                        } else if (height > 145 && height < 165) {
                            lengthBoard.setText("D??ugo???? nart to od 140cm do 160cm");
                        } else if (height >= 165 && height < 175) {
                            lengthBoard.setText("D??ugo???? nart to od 160cm do 165cm");
                        } else if (height >= 175 && height < 185) {
                            lengthBoard.setText("D??ugo???? nart to 168cm do 170cm");
                        } else if (height >= 185) {
                            lengthBoard.setText("D??ugo???? nart wi??ksza od 176cm");
                        }else{
                            lengthBoard.setText("Narty na zam??wienie");
                        }
                    } else if (weight > 45 && weight < 100) {
                        if (height >= 140 && height <= 145) {
                            lengthBoard.setText("D??ugo???? nart to od 142cm do 146cm");
                        } else if (height > 145 && height < 165) {
                            lengthBoard.setText("D??ugo???? nart to od 146cm do 160cm");
                        } else if (height >= 165 && height < 175) {
                            lengthBoard.setText("D??ugo???? nart to od 160cm do 165cm");
                        } else if (height >= 175 && height < 185) {
                            lengthBoard.setText("D??ugo???? nart to 168cm do 182cm");
                        } else if (height >= 185) {
                            lengthBoard.setText("D??ugo???? nart wi??ksza od 182cm");
                        }else{
                            lengthBoard.setText("Narty na zam??wienie");
                        }
                    } else {
                        lengthBoard.setText("Narty na zam??wienie");
                    }
                }
            }
            lengthEquipment.setText("D??ugo???? nart");

        }else lengthBoard.setText("Nie wybrano dyscypliny sportu");


        //ROZMIAR BUT??W

        if (gender.equals("kobieta") || gender.equals("Kobieta") || gender.equals("woman") || gender.equals("Woman") ||
                gender.equals("die Frau") || gender.equals("Die Frau")) {
            if (size == 23) {
                bootSize.setText("Rozmiar but??w to 36.");
            } else if (size >= 24 && size < 24.5) {
                bootSize.setText("Rozmiar but??w to 37");
            } else if (size >= 24.5 && size < 25.5) {
                bootSize.setText("Rozmiar but??w to 38.");
            } else if (size >= 25.5 && size < 26) {
                bootSize.setText("Rozmiar but??w to 39");
            } else if (size >= 26 && size < 26.5) {
                bootSize.setText("Rozmiar but??w to 40");
            } else if (size == 26.5) {
                bootSize.setText("Rozmiar but??w to 41.");
            } else {
                bootSize.setText("Musisz kupi?? wi??ksze buty.");
            }
        } else if (gender.equals("mezczyzna") || gender.equals("Mezczyzna") || gender.equals("man") || gender.equals("Man")
                || gender.equals("der Mann") || gender.equals("Der Mann")){
            if (size == 26.5) {
                bootSize.setText("Rozmiar but??w to 41.");
            } else if (size > 26.5 && size <= 27) {
                bootSize.setText("Rozmiar but??w to 42");
            } else if (size > 27 && size <= 27.5) {
                bootSize.setText("Rozmiar but??w to 43");
            } else if (size > 27.5 && size < 29) {
                bootSize.setText("Rozmiar but??w to 44");
            } else if (size == 29) {
                bootSize.setText("Romziar but??w to 45");
            } else {
                bootSize.setText("Musisz kupi?? wi??ksze buty.");
            }
        } else bootSize.setText("Podano niepoprawne dane");
        sizeShoe.setText("Rozmiar but??w");


        //POZIOM I STYL JAZDY

        if(sport.equals("Snowboarding") || sport.equals("Das Snowboard")) {
            if (style.equals("Snowboard: Freestyle")) {
                if (level.equals("Pocz??tkuj??cy") || level.equals("Beginner") || level.equals("Der Anf??nger")) {
                    levelDescribe.setText("Deska typu all mountain lub freestyle \n" +
                            "profil deski: rocker \n " +
                            "wi??zania o ma??ej sztywno??ci (mi??kkie) \n");
                } else if (level.equals("??redniozaawansowany") || level.equals("Intermediate") || level.equals("Die Mittelstufe")) {
                    levelDescribe.setText("Deska typu all mountain lub freestyle\n" +
                            "profil deski: rocker, hybryda, flat \n" +
                            "wi??zania o ma??ej lub ??redniej sztyno??ci ");
                } else if (level.equals("Zaawansowany") || level.equals("Advanced") || level.equals("Die Oberstufe")) {
                    levelDescribe.setText("Deska typu freestyle \n" +
                            "profil deski: camber \n" +
                            "wi??zania o ma??ej lub ??redniej sztywno??ci");
                }
            } else if (style.equals("Snowboard: Freeride")) {
                if (level.equals("Pocz??tkuj??cy") || level.equals("Beginner") || level.equals("Der Anf??nger") ) {
                    levelDescribe.setText("Deska typu all mountain lub freestyle\n" +
                            "wi??zania o ma??ej lub ??rdeniej sztywno??ci");
                } else if (level.equals("??redniozaawansowany") || level.equals("Intermediate") || level.equals("Die Mittelstufe")) {
                    levelDescribe.setText("Deska typu all mountain lub freeride \n" +
                            "wi??zania o ??redniej sztywno??ci");
                } else if (level.equals("Zaawansowany") || level.equals("Advanced") || level.equals("Die Oberstufe")) {
                    levelDescribe.setText("Deska typu freeride \n" +
                            "wi??zania o ??redniej sztywno??ci");
                }
            } else if (style.equals("Snowboard: Styl alpejski") || style.equals("Snowboard: alpine style")) {
                if (level.equals("Pocz??tkuj??cy") || level.equals("Beginner") || level.equals("Der Anf??nger")) {
                    levelDescribe.setText("Deska typu all mountain lub freestyle \n" +
                            "wi??zania o ??redniej sztywno??ci");
                } else if (level.equals("??redniozaawansowany") || level.equals("Intermediate") || level.equals("Die Mittelstufe")) {
                    levelDescribe.setText("Deska typu alpejska lub race \n" +
                            "wi??zania o du??ej sztywno??ci (twarde)");
                } else if (level.equals("Zaawansowany") || level.equals("Advanced") || level.equals("Die Oberstufe")) {
                    levelDescribe.setText("Deska typu alpejska lub race \n" +
                            "wi??zania o du??ej sztywno??ci (twarde)");
                }
            } else if (style.equals("Snowboard: Snowcross")) {
                if (level.equals("Pocz??tkuj??cy") || level.equals("Beginner")  || level.equals("Der Anf??nger")) {
                    levelDescribe.setText("Deska typu all mountain lub freestyle");
                } else if (level.equals("??redniozaawansowany") || level.equals("Intermediate") || level.equals("Die Mittelstufe")) {
                    levelDescribe.setText("Deska typu freestyle lub bordercross");
                } else if (level.equals("Zaawansowany") || level.equals("Advanced") || level.equals("Die Oberstufe")) {
                    levelDescribe.setText("Deska typu boardercross");
                }
            }
        } else if(sport.equals("Narciarstwo") || sport.equals("Skiing") || sport.equals("Das Skifahren")) {
            if (style.equals("Narciarstwo: Freestyle") || style.equals("Skiing: Freestyle") || style.equals("Skifahren: Freestyle")) {
                if (level.equals("Pocz??tkuj??cy") || level.equals("Beginner") || level.equals("Der Anf??nger")) {
                    levelDescribe.setText("Narty typu easycarver o ma??ej sztywno??ci\n");
                } else if (level.equals("??redniozaawansowany") || level.equals("Intermediate") || level.equals("Die Mittelstufe")) {
                    levelDescribe.setText("Narty typu allround lub all mountain o ma??ej lub ??redniej sztywno??ci\n");
                } else if (level.equals("Zaawansowany") || level.equals("Advanced") || level.equals("Die Oberstufe")) {
                    levelDescribe.setText("Narty typu freestyle");
                }
            } else if (style.equals("Narciarstwo: Freeride") || style.equals("Skiing: Freeride") || style.equals("Skifahren: Freeride")) {
                if (level.equals("Pocz??tkuj??cy") || level.equals("Beginner") || level.equals("Der Anf??nger")) {
                    levelDescribe.setText("Narty typu easycarver o ma??ej sztywno??ci o ma??ej sztywno??ci");
                } else if (level.equals("??redniozaawansowany")  || level.equals("Intermediate") || level.equals("Die Mittelstufe")) {
                    levelDescribe.setText("Narty typu allround, all mountain lub rocker o ??redniej sztywno??ci ");
                } else if (level.equals("Zaawansowany")  || level.equals("Advanced") || level.equals("Die Oberstufe")) {
                    levelDescribe.setText("Narty typu rocker o du??ej sztywno??ci");
                }
            } else if (style.equals("Narciarstwo: alpejskie") || style.equals("Skiing: alpine style") || style.equals("Skifahren: alpiner Stil")) {
                if (level.equals("Pocz??tkuj??cy") || level.equals("Beginner") || level.equals("Der Anf??nger")) {
                    levelDescribe.setText("Narty typu easycarver o ma??ej sztywno??ci ma??ej sztywno??ci");
                } else if (level.equals("??redniozaawansowany")  || level.equals("Intermediate") || level.equals("Die Mittelstufe")) {
                    levelDescribe.setText("Narty typu allround lub all mountain o ??redniej sztywno??ci");
                } else if (level.equals("Zaawansowany")  || level.equals("Advanced")  || level.equals("Die Oberstufe")) {
                    levelDescribe.setText("Narty typu race, skitourowe lub do jazdy telemarkiem");
                }
            } else if (style.equals("Narciarstwo: klasyczne") || style.equals("Skiing: classic style") || style.equals("Skifahren: klassischer Stil")) {
                if (level.equals("Pocz??tkuj??cy") || level.equals("Beginner") || level.equals("Der Anf??nger")) {
                    levelDescribe.setText("Narty klasyczne z ??usk??");
                } else if (level.equals("??redniozaawansowany") || level.equals("Intermediate") || level.equals("Die Mittelstufe")) {
                    levelDescribe.setText("Narty klasyczne ze skinem");
                } else if (level.equals("Zaawansowany") || level.equals("Advanced") || level.equals("Die Oberstufe")) {
                    levelDescribe.setText("Narty klasyczne smarowane");
                }
            }
        }else{
            levelDescribe.setText("Nie wybrano rodzaju wykonywanej dyscypliny");
        }

        levelSkill.setText("Poziom umiej??tno??ci");

    }

    private void clearData() {

        TextView nameTextView = findViewById(R.id.IdNameFromInput);
        nameTextView.setText("");

        TextView surnameTextView = findViewById(R.id.IdSurnameFromInput);
        surnameTextView.setText("");

        TextView ageTextView = findViewById(R.id.IdAgeFromInput);
        ageTextView.setText("");

        TextView genderTextView = findViewById(R.id.IdGenderFromSpinner);
        genderTextView.setText("");

        TextView heightTextView = findViewById(R.id.IdHeightFromInput);
        heightTextView.setText("");

        TextView weightTextView = findViewById(R.id.IdWeightFromInput);
        weightTextView.setText("");

        TextView footLengthTextView = findViewById(R.id.IdFootLengthFromInput);
        footLengthTextView.setText("");

        TextView sportTextView = findViewById(R.id.IdSportFromSpinner);
        sportTextView.setText("");

        TextView levelTextView = findViewById(R.id.IdLevelFromSpinner);
        levelTextView.setText("");

        TextView typeOfDrivingTextView = findViewById(R.id.IdTypeFromSpinner);
        typeOfDrivingTextView.setText("");


        TextView lengthBoard = findViewById(R.id.IdLengthBoard);
        lengthBoard.setText("");

        TextView lengthBoardDescribe = findViewById(R.id.IdLengthBoardDescribe);
        lengthBoardDescribe.setText("");

        TextView bootSize = findViewById(R.id.IdBootSize);
        bootSize.setText("");

        TextView bootSizeDescribe = findViewById(R.id.IdBootSizeDescribe);
        bootSizeDescribe.setText("");

        TextView levelYourSkill = findViewById(R.id.IdLevelYourSkill);
        levelYourSkill.setText("");

        TextView levelDescribe = findViewById(R.id.IdlevelDescribe);
        levelDescribe.setText("");
    }
}



