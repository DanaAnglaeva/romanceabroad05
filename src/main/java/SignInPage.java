import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SignInPage extends BaseActions {
    int indexLinkSignIn = 0;

    public SignInPage(WebDriver driver, WebDriverWait wait) {

        super(driver, wait);
    }

    public void clickSignInLink() {
        driver.findElements(Locators.LINK_SIGN_IN).get(indexLinkSignIn).click();
    }

    public void clickSignInWebElement() {
        WebElement element = driver.findElement(Locators.LINK_SIGN_IN);
    }

    public void clickLinkSignInWebElement() {
        driver.findElements(Locators.LINK_SIGN_IN).get(indexLinkSignIn).click();
    }

}



