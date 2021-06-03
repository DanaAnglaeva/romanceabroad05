import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class TourTests extends BaseUI {
    String currentUrlTour;

    public static final boolean testCase11 = true;
    public static final boolean testCase12 = false;
    public static final boolean testCase13 = true;

    @Test(priority = 2,enabled = testCase12, groups = {"user","admin", "ie"})
    public void testLinkTourTestCase12() {

        tourPage.clickLinkTourPage();
        currentUrlTour = driver.getCurrentUrl();
        System.out.println(currentUrlTour);
        Assert.assertEquals(currentUrlTour, Data.expectedUrlTour);
    }
    @Test (priority = 3,enabled = testCase13, groups = {"user","admin"})
    // Homework: SendKeys
    public void testSearchTourTestCase13() {
        tourPage.clickLinkTourPage();
        tourPage.clickSearchFieldVipTourToUkraine();
        tourPage.clickButtonTourSearch();
        tourPage.clickButtonQuickView();
        tourPage.clickLinkTourPage();
//        tourPage.clickButtonPayWithPayPal();
        tourPage.clickLinkTourPage();
    }
        @Test (priority = 1,enabled = testCase11, groups = {"user","admin", "ie"})
        //Homework //Lesson12
        public void testLoopsTestCase11 () {
            tourPage.clickLinkTourPage();
            List<WebElement> links = driver.findElements(Locators.TOUR_GALLERY_WITH_GIFTS);
            System.out.println(links.size());

            for (int i = 0; i < links.size(); i++) {
                String info = links.get(i).getText();

               System.out.println(info);
               links.get(i).click();
               tourPage.clickLinkTourPage();
               driver.get(Data.mainUrl);
               links = driver.findElements(Locators.TOUR_GALLERY_WITH_GIFTS);
            }
        }
}


