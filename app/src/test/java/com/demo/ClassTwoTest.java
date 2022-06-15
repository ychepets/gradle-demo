package com.demo;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ClassTwoTest {
    @DataProvider(name = "loginPasswordTest")
    public static Object[][] testData() {
        return new Object[][]{
                {"dataProvider", "12345"}
        };
    }

    @Parameters({"login", "password"})
    @Test
    public void loginPasswordTest(String login, String password) {
        System.out.println("Login: " + login + "\nPassword: " + password);
    }

    @Test(dataProvider = "loginPasswordTest")
    public void loginPasswordDataProviderTest(String login, String password) {
        System.out.println("Login: " + login + "\nPassword: " + password);
    }
}
