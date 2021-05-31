import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class TourTests extends BaseUI {
    String currentUrlTour;

    @Test
    public void testLinkTour() {

        tourPage.clickLinkTourPage();
        currentUrlTour = driver.getCurrentUrl();
        System.out.println(currentUrlTour);
        Assert.assertEquals(currentUrlTour, Data.expectedUrlTour);
    }

    @Test  // Homework: SendKeys
    public void testSearchTour() {

        tourPage.clickLinkTourPage();
        tourPage.clickSearchFieldVipTourToUkraine();
        tourPage.clickButtonTourSearch();
        tourPage.clickButtonQuickView();
        tourPage.clickLinkTourPage();
//        tourPage.clickButtonPayWithPayPal();
        tourPage.clickLinkTourPage();
    }

        @Test //Homework //Lesson12
        public void testLoops () {
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


