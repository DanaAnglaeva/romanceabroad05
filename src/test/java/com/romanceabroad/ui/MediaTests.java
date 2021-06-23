package com.romanceabroad.ui;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;


public class MediaTests extends BaseUI {

    String currentUrlMedia;

       @Test

    public void testGetLinkMediaAssertEqualTestCase1() {
        wait.until(ExpectedConditions.elementToBeClickable(Locators.LINK_MEDIA));
        mediaPage.clickLinkMedia();
        currentUrlMedia = driver.getCurrentUrl();
        System.out.println(currentUrlMedia);
        Assert.assertEquals(currentUrlMedia, Data.expectedUrlMedia);
       }
}




