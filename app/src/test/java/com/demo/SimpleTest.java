package com.demo;

import org.testng.annotations.*;

public class SimpleTest {
    @BeforeClass
    public void setUp() {
        String name = new Object(){}.getClass().getEnclosingMethod().getName();
        System.out.println(name);
    }

    @AfterClass
    public void tearDown() {
        String name = new Object(){}.getClass().getEnclosingMethod().getName();
        System.out.println(name);
    }

    @Test
    public void test() {
        System.out.println("simple test passed");
    }
}
