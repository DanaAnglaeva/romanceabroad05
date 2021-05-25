import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TourPage extends BaseActions {
    public TourPage(WebDriver driver, WebDriverWait wait) {

        super(driver, wait);
    }

    public void clickLinkTourPage() {
        driver.findElement(Locators.LINK_TOUR).click();
    }

    public void clickLinkTourSearchField() {
        driver.findElement(Locators.TOUR_SEARCH_FIELD).sendKeys(Data.tourSearchField);
    }

    public void clickButtonTourSearch() {
        driver.findElement(Locators.BUTTON_SEARCH_TOUR).click();
    }


}
