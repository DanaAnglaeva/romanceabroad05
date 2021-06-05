import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

    public class HeaderPage extends BaseActions {
    public HeaderPage(WebDriver driver, WebDriverWait wait){

        super(driver, wait);
    }

    public void clickHeaderDropDownMenu() {
        driver.findElement(Locators.HEADER_DROPDOWN_BUTTON).click();
    }
    public void clickCloseSignDropDownMenu() {
        driver.findElement(Locators.HEADER_DROP_DOWN_MENU_CLOSE_SIGN).click();
    }

    public void clickHeaderGiftSignIn() {
        driver.findElement(Locators.HEADER_GIFT_SIGN).click();
    }

    public void clickHeaderTourToUkraine() {
        driver.findElement(Locators.HEADER_TOUR_TO_UKRAINE).click();
    }

    public void clickHeaderIndividualTripToUkraine() {
        driver.findElement(Locators.HEADER_INDIVIDUAL_TRIP_TO_UKRAINE).click(); }

    public void clickHeaderLogoHeart() {
        driver.findElement(Locators.HEADER_ROMANCE_LOGO_HEART).click();
    }

    public void clickHeaderButtonFindPeople() {
        driver.findElement(Locators.HEADER_BUTTON_FIND_PEOPLE).click();
    }

    public void clickHeaderButtonLogin() {
        driver.findElement(Locators.HEADER_BUTTON_LOGIN).click();
    }

    public void clickHeaderLeftDropDownMenu() {driver.findElement(Locators.HEADER_LEFT_DROPDOWN_MENU).click();}

}
