package com.acikojevic.seleniumdemo.tests;

import com.acikojevic.seleniumdemo.core.TestBase;
import com.acikojevic.seleniumdemo.pageobjectpages.GoogleSearchPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GoogleSearch extends TestBase {

    @Test
    public void googleSearchTest() {

        driver.get("https://www.google.com");
        GoogleSearchPage googleSearchPage = new GoogleSearchPage(driver);
        googleSearchPage.searchByText("nekitekst");
        Assert.assertTrue(googleSearchPage.isSearchResultFound());
    }
}
