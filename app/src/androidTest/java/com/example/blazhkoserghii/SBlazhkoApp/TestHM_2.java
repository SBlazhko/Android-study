package com.example.blazhkoserghii.SBlazhkoApp;

import junit.framework.TestCase;

import java.math.BigInteger;

/**
 * Created by Blazhko Serghii on 15.10.2015.
 */
public class TestHM_2 extends TestCase{

    public void testFactorial(){
        assertTrue(BigInteger.valueOf(1).equals(Homework_2.factorial("0")));
        assertTrue(BigInteger.valueOf(2).equals(Homework_2.factorial("2")));
        assertTrue(BigInteger.valueOf(120).equals(Homework_2.factorial("5")));
        assertTrue(new BigInteger("6227020800").equals(Homework_2.factorial("13")));
    }
    public void testFibonachi(){
        assertTrue(BigInteger.valueOf(0).equals(Homework_2.fibonachi("0")));
        assertTrue(BigInteger.valueOf(1).equals(Homework_2.fibonachi("2")));
        assertTrue(BigInteger.valueOf(5).equals(Homework_2.fibonachi("5")));
        assertTrue(new BigInteger("190392490709135").equals(Homework_2.fibonachi("70")));
    }
}
