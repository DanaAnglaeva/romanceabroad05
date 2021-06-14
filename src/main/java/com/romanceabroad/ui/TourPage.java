package com.romanceabroad.ui;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TourPage extends BaseActions {
    public TourPage(WebDriver driver, WebDriverWait wait) {

        super(driver, wait);
    }

    public void clickLinkTourPage() {
        driver.findElement(Locators.LINK_TOUR).click();
    }

    public void clickSearchFieldVipTourToUkraine() {
        driver.findElement(Locators.TOUR_SEARCH_FIELD).sendKeys(Data.searchFieldVipTourToUkraine);
    }

    public void clickButtonTourSearch() {
        driver.findElement(Locators.BUTTON_SEARCH_TOUR).click();
    }
    public void clickButtonQuickView() {
        driver.findElement(Locators.BUTTON_QUICK_VIEW).click();
    }
    public void clickButtonPayWithPayPal() {
        driver.findElement(Locators.BUTTON_PAY_WITH_PAYPAL).click();
    }


}
