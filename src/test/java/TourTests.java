import org.testng.Assert;
import org.testng.annotations.Test;

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
        tourPage.clickLinkTourSearchField();
        tourPage.clickButtonTourSearch();

    }

}
