package com.romanceabroad.ui;

import org.testng.Assert;
import org.testng.annotations.Test;

public class GiftTests extends BaseUI {

    String currentUrlGift;

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
}
