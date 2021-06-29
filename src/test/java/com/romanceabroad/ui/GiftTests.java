package com.romanceabroad.ui;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import javax.swing.*;
import java.util.List;

public class GiftTests extends BaseUI {

    String currentUrlGift;

    @Test
    public void testLinkGiftAssertEqualTestCase1() {

        giftPage.clickLinkGift();
        currentUrlGift = driver.getCurrentUrl();
        System.out.println(currentUrlGift);
        Assert.assertEquals(currentUrlGift, Data.expectedUrlGift);

    }

    @Test
    public void testSearchGiftSpaOnFieldTestCase2() {
        giftPage.clickLinkGift();
        giftPage.findGiftSpa();
        giftPage.clickButtonGiftSearch();
        giftPage.getWebElementsLinksByLoopGiftBestsellers();
        giftPage.clickLinkGift();
    }

    @Test
    public void clickLinksListRelatedItemsByLoopTestCase3() {

        giftPage.clickLinkGift();
        giftPage.driver.findElement(Locators.GIFTS_BESTSELLERS).click();
        giftPage.getWebElementsLinksByLoopListRelatedItems();
    }

    @Test
    public void testGetLinksGiftsBestsellersByLoopTestCase4() {
        giftPage.clickLinkGift();
        giftPage.findGiftSpa();
        giftPage.clickButtonGiftSearch();
        driver.navigate().back();
        WebElement giftsBestSellers = driver.findElement(Locators.GIFTS_BESTSELLERS);
        if (giftsBestSellers.isDisplayed()) {
            List<WebElement> links = driver.findElements(Locators.GIFTS_BESTSELLERS);

            for (int i = 0; i < links.size(); i++) {
                String info = links.get(i).getText();
                System.out.println(info);
            }
            giftPage.clickLinkGift();
        }
    }
}


