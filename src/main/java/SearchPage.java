import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchPage extends BaseActions {

    public SearchPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }
    public void clickLinkSearch() {
        driver.findElement(Locators.LINK_SEARCH).click();
    }
    public void getDropDownListByDefault() {
        getDropDownListByText(Locators.DROP_DOWN_LIST_SORT_BY, "Default");
    }
    public void getDropDownListByViews() {
        getDropDownListByText(Locators.DROP_DOWN_LIST_SORT_BY, "Views");
    }
    public void getDropDownListByName() {
        getDropDownListByText(Locators.DROP_DOWN_LIST_SORT_BY, "Name");
    }
     public void getDropDownListByRegistrationDate() {
         getDropDownListByText(Locators.DROP_DOWN_LIST_SORT_BY, "Registration date");
    }
    public void clickButtonSearchByAge() {
        driver.findElement(Locators.BUTTON_SEARCH_BY_AGE).click();
    }
}