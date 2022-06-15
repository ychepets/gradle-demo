package com.demo;

import org.testng.annotations.Test;

public class ClassThreeTest {
    @Test(priority = 3)
    public void testOne() {
        System.out.println("Test with the lowest priority executed");
    }

    @Test(priority = 2)
    public void testTwo() {
        System.out.println("Test with the normal priority executed");
    }

    @Test(priority = 1)
    public void testThree() {
        System.out.println("Test with the highest priority executed");
    }
}
