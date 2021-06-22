package com.romanceabroad.ui;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class GiftTests extends BaseUI {

    String currentUrlGift;
    String actualTitle;

    @Test
    public void testLinkGiftAssertEqualTestCase1() {

        giftPage.clickLinkGift();
        currentUrlGift = driver.getCurrentUrl();
        System.out.println(currentUrlGift);
        Assert.assertEquals(currentUrlGift, Data.expectedUrlGift);

    }

    @Test    // Homework Lesson 4,8 SendKeys,POM
    public void testSearchGiftSpaOnFieldTestCase2() {
        giftPage.clickLinkGift();
        giftPage.findGiftSpa();
        giftPage.clickButtonGiftSearch();

    }

    @Test
    public void testGetGiftsLinkByLoopRelatedItems() {

        giftPage.clickLinkGift();
        giftPage.driver.findElement(Locators.GIFTS_BESTSELLERS).click();
        List<WebElement> links = driver.findElements(Locators.LIST_RELATED_ITEMS);

        for (int i = 0; i < links.size(); i++) {
            String info = links.get(i).getText();
            System.out.println(info);
        }
    }

    @Test
    public void testGetGiftsLinkByLoopBestsellers() {

        giftPage.clickLinkGift();
        List<WebElement> links = driver.findElements(Locators.GIFTS_BESTSELLERS);

        for (int i = 0; i < links.size(); i++) {
            String info = links.get(i).getText();
            System.out.println(info);
        }
    }

    @Test
    public void testGetGiftsLinkByLoop() {

        giftPage.clickLinkGift();
        List<WebElement> userTabs = driver.findElements(Locators.GIFTS_BESTSELLERS);

        for (int i = 0; i < userTabs.size(); i++) {
          // userTabs.get(i).
           giftPage.ajaxClick(driver.findElement(Locators.GIFTS_BESTSELLERS));
           driver.navigate().back();
           driver.findElement(Locators.GIFTS_BESTSELLERS).click();
          //  actualTitle = giftPage.getAnyTitle();

            if (i == 0) {
                Assert.assertEquals(actualTitle, Data.expectedTitleGiftFlowerBasket);
            } else if (i == 1) {
                Assert.assertEquals(actualTitle, Data.expectedTitleGiftSpa);
            } else if (i == 2) {
                Assert.assertEquals(actualTitle, Data.expectedTitleGiftTeddyBear);
            } else if (i == 3) {
                Assert.assertEquals(actualTitle, Data.expectedTitleGiftVipToutToUkraine);
            }
            userTabs = driver.findElements(Locators.GIFTS_BESTSELLERS);
        }
    }
}
