import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Conditions extends BaseUI {

    @Test //test have moved to Registration test /  Lesson 10
    public void testWebElementCheckboxIf() {
        mainPage.clickJoinButton();
        mainPage.completeFirstPartOfRegistration();
        mainPage.completeSecondPartOfRegistration();

        WebElement checkbox = driver.findElement((Locators.BUTTON_REGISTRATION));

        if (checkbox.isSelected()) {
            checkbox.click();
        }
    }

    @Test //test have moved to Registration test /  Lesson 10
    public void test6CheckboxConfirmationIfElse() {
        mainPage.clickJoinButton();
        mainPage.completeFirstPartOfRegistration();
        mainPage.completeSecondPartOfRegistration();
        WebElement checkbox = driver.findElement((Locators.CHECKBOX_CONFIRMATION_BUTTON));
        if (!checkbox.isSelected()) {
            checkbox.click();
            System.out.println("Checkbox is selected!");
        }
    }

    @Test
    public void test7ArrayListWithString() {

        List<String> crunchifyList1 = new ArrayList<>(Arrays.asList("Kiwi", "orange", "melon"));
        String element = crunchifyList1.get(0);
        System.out.println(element);
    }

    @Test
    public void test8ArrayListContainsTextWithIf() {

        List<String> crunchifyList1 = new ArrayList<>(Arrays.asList("Kiwi", "orange", "melon"));
        if (crunchifyList1.contains("orange")) {
            System.out.println(crunchifyList1);
        }
    }

    @Test
    public void test8ArrayListWithInteger() {  //integers are always without ""

        List<Integer> crunchifyList1 = new ArrayList<>(Arrays.asList(5, 10, 19));
        int sum = crunchifyList1.get(1) + crunchifyList1.get(2);
        System.out.println(sum);
    }

    @Test//test have moved to Registration test /  Lesson 10
    public void test9Loop() {  //for iteration

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

    //Ask Alex,why links did not opened????
    @Test    //test have moved to Registration test /  Lesson 10//for iteration with BlogPage
    public void testBlogLoop() {
        blogPage.clickLinkBlog();
        List<WebElement> links = driver.findElements(Locators.BLOG_ALL_MENU);
        System.out.println(links.size());
        for (int i = 0; i < links.size(); i++) {
            String info = links.get(i).getText();
            System.out.println(info);
            links.get(i).click();
            blogPage.clickLinkBlog();
            //    driver.get(mainUrl);
            links = driver.findElements(Locators.BLOG_ALL_MENU);
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

    @Test  //Lesson 9 If/else//contains text!!!//Homework//Test have moved to BlogTests
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

    @Test //Web element is displayed//Lesson 9// TC have moved to BlogTests
    public void testBlogTabDisplayedIfElseFailed() {

        blogPage.clickLinkBlog();
        WebElement blogTabMenu = driver.findElement(Locators.BLOG_ALL_MENU);
        if (!blogTabMenu.isDisplayed()) {
            blogTabMenu.click();
            System.out.println("This page displayed!");
        } else {
            Assert.fail("Not found this page");
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

    @Test    //  Lesson 11//
    public void testBlogActionsInsideLoopInteger() {

        List<Integer> crunchifyList1 = new ArrayList<>(Arrays.asList(5, 10, 19));

        crunchifyList1.add(10);
        System.out.println(crunchifyList1);

        for (int i = 0; i < crunchifyList1.size(); i++) {
            int element = crunchifyList1.get(i);
        }
    }

    @Test    //  Lesson 11
    public void testBlogActionsInsideLoopString() {
        String phrase = "Melon is inside list";
        List<String> crunchifyList1 = new ArrayList<>(Arrays.asList("apple", "kiwi", "Orange"));

        crunchifyList1.add("melon");
        System.out.println(crunchifyList1);

        for (int i = 0; i < crunchifyList1.size(); i++) {
            String element = crunchifyList1.get(i);
            System.out.println(i + " iteration");
            if (element.contains("melon")) {
                System.out.println("melon inside list");
            }

        }
    }

    @Test//Lesson 11
    public void testLoop() {  //for iteration
        String expectedTitle = "Ukrainian women for marriage!";
        List<WebElement> links = driver.findElements(Locators.TAB_OF_MAIN_PAGE);
        System.out.println(links.size());

        for (int i = 0; i < links.size(); i++) {
            String info = links.get(i).getText();
            System.out.println(info);
            links.get(i).click();

            if (info.contains("WORK")) {
                String actualTitle = driver.findElement(By.xpath("//h1")).getText();
                Assert.assertEquals(expectedTitle, actualTitle);
            }
            driver.get(mainUrl);
            links = driver.findElements(Locators.BLOG_ALL_MENU);
        }
    }

    @Test //Lesson 11,12 /Homework
    public void test7_1() {
        String actualTitle;
        String actualUrlPrettyWomen;
        String expectedUrlPrettyWomen = "https://romanceabroad.com/users/search";
        String expectedTitleHowWeWork = "Ukrainian women for marriage";
        String expectedTitlePrettyWomen = "Single Ukrainian women online";
        List<WebElement> links = driver.findElements(Locators.TITLE_OF_PAGE);
        System.out.println(links.size());


        for (int i = 0; i < links.size(); i++) {
            String info = links.get(i).getText();
            System.out.println(info);
            links.get(i).click();

            if (info.contains("WORK")) {
                actualTitle = driver.findElement(Locators.TITLE_OF_PAGE).getText();
                Assert.assertEquals(expectedTitleHowWeWork, actualTitle);
            }
            if (info.contains("PRETTY WOMEN")) {
                actualTitle = driver.findElement(Locators.TITLE_OF_PAGE).getText();
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
            driver.get(Data.mainUrl);
            links = driver.findElements(Locators.TAB_OF_MAIN_PAGE);
        }
    }

    @Test
    public void testWithAjaxByIndex() {
        searchPage.clickLinkSearch();
        searchPage.ajaxClick(Locators.FOOTER_TAB, 1);
    }

}



