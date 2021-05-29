import org.testng.annotations.Test;

public class SignInTests extends BaseUI {

    String currentSignInForm;

    @Test
    public void SignInPageAssertion() {
        signInPage.clickLinkSignInWebElement();
        currentSignInForm = driver.getCurrentUrl();
        System.out.println(currentSignInForm);
    }

    @Test
    public void FirsSignInWebElementRegistrationForm() {
        signInPage.clickLinkSignInWebElement();
        signInPage.completeSignInRegistrationForm();
        signInPage.clickSignInButton();
    }

    @Test
    public void NewUserSignInWebElementRegistrationForm() {
        signInPage.clickLinkSignInWebElement();
        signInPage.completeSignInRegistrationForm();
        signInPage.clickSignInButton();
        signInPage.clickLinkRegister();
    }

    @Test
    public void SignInWebElementRegistrationWithFacebook() {
        signInPage.clickLinkSignInWebElement();
        signInPage.completeSignInRegistrationForm();
        signInPage.clickSignInButton();
        signInPage.clickRegistrationWithFacebook();
    }

    @Test
    public void SignInWebElementRestoreUsersPasword() {
        signInPage.clickLinkSignInWebElement();
        signInPage.completeSignInRegistrationForm();
        signInPage.clickLinkForgotPassword();
        signInPage.RestoreUserPassword();
    }
}

