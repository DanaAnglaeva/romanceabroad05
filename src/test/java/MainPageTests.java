import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

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

    @Test//Lesson 12 AjaxscrollToButtom
    public void testMainPageJoinTodaywithAjaxclick() {
        mainPage.scrollToBottomOfPage();
        mainPage.ajaxClick(Locators.HOME_PAGE_JOIN_TODAY);
        homePageJoinToday = driver.getCurrentUrl();
        System.out.println(homePageJoinToday);
        Assert.assertEquals(homePageJoinToday, Data.expectedHomePageJoinToday);
    }

    @Test //Lesson12 //AjaxClick
    public void testMainPageSupportEmailWithAjaxClick() {
        mainPage.ajaxClick(Locators.LINK_HOME_PAGE);
        mainPage.clickHomePageSupportByEmail();
    }

    @Test // Iframe Homework Lesson 7
    public void testMainPageIframeYoutube() {
        mainPage.clickIframeYoutube();
        mainPage.clickButtonIframeYoutube();
    }

    @Test//test have moved to Registration test /  Lesson 9
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
}
