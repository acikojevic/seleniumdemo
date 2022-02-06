package com.acikojevic.seleniumdemo.core;

import org.openqa.selenium.ImmutableCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.util.HashMap;
import java.util.Map;

class Driver {

    static WebDriver getDriver() {

        // Chrome driver options
        ChromeOptions chromeOptions = new ChromeOptions();
        Map<String, Object> preferences = new HashMap<>();
        preferences.put("disable-popup-blocking", "true");
        chromeOptions.addArguments("--start-maximized");
        chromeOptions.setExperimentalOption("prefs", preferences);

        return new RemoteWebDriver(new ImmutableCapabilities(chromeOptions));
    }
}
