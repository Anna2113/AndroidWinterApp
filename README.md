# Android WinterApp
### Android WinterApp - to aplikacja wykonana na system mobilny Android. Aplikacja została wykonana w języku Kotlin oraz Java. 
#### Po skolonowaniu projektu uruchamiamy projekt w środowsiku przeznaczonym dla systemu Android na przykład Android Studio i w standardowy sposób odpalamy aplikację. 
#### Struktura projektu opiera się na klasach (aktywnościach) napisanych w jęzku Kotlin oraz w jęzku Java przy czym dane wprowadzane przez użytkownika zapisywane są w bazie danych do, której zarządzania posłużyło system SQLite.
#### Katalog res zawiera:
* katalog drawable, w którym znajdują się grafiki wykorzystywane w aplikacji;
* katalog layout, w którym znajduje się 10 (plików zawierających layouty), layoutów (wygląd aktywności)
* katalog values, w którym znajduje się plik zawierający deklaracje	domyślnych stringów;
* katalog values-de, w którym znajdują się pliki zawierające deklaracje stringów w języku niemieckim;
* katalog values-en, w którym znajdują się pliki zawierające deklaracje stringów w języku angielskim;
* katalog value-pl, w którym znajdują się pliki zawierające deklaracje stringów w języku polskim;

#### Po uruchomieniu aplikacji ukazuje się panel główny aplikacji, gdzie użytkownik ma do wyboru pięć battonów (przycisków) dotyczących temtyki narciasrkiej i snowboardowej  jeden button (przycisk) dotyczący dyscypliny sportu jaką jest pływanie oraz jeden button dotyczący temtyki sportowej. 

1. Przycisk „Narciarstwo”, przekierowujący do nowej 	aktywności, w której znajduje się statyczna część aplikacji, 	omawiająca style narciarstwa.

2. Przycisk „Snowboardnig”, przekierowujący do nowej 	aktywności, w której znajduje się statyczna część aplikacji, 	omawiająca style jazdy na snowboardzie.

3. Przycisk „Wskazówki”, przekierowujący do nowej 	aktywności, w której znajduje się statyczna część aplikacji 	omawiająca rodzaje sprzętu narciarskiego i snowboardowego.

4. Przycisk „Ciekawostki”, przekierowujący do nowej 	aktywności, w której znajduje się statyczna część aplikacji 	omawiająca ciekawostki ze świata sportu.

5. Przycisk „Ośrodki narciarskie” przekierowujący do nowej 	aktywności, w której znajdują się przyciski pozwalające na 	przejście do witryny przedstawiającej ośrodki narciarskie na 	świecie.

6. Przycisk „Sprzęt” przekierowujący do nowej aktywności, w której użytkownik ma możliwość przejścia do aktywności, umożliwiającej wprowadzenie danych, potrzebnych do określenia najlepiej dopasowanych parametrów sprzętu narciarskiego lub snowboardowego dla danego użytkownika. Użytkownik ma także możliwość dodania swoich parametrów do bazy danych, wyszukania ich, lub ich usunięcia. A także ma możliwość wyczyszczenia formularza, aby wprowadzić nowe dane. 
Następnie po kliknięciu na przycisk „Zatwierdź” użytkownik zostanie przeniesiony do poprzedniej aktywności, w której zostaną wyświetlone wcześniej wprowadzone parametry określające: wzrost, wagę, długość stopy, rodzaj dyscypliny sportowej, poziom zaawansowania oraz styl jazdy użytkownika. Po kliknięciu odpowiedniego przycisku, użytkownik dostanie informacje zwrotne o tym jaki sprzęt jest dla niego w obecnej chwili najlepszy. 

7. Przycisk „Coś ekstra” przekierowujący do nowej aktywności, w której znajduje się krótki formularz na wprowadzenie danych określających ilość przepłyniętych basenów, oraz długość danego basenu. Kiedy dane zostaną wprowadzone, po przyciśnięciu przycisku „Pokaż” otworzy nam się nowa aktywność, do której będą przekazane wcześniej wprowadzone dane, a także przycisk pozwalający na przeliczenie ilości pokonanych basenów o odpowiedniej długości na metry i kilometry.
