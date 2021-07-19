package com.romanceabroad.ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchPage extends BaseActions {

    public SearchPage(WebDriver driver, WebDriverWait wait) {

        super(driver, wait);
    }

    public void clickLinkSearch() {
  //      wait.until(ExpectedConditions.elementToBeClickable(Locators.LINK_SEARCH));
        driver.findElement(Locators.LINK_SEARCH).click();
    }

    public void getDropDownListByDefault() {
        getDropDownListByText(Locators.DROP_DOWN_LIST_SORT_BY, "Default");
    }

    public void getDropDownListByViews() {
        getDropDownListByText(Locators.DROP_DOWN_LIST_SORT_BY, "Views");
    }

    public void getDropDownListByName() {
        getDropDownListByText(Locators.DROP_DOWN_LIST_SORT_BY, "Name");
    }

    public void getDropDownListByRegistrationDate() {
        getDropDownListByText(Locators.DROP_DOWN_LIST_SORT_BY, "Registration date");
    }

    public void clickButtonSearch() {
        driver.findElement(Locators.BUTTON_SEARCH).click();
    }


}





