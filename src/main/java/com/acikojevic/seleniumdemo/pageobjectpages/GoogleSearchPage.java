package com.acikojevic.seleniumdemo.pageobjectpages;

import com.acikojevic.seleniumdemo.pageobjectmodel.PageObject;
import org.openqa.selenium.Keys;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GoogleSearchPage extends PageObject {

    private String searchText;

    @FindBy(id = "lst-ib")
    private WebElement searchBox;

    @FindBy(css = "[role=search] input[name=btnK]")
    private WebElement searchButton;

    public GoogleSearchPage(WebDriver driver) {
        super(driver);
    }

    public void searchByText(String searchText) {

        this.searchText = searchText;
        searchBox.sendKeys(searchText);
        searchButton.sendKeys(Keys.ENTER);
    }

    public boolean isSearchResultFound() {

        try {
            WebDriverWait wait = new WebDriverWait(driver, 10);
            wait.until(isTrue -> driver.getTitle().contains(searchText));

            return true;
        }
        catch (TimeoutException e) {

            return false;
        }
    }

}
