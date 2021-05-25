import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTests extends BaseUI {

    String currentUrlHome;
    String homePageBookNow;
    String homePageJoinToday;

    @Test
    public void testHomePageLink() {
        driver.findElement(Locators.LINK_HOME_PAGE).click();
        currentUrlHome = driver.getCurrentUrl();
        System.out.println(currentUrlHome);
        Assert.assertEquals(currentUrlHome, Data.expectedUrlHome);
    }

    @Test
    public void testHomePageBookNow() {
        driver.findElement(Locators.HOME_PAGE_BOOK_NOW).click();
        homePageBookNow = driver.getCurrentUrl();
        System.out.println(homePageBookNow);
        Assert.assertEquals(homePageBookNow, Data.expectedHomePageBookNow);
    }

    @Test
    public void testJoinToday() {
        driver.findElement(Locators.HOME_PAGE_JOIN_TODAY).click();
        homePageJoinToday = driver.getCurrentUrl();
        System.out.println(homePageJoinToday);
        Assert.assertEquals(homePageJoinToday, Data.expectedHomePageJoinToday);
    }

    @Test
    public void testSupportEmail() {
        driver.findElement(Locators.HOME_PAGE_SUPPORT_EMAIL).click();
    }

    @Test //image dynamic,maybe needs use loops. Ask Oleksii
    public void testHomePageImages() {
        driver.findElement(Locators.HOME_PAGE_IMAGE_1).click();
    }

    @Test // Iframe Homework Lesson 7
    public void testHomePageIframeYoutube() {
        WebElement ele = driver.findElement(Locators.IFRAME_YOUTUBE);
        driver.switchTo().frame(ele);
        driver.findElement(Locators.IFRAME_YOUTUBE_BUTTON).click();

    }

}
