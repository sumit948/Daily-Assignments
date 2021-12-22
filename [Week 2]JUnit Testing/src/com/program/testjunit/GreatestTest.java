package com.program.testjunit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class GreatestTest {
    Greatest g;
    int result;
    @Test(timeout=10, expected=Exception.class)
    public void TestingGreaterNumber1() {
        int expected=10;
        result = g.greatest(20, 10, 50);
        Assert.assertEquals(expected, result);
    }
 
    @Before
    @Ignore
    public void TestingAddition() {
        System.out.println("This Test case will execute first");
        Greatest g = new Greatest();
        int result=0;
    }
 
    @After
    public void TestingSubtraction() {
        System.out.println("Executes after the Test");
        g=null;
        result =0;
    }
 
    @AfterClass
    public static void TestingMultiplication() {
        System.out.println("Executes in the End of the class");
    }
 
    @BeforeClass
    // when the class loads into LVM
    public static void TestingModulo() {
        System.out.println("Executes before loading class in memory");
    }
    @Test
    public void TestingDivision() {
        Greatest g = new Greatest();
         int result = g.division(10, 2);
        Assert.assertEquals(5, result);
    }
}