package com.romanceabroad.ui;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class GiftPage extends BaseActions {

    public GiftPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public void clickLinkGift() {
        driver.findElement(Locators.LINK_GIFT).click();
    }

    public void findGiftSpa() {
        driver.findElement(Locators.GIFT_SEARCH_FIELD).sendKeys(Data.searchGiftSpa);
    }

    public void clickButtonGiftSearch() {
        driver.findElement(Locators.BUTTON_GIFT_SEARCH).click();
    }

    public void getWebElementsLinksByLoopGiftBestsellers() {

        List<WebElement> links = driver.findElements(Locators.GIFTS_BESTSELLERS);

        for (int i = 0; i < links.size(); i++) {
            String info = links.get(i).getText();
            System.out.println(info);
        }
    }

    public void getWebElementsLinksByLoopListRelatedItems() {
        List<WebElement> links = driver.findElements(Locators.LIST_RELATED_ITEMS);

        for (int i = 0; i < links.size(); i++) {
            String info = links.get(i).getText();
            System.out.println(info);
        }
    }
}


