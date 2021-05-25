import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class SignInTests extends BaseUI {

    String currentSignInForm;
    int indexLinkSignIn = 0;

    @Test
    public void SignInPage() {
        driver.findElements(Locators.LINK_SIGN_IN).get(indexLinkSignIn).click();
        currentSignInForm = driver.getCurrentUrl();
        System.out.println(currentSignInForm);
    }

    @Test
    public void SignInWebElement() {

        //  in some test cases we can to collect many Web elements and after use it;
        //   WebElement element = driver.findElement(LINK_SIGN_IN);
        //  driver.findElement(LINK_SIGN_IN).click(); //for one element

        //for many elements
        WebElement element = driver.findElement(Locators.LINK_SIGN_IN);
        driver.findElements(Locators.LINK_SIGN_IN).get(indexLinkSignIn).click();

//        WebElement linkSignIn = driver.findElement(LINK_SIGN_IN);
//        linkSignIn.click();
    }
}

