import org.testng.Assert;
import org.testng.annotations.Test;

public class MainPageTests extends BaseUI {

    String currentUrlHome;
    String homePageBookNow;
    String homePageJoinToday;

    @Test
    public void testMainPageLink() {
        mainPage.clickLinkHomePage();

        currentUrlHome = driver.getCurrentUrl();
        System.out.println(currentUrlHome);
        Assert.assertEquals(currentUrlHome, Data.expectedUrlHome);
    }

    @Test
    public void testMainPageBookNowSave60() {
        mainPage.clickHomePageBookNow();

        homePageBookNow = driver.getCurrentUrl();
        System.out.println(homePageBookNow);
        Assert.assertEquals(homePageBookNow, Data.expectedHomePageBookNow);
    }

    @Test
    public void testMainPageJoinToday() {
        mainPage.clickHomePageJoinToday();
        homePageJoinToday = driver.getCurrentUrl();
        System.out.println(homePageJoinToday);
        Assert.assertEquals(homePageJoinToday, Data.expectedHomePageJoinToday);
    }

    @Test
    public void testMainPageSupportEmail() {
        mainPage.clickHomePageSupportByEmail();
    }

    @Test // Iframe Homework Lesson 7
    public void testMainPageIframeYoutube() {
        mainPage.clickIframeYoutube();
        mainPage.clickButtonIframeYoutube();
    }

}
