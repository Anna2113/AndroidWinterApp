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
            "Narciarstwo alpejskie zaliczane jest do sportów zimowych. " +
                    "Polega ono na jak najszybszym zjeździe po trasie wyznaczonej " +
                    "przez specjalne tyczki. Narciarstwo alpejskie to slalom, zjazd, super gigant, " +
                    "slalom gigant, kombinacja i super kombinacja."
        )


        //narciarstwo klasyczne
        runFirstIntent.putExtra("narciarstwoKlasyczne", "NARCIARSTWO KLASYCZNE")
        runFirstIntent.putExtra(
            "opisKlasyczne", ("Ten rodzaj narciarstwa pochodzi z krajów skandynawskich. " +
                    "Zalicza się do niego między innymi biegi narciarskie. Jest to bardzo popularne rozwiązanie, gdyż " +
                    "znacząco poprawia ono kondycję całego organizmu i pozwala na równomierną pracę wszystkich mięśni. " +
                    "Sport ten można uprawiać w zasadzie wszędzie, w każdym wieku i na każdym stopniu zaawansowania. " +
                    "Bardzo często do tej dyscypliny wykorzystuje się leśne ścieżki na łonie natury. ")
        )


        //narciarstwo ekstremalne
        runFirstIntent.putExtra("freeride", "FREERIDE")
        runFirstIntent.putExtra(
            "opisFreeride", ("Jazda na nartach po dziewiczym, nietkniętym " +
                    "ratrakami śniegu. Wyzwala adrenalinę. Jest ucieczką od zatłoczonych niczym plaże " +
                    "narciarskich stacji, wyzwaniem i przygodą. Niezależnie od formy – od swobodnego płynnego " +
                    "kręcenia po rozległych zaśnieżonych stokach, po karkołomne zjazdy w żlebach i wąskich " +
                    "rynnach – freeride wymaga perfekcyjnej techniki jazdy, odwagi i determinacji. ")
        )
        runFirstIntent.putExtra("freestyle", "FREESTYLE")
        runFirstIntent.putExtra(
            "opisFreestyle", ("Efektowne ewolucje na przyrządach snowparków, na " +
                    "skoczniach, muldach, bądź w trudnym terenie. Uprawianie tego rodzaju narciarstwa wymaga " +
                    "lekkoatletycznego przygotowania. Opróćz kondycji niezbędne są też predyspozycje fizyczne oraz " +
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
            ("Styl polegający na wykonywaniu jak najefektowniejszych trików, głównie z wykorzystaniem " +
                    "konstrukcji takich jak skocznie, raile, boxy. Można go uprawiać zarówno na górskich " +
                    "stokach jak i w snowparkach, czy nawet w mieście. Składają się na niego takie konkurencje " +
                    "i style jak Half-pipe, Big Air, Slopestyle, Jibbing.Najłatwiejszym trikiem jest Ollie.")
        )
        runSecondIntent.putExtra("alpineStyleSnowboard", "STYL APLEJSKI")
        runSecondIntent.putExtra(
            "opisAlpejskiStylSnowboard",
            "Skupia się na jak najlepszej kontroli nad deską podczas jazdy po przygotowanym stoku. " +
                    "Można tutaj wyróżnić jazdę wyścigową i Extremecarving."
        )
        runSecondIntent.putExtra("freerideSnowborad", "FREERIDE")
        runSecondIntent.putExtra(
            "opisFreerideSnowboard",
            "Styl polegający na jeżdżeniu poza przygotowanymi trasami."
        )
        runSecondIntent.putExtra("snowcrossSnowboard", "SNOWCROSS")
        runSecondIntent.putExtra(
            "opisSnowcrossSnowboard",
            ("Inna nazwwa tego stylu to snowboard cross lub boardercross. " +
                    "Styl ten skupia się na jaździe na czas po trasie z przeszkodami. W finałach zawodów " +
                    "snowcrossowych zwykle ściga się 4 lub 6 zawodników, z których szybsza połowa przechodzi do " +
                    "następnego etapu.")
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
            ("Konstrukcja charakteryzująca się uniesionym " +
                    "nose’em i tail’em do góry, przypominająca kształtem banana. Ma to na celu zwiększenie " +
                    "wybaczalności błędów podczas jazdy oraz ułatwienie wygięcia deski podczas jazdy na przeszkodach " +
                    "jibbowych. Konstrukcja ułatwia dokręcanie ewolucji oraz przyśpiesza start osobą początkującym.")
        )
        runSixthIntent.putExtra("boardProfileFlatCamber", "Flat camber")
        runSixthIntent.putExtra(
            "boardProfileDescribeFlatCamber",
            ("Cała długość deski wykonana jest z płaskiego odcinka rdzenia, który zachowuje się " +
                    "bardzo podobnie do desek rocker’owych. Jedyną różnica jest minimalnie mniejszy " +
                    "próg wybaczalności błędów oraz większa stabilność przy osiąganiu prędkości na najazdach. " +
                    "To propozycja profilu deski snowboardowej dla osób, które korzystają ze wszystkich " +
                    "przeszkód snowpark’owych: od kicker’ów po rail’e.")
        )
        runSixthIntent.putExtra("boardProfileCamber", "Camber")
        runSixthIntent.putExtra(
            "boardProfileDescribeCamber",
            ("Najstarsza konstrukcja desek snowboardowych, charakteryzująca się dwom punktami styku deski " +
                    "ze śniegiem na nose na tail’u oraz uniesionym do góry środkiem deski. Gwarantuje idealne " +
                    "prowadzenie deski podczas technicznej i szybkiej jazdy. Idealna konstrukcja dla osób " +
                    "nastawiających się na duże skocznie snowboardowe. Dzięki niej będziemy mogli bezpiecznie, " +
                    "bez zbędnych drgań dojechać z dużą prędkością do kicker’a oraz stabilnie wylądować zaplanowaną" +
                    " ewolucję.")
        )
        runSixthIntent.putExtra("boardProfileHybryda", "Hybryda")
        runSixthIntent.putExtra(
            "boardProfileDescribeHybryda",
            (" Jest to połączenie dwóch z wyżej wymienionych konstrukcji: zero (flat) camber i camber. " +
                    "Ze względu na rodzaj połączenia oraz użyte konstrukcje, każda hybryda posiada inne " +
                    "zastosowanie. Klasycznym przykładem jest konstrukcja łącząca rockera z camberem " +
                    "(Nitro – model Gullwing, Burton - Flying-v), która tworzy trzy punkty styku deski ze " +
                    "śniegiem oraz konstrukcja powder rocker, wykonana z połączenia rockera pociągniętego przez " +
                    "cały nose i cambera na całym tailu (konstrukcja przeznaczona do jazdy w świeżym śniegu).")
        )
        runSixthIntent.putExtra("boardTypeFreeride", "Deska Freeride")
        runSixthIntent.putExtra(
            "boardTypeDescribeFreeride",
            ("deski skonstruowane do jazdy w każdych warunkach, głównie do szybkiej jazdy po przygotowanych" +
                    " stokach jak i w poza trasami w dziewiczym puchu. Są to deski directional, z przesuniętymi" +
                    " w tył insertami, przez co łatwiej się je prowadzi. Wydłużony nose ułatwia jazdę w puchu. " +
                    "Lepiej trzymają krawędź przy dużej prędkości.")
        )
        runSixthIntent.putExtra("boardTypeAllMountain", "Deska All Mountain")
        runSixthIntent.putExtra(
            "boardTypeDescribeAllMountain",
            ("Kategoria desek najbardziej uniwersalnych, skonstruowanych i przeznaczonych dla " +
                    "początkujących i średnio zaawansowanych osób. Te deski sprawdzą się na i poza " +
                    "stokiem, wybaczają dużo błędów i pozwalają na szybki progres bez zastanawiania się " +
                    "nad tym gdzie i jak akurat masz ochotę jeździć.")
        )
        runSixthIntent.putExtra("boardTypeFreestyle", "Deska Freestyle")
        runSixthIntent.putExtra(
            "boardTypeDescribeFreestyle",
            ("To zazwyczaj miękkie deski, w kształcie twin tip, aby jazda na switchu była tak samo łatwa" +
                    " i przyjemna. Sprawdzają się w snowparku i na miękkich przygotowanych trasach, niestety " +
                    "w głębokim puchu nose lubi nurkować. Można temu zapobiec przesuwając wiązania w stronę " +
                    "taila.")
        )
        runSixthIntent.putExtra("boardTypeJibbing", "Deska Jibbing")
        runSixthIntent.putExtra(
            "boardTypeDescribeJibbing",
            ("Deski nieco krótsze, o kształtcie Twin Tip, zazwyczaj mają o kilka stopni podniesione krawędzie " +
                    "co ułatwia slide po poręczach i murkach, wzmacniana konstrukcja zapobiega odkształceniom przy " +
                    "upadkach, deski jibbowe nie są przeznaczone do szybkiej jazdy - są stworzone do zabawy i z tego " +
                    "zadania wywiązują się znakomicie")
        )
        runSixthIntent.putExtra("boardTypeButtering", "Deska Buttering")
        runSixthIntent.putExtra(
            "boardTypeDescribeButtering",
            ("Stosunkowo miękkie deski w kształcie Twin, o nieco zredukowanej długości. Idealny typ dla osób " +
                    "lubiących jeździć w formie zabawowej, wykorzystując naturalne ułożenie stoku. Wszelkie flatowe " +
                    "triki, rotacje, pressy, rolle - to esencja tego stylu.")
        )
        runSixthIntent.putExtra("skiTypeEasycarver", "Narty Easycarver")
        runSixthIntent.putExtra(
            "skiTypeEasycarverDescribe",
            "To narty dla początkujących. Idealnie wybaczają błędy, łatwo wykonują skręty i zwykle są stosunkowo " +
                    "lekkie. Przeznaczone są do jazdy niskim lub średnim tempem."
        )
        runSixthIntent.putExtra("skiAllroundType", "Narty Allround")
        runSixthIntent.putExtra(
            "skiAllroundTypeDescribe",
            ("Najczęściej kupowany rodzaj nart do jazdy rekreacyjnej. Zwykłemu, nieco już wprawionemu narciarzowi " +
                    "pozwolą w stu procentach delektować się urlopem na stoku. To bardzo zwrotne narty umożliwiające " +
                    "bezpieczną jazdę nie wymagającą dużego wysiłku. Nie posiadają ani istotnych wad ani zalet. " +
                    "Idealnie nadają się do jazdy z umiarkowaną prędkością po przygotowanym stoku.")
        )
        runSixthIntent.putExtra("skiAllMountainType", "Narty All Mountain")
        runSixthIntent.putExtra(
            "skiAllMountainTypeDescribe",
            "To narty o średniej szerokości (>75mm), które dobrze radzą sobie zarówno na przygotowanym stoku, " +
                    "jak i w głębokim śniegu. Dzięki zwiększonej szerokości narty tego rodzaju mają dużą wyporność, spokojnie się prowadzą. Na wyratrakowanej trasie  poruszają się jednak nieco wolniej."
        )
        runSixthIntent.putExtra("skiRaceType", "Narty Race")
        runSixthIntent.putExtra(
            "skiReceTypeDescribe",
            ("Jak sama nazwa wskazuje, to narty dla osób które lubią ostrą, szybką jazdę po stromych, " +
                    "przygotowanych trasach. Cechują się  dużą wagą, stabilnością i dobrą kontrolą toru jazdy. " +
                    "Wymagają jednak dużego nakładu siły oraz dobrej techniki jazdy. Dzielą się na narty: " +
                    "slalomowe (dzięki małemu promieniowi idealne do wykonywania wąskich, szybkich skrętów, " +
                    "dobrze trzymają się na lodzie) i gigantowe (dłuższe i mniej taliowane, utrzymują " +
                    "stabilność w skręcie o dużym promieniu).")
        )
        runSixthIntent.putExtra("skiCrosscarverType", "Narty Crosscarver")
        runSixthIntent.putExtra(
            "skiCrosscarverTypeDescribe",
            "Nieco łatwiejsza w prowadzeniu wersja nart typu race, są mniej twarde a przez to też wymagają" +
                    " mniejszego nakładu siły."
        )
        runSixthIntent.putExtra("skiFreerideType", "Narty Freeride")
        runSixthIntent.putExtra(
            "skiFreerideTypeDescribe",
            ("Bardzo szerokie narty, które najlepiej czują się w głębokim puchu. Dzięki dużej szerokości" +
                    " (nawet do 120 mm) płyną po powierzchni, nie zapadają się i dają narciarzowi poczucie " +
                    "prawdziwego surfowania w śniegu. Dostępne też w wersji z podniesionymi tyłami zwanej " +
                    "„Twintip Backcountry“, która umożliwia jazdę zarówno przodem, jak i tyłem, co ma " +
                    "szczególne znaczenie przy wykonywania skoków z lądowaniem tyłem. Narty freeride’owe " +
                    "powinny być nieco dłuższe niż te przeznaczone do jazdy po przygotowanym stoku.")
        )
        runSixthIntent.putExtra("skiTwintipFreestyleType", "Narty Twintip-Freestyle")
        runSixthIntent.putExtra(
            "skiTwintipFreestyleTypeDescribe",
            "Relatywnie krótkie narty służące głównie do zabawy w snow parku i halfpipie. Są dość lekkie " +
                    "i także mają podniesione końce, aby umożliwić jazdę tyłem."
        )
        runSixthIntent.putExtra("skiSkitourType", "Narty Skitourowe")
        runSixthIntent.putExtra(
            "skiSkitourTypeDescribe",
            ("Narty do turystyki narciarskiej, umożliwiają wycieczki w tereny, gdzie nie ma wyciągów " +
                    "(lub gdy nie chce się z nich korzystać). Są lekkie a przy tym dość szerokie, by nie " +
                    "zapadać się w śniegu. Specjalne taśmy z tworzywa sztucznego i wiązania z ruchomą " +
                    "piętą ułatwiają podchodzenie.")
        )
        startActivity(runSixthIntent)
    }

    private fun readInfo() {
        val seventhIntent = Intent(this, Info::class.java)
        seventhIntent.putExtra("firstTitle", "Medal Olimpijski")
        seventhIntent.putExtra(
            "firstInfo",
            ("Ostatni medal Olimpijski był w pełni stworzony ze złota " +
                    "w 1912 roku. Dzisiejsze złote medale olimpijskie stworzone są z 93% srebra, 6% miedzi zaledwie " +
                    "1% złota. Za zwycięstwo otrzymuje się medal nie złoty, a pozłacany.")
        )
        seventhIntent.putExtra("secondTitle", "Multimedaliści olimpijscy")
        seventhIntent.putExtra(
            "secondInfo",
            ("Mówiąc o olimpiadach, nie sposób pominąć zawodników, którzy odnosili na nich największe " +
                    "sukcesy. Obecnie ranking multimedalistów olimpijskich zdominował Michael Phelps. " +
                    "Ten Amerykanin uznawany za najlepszego pływaka w historii może pochwalić się aż 28 " +
                    "medalami zdobytymi na igrzyskach olimpijskich. 23 z nich są złote, 3 srebrne, a 2 brązowe. \n " +
                    "Michael Phelps wskoczył jednak na pozycję lidera dopiero podczas Olimpiady w stolicy " +
                    "Wielkiej Brytanii – Londynie w 2012 roku. Do tego czasu, niekwestionowaną liderką rankingu " +
                    "była reprezentantka Związku Radzieckiego – pochodząca z Ukrainy gimnastyczka Łarysa Łatynina." +
                    " Zawodniczka na 3 kolejnych olimpiadach (licząc od Melbourne w 1956 roku) zgromadziła 18 medali" +
                    " – 9 złotych, 5 srebrnych i 4 brązowe. ")
        )
        seventhIntent.putExtra("thirdTitle", "Flaga Olimpijska")
        seventhIntent.putExtra(
            "thirdInfo",
            ("Flagę olimpijską kojarzy każdy, jednak nie każdy wie co symbolizują charakterystyczne okręgi " +
                    "i ich kolory. 5 okręgów to 5 kontynentów, a ich kolory (razem z białym tłem flagi) dobrano" +
                    " tak, żeby przynajmniej jeden z nich był obecny na jakiejkolwiek fladze państwa " +
                    "(wg stanu z 1913 roku).")
        )
        startActivity(seventhIntent)
    }

    private fun extraPossibility() {
        val eightIntent = Intent(this, Extra::class.java)
        startActivity(eightIntent)
    }

}