package com.example.winterapp

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class Guide : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_guide)

        //profile deski
        textAboutBoardProfileRocker
        textAboutBoardProfileFlatCamber
        textAboutBoardProfileCamber
        textAboutBoardProfileHybryda

        //rodzaj jazdy
        textAboutFreerideBoard
        textAboutAllMountainBoard
        textAboutFreestyleBoard
        textAboutJibbingBoard
        textAboutButteringBoard

        textAboutEasycarverSki
        textAboutAllroundSki
        textAboutAllMountainSki
        textAboutRaceSki
        textAboutTwintipFreestyle
        textAboutFreerideSki
        textAboutSkitourSki
        textAboutCrosscarverSki
    }

    private val textAboutBoardProfileRocker: Unit
         get() {
            val firstTitleProfileRocker = findViewById<TextView>(R.id.IdBoardRocker)
            val describeRocker = findViewById<TextView>(R.id.IdBoardRockerDescribe)
            val intentOne = intent
            val boardProfile = intentOne.getStringExtra("boardProfileRocker")
            val boardProfileDescribe = intentOne.getStringExtra("boardProfileDescribeRocker")
            firstTitleProfileRocker.text = boardProfile
            describeRocker.text = boardProfileDescribe
        }
    private val textAboutBoardProfileFlatCamber: Unit
         get() {
            val secondTitleProfileFlatCamber = findViewById<TextView>(R.id.IdBoardFlatCamber)
            val describeFlatCamber = findViewById<TextView>(R.id.IdBoardFlatCamberDescribe)
            val intentTwo = intent
            val boardProfile = intentTwo.getStringExtra("boardProfileFlatCamber")
            val boardProfileDescribe = intentTwo.getStringExtra("boardProfileDescribeFlatCamber")
            secondTitleProfileFlatCamber.text = boardProfile
            describeFlatCamber.text = boardProfileDescribe
        }
    private val textAboutBoardProfileCamber: Unit
         get() {
            val thirdTitleProfileCamber = findViewById<TextView>(R.id.IdBoardCamber)
            val describeCamber = findViewById<TextView>(R.id.IdBoardCamberDescribe)
            val intentThree = intent
            val boardProfile = intentThree.getStringExtra("boardProfileCamber")
            val boardProfileDescribe = intentThree.getStringExtra("boardProfileDescribeCamber")
            thirdTitleProfileCamber.text = boardProfile
            describeCamber.text = boardProfileDescribe
        }
    private val textAboutBoardProfileHybryda: Unit
         get() {
            val fourthTitleProfileHybryda = findViewById<TextView>(R.id.IdBoardHybryda)
            val describeHybryda = findViewById<TextView>(R.id.IdBoardHybrydaDescribe)
            val intentFour = intent
            val boardProfile = intentFour.getStringExtra("boardProfileHybryda")
            val boardProfileDescribe = intentFour.getStringExtra("boardProfileDescribeHybryda")
            fourthTitleProfileHybryda.text = boardProfile
            describeHybryda.text = boardProfileDescribe
        }
    private val textAboutFreerideBoard: Unit
         get() {
            val firstTitleTypeOfBoard = findViewById<TextView>(R.id.IdFreerideBoard)
            val describeFreeride = findViewById<TextView>(R.id.IdFreerideBoardDescribe)
            val intentFive = intent
            val boardType = intentFive.getStringExtra("boardTypeFreeride")
            val boardTypeDescribe = intentFive.getStringExtra("boardTypeDescribeFreeride")
            firstTitleTypeOfBoard.text = boardType
            describeFreeride.text = boardTypeDescribe
        }
    private val textAboutAllMountainBoard: Unit
         get() {
            val secondTitleTypeOfBoard = findViewById<TextView>(R.id.IdAllMountainBoard)
            val describeAllMountain = findViewById<TextView>(R.id.IdAllMountainBoardDescribe)
            val intentSix = intent
            val boardType = intentSix.getStringExtra("boardTypeAllMountain")
            val boardTypeDescribe = intentSix.getStringExtra("boardTypeDescribeAllMountain")
            secondTitleTypeOfBoard.text = boardType
            describeAllMountain.text = boardTypeDescribe
        }
    private val textAboutFreestyleBoard: Unit
         get() {
            val thirdTitleTypeOfBoard = findViewById<TextView>(R.id.IdFreestyleBoard)
            val describeFreestyle = findViewById<TextView>(R.id.IdFreestyleBoardDescribe)
            val intentSeven = intent
            val boardType = intentSeven.getStringExtra("boardTypeFreestyle")
            val boardTypeDescribe = intentSeven.getStringExtra("boardTypeDescribeFreestyle")
            thirdTitleTypeOfBoard.text = boardType
            describeFreestyle.text = boardTypeDescribe
        }
    private val textAboutJibbingBoard: Unit
         get() {
            val fourthTitleTypeOfBoard = findViewById<TextView>(R.id.IdJibbingBoard)
            val describeJibbing = findViewById<TextView>(R.id.IdJibbingBoardDescribe)
            val intentEight = intent
            val boardType = intentEight.getStringExtra("boardTypeJibbing")
            val boardTypeDescribe = intentEight.getStringExtra("boardTypeDescribeJibbing")
            fourthTitleTypeOfBoard.text = boardType
            describeJibbing.text = boardTypeDescribe
        }
    private val textAboutButteringBoard: Unit
         get() {
            val fifthTitleTypeOfBoard = findViewById<TextView>(R.id.IdButteringBoard)
            val describeButtering = findViewById<TextView>(R.id.IdButteringBoardDescribe)
            val intentNine = intent
            val boardType = intentNine.getStringExtra("boardTypeButtering")
            val boardTypeDescribe = intentNine.getStringExtra("boardTypeDescribeButtering")
            fifthTitleTypeOfBoard.text = boardType
            describeButtering.text = boardTypeDescribe
        }
    private val textAboutEasycarverSki: Unit
         get() {
            val firstTitleTypeOfSki = findViewById<TextView>(R.id.IdEasycarverTypeSki)
            val describeEasycarver = findViewById<TextView>(R.id.IdEasycarverTypeSkiDescribe)
            val intentOne = intent
            val skiType = intentOne.getStringExtra("skiTypeEasycarver")
            val skiTypeDescribe = intentOne.getStringExtra("skiTypeEasycarverDescribe")
            firstTitleTypeOfSki.text = skiType
            describeEasycarver.text = skiTypeDescribe
        }
    private val textAboutAllroundSki: Unit
         get() {
            val secondTitleTypeOfSki = findViewById<TextView>(R.id.IdAllroundTypeSki)
            val describeAllround = findViewById<TextView>(R.id.IdAllroundTypeSkiDescribe)
            val intentTwo = intent
            val skiType = intentTwo.getStringExtra("skiAllroundType")
            val skiTypeDescribe = intentTwo.getStringExtra("skiAllroundTypeDescribe")
            secondTitleTypeOfSki.text = skiType
            describeAllround.text = skiTypeDescribe
        }
    private val textAboutAllMountainSki: Unit
         get() {
            val thirdTitleTypeOfSki = findViewById<TextView>(R.id.IdAllMountainTypeSki)
            val describeAllMountain = findViewById<TextView>(R.id.IdAllMountainTypeSkiDescribe)
            val intentThree = intent
            val skiType = intentThree.getStringExtra("skiAllMountainType")
            val skiTypeDescribe = intentThree.getStringExtra("skiAllMountainTypeDescribe")
            thirdTitleTypeOfSki.text = skiType
            describeAllMountain.text = skiTypeDescribe
        }
    private val textAboutRaceSki: Unit
         get() {
            val fourthTitleTypeOfSki = findViewById<TextView>(R.id.IdRaceTypeSki)
            val describeRace = findViewById<TextView>(R.id.IdRaceTypeSkiDescribe)
            val intentFour = intent
            val skiType = intentFour.getStringExtra("skiRaceType")
            val skiTypeDescribe = intentFour.getStringExtra("skiReceTypeDescribe")
            fourthTitleTypeOfSki.text = skiType
            describeRace.text = skiTypeDescribe
        }
    private val textAboutCrosscarverSki: Unit
         get() {
            val fifthTitleTypeOfSki = findViewById<TextView>(R.id.IdCrosscarverTypeSki)
            val describeCrosscarver = findViewById<TextView>(R.id.IdCrosscarverTypeSkiDescribe)
            val intentFive = intent
            val skiType = intentFive.getStringExtra("skiCrosscarverType")
            val skiTypeDescribe = intentFive.getStringExtra("skiCrosscarverTypeDescribe")
            fifthTitleTypeOfSki.text = skiType
            describeCrosscarver.text = skiTypeDescribe
        }
    private val textAboutFreerideSki: Unit
         get() {
            val sixthTitleTypeOfSki = findViewById<TextView>(R.id.IdFreerideTypeSki)
            val describeFreerideSki = findViewById<TextView>(R.id.IdFreerideTypeSkiDescribe)
            val intentSix = intent
            val skiType = intentSix.getStringExtra("skiFreerideType")
            val skiTypeDescribe = intentSix.getStringExtra("skiFreerideTypeDescribe")
            sixthTitleTypeOfSki.text = skiType
            describeFreerideSki.text = skiTypeDescribe
        }
    private val textAboutTwintipFreestyle: Unit
         get() {
            val sevenTitleTypeOfSki = findViewById<TextView>(R.id.IdTwintipFreestyleTypeSki)
            val describeTwinTipFreestyle =
                findViewById<TextView>(R.id.IdTwintipFreestyleTypeSkiDescribe)
            val intentSeven = intent
            val skiType = intentSeven.getStringExtra("skiTwintipFreestyleType")
            val skiTypeDescribe = intentSeven.getStringExtra("skiTwintipFreestyleTypeDescribe")
            sevenTitleTypeOfSki.text = skiType
            describeTwinTipFreestyle.text = skiTypeDescribe
        }
    private val textAboutSkitourSki: Unit
         get() {
            val eightTitleTypeOfSki = findViewById<TextView>(R.id.IdSkitourTypeSki)
            val describeSkitour = findViewById<TextView>(R.id.IdSkitourTypeSkiDescribe)
            val intentEight = intent
            val skiType = intentEight.getStringExtra("skiSkitourType")
            val skiTypeDescribe = intentEight.getStringExtra("skiSkitourTypeDescribe")
            eightTitleTypeOfSki.text = skiType
            describeSkitour.text = skiTypeDescribe
        }
}