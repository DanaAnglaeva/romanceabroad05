import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class MainPage extends BaseActions {

    public MainPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public void clickJoinButton() {
        driver.findElement(Locators.BUTTON_REGISTRATION).click();
    }

    public void completeFirstPartOfRegistration() {
        driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
        driver.findElement(Locators.TEXT_FIELD_EMAIL).sendKeys(Data.email);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(Locators.TEXT_FIELD_PASSWORD)));
        driver.findElement(Locators.TEXT_FIELD_PASSWORD).sendKeys(Data.password);
        wait.until(ExpectedConditions.elementToBeClickable(Locators.BUTTON_NEXT));

    }

    public void completeSecondPartOfRegistration() {
        driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
        driver.findElement(Locators.BUTTON_NEXT).click();
        try {
            driver.findElement(Locators.BUTTON_NEXT).click();

        } catch (Exception e) {
            e.printStackTrace();
        }
        driver.findElement(Locators.TEXT_FIELD_NICKNAME).sendKeys(generateNewNumber(Data.nickname, 5));
        driver.findElement(Locators.DROP_DOWN_LIST_SELECT_BY_DAY).click();
        driver.findElement(Locators.USERS_BIRTHDAY_SELECTED_DAY_2);

        driver.findElement(Locators.DROP_DOWN_LIST_SELECT_BY_MONTH).click();
        driver.findElement(Locators.USERS_BIRTHDAY_SELECTED_MONTH_JUNE);

        driver.findElement(Locators.DROP_DOWN_LIST_SELECT_BY_YEAR).click();
        driver.findElement(Locators.USERS_BIRTHDAY_SELECTED_YEAR_2001);

        driver.findElement(Locators.TEXT_FIELD_PHONE).sendKeys(Data.phone);
        WebElement checkboxConfirmation = driver.findElement(Locators.CHECKBOX_CONFIRMATION_BUTTON);
        //ask Alex maybe we need spit boolean method with registration test, because need comment before running
        // running search test CheckBox confirmation
//        boolean selectedCheckbox = checkboxConfirmation.isSelected();
//        System.out.println(selectedCheckbox + "!!!!!");
    }
         public void clickCheckboxConfirmation() {
         WebElement checkboxConfirmation = driver.findElement(Locators.CHECKBOX_CONFIRMATION_BUTTON);
         checkboxConfirmation.click();
    }
    public void clickLinkHomePage() {
        driver.findElement(Locators.LINK_HOME_PAGE).click();
    }
    public void clickHomePageBookNow() {
        driver.findElement(Locators.HOME_PAGE_BOOK_NOW).click();
    }
    public void clickHomePageJoinToday() {
        driver.findElement(Locators.HOME_PAGE_JOIN_TODAY).click();
    }
    public void clickHomePageSupportByEmail() {
        driver.findElement(Locators.HOME_PAGE_SUPPORT_BY_EMAIL).click();
    }
    public void clickIframeYoutube() {
        WebElement ele = driver.findElement(Locators.IFRAME_YOUTUBE);
        driver.switchTo().frame(ele);
    }
    public void clickButtonIframeYoutube() {
        driver.findElement(Locators.YOUTUBE_BUTTON_INSIDE_IFRAME_).click();

    }

}
