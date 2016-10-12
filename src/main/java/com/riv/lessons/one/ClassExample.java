package com.riv.lessons.one;


/**
 * TEN PLIK TO ŚCIĄGAWKA Z PODSTAWAMI
 */


// najprostszy komentarz to taki z dwoma //
// linijka która sie tak zaczyna jest "niewidzialna dla kompilatora"
//
/**
 * komentarze można pisać też w ten sposób
 */
/*
i w taki sposób
 */


    // to jest klasa, klasę tworzy się poprzed dodanie słowa kluczowego 'class'
    // 'public' to modyfikator dostępu inne to:
    // 'private'
    // 'protected'
    // może też nie być żadnego z tych słów
    // dodatkowo możesz też zobaczyć przed słowem 'class'
    // wyjaśnię to później
    //

    // każdą linijkę kończymy średnikiem!

public class ClassExample {

    // tu jest ciało funkcji

    // klasa może posiadać zmienne(pola) i metody(funkcje)

    // nazwy klas piszemy z dużej litery, metody i zmienne z małej
    // gdy nazwa zawiera więcej niżjedno słowo, każde kolejne zaczynamy z dużej litery
    // staraj sie używać wyłącznie nazw angielskich

    // to są zmienne:
    // zmienne różnią się tym ile pamięci w komputerze zajmują (ile bitów) i jakie zmienne reprezentują
    // zmienne mogą być typami prymitywnymi takimi jak:

    int number=5838;                    //  int przechowuje wartości całkowite od -2^31 do (2^31)-1
    int negativeNumber=-5;              //  int może być ujemna
    double decimalHighPrecision = 1.1;  //  double przechowuje zmienne rzeczywiste z dużą precyzją, używamy tego przy dowolnych obliczeniach
    float decimalLowPrecision=1.1f;     //  float też, ale ma mniejszą precyzję, dodajemy na koncu cyfry f
    boolean isItJavaCode=true;          // boolean to zmienna określająca prawdę/fałsz
    boolean javaSucks=false;

    //tych będziesz rzadziej używać, najczęściej wystarczy ci int
    long veryLongIntNumber= 1523513545; // zmienne calkowite od -263 do (2^63)-1
    short shortNumber =397;             // zmienne całkowite -32,768 do 32,767
    byte bytenumber=123;                // zmienne całkowite -128 do 127

    char character = 'c';               // char, jak character, jest zmienną która przechowuje znaki unicode
    char characterNumeric= 12;          // tak naprawdę wszytskie znaki z klawiatury, są w komputerze liczbami
    char heart='\u2764';                // system unicode to system znaków http://unicode-table.com/en/
    char alsoHeart='❤';                 // obejmuje różne alfabety i symbole, istnieją inne systemy kodowania poza unicodem

    // zamiast pojedyńczej wartości, można przechowywać w pamięci całą tablicę zmiennych
    char[] arrayOfCharacters={'c','z','e','ś','ć'};
    int[] firstTenNumbers= {1,2,3,4,5,6,7,8,9,10};
    float[] temperatures= new float[3];
    // tablice muszą znać swój rozmiar w momencie tworzenia

    // zmienne nazywać możesz dowolnie
    boolean dupa17=true;
    // ale lepiej nazywać je sensownie


    // zmienne prymitywne tylko przechowują wartości
    // zmienne mogą być też obiektami innych klas, taką najbardziej używaną klasą jest klasa String,
    // która przechowuje teksty

    String welcome="witaj w moim programie! ❤ ❤ ❤";  // zauważ, że do tekstów używamy "" a do charów ''
    // poza tym że zmienna przechowuje kawałek tekstu, można na niej wywołać różne metody
    // tak samo zamiast prostych tablic można używać różnych list

    //a teraz metody

    // metody wykonują pewne zadania i ich nazwa powinna to odzwierciedlać
    // tu też na początku mogą występować modyfikatory prywatności
    // potem jest typ, który funkcja zwraca
    // nazwa funkcji
    // i parametry wejsciowe

    // ta metoda dodaje dwie liczby całkowite i zwraca wynik
    public int addTwoNumbers(int one, int two){
        return one+two; // słowo return zwraca wynik z funkcji
    }


    // funkcja która nic nie zwraca ma typ 'void'
    void showResult(int result){
        System.out.println("zwracam wynik! "+result);  // ta linijka wypisuje tekst do konsoli
        // nie ma returna!
    }
    // metoda może nie mieć żadnych paramatrów wejciowych
    String getWelconeString(){
        return welcome; // ta metoda zwraca zmienną klasy
    }

