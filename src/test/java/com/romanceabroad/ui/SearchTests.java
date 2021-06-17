package com.romanceabroad.ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;
public class SearchTests extends BaseUI {

    String currentUrlSearch;

    public static final boolean testCase15 = true;


    @Test
    //homework Lesson7 Dropdown list + try catch//tc passed
    public void testLinkSearchAssertEqualTestCase1() {

        searchPage.clickLinkSearch();
        currentUrlSearch = driver.getCurrentUrl();
        System.out.println(currentUrlSearch);
        Assert.assertEquals(currentUrlSearch, Data.expectedUrlSearch);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        searchPage.getDropDownListByDefault();
        System.out.println("List sorted by Default!");

        searchPage.getDropDownListByViews();
        System.out.println("List sorted by View!");

        searchPage.getDropDownListByName();
        System.out.println("List sorted by Name!");

        searchPage.getDropDownListByRegistrationDate();
        System.out.println("List sorted by Registration date!");

    }

    @Test
    //homework Lesson 7/DropDown List
    public void testGetDropDownListFromAge_18_To_80_TestCase2() {
        searchPage.clickLinkSearch();
        WebElement dropDownListSortByMinAge = driver.findElement(Locators.DROP_DOWN_LIST_MIN_USER_AGE);
        searchPage.getDropDownListByIndex(dropDownListSortByMinAge, 0);
        WebElement dropDownListSortByMaxAge = driver.findElement(Locators.DROP_DOWN_LIST_MAX_USER_AGE);
        searchPage.getDropDownListByIndex(dropDownListSortByMaxAge, 62);
        System.out.println("List of brides sorted by age from 18 to 80 successfully!");
        searchPage.clickButtonSearch();

    }
    @Test
    public void testGetDropDownListSearchByIndexFromAge_19_TO_79TestCase3() {
        searchPage.clickLinkSearch();
        WebElement dropDownListMinPage = driver.findElement(Locators.DROP_DOWN_LIST_MIN_USER_AGE);
        searchPage.getDropDownListByIndex(dropDownListMinPage, 2);
        WebElement dropDownListMaxPage = driver.findElement(Locators.DROP_DOWN_LIST_MAX_USER_AGE);
        searchPage.getDropDownListByIndex(dropDownListMaxPage, 60);
        System.out.println("List of brides sorted by age from 19 to 78 successfully!");
        searchPage.clickButtonSearch();
    }

    @Test
    //homework Lesson 7. Dropdown list + Explicit wait //tc passed
    public void testGetDropDownListSearchByAllIndexTestCase4() {
        searchPage.clickLinkSearch();
        WebElement dropDownListSortBy = driver.findElement(Locators.DROP_DOWN_LIST_SORT_BY);
        searchPage.getDropDownListByIndex(dropDownListSortBy, 0);
        System.out.println("Success! Index 0 selected!");
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

        searchPage.getDropDownListByIndex(dropDownListSortBy, 1);
        System.out.println("Success! Index 1 selected!");

        searchPage.getDropDownListByIndex(dropDownListSortBy, 2);
        System.out.println("Success! Index 2 selected!");

        searchPage.getDropDownListByIndex(dropDownListSortBy, 3);
        System.out.println("Success! Index 3 selected!");
    }

    @Test //tc passed
    public void testGetListSearchByIndexFromAge20To54TestCase5() {
        searchPage.clickLinkSearch();
        WebElement dropDownListMinAge = driver.findElement(Locators.DROP_DOWN_LIST_MIN_USER_AGE);
        searchPage.getDropDownListByIndex(dropDownListMinAge, 2);
        WebElement dropDownListMaxAge = driver.findElement(Locators.DROP_DOWN_LIST_MAX_USER_AGE);
        searchPage.getDropDownListByIndex(dropDownListMaxAge, 36);
        System.out.println("Success!List of brides sorted by age from 20 to 54!");
        searchPage.clickButtonSearch();
    }

    @Test //Lesson 9 tc passed

    public void testGetWebEleByTextPrettyWomenTestCase6() {
        WebElement tabSearch = driver.findElement((Locators.LINK_SEARCH));
        if (tabSearch.getText().contains("PRETTY WOMEN")) {
            tabSearch.click();
        } else {
            Assert.fail("We can't find Pretty Women Tab");
        }
    }

    @Test //Lesson 10 tc passed
    public void clickWebElementIsDisplayedTestCase7() {
        WebElement tabSearch = driver.findElement((Locators.LINK_SEARCH));
        if (tabSearch.isDisplayed()) {
            tabSearch.click();
        } else {
            Assert.fail("We can't find Pretty Women Tab");
        }
    }

    @Test //Lesson 10 Soft Assertion //tc passed
//if we change data, we can see how it work when tc is failed
    public void testGetDropDownListByTextTestCase10() {
        Assert.assertTrue(driver.findElement(Locators.LINK_SEARCH).isDisplayed(), "Element is not displayed");
        driver.findElement(Locators.LINK_SEARCH).click();
        currentUrlSearch = driver.getCurrentUrl();
        System.out.println(currentUrlSearch);
        softAssert.assertEquals(currentUrlSearch, Data.expectedUrlSearch, "Url is wrong");
        WebElement dropDownListSortBy = driver.findElement(Locators.DROP_DOWN_LIST_SORT_BY);
        searchPage.getDropDownListByValue(dropDownListSortBy, "date_created");
        softAssert.assertAll();

    }
    @Test //Lesson 14 //tc passed
    public void testSelectRandomDropDownListTestCase11() {

        driver.findElement(Locators.LINK_SEARCH).click();

        for (int i = 0; i < 10; i++) {
            searchPage.selectItemDropDownRandomOption(Locators.DROP_DOWN_LIST_SORT_BY, "Sort by");
            mainPage.javaWaitSec(3);
        }
    }

