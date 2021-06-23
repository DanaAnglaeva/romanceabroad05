package com.romanceabroad.ui;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class TourTests extends BaseUI {
    String currentUrlTour;

    public static final boolean testCase1 = true;
    public static final boolean testCase2 = false;
    public static final boolean testCase3 = true;

    @Test(priority = 2,enabled = testCase1, groups = {"ie","user","admin", })

    public void testLinkTourTestCase1() {

        tourPage.clickLinkTourPage();
        currentUrlTour = driver.getCurrentUrl();
        System.out.println(currentUrlTour);
        Assert.assertEquals(currentUrlTour, Data.expectedUrlTour);
    }
    @Test (priority = 3,enabled = testCase2, groups = {"user","admin"})

     public void testSearchTourTestCase2() {
        tourPage.clickLinkTourPage();
        tourPage.clickSearchFieldVipTourToUkraine();
        tourPage.clickButtonTourSearch();
        tourPage.clickButtonQuickView();
        tourPage.clickLinkTourPage();
         tourPage.clickLinkTourPage();
    }

    @Test (priority = 1,enabled = testCase3, groups = {"user","admin"})

         public void testGetLinksSizeLoopsTestCase3 () {
            tourPage.clickLinkTourPage();
            List<WebElement> links = driver.findElements(Locators.TOUR_GALLERY_WITH_GIFTS);
            System.out.println(links.size());

            for (int i = 0; i < links.size(); i++) {
                String info = links.get(i).getText();

               System.out.println(info);
               links.get(i).click();
               links = driver.findElements(Locators.TOUR_GALLERY_WITH_GIFTS);
            }
        }
}


