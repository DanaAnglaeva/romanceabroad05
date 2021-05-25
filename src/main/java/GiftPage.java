import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GiftPage extends BaseActions {

    public GiftPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public void clickLinkGift() {
        driver.findElement(Locators.LINK_GIFT).click();
    }

    public void clickGiftSearchField() {
        driver.findElement(Locators.GIFT_SEARCH_FIELD).sendKeys(Data.searchGift);
    }

    public void clickButtonGiftSearch() {
        driver.findElement(Locators.BUTTON_GIFT_SEARCH).click();


    }
}
