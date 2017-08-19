package com.acikojevic.seleniumdemo.core;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestBase {

    protected WebDriver driver;

    @BeforeMethod
    public void startDriver() {

        driver = Driver.getDriver();
        driver.manage().window().maximize();
    }

    @AfterMethod
    public void stopDriver() {

        driver.quit();
    }
}
