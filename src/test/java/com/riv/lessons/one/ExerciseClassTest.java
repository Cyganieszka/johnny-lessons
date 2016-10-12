package com.riv.lessons.one;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

/**
 * Created by agnieszka on 12.10.2016.
 */
public class ExerciseClassTest {

    ExerciseClass exercise;
    @Before
    public void setUp() throws Exception {
        exercise=new ExerciseClass();
    }


    @Test
    public void testCase1(){
        ArrayList<Integer> result=exercise.calcQuadraticEquation(1,-8,12);
        assert (result.size()==2);
        assert (result.contains(6));
        assert (result.contains(2));
    }
    @Test
    public void testCase2(){
        ArrayList<Integer> result=exercise.calcQuadraticEquation(-1,5,-4);
        assert (result.size()==2);
        assert (result.contains(1));
        assert (result.contains(4));
    }
    @Test
    public void testCase3(){
        ArrayList<Integer> result=exercise.calcQuadraticEquation(1,-2,0);
        assert (result.size()==2);
        assert (result.contains(2));
        assert (result.contains(0));
    }

    @Test
    public void testCase4(){
        ArrayList<Integer> result=exercise.calcQuadraticEquation(1,0,0);
        assert (result.size()==1);
        assert (result.contains(1));
    }
    @Test
    public void testCase5(){
        ArrayList<Integer> result=exercise.calcQuadraticEquation(1,6,10);
        assert (result.size()==0);
    }

}