package com.romanceabroad.ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class PhotoTests extends BaseUI {

    String actualTitle;

    @Test
    public void testMediaTab() {

        photosPage.clickLinkMedia();
        List<WebElement> userTabs = driver.findElements(Locators.LINK_TAB_USER_PROFILE);
        actualTitle = photosPage.getAnyTitle();
        Assert.assertEquals(actualTitle, Data.expectedTitleAllPhotos);
        for (int i = 0; i < userTabs.size(); i++) {

            userTabs.get(i).click();
            actualTitle = photosPage.getAnyTitle();

            if (i == 0) {
                Assert.assertEquals(actualTitle, Data.expectedTitleGallery);
            } else if (i == 1) {
                Assert.assertEquals(actualTitle, Data.expectedTitlePhotoGallery);
            } else if (i == 2) {
                Assert.assertEquals(actualTitle, Data.expectedTitleVideoGallery);
            } else if (i == 3) {
                Assert.assertEquals(actualTitle, Data.expectedTitleGalleryAlbums);
            }
            userTabs = driver.findElements(Locators.LINK_TAB_USER_PROFILE);
        }
    }

    @Test
    public void testMediaLinks() {

        photosPage.clickLinkMedia();
        List<WebElement> userTabs = driver.findElements(Locators.LINK_TAB_USER_PROFILE);
        actualTitle = photosPage.getAnyTitle();
        Assert.assertEquals(actualTitle, Data.expectedTitleAllPhotos);

        for (int i = 0; i < userTabs.size(); i++) {
            userTabs.get(i).click();
            actualTitle = photosPage.getAnyTitle();
            if (i == 0){
                Assert.assertEquals(actualTitle, Data.expectedTitleGallery);
            } else if (i == 1) {
                Assert.assertEquals(actualTitle, Data.expectedTitlePhotoGallery);
            } else if (i == 2) {
                Assert.assertEquals(actualTitle, Data.expectedTitleVideoGallery);
                String textMedia = driver.findElement(By.xpath("//div[@class='g-flatty-block']")).getText();
                System.out.println(Data.textMedia);
                if (textMedia.contains(Data.textMedia)) {
                    System.out.println("Text media is correct!");
                }
            } else if (i == 3) {
                Assert.assertEquals(actualTitle, Data.expectedTitleGalleryAlbums);
                mainPage.javaWait(2);
                Assert.assertTrue(driver.findElement(By.xpath("//div[@class='col-xs-12 content-block']")).isDisplayed());
            }
                userTabs = driver.findElements(Locators.LINK_TAB_USER_PROFILE);

            }
        }
    }
