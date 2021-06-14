package com.romanceabroad.ui;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class BlogTests extends BaseUI {

    String currentUrlBlog;

    @Test //Homework Lesson8 / Ptc passed
    public void testBlogAsssertEqualTestCase1() {

        blogPage.clickLinkBlog();
        currentUrlBlog = driver.getCurrentUrl();
        System.out.println(currentUrlBlog);
        Assert.assertEquals(currentUrlBlog, Data.expectedUrlBlog);
    }

    @Test   // Homework Lesson 10 //
    public void testBlogLoopForAllMenuUlListTestCase2() {  //links collected tc passed
        blogPage.clickLinkBlog();
        List<WebElement> links = driver.findElements(Locators.LIST_OF_BLOG_LINKS);
        System.out.println(links.size());
        for (int i = 0; i < links.size(); i++) {
            String info = links.get(i).getText();
            System.out.println(info);
            links.get(i).click();
            blogPage.clickLinkBlog();
            links = driver.findElements(Locators.LIST_OF_BLOG_LINKS);
        }
    }

    @Test  //Lesson 9 If/else//contains text!!!//Homework
    public void testBlogIsContainsTextIfElseTestCase3() {
        blogPage.clickLinkBlog();
        WebElement listOfBlogLinks = driver.findElement(Locators.LIST_OF_BLOG_LINKS);

        if (listOfBlogLinks.getText().contains("Kharkov dating agency")) {
            listOfBlogLinks.click();
            System.out.println("This page exist!");
        } else {
            Assert.fail("Not found this page");

        }
    }

    @Test //Web element is displayed //Lesson9/TC passed
    public void testBlogTabIsDisplayedIfElseTestCase4() {

        blogPage.clickLinkBlog();
        WebElement listOfBlogLinks = driver.findElement(Locators.LIST_OF_BLOG_LINKS);
        if (listOfBlogLinks.isDisplayed()) {
            listOfBlogLinks.click();
            System.out.println("This page displayed!");
        } else {
            Assert.fail("Not found this page");
        }
    }

    @Test  //Lesson 9 If/else //Homework//Test passed

    public void testBlogGetTextIfElseFailedTestCase5() {
        blogPage.clickLinkBlog();
        WebElement blogTabMenu = driver.findElement(Locators.LIST_OF_BLOG_LINKS);

        if (!blogTabMenu.getText().contains("Kiev dating agency")) {
            blogTabMenu.click();
        } else {
            Assert.fail("Not found this page!");
        }
    }

    @Test //Lesson 9 // Homework //TC passed
    public void testBlogIfElseForAllLinksTestCase6() {

        blogPage.clickLinkBlog();
        WebElement blogTabMenu = driver.findElement(Locators.PAGES_CONTENT_LIST_OF_ALL_LINKS);

        if (blogTabMenu.getText().contains("Kharkov dating agency")) {
            blogTabMenu.click();
            System.out.println("This page exist!");
        }
        if (blogTabMenu.getText().contains("Kiev dating agency")) {
            blogTabMenu.click();
            System.out.println("This page exist!");
        }
        if (blogTabMenu.getText().contains("Odessa dating agency")) {
            blogTabMenu.click();
            System.out.println("This page exist!");
        }
        if (blogTabMenu.getText().contains("Mail order girls")) {
            blogTabMenu.click();
            System.out.println("This page exist!");
        }
        if (blogTabMenu.getText().contains("Beautiful urkainian girls")) {
            blogTabMenu.click();
            System.out.println("This page exist!");
        }
        if (blogTabMenu.getText().contains("Real Ukrainian brides")) {
            blogTabMenu.click();
            System.out.println("This page exist!");
        }
        if (blogTabMenu.getText().contains("Eastern European women")) {
            blogTabMenu.click();
            System.out.println("This page exist!");
        }
        if (blogTabMenu.getText().contains("Marriage agency in Ukraine")) {
            blogTabMenu.click();
            System.out.println("This page exist!");
        }
        if (blogTabMenu.getText().contains("Kiev dating site")) {
            blogTabMenu.click();
            System.out.println("This page exist!");
        }
        if (blogTabMenu.getText().contains("Find Ukrainian girlfriend")) {
            blogTabMenu.click();
            System.out.println("This page exist!");
        }
        if (blogTabMenu.getText().contains("Slavic women for marriage")) {
            blogTabMenu.click();
            System.out.println("This page exist!");
        }
        if (blogTabMenu.getText().contains("How to marry Ukrainian lady")) {
            blogTabMenu.click();
            System.out.println("This page exist!");
        }
        if (blogTabMenu.getText().contains("Free Ukrainian dating site")) {
            blogTabMenu.click();
            System.out.println("This page exist!");
        }
        if (blogTabMenu.getText().contains("9 Factors to Keep in Mind When Dating a Ukrainian Woman")) {
            blogTabMenu.click();
            System.out.println("This page exist!");
        }
        if (blogTabMenu.getText().contains("Is There a Difference Between Dating or Courting a Ukrainian Woman")) {
            blogTabMenu.click();
            System.out.println("This page exist!");
        } else {
            Assert.fail("Not found this pages");
        }
    }

}
