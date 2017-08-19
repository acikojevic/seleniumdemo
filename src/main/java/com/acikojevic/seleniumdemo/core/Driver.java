package com.acikojevic.seleniumdemo.core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

class Driver {

    static WebDriver getDriver() {

        DesiredCapabilities capabilities = DesiredCapabilities.chrome();

        return new RemoteWebDriver(capabilities);
    }
}
