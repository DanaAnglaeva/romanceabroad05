package com.romanceabroad.ui;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SignInTests extends BaseUI {

    String currentSignInForm;

    @Test

    public void SignInPageAssertionTestCase1() {
        signInPage.clickLinkSignInWebElement();
        currentSignInForm = driver.getCurrentUrl();
        System.out.println(currentSignInForm);
    }

    @Test
    public void FirsSignInWebElementRegistrationFormTestCase2() {
        signInPage.clickLinkSignInWebElement();
        signInPage.completeSignInRegistrationForm();
        signInPage.clickSignInButton();
    }

    @Test
    public void NewUserSignInWebElementRegistrationFormTestCase3() {
        signInPage.clickLinkSignInWebElement();
        signInPage.completeSignInRegistrationForm();
        signInPage.clickSignInButton();
        signInPage.clickLinkRegister();
    }

    @Test
    public void SignInWebElementRegistrationWithFacebookTestCase4() {
        signInPage.clickLinkSignInWebElement();
        signInPage.completeSignInRegistrationForm();
        signInPage.clickSignInButton();
        signInPage.clickRegistrationWithFacebook();
    }

    @Test
    public void SignInWebElementRestoreUsersPasswordTestCase5() {
        signInPage.clickLinkSignInWebElement();
        signInPage.completeSignInRegistrationForm();
        signInPage.clickLinkForgotPassword();
        signInPage.RestoreUserPassword();
    }

    @Test(dataProvider = "NewRequirementsForPassword", dataProviderClass = DataProviders.class)

        public void password(String password, boolean requirement) {

        signInPage.clickLinkSignInWebElement();
        mainPage.fillingPasswordForSignInFormUsingDataProvider(password);
          if (!requirement){
            Assert.assertTrue(driver.findElement(Locators.ALERT_WRONG_PASSWORD).isDisplayed());
        }
    }
}


