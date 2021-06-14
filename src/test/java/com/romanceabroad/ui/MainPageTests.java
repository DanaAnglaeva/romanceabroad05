package com.romanceabroad.ui;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class MainPageTests extends BaseUI {

    String currentUrlHome;
    String homePageBookNow;
    String homePageJoinToday;

    @Test //TC passed
    public void testMainPageAssertEgualTestCase1() {
        mainPage.clickLinkHomePage();
        currentUrlHome = driver.getCurrentUrl();
        System.out.println(currentUrlHome);
        Assert.assertEquals(currentUrlHome, Data.expectedUrlHome);
    }

    @Test //TC passed
    public void testMainPageBookNowSave60TestCase2() {
        mainPage.clickHomePageBookNow();
        homePageBookNow = driver.getCurrentUrl();
        System.out.println(homePageBookNow);
        Assert.assertEquals(homePageBookNow, Data.expectedHomePageBookNow);
    }

    @Test//Lesson 12 AjaxscrollToButtom//TC passed
    public void testMainPageJoinTodayWithAjaxclickTestCase3() {
        mainPage.scrollToBottomOfPage();
        mainPage.clickHomePageLinkJoinToday();
        homePageJoinToday = driver.getCurrentUrl();
        System.out.println(homePageJoinToday);
        Assert.assertEquals(homePageJoinToday, Data.expectedHomePageJoinToday);
    }

    @Test //Lesson12 //AjaxClick //TC passed
    public void testMainPageSupportEmailWithAjaxClickTestCase4() {
        mainPage.ajaxClick(Locators.LINK_HOME_PAGE);
        mainPage.clickHomePageSupportByEmail();
    }

    @Test // Iframe Homework Lesson 7 //TC passed
    public void testMainPageIframeYoutubeTestCase5() {
        mainPage.clickIframeYoutube();
        mainPage.clickButtonIframeYoutube();
    }

    @Test // Iframe Homework Lesson 13//TC passed
    public void testIframeYoutubeSizeTestCase6() {
        int numbersOfIframes = mainPage.verifyIframeYoutubeSize();
        Assert.assertTrue(numbersOfIframes > 0);
        mainPage.verifyIframeYoutubeSize();

    }

    @Test//test have moved to Registration test /  Lesson 9
    public void testGetAllLinksByLoopTestCase7() {  //for iteration//TC passed

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

    @Test//Lesson 11 >>>
    public void testMainLinkByLoopTestCase8() {  //for iteration tc passed

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

    @Test   // Homework Lesson 10,16 // tc passed, links opened
    public void SmokeTestMainPageTestCase9() {  //for iteration with com.romanceabroad.ui.BlogPage

        List<WebElement> mainTabs = driver.findElements(Locators.TAB_OF_MAIN_PAGE);

        for (int i = 0; i < mainTabs.size(); i++) {
            mainTabs.get(i).click();
            driver.get(Data.mainUrl);
            mainTabs = driver.findElements(Locators.TAB_OF_MAIN_PAGE);
        }
    }

    @Test //Lesson 14 //TC passed //checked links by elements and attributes
    public void testLinksOnMainPageTestCase10 () {
        mainPage.checkLinksOnWebPage("//a", "href");
    }

    @Test //Lesson 20 tc passed
    public void printTestCase11() {
        searchPage.javaWait(5000);
    }

    @Test //Lesson 19 tc passed
    public void test9LoopTestCase12() {  //for iteration   //test have moved to Registration test /  Lesson 9,16

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
