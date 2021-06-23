package com.romanceabroad.ui;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

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

    }

    @Test
    public void testGetGiftsLinkByLoopRelatedItemsTestCase3() {

        giftPage.clickLinkGift();
        giftPage.driver.findElement(Locators.GIFTS_BESTSELLERS).click();
        List<WebElement> links = driver.findElements(Locators.LIST_RELATED_ITEMS);

        for (int i = 0; i < links.size(); i++) {
            String info = links.get(i).getText();
            System.out.println(info);
        }
    }

    @Test
    public void testGetGiftsLinkByLoopBestsellersTestCase4() {

        giftPage.clickLinkGift();
        List<WebElement> links = driver.findElements(Locators.GIFTS_BESTSELLERS);

        for (int i = 0; i < links.size(); i++) {
            String info = links.get(i).getText();
            System.out.println(info);
        }
    }

    @Test
    public void clickLinksListRelatedItemsByLoopTestCase5() {

        giftPage.clickLinkGift();
        giftPage.driver.findElement(Locators.GIFTS_BESTSELLERS).click();
        List<WebElement> links = driver.findElements(Locators.LIST_RELATED_ITEMS);

        for (int i = 0; i < links.size(); i++) {
            String info = links.get(i).getText();
            System.out.println(info);
        }
    }
}

