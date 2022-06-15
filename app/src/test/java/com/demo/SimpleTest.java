package com.demo;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SimpleTest {
    @BeforeTest
    public void setUp() {
        String name = new Object(){}.getClass().getEnclosingMethod().getName();
        System.out.println(name);
    }

    @AfterTest
    public void tearDown() {
        String name = new Object(){}.getClass().getEnclosingMethod().getName();
        System.out.println(name);
    }

    @Test
    public void test() {
        System.out.println("simple test passed");
    }
}
