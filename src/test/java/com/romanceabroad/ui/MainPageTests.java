package com.romanceabroad.ui;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class MainPageTests extends BaseUI {

    String currentUrlHome;
    String homePageBookNow;
    String homePageJoinToday;

    @Test
    public void testMainPageAssertEgualTestCase1() {
        mainPage.clickLinkHomePage();
        currentUrlHome = driver.getCurrentUrl();
        System.out.println(currentUrlHome);
        Assert.assertEquals(currentUrlHome, Data.expectedUrlHome);
    }

    @Test
    public void testMainPageBookNowSave60TestCase2() {
        mainPage.clickHomePageBookNow();
        homePageBookNow = driver.getCurrentUrl();
        System.out.println(homePageBookNow);
        Assert.assertEquals(homePageBookNow, Data.expectedHomePageBookNow);
    }

    @Test
    public void testMainPageJoinTodayWithAjaxclickTestCase3() {
        mainPage.scrollToBottomOfPage();
        mainPage.clickHomePageLinkJoinToday();
        homePageJoinToday = driver.getCurrentUrl();
        System.out.println(homePageJoinToday);
        Assert.assertEquals(homePageJoinToday, Data.expectedHomePageJoinToday);
    }

    @Test
    public void testMainPageSupportEmailWithAjaxClickTestCase4() {
        mainPage.ajaxClick(Locators.LINK_HOME_PAGE);
        mainPage.clickHomePageSupportByEmail();
    }

    @Test
    public void testMainPageIframeYoutubeTestCase5() {
        mainPage.clickIframeYoutube();
        mainPage.clickButtonIframeYoutube();
    }

    @Test
    public void testIframeYoutubeSizeTestCase6() {
        int numbersOfIframes = mainPage.verifyIframeYoutubeSize();
        Assert.assertTrue(numbersOfIframes > 0);
        mainPage.verifyIframeYoutubeSize();

    }

    @Test
    public void testGetAllLinksByLoopTestCase7() {

        List<WebElement> links = driver.findElements(Locators.TAB_OF_MAIN_PAGE);
        System.out.println(links.size());
        for (int i = 0; i < links.size(); i++) {
            String info = links.get(i).getText();
            System.out.println(info);

            links.get(i).click();
            driver.get(mainUrl);
            links = driver.findElements(Locators.TAB_OF_MAIN_PAGE);
        }
    }

    @Test
    public void testMainLinkByLoopTestCase8() {

        String expectedTitle = "Ukrainian women for marriage";

        List<WebElement> links = driver.findElements(Locators.TAB_OF_MAIN_PAGE);
        System.out.println(links.size());

        for (int i = 0; i < links.size(); i++) {
            String info = links.get(i).getText();
            System.out.println(info);
            links.get(i).click();

            if (info.contains("WORK")) {
                String actualTitle = driver.findElement(Locators.H1_TITLE_OF_PAGE).getText();
                Assert.assertEquals(expectedTitle, actualTitle);
            }
            driver.get(mainUrl);
            links = driver.findElements(Locators.TAB_OF_MAIN_PAGE);
        }
    }

    @Test
    public void SmokeTestMainPageTestCase9() {

        List<WebElement> mainTabs = driver.findElements(Locators.TAB_OF_MAIN_PAGE);

        for (int i = 0; i < mainTabs.size(); i++) {
            mainTabs.get(i).click();
            driver.get(Data.mainUrl);
            mainTabs = driver.findElements(Locators.TAB_OF_MAIN_PAGE);
        }
    }

    @Test
    public void testLinksOnMainPageTestCase10 () {
        mainPage.checkLinksOnWebPage("//a", "href");
    }


    @Test
    public void test9LoopTestCase11() {
        List<WebElement> links = driver.findElements(Locators.TAB_OF_MAIN_PAGE);
        System.out.println(links.size());
        for (int i = 0; i < links.size(); i++) {
            String info = links.get(i).getText();
            System.out.println(info);

            links.get(i).click();
            driver.get(mainUrl);
            links = driver.findElements(Locators.TAB_OF_MAIN_PAGE);
        }
    }

}