    @Test //Lesson 14//tc passed
    public void SelectRandomDropDownListMaxAgeTestCase12() {
        driver.findElement(Locators.LINK_SEARCH).click();

        int sizeOfDropDownListSortBy = searchPage.getSizeDropDownList(Locators.DROP_DOWN_LIST_MAX_USER_AGE);
        System.out.println(sizeOfDropDownListSortBy);
        for (int i = 0; i < sizeOfDropDownListSortBy; i++) {
            searchPage.selectItemDropDownRandomOption(Locators.DROP_DOWN_LIST_MAX_USER_AGE, "Sort by");
            mainPage.javaWaitSec(3);
        }
    }
    @Test //Lesson 14////tc passed
    public void SelectRandomDropDownListMinAgeTestCase13() {
        driver.findElement(Locators.LINK_SEARCH).click();

        int sizeOfDropDownListSortBy = searchPage.getSizeDropDownList(Locators.DROP_DOWN_LIST_MIN_USER_AGE);
        System.out.println(sizeOfDropDownListSortBy);
        for (int i = 0; i < sizeOfDropDownListSortBy; i++) {
            searchPage.selectItemDropDownRandomOption(Locators.DROP_DOWN_LIST_MIN_USER_AGE, "Sort by");
            mainPage.javaWaitSec(3);
        }
    }

    @Test //Lesson 11,12 /Homework
    public void testGetAllLinksTestCase14() {
        String actualTitle;
        String actualUrlPrettyWomen;
        String expectedUrlPrettyWomen = "https://romanceabroad.com/users/search";
        String expectedTitleHowWeWork = "Ukrainian women for marriage";
        String expectedTitlePrettyWomen = "Single Ukrainian women online";
        List<WebElement> links = driver.findElements(Locators.H1_TITLE_OF_PAGE);
        System.out.println(links.size());

        for (int i = 0; i < links.size(); i++) {
            String info = links.get(i).getText();
            System.out.println(info);
            links.get(i).click();

            if (info.contains("WORK")) {
                actualTitle = driver.findElement(Locators.H1_TITLE_OF_PAGE).getText();
                Assert.assertEquals(expectedTitleHowWeWork, actualTitle);
            }
            if (info.contains("PRETTY WOMEN")) {
                actualTitle = driver.findElement(Locators.H1_TITLE_OF_PAGE).getText();
                actualUrlPrettyWomen = driver.getCurrentUrl();
                Assert.assertEquals(expectedTitlePrettyWomen, actualTitle);
                Assert.assertEquals(actualUrlPrettyWomen, expectedUrlPrettyWomen);
                driver.findElement(By.xpath("//a[@class='g-pic-border g-rounded']")).isDisplayed();

                if (actualUrlPrettyWomen.contains("#")) {
                    Assert.fail("It contains restricted #");
                } else {
                    System.out.println("No special characters.It is good url!");
                }
            }
            driver.get(Data.mainUrl);//tc passed
            links = driver.findElements(Locators.TAB_OF_MAIN_PAGE);
        }
    }

    @Test// Lesson22
            (dataProvider = "Search", dataProviderClass = DataProviders.class, priority = 3, enabled = testCase15,
                    groups = {"user", "admin"}
    )
    public void searchDifferentResultsTestCase15(String minAge, String maxAge, String sortBy) {
        int min = Integer.parseInt(minAge);
        int max = Integer.parseInt(maxAge);
        System.out.println(min);
        System.out.println(max);

        searchPage.clickLinkSearch();
        searchPage.getDropDownListByText(driver.findElement(Locators.DROP_DOWN_LIST_MIN_USER_AGE), minAge);
        searchPage.getDropDownListByText(driver.findElement(Locators.DROP_DOWN_LIST_MAX_USER_AGE), maxAge);
        searchPage.getDropDownListByText(driver.findElement(Locators.DROP_DOWN_LIST_SORT_BY), sortBy);
        searchPage.clickButtonSearch();

        List<WebElement> infoAboutUser = driver.findElements(Locators.USERS_DISPLAYED_INFO);

        for (int i = 0; i < infoAboutUser.size(); i++) {
            if (i % 2 == 0) {
                WebElement text = infoAboutUser.get(i);
                String info = text.getText();
                String [] splitedPhrase = info.split(",");
                String age = splitedPhrase [1];
                int ageNum = Integer.parseInt(age);

                if (min <= ageNum || ageNum <= max) {
                    System.out.println("This age: " + ageNum + " is correct");
                } else {
                    Assert.fail("Wrong age: " + ageNum);
                }
            }
                mainPage.javaWait(3);
                infoAboutUser = driver.findElements(Locators.USERS_DISPLAYED_INFO);

        }
    }

            @Test //Lesson 14 //tc passed
            public void testCheckAllLinksAndImgagesTestCase16 () {
                //                } else {
//                    Assert.fail("Wrong age:" + ageNum);
                searchPage.clickLinkSearch();
                searchPage.checkLinksOnWebPage("//a", "href");
                searchPage.checkLinksOnWebPage("//li", "href");

    }
}







