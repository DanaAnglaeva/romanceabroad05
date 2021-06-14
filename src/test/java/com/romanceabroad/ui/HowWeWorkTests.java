package com.romanceabroad.ui;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class HowWeWorkTests extends BaseUI {

    String currentUrlHowWeWork;

    @Test //use boolean for homework 30min move mouse action and drop down select to Base class; tc passed

    public void testHowWeWorkPageAssertEgualTestCase1() {
        howWeWorkPage.clickLinkHowWeWork();
        currentUrlHowWeWork = driver.getCurrentUrl();
        System.out.println(currentUrlHowWeWork);
        Assert.assertEquals(currentUrlHowWeWork, Data.expectedUrlHowWeWork);
    }

    @Test    //  Lesson 10//for iteration with com.romanceabroad.ui.BlogPage
        public void testGetAllLinksByLoopTestCase2() {

            howWeWorkPage.clickLinkHowWeWork();
            List<WebElement> links = driver.findElements(Locators.LIST_OF_LINKS);
            System.out.println(links.size());

            for (int i = 0; i < links.size(); i++) {
                String info = links.get(i).getText();
                System.out.println(info);

                links.get(i).click();
                links = driver.findElements(Locators.LIST_OF_LINKS);
            }
        }
}