    // jak już mówiłam, String to obiekt i ma różne metody, np toUpperCase, która zmienia wszytskie litery na duże
    String getWelcomeUpperCase(){
        return welcome.toUpperCase(); // ta metoda zwraca nowego stringa zwróconego przez metode toUpperCase
    }

    // ta funkcja cenzoruje tekst, podmieniając słowo dupa na serduszka ;]
    String cenzor(String inputString){

        String newString = inputString.replace("dupa","❤ ❤ ❤");
        System.out.println("proszę, oto twój ocenzorowany tekst: "+newString);
        return newString;
    }
    // zmienne jednego typu można rzutować na inny, jak jest to proste to java sama ogarnie
    // czasem trzeba pomóc
    int castingExample1() {
        float one = 1.0f;
        // rzutowanie (po angielsku cast) wykonujemy poprzez podanie typu w nawiasie przed zmienną
        int integerOne = (int) one; // zmienna integerOne będzie maiła wartość 1
        System.out.println("float: " + one + " int: " + integerOne);
        return integerOne;
    }

    int castingExample2(){
        // w pewnych wypadkach rzutowanie będzie stratne!
        float height=1.75f;
        int integerHeight=(int)height; // tutaj zmienna integerHeight też będzie miała wartość jeden
        // takie rzutowanie nie zaokrągla, a ucina część dziesiętną, do zaokrąglania są inne metody
        System.out.println("float: "+height+" int: "+integerHeight);
        return integerHeight;
    }
    float castingExample3(){
        // java widząc zmienną całkowitą, traktuje ją jak inta
        // trzeba o tym pamiętać robiąc działania matematyczne
        // np tutaj:
        float half = 1/2; //!!! =0
        // java podzieli przez siebie dwie zmienne int i dopiero ją zrzutuje do float
        System.out.println("float result = 1/2; result ="+half);
        return half;
    }
    float castingExample4(){
        // trzeba wcześniej dać znać że operacje wykonujemy na liczbach rzeczywistych
        float secondHalf = (float)1/2; // =0.5
        System.out.println("float result = (float)1/2; result ="+secondHalf);
        return secondHalf;
    }


    // ważnym elementem programowania są pętle

    void ifExample(int money){ //if z angielskiego to "jeśli"
        System.out.println("masz "+money+ "piniondza, czyli:");
       if(money==0){                                                    // jeśli zmienna jest równa zero
           System.out.println("jesteś biedny, idź do pracy");
       }else if(money<0){                                               // jeśli zmienna jest mniejsza od zera
           System.out.println("masz długi, tym bardziej idź do pracy");
       }else{                                                           // w pozostałych przypadkach
           System.out.println("masz pieniądze, możesz się opierdzielać");
       }
    }

    void switchExample(int numberOfLimbs){ //numberOfLimbs=liczba kończyn ;]
        // kiedy if miałby mieć dużo warunków, można zrobić switcha(switch z angieslkiego to "przełącznik")

        System.out.println("masz "+numberOfLimbs+" kończyn, czyli:");
        switch (numberOfLimbs){
            case 0:
                System.out.println("jesteś korpusikiem :(");
                break;
            case 1:
                System.out.println("masz jedną kończynę, to wystarczajaco do gry na komputerze");
                break;
            case 2:
                System.out.println("jesli masz dwie ręce, to nie odejdziesz od komputera :D");
                break;
            case 3:
                System.out.println("saper myli sie tylko raz");
                break;
            case 4:
                System.out.println("o ile nie masz trzech rąk, prawdopodobnie jesteś całkiem kormalny");
                break;
            default:
                System.out.println("jesteś dziwny");
                break;
        }
    }

    void forExample(){
        // kiedy chcemy wykonać jakść czynność kilka razy
        for(int i=0;i<100;i++){
            System.out.println(i+ "nie będę bił innych dzieci");
        }

    }

    void whileExample(){
        // kiedy chcemy wykonywać jakąć czynność tak długo aż nastąpi jakiś warunek
        int[] numbers= {1,2,3,4,5,6,7,8,9,10};
        int i=0;
        System.out.println(i+ "zaczynam pętlę");
        while(numbers[i]!=5){ // pętla działa tak długo jak w tablicy pod numerem i nie ma piątki
            System.out.println(numbers[i]+ " to nie jest pięć");
            i++; // i=i+1;  zwiększamy numer i o 1
        }
        System.out.println("koniec petli! i="+i);
    }




}
