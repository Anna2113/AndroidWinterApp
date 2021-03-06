package com.example.winterapp

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity


class MainActivity() : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initListeners()
    }

    private fun initListeners() {
        val buttonSkiing = findViewById<Button>(R.id.IdSkiingButton)
        val buttonSnowboard = findViewById<Button>(R.id.IdSnowboardButton)
        val buttonMaps = findViewById<Button>(R.id.IdMapsButton)
        val buttonEquipment = findViewById<Button>(R.id.IdEquipmentButton)
        val buttonGuide = findViewById<Button>(R.id.IdGuidanceButton)
        val buttonInfo = findViewById<Button>(R.id.IdInfoButton)
        val buttonExtra = findViewById<Button>(R.id.IdExtraButton)

        buttonSkiing.setOnClickListener(buttonSkiingListener)
        buttonSnowboard.setOnClickListener(buttonSnowboardListener)
        buttonMaps.setOnClickListener(buttonMapsListener)
        buttonEquipment.setOnClickListener(buttonEquipmentListener)
        buttonGuide.setOnClickListener(buttonGuideListener)
        buttonInfo.setOnClickListener(buttonInfoListener)
        buttonExtra.setOnClickListener(buttonExtraListener)
    }

    private val buttonSkiingListener: View.OnClickListener = View.OnClickListener {
        skiing()
    }
    private val buttonSnowboardListener: View.OnClickListener = View.OnClickListener {
        snowboard()
    }
    private val buttonMapsListener: View.OnClickListener = View.OnClickListener {
        showSkiResorts()
    }
    private val buttonEquipmentListener: View.OnClickListener = View.OnClickListener {
            matchTheEquipment()
    }
    private val buttonGuideListener: View.OnClickListener = View.OnClickListener {
        readGuidances()
    }
    private val buttonInfoListener: View.OnClickListener = View.OnClickListener {
        readInfo()
    }
    private val buttonExtraListener: View.OnClickListener =  View.OnClickListener {
            extraPossibility()
    }

    //Metody
    private fun skiing() {
        val runFirstIntent = Intent(this, Skiing::class.java)

        //narciarstwo alpejskie
        runFirstIntent.putExtra("narciarstwoAlpejskie", "NARCIARSTWO ALPEJSKIE")
        runFirstIntent.putExtra(
            "opisAlpejskie",
            "Narciarstwo alpejskie zaliczane jest do sport??w zimowych. " +
                    "Polega ono na jak najszybszym zje??dzie po trasie wyznaczonej " +
                    "przez specjalne tyczki. Narciarstwo alpejskie to slalom, zjazd, super gigant, " +
                    "slalom gigant, kombinacja i super kombinacja."
        )


        //narciarstwo klasyczne
        runFirstIntent.putExtra("narciarstwoKlasyczne", "NARCIARSTWO KLASYCZNE")
        runFirstIntent.putExtra(
            "opisKlasyczne", ("Ten rodzaj narciarstwa pochodzi z kraj??w skandynawskich. " +
                    "Zalicza si?? do niego mi??dzy innymi biegi narciarskie. Jest to bardzo popularne rozwi??zanie, gdy?? " +
                    "znacz??co poprawia ono kondycj?? ca??ego organizmu i pozwala na r??wnomiern?? prac?? wszystkich mi????ni. " +
                    "Sport ten mo??na uprawia?? w zasadzie wsz??dzie, w ka??dym wieku i na ka??dym stopniu zaawansowania. " +
                    "Bardzo cz??sto do tej dyscypliny wykorzystuje si?? le??ne ??cie??ki na ??onie natury. ")
        )


        //narciarstwo ekstremalne
        runFirstIntent.putExtra("freeride", "FREERIDE")
        runFirstIntent.putExtra(
            "opisFreeride", ("Jazda na nartach po dziewiczym, nietkni??tym " +
                    "ratrakami ??niegu. Wyzwala adrenalin??. Jest ucieczk?? od zat??oczonych niczym pla??e " +
                    "narciarskich stacji, wyzwaniem i przygod??. Niezale??nie od formy ??? od swobodnego p??ynnego " +
                    "kr??cenia po rozleg??ych za??nie??onych stokach, po karko??omne zjazdy w ??lebach i w??skich " +
                    "rynnach ??? freeride wymaga perfekcyjnej techniki jazdy, odwagi i determinacji. ")
        )
        runFirstIntent.putExtra("freestyle", "FREESTYLE")
        runFirstIntent.putExtra(
            "opisFreestyle", ("Efektowne ewolucje na przyrz??dach snowpark??w, na " +
                    "skoczniach, muldach, b??d?? w trudnym terenie. Uprawianie tego rodzaju narciarstwa wymaga " +
                    "lekkoatletycznego przygotowania. Opr????z kondycji niezb??dne s?? te?? predyspozycje fizyczne oraz " +
                    "psychiczne do balansowania na pograniczu cyrkowej ekwilibrystyki i ekstremalnego narciarstwa. ")
        )
        startActivity(runFirstIntent)
    }

    private fun snowboard() {
        val runSecondIntent = Intent(this, Snowboard::class.java)

        //Freeride - snowboard
        runSecondIntent.putExtra("freestyleSnowboard", "FREESTYLE")
        runSecondIntent.putExtra(
            "opisFreestyleSnowboard",
            ("Styl polegaj??cy na wykonywaniu jak najefektowniejszych trik??w, g????wnie z wykorzystaniem " +
                    "konstrukcji takich jak skocznie, raile, boxy. Mo??na go uprawia?? zar??wno na g??rskich " +
                    "stokach jak i w snowparkach, czy nawet w mie??cie. Sk??adaj?? si?? na niego takie konkurencje " +
                    "i style jak Half-pipe, Big Air, Slopestyle, Jibbing.Naj??atwiejszym trikiem jest Ollie.")
        )
        runSecondIntent.putExtra("alpineStyleSnowboard", "STYL APLEJSKI")
        runSecondIntent.putExtra(
            "opisAlpejskiStylSnowboard",
            "Skupia si?? na jak najlepszej kontroli nad desk?? podczas jazdy po przygotowanym stoku. " +
                    "Mo??na tutaj wyr????ni?? jazd?? wy??cigow?? i Extremecarving."
        )
        runSecondIntent.putExtra("freerideSnowborad", "FREERIDE")
        runSecondIntent.putExtra(
            "opisFreerideSnowboard",
            "Styl polegaj??cy na je??d??eniu poza przygotowanymi trasami."
        )
        runSecondIntent.putExtra("snowcrossSnowboard", "SNOWCROSS")
        runSecondIntent.putExtra(
            "opisSnowcrossSnowboard",
            ("Inna nazwwa tego stylu to snowboard cross lub boardercross. " +
                    "Styl ten skupia si?? na ja??dzie na czas po trasie z przeszkodami. W fina??ach zawod??w " +
                    "snowcrossowych zwykle ??ciga si?? 4 lub 6 zawodnik??w, z kt??rych szybsza po??owa przechodzi do " +
                    "nast??pnego etapu.")
        )
        startActivity(runSecondIntent)
    }

    private fun showSkiResorts() {
        val runFourthIntent = Intent(this, Maps::class.java)
        startActivity(runFourthIntent)
    }

    private fun matchTheEquipment() {
        val runFifthIntent = Intent(this, Equipment::class.java)
        startActivity(runFifthIntent)
    }

    private fun readGuidances() {
        val runSixthIntent = Intent(this, Guide::class.java)
        runSixthIntent.putExtra("boardProfileRocker", "Rocker")
        runSixthIntent.putExtra(
            "boardProfileDescribeRocker",
            ("Konstrukcja charakteryzuj??ca si?? uniesionym " +
                    "nose???em i tail???em do g??ry, przypominaj??ca kszta??tem banana. Ma to na celu zwi??kszenie " +
                    "wybaczalno??ci b????d??w podczas jazdy oraz u??atwienie wygi??cia deski podczas jazdy na przeszkodach " +
                    "jibbowych. Konstrukcja u??atwia dokr??canie ewolucji oraz przy??piesza start osob?? pocz??tkuj??cym.")
        )
        runSixthIntent.putExtra("boardProfileFlatCamber", "Flat camber")
        runSixthIntent.putExtra(
            "boardProfileDescribeFlatCamber",
            ("Ca??a d??ugo???? deski wykonana jest z p??askiego odcinka rdzenia, kt??ry zachowuje si?? " +
                    "bardzo podobnie do desek rocker???owych. Jedyn?? r????nica jest minimalnie mniejszy " +
                    "pr??g wybaczalno??ci b????d??w oraz wi??ksza stabilno???? przy osi??ganiu pr??dko??ci na najazdach. " +
                    "To propozycja profilu deski snowboardowej dla os??b, kt??re korzystaj?? ze wszystkich " +
                    "przeszk??d snowpark???owych: od kicker?????w po rail???e.")
        )
        runSixthIntent.putExtra("boardProfileCamber", "Camber")
        runSixthIntent.putExtra(
            "boardProfileDescribeCamber",
            ("Najstarsza konstrukcja desek snowboardowych, charakteryzuj??ca si?? dwom punktami styku deski " +
                    "ze ??niegiem na nose na tail???u oraz uniesionym do g??ry ??rodkiem deski. Gwarantuje idealne " +
                    "prowadzenie deski podczas technicznej i szybkiej jazdy. Idealna konstrukcja dla os??b " +
                    "nastawiaj??cych si?? na du??e skocznie snowboardowe. Dzi??ki niej b??dziemy mogli bezpiecznie, " +
                    "bez zb??dnych drga?? dojecha?? z du???? pr??dko??ci?? do kicker???a oraz stabilnie wyl??dowa?? zaplanowan??" +
                    " ewolucj??.")
        )
        runSixthIntent.putExtra("boardProfileHybryda", "Hybryda")
        runSixthIntent.putExtra(
            "boardProfileDescribeHybryda",
            (" Jest to po????czenie dw??ch z wy??ej wymienionych konstrukcji: zero (flat) camber i camber. " +
                    "Ze wzgl??du na rodzaj po????czenia oraz u??yte konstrukcje, ka??da hybryda posiada inne " +
                    "zastosowanie. Klasycznym przyk??adem jest konstrukcja ????cz??ca rockera z camberem " +
                    "(Nitro ??? model Gullwing, Burton - Flying-v), kt??ra tworzy trzy punkty styku deski ze " +
                    "??niegiem oraz konstrukcja powder rocker, wykonana z po????czenia rockera poci??gni??tego przez " +
                    "ca??y nose i cambera na ca??ym tailu (konstrukcja przeznaczona do jazdy w ??wie??ym ??niegu).")
        )
        runSixthIntent.putExtra("boardTypeFreeride", "Deska Freeride")
        runSixthIntent.putExtra(
            "boardTypeDescribeFreeride",
            ("deski skonstruowane do jazdy w ka??dych warunkach, g????wnie do szybkiej jazdy po przygotowanych" +
                    " stokach jak i w poza trasami w dziewiczym puchu. S?? to deski directional, z przesuni??tymi" +
                    " w ty?? insertami, przez co ??atwiej si?? je prowadzi. Wyd??u??ony nose u??atwia jazd?? w puchu. " +
                    "Lepiej trzymaj?? kraw??d?? przy du??ej pr??dko??ci.")
        )
        runSixthIntent.putExtra("boardTypeAllMountain", "Deska All Mountain")
        runSixthIntent.putExtra(
            "boardTypeDescribeAllMountain",
            ("Kategoria desek najbardziej uniwersalnych, skonstruowanych i przeznaczonych dla " +
                    "pocz??tkuj??cych i ??rednio zaawansowanych os??b. Te deski sprawdz?? si?? na i poza " +
                    "stokiem, wybaczaj?? du??o b????d??w i pozwalaj?? na szybki progres bez zastanawiania si?? " +
                    "nad tym gdzie i jak akurat masz ochot?? je??dzi??.")
        )
        runSixthIntent.putExtra("boardTypeFreestyle", "Deska Freestyle")
        runSixthIntent.putExtra(
            "boardTypeDescribeFreestyle",
            ("To zazwyczaj mi??kkie deski, w kszta??cie twin tip, aby jazda na switchu by??a tak samo ??atwa" +
                    " i przyjemna. Sprawdzaj?? si?? w snowparku i na mi??kkich przygotowanych trasach, niestety " +
                    "w g????bokim puchu nose lubi nurkowa??. Mo??na temu zapobiec przesuwaj??c wi??zania w stron?? " +
                    "taila.")
        )
        runSixthIntent.putExtra("boardTypeJibbing", "Deska Jibbing")
        runSixthIntent.putExtra(
            "boardTypeDescribeJibbing",
            ("Deski nieco kr??tsze, o kszta??tcie Twin Tip, zazwyczaj maj?? o kilka stopni podniesione kraw??dzie " +
                    "co u??atwia slide po por??czach i murkach, wzmacniana konstrukcja zapobiega odkszta??ceniom przy " +
                    "upadkach, deski jibbowe nie s?? przeznaczone do szybkiej jazdy - s?? stworzone do zabawy i z tego " +
                    "zadania wywi??zuj?? si?? znakomicie")
        )
        runSixthIntent.putExtra("boardTypeButtering", "Deska Buttering")
        runSixthIntent.putExtra(
            "boardTypeDescribeButtering",
            ("Stosunkowo mi??kkie deski w kszta??cie Twin, o nieco zredukowanej d??ugo??ci. Idealny typ dla os??b " +
                    "lubi??cych je??dzi?? w formie zabawowej, wykorzystuj??c naturalne u??o??enie stoku. Wszelkie flatowe " +
                    "triki, rotacje, pressy, rolle - to esencja tego stylu.")
        )
        runSixthIntent.putExtra("skiTypeEasycarver", "Narty Easycarver")
        runSixthIntent.putExtra(
            "skiTypeEasycarverDescribe",
            "To narty dla pocz??tkuj??cych. Idealnie wybaczaj?? b????dy, ??atwo wykonuj?? skr??ty i zwykle s?? stosunkowo " +
                    "lekkie. Przeznaczone s?? do jazdy niskim lub ??rednim tempem."
        )
        runSixthIntent.putExtra("skiAllroundType", "Narty Allround")
        runSixthIntent.putExtra(
            "skiAllroundTypeDescribe",
            ("Najcz????ciej kupowany rodzaj nart do jazdy rekreacyjnej. Zwyk??emu, nieco ju?? wprawionemu narciarzowi " +
                    "pozwol?? w stu procentach delektowa?? si?? urlopem na stoku. To bardzo zwrotne narty umo??liwiaj??ce " +
                    "bezpieczn?? jazd?? nie wymagaj??c?? du??ego wysi??ku. Nie posiadaj?? ani istotnych wad ani zalet. " +
                    "Idealnie nadaj?? si?? do jazdy z umiarkowan?? pr??dko??ci?? po przygotowanym stoku.")
        )
        runSixthIntent.putExtra("skiAllMountainType", "Narty All Mountain")
        runSixthIntent.putExtra(
            "skiAllMountainTypeDescribe",
            "To narty o ??redniej szeroko??ci (>75mm), kt??re dobrze radz?? sobie zar??wno na przygotowanym stoku, " +
                    "jak i w g????bokim ??niegu. Dzi??ki zwi??kszonej szeroko??ci narty tego rodzaju maj?? du???? wyporno????, spokojnie si?? prowadz??. Na wyratrakowanej trasie  poruszaj?? si?? jednak nieco wolniej."
        )
        runSixthIntent.putExtra("skiRaceType", "Narty Race")
        runSixthIntent.putExtra(
            "skiReceTypeDescribe",
            ("Jak sama nazwa wskazuje, to narty dla os??b kt??re lubi?? ostr??, szybk?? jazd?? po stromych, " +
                    "przygotowanych trasach. Cechuj?? si??  du???? wag??, stabilno??ci?? i dobr?? kontrol?? toru jazdy. " +
                    "Wymagaj?? jednak du??ego nak??adu si??y oraz dobrej techniki jazdy. Dziel?? si?? na narty: " +
                    "slalomowe (dzi??ki ma??emu promieniowi idealne do wykonywania w??skich, szybkich skr??t??w, " +
                    "dobrze trzymaj?? si?? na lodzie) i gigantowe (d??u??sze i mniej taliowane, utrzymuj?? " +
                    "stabilno???? w skr??cie o du??ym promieniu).")
        )
        runSixthIntent.putExtra("skiCrosscarverType", "Narty Crosscarver")
        runSixthIntent.putExtra(
            "skiCrosscarverTypeDescribe",
            "Nieco ??atwiejsza w prowadzeniu wersja nart typu race, s?? mniej twarde a przez to te?? wymagaj??" +
                    " mniejszego nak??adu si??y."
        )
        runSixthIntent.putExtra("skiFreerideType", "Narty Freeride")
        runSixthIntent.putExtra(
            "skiFreerideTypeDescribe",
            ("Bardzo szerokie narty, kt??re najlepiej czuj?? si?? w g????bokim puchu. Dzi??ki du??ej szeroko??ci" +
                    " (nawet do 120 mm) p??yn?? po powierzchni, nie zapadaj?? si?? i daj?? narciarzowi poczucie " +
                    "prawdziwego surfowania w ??niegu. Dost??pne te?? w wersji z podniesionymi ty??ami zwanej " +
                    "???Twintip Backcountry???, kt??ra umo??liwia jazd?? zar??wno przodem, jak i ty??em, co ma " +
                    "szczeg??lne znaczenie przy wykonywania skok??w z l??dowaniem ty??em. Narty freeride???owe " +
                    "powinny by?? nieco d??u??sze ni?? te przeznaczone do jazdy po przygotowanym stoku.")
        )
        runSixthIntent.putExtra("skiTwintipFreestyleType", "Narty Twintip-Freestyle")
        runSixthIntent.putExtra(
            "skiTwintipFreestyleTypeDescribe",
            "Relatywnie kr??tkie narty s??u????ce g????wnie do zabawy w snow parku i halfpipie. S?? do???? lekkie " +
                    "i tak??e maj?? podniesione ko??ce, aby umo??liwi?? jazd?? ty??em."
        )
        runSixthIntent.putExtra("skiSkitourType", "Narty Skitourowe")
        runSixthIntent.putExtra(
            "skiSkitourTypeDescribe",
            ("Narty do turystyki narciarskiej, umo??liwiaj?? wycieczki w tereny, gdzie nie ma wyci??g??w " +
                    "(lub gdy nie chce si?? z nich korzysta??). S?? lekkie a przy tym do???? szerokie, by nie " +
                    "zapada?? si?? w ??niegu. Specjalne ta??my z tworzywa sztucznego i wi??zania z ruchom?? " +
                    "pi??t?? u??atwiaj?? podchodzenie.")
        )
        startActivity(runSixthIntent)
    }

    private fun readInfo() {
        val seventhIntent = Intent(this, Info::class.java)
        seventhIntent.putExtra("firstTitle", "Medal Olimpijski")
        seventhIntent.putExtra(
            "firstInfo",
            ("Ostatni medal Olimpijski by?? w pe??ni stworzony ze z??ota " +
                    "w 1912 roku. Dzisiejsze z??ote medale olimpijskie stworzone s?? z 93% srebra, 6% miedzi zaledwie " +
                    "1% z??ota. Za zwyci??stwo otrzymuje si?? medal nie z??oty, a poz??acany.")
        )
        seventhIntent.putExtra("secondTitle", "Multimedali??ci olimpijscy")
        seventhIntent.putExtra(
            "secondInfo",
            ("M??wi??c o olimpiadach, nie spos??b pomin???? zawodnik??w, kt??rzy odnosili na nich najwi??ksze " +
                    "sukcesy. Obecnie ranking multimedalist??w olimpijskich zdominowa?? Michael Phelps. " +
                    "Ten Amerykanin uznawany za najlepszego p??ywaka w historii mo??e pochwali?? si?? a?? 28 " +
                    "medalami zdobytymi na igrzyskach olimpijskich. 23 z nich s?? z??ote, 3 srebrne, a 2 br??zowe. \n " +
                    "Michael Phelps wskoczy?? jednak na pozycj?? lidera dopiero podczas Olimpiady w stolicy " +
                    "Wielkiej Brytanii ??? Londynie w 2012 roku. Do tego czasu, niekwestionowan?? liderk?? rankingu " +
                    "by??a reprezentantka Zwi??zku Radzieckiego ??? pochodz??ca z Ukrainy gimnastyczka ??arysa ??atynina." +
                    " Zawodniczka na 3 kolejnych olimpiadach (licz??c od Melbourne w 1956 roku) zgromadzi??a 18 medali" +
                    " ??? 9 z??otych, 5 srebrnych i 4 br??zowe. ")
        )
        seventhIntent.putExtra("thirdTitle", "Flaga Olimpijska")
        seventhIntent.putExtra(
            "thirdInfo",
            ("Flag?? olimpijsk?? kojarzy ka??dy, jednak nie ka??dy wie co symbolizuj?? charakterystyczne okr??gi " +
                    "i ich kolory. 5 okr??g??w to 5 kontynent??w, a ich kolory (razem z bia??ym t??em flagi) dobrano" +
                    " tak, ??eby przynajmniej jeden z nich by?? obecny na jakiejkolwiek fladze pa??stwa " +
                    "(wg stanu z 1913 roku).")
        )
        startActivity(seventhIntent)
    }

    private fun extraPossibility() {
        val eightIntent = Intent(this, Extra::class.java)
        startActivity(eightIntent)
    }

}