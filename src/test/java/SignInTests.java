import org.testng.annotations.Test;

public class SignInTests extends BaseUI {

    String currentSignInForm;

    @Test
    public void SignInPage() {
        signInPage.clickSignInLink();

        currentSignInForm = driver.getCurrentUrl();
        System.out.println(currentSignInForm);
    }

    @Test
    public void SignInWebElement() {

        signInPage.clickSignInWebElement();
        signInPage.clickSignInWebElement();

    }
}

