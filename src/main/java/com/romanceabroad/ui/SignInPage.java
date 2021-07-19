package com.romanceabroad.ui;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class SignInPage extends BaseActions {
    int indexLinkSignIn = 0;

    public SignInPage(WebDriver driver, WebDriverWait wait) {

        super(driver, wait);
    }
    public void clickLinkSignInWebElement() {
        driver.findElements(Locators.LINK_SIGN_IN).get(indexLinkSignIn).click();
    }

    public void completeSignInRegistrationForm() {
        driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
        driver.findElement(Locators.SIGN_IN_EMAIL_FIELD).sendKeys("tester123@gmail.com");
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(Locators.SIGN_IN_PASSWORD_FIELD)));
        driver.findElement(Locators.SIGN_IN_PASSWORD_FIELD).sendKeys("123456");
        wait.until(ExpectedConditions.elementToBeClickable(Locators.SIGN_IN_BUTTON));
    }
        public void clickSignInButton() {
            driver.findElement(Locators.SIGN_IN_BUTTON).click();
    }
        public void clickLinkRegister() {
            driver.findElement(Locators.LINK_REGISTER).click();
    }
        public void clickRegistrationWithFacebook() {
            driver.findElement(Locators.SIGN_IN_WITH_FACEBOOK).click();
    }
        public void clickLinkForgotPassword() {
            driver.findElement(Locators.LINK_FORGOT_PASSWORD).click();
    }

        public void RestoreUserPassword() {
        driver.findElement(Locators.RESTORE_PASSWORD_EMAIL_FIELD).sendKeys(Data.email);
        driver.findElement(Locators.RESTORE_PASSWORD_BUTTON_SAVE).click();
    }
}



