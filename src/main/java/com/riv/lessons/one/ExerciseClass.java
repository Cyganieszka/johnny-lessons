package com.riv.lessons.one;

import java.util.ArrayList;

/**
 * Created by agnieszka on 12.10.2016.
 */
public class ExerciseClass {



    // zaczniemy od czegoś co znasz, liczenie pierwiastków równania kwadratowego!
    // funkcja y= ax^2 + bx +c

    // paramatry wejściowe są typem int, przykłądy do testowania będą takie ze wyniki będą tylko calkowite
    // więc nie przejmuj się rzutowaniem

    ArrayList<Integer> calcQuadraticEquation(int a, int b, int c){
        ArrayList<Integer> result= new ArrayList<Integer>();// lista wyników(pierwiastków), zwrócimy je jako lista, bo mogą być 2,1 albo zero
        // w tym momencie lista jest pusta

        // potęga Math.pow(liczba, potęga)
        // pierwiastek Math.sqrt(liczba)


        int delta =(b*b)-4*a*c;

        if(delta>0){
            result.add((int)(-b-Math.sqrt(delta))/(2*a));
            result.add((int)(-b+Math.sqrt(delta))/(2*a));
        }else if(delta==0){
            result.add(-b/2*a);
        }


        //todo policz deltę


        //todo jeśli delta dodatnie, policz dwa pierwiastki


        //todo jeśli delta =0 to policz jeden


        //todo jeśli ujemna to nic nie licz i zwróc pustą listę




        return result;
    }


    /**
     * tu masz przykład jak korzystać z obiektu listy ArrayList
     */
    // to jest lista zmiennych int, jest łatwiejsza niż tablice, bo może miec zmienny rozmiar
    void listExample(){
        int x=35;
        ArrayList<Integer> numbers= new ArrayList<Integer>(); // ArrayList to klasa, obiekt klasy tworzymy słowem 'new', będzie o tym potem
        numbers.add(36); // na razie jedyne co musisz o niej wiedzieć
        numbers.add(37); // to że nowe elementy dodaje sie metodą add(zmienna)
        numbers.add(x);

        // w tym momencie lista temperatures ma 3 pozycje
    }

}
