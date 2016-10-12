package com.riv.lessons.one;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by agnieszka on 12.10.2016.
 */
public class TestIntroduction {
    /**
     * tu będą testy sprawdzające działanie programu
     * -po prawej jest zakłądka z zielonym napisem gradle, tam klikając w verification->test można uruchomić wszytskie
     *  testy na raz
     * -możesz uruchomić wszytskie testy z pliku klikając prawym klawiszem na plik 'TestIntroduction'
     *  na liście plików po lewej
     * -możesz też uruchomić pojedyńcze testy klikając prawym klawiszem na zieloną strzałkę przy nazwie metody
     *
     *
     */

    ClassExample example;
    @Before
    public void setUp(){
        example=new ClassExample();
    }

    @Test
    public void testCastingExamples(){
        System.out.println("\n\n test rzutowania");
        assert(example.castingExample1()==1);
        assert(example.castingExample2()==1);
        assert(example.castingExample3()==0);
        assert(example.castingExample4()==0.5f);
    }

    @Test
    public void testLoops(){//loop=pętla
        System.out.println("\n\n test pętli");
        example.ifExample(10);
        example.ifExample(-5);
        example.ifExample(0);
        System.out.println("\n\n");  //\n to enter
        example.switchExample(0);
        example.switchExample(1);
        example.switchExample(2);
        example.switchExample(3);
        example.switchExample(4);
        example.switchExample(10);
        System.out.println("\n\n");
        example.forExample();
        System.out.println("\n\n");
        example.whileExample();
    }

    @Test
    public void testCenzor(){
        System.out.println("\n\n test cenzora");
        assert (example.cenzor("dupa maryna").equals("❤ ❤ ❤ maryna"));
    }

    /**
     * ten test zawsze zakończy sie wynikiem nagatywnym
     */
    @Test
    public void alwaysFail(){
        assert(false);
        assert(4>5);
    }

    /**
     * ten test zawsze zakończy się sukcesem
     */
    @Test
    public void alwaysSucces(){
        assert(true);
        assert(5==5);
    }


}
