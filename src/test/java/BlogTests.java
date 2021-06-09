import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class BlogTests extends BaseUI {

    String currentUrlBlog;

    @Test //Homework Lesson8 / POM
    public void BlogTests() {

        blogPage.clickLinkBlog();
        currentUrlBlog = driver.getCurrentUrl();
        System.out.println(currentUrlBlog);
        Assert.assertEquals(currentUrlBlog, Data.expectedUrlBlog);
    }

       @Test    //  Lesson 10//for iteration with BlogPage
    public void testBlogLoop() {

        blogPage.clickLinkBlog();
        List<WebElement> links = driver.findElements(Locators.BLOG_ALL_MENU);
        System.out.println(links.size());

        for (int i = 0; i < links.size(); i++) {
            String info = links.get(i).getText();

            System.out.println(info);
            links.get(i).click();
            blogPage.clickLinkBlog();
            driver.get(mainUrl);
            links = driver.findElements(Locators.BLOG_ALL_MENU);
        }
    }

    @Test   // Homework Lesson 10 // did not open links
    public void testBlogLoopForAllMenuUlList() {  //for iteration with BlogPage
        blogPage.clickLinkBlog();
        List<WebElement> links = driver.findElements(Locators.BLOG_TAB_MENU);
        System.out.println(links.size());
        for (int i = 0; i < links.size(); i++) {
            String info = links.get(i).getText();
            System.out.println(info);
            links.get(i).click();
            blogPage.clickLinkBlog();
            links = driver.findElements(Locators.BLOG_TAB_MENU);
        }
    }

    @Test //Web element is displayed//Lesson 9// TC have moved to BlogTests
    public void testBlogTabDisplayedIfElseFailed() {

        blogPage.clickLinkBlog();
        blogPage.clickWebElementBlogAllTabMenu();

        WebElement blogTabMenu = driver.findElement(Locators.BLOG_ALL_MENU);
        if (!blogTabMenu.isDisplayed()) {
            blogTabMenu.click();
            System.out.println("This page displayed!");
        } else {
            Assert.fail("Not found this page");
        }

    }

    @Test  //Lesson 9 If/else//contains text!!!//Homework
    public void testBlogIsContainsTextIfElsePassed() {
        blogPage.clickLinkBlog();
        WebElement blogTabMenu = driver.findElement(Locators.BLOG_TAB_MENU);

        if (blogTabMenu.getText().contains("Kiev dating agency")) {
            blogTabMenu.click();
            System.out.println("This page exist!");
        } else {
            Assert.fail("Not found this page");

        }
    }
    @Test //Web element is displayed //Lesson9/TC have moved to BlogTests
    public void testBlogTabIsDisplayedIfElsePassed() {

        blogPage.clickLinkBlog();
        WebElement blogTabMenu = driver.findElement(Locators.BLOG_TAB_MENU);
        if (blogTabMenu.isDisplayed()) {
            blogTabMenu.click();
            System.out.println("This page displayed!");
        } else {
            Assert.fail("Not found this page");
        }
    }

    @Test  //Lesson 9 If/else //Homework//Test have moved to BlogTests

    public void testBlogGetTextIfElseFailed() {
        blogPage.clickLinkBlog();
        WebElement blogTabMenu = driver.findElement(Locators.BLOG_TAB_MENU);

        if (!blogTabMenu.getText().contains("Kiev dating agency")) {
            blogTabMenu.click();
        } else {
            Assert.fail("Not found this page!");
        }
    }

    @Test //Lesson 9 // Homework //TC have moved to BlogTests
    public void testBlogIfElseForAllLinksPassed() {

        blogPage.clickLinkBlog();
        WebElement blogTabMenu = driver.findElement(Locators.BLOG_TAB_MENU);

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
