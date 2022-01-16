package com.example.winterapp

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity


class Maps : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_maps)
        initListeners()
    }

    private fun initListeners() {

        val showCountryAustria = findViewById<Button>(R.id.IdCountryAustria)
        val showCountryFrance = findViewById<Button>(R.id.IdCountryFrance)
        val showCountrySpain = findViewById<Button>(R.id.IdCountrySpain)
        val showCountryNorway = findViewById<Button>(R.id.IdCountryNorway)
        val showCountryPoland = findViewById<Button>(R.id.IdCountryPoland)
        val showCountryRomania = findViewById<Button>(R.id.IdCountryRomania)
        val showCountrySlovenia = findViewById<Button>(R.id.IdCountrySlovenia)
        val showCountrySwitzerland = findViewById<Button>(R.id.IdCountrySwitzerland)
        val showCountryItaly = findViewById<Button>(R.id.IdCountryItaly)
        val showCountryUSA = findViewById<Button>(R.id.IdCountryUSA)
        val showCountryCanada = findViewById<Button>(R.id.IdCountryCanada)
        val showCountryChile = findViewById<Button>(R.id.IdCountryChile)



        showCountryAustria.setOnClickListener(buttonCountryAustria)
        showCountryFrance.setOnClickListener(buttonCountryFrance)
        showCountrySpain.setOnClickListener(buttonCountrySpain)
        showCountryNorway.setOnClickListener(buttonCountryNorway)
        showCountryPoland.setOnClickListener(buttonCountryPoland)
        showCountryRomania.setOnClickListener(buttonCountryRomania)
        showCountrySlovenia.setOnClickListener(buttonCountrySlovenia)
        showCountrySwitzerland.setOnClickListener(buttonCountrySwitzerland)
        showCountryItaly.setOnClickListener(buttonCountryItaly)
        showCountryUSA.setOnClickListener(buttonCountryUSA)
        showCountryCanada.setOnClickListener(buttonCountryCanada)
        showCountryChile.setOnClickListener(buttonCountryChile)
    }

    private val buttonCountryAustria = View.OnClickListener {
        showSkiResortsInAustria()
    }
    private val buttonCountryFrance = View.OnClickListener {
        showSkiResortsInFrance()
    }
    private val buttonCountrySpain = View.OnClickListener {
        showSkiResortsInSpain()
    }
    private val buttonCountryNorway = View.OnClickListener {
        showSkiResortsInNorway()
    }
    private val buttonCountryPoland = View.OnClickListener {
        showSkiResortsInPoland()
    }
    private val buttonCountryRomania = View.OnClickListener {
        showSkiResortsInRomania()
    }
    private val buttonCountrySlovenia = View.OnClickListener {
        showSkiResortsInSlovenia()
    }
    private val buttonCountrySwitzerland = View.OnClickListener {
        showSkiResortsInSwitzerland()
    }
    private val buttonCountryItaly = View.OnClickListener {
        showSkiResortsInItaly()
    }
    private val buttonCountryUSA = View.OnClickListener {
        showSkiResortsInUSA()
    }
    private val buttonCountryCanada = View.OnClickListener {
        showSkiResortsInCanada()
    }
    private val buttonCountryChile = View.OnClickListener {
        showSkiResortsInChile()
    }

    //METODY
    private fun showSkiResortsInAustria() {
        val austriaIntent = Intent(
            Intent.ACTION_VIEW,
            Uri.parse("https://www.skiinfo.pl/austria/osrodki-narciarskie")
        )
        startActivity(austriaIntent)
    }

    private fun showSkiResortsInFrance() {
        val franceIntent = Intent(
            Intent.ACTION_VIEW,
            Uri.parse("https://www.skiinfo.pl/francja/osrodki-narciarskie")
        )
        startActivity(franceIntent)
    }

    private fun showSkiResortsInSpain() {
        val spainIntent = Intent(
            Intent.ACTION_VIEW,
            Uri.parse("https://www.skiinfo.pl/hiszpania/osrodki-narciarskie")
        )
        startActivity(spainIntent)
    }

    private fun showSkiResortsInNorway() {
        val norwayIntent = Intent(
            Intent.ACTION_VIEW,
            Uri.parse("https://www.skiinfo.pl/norwegia/osrodki-narciarskie")
        )
        startActivity(norwayIntent)
    }

    private fun showSkiResortsInPoland() {
        val polandIntent = Intent(
            Intent.ACTION_VIEW,
            Uri.parse("https://www.skiinfo.pl/polska/osrodki-narciarskie")
        )
        startActivity(polandIntent)
    }

    private fun showSkiResortsInRomania() {
        val romaniaIntent = Intent(
            Intent.ACTION_VIEW,
            Uri.parse("https://www.skiinfo.pl/rumunia/osrodki-narciarskie")
        )
        startActivity(romaniaIntent)
    }

    private fun showSkiResortsInSlovenia() {
        val sloveniaIntent = Intent(
            Intent.ACTION_VIEW,
            Uri.parse("https://www.skiinfo.pl/slowenia/osrodki-narciarskie")
        )
        startActivity(sloveniaIntent)
    }

    private fun showSkiResortsInSwitzerland() {
        val switzerlandIntent = Intent(
            Intent.ACTION_VIEW,
            Uri.parse("https://www.skiinfo.pl/szwajcaria/osrodki-narciarskie")
        )
        startActivity(switzerlandIntent)
    }

    private fun showSkiResortsInItaly() {
        val italyIntent = Intent(
            Intent.ACTION_VIEW,
            Uri.parse("https://www.skiinfo.pl/wlochy/osrodki-narciarskie")
        )
        startActivity(italyIntent)
    }

    private fun showSkiResortsInUSA() {
        val usaIntent = Intent(
            Intent.ACTION_VIEW,
            Uri.parse("https://www.skiinfo.pl/usa/osrodki-narciarskie")
        )
        startActivity(usaIntent)
    }

    private fun showSkiResortsInCanada() {
        val canadaIntent = Intent(
            Intent.ACTION_VIEW,
            Uri.parse("https://www.skiinfo.pl/kanada/osrodki-narciarskie")
        )
        startActivity(canadaIntent)
    }

    private fun showSkiResortsInChile() {
        val chileIntent = Intent(
            Intent.ACTION_VIEW,
            Uri.parse("https://www.skiinfo.pl/chile/osrodki-narciarskie")
        )
        startActivity(chileIntent)
    }
}