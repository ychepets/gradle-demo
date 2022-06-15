package com.demo;

import org.testng.annotations.Test;

public class ClassOneTest {
    @Test(groups = {"group1"})
    public void setUp() {
        String name = new Object() {
        }.getClass().getEnclosingMethod().getName();
        System.out.println(name);
    }

    @Test(groups = {"excludeTest"})
    public void tearDown() {
        String name = new Object() {
        }.getClass().getEnclosingMethod().getName();
        System.out.println(name);
    }

    @Test(groups = {"group2"})
    public void test() {
        System.out.println("classOne test passed");
    }
}
