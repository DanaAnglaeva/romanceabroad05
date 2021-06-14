package com.romanceabroad.ui;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HeaderPage extends BaseActions {
        public HeaderPage(WebDriver driver, WebDriverWait wait) {

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
            driver.findElement(Locators.HEADER_INDIVIDUAL_TRIP_TO_UKRAINE).click();
        }

        public void clickHeaderLogoHeart() {
            driver.findElement(Locators.HEADER_ROMANCE_LOGO_HEART).click();
        }

        public void clickHeaderButtonFindPeople() {
            driver.findElement(Locators.HEADER_BUTTON_FIND_PEOPLE).click();
        }

        public void clickHeaderButtonLogin() {
            driver.findElement(Locators.HEADER_BUTTON_LOGIN).click();
        }

        public void clickHeaderLeftDropDownMenu() {
            driver.findElement(Locators.HEADER_LEFT_DROPDOWN_MENU).click();
        }

        public void clickSignUpForm() {
            driver.findElement(Locators.HEADER_SIGN_UP_FORM_LINK).click();
        }

        public void completeFullSignUpRegistrationForm(String email, String username, String password, String day,
                                              String month, String year, String phone, String city, String location) {

       //     driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
            driver.findElement(Locators.SIGN_UP_USER_EMAIL_FIELD).sendKeys(email);
            driver.findElement(Locators.SIGN_UP_USERNAME_FIELD).sendKeys(username);
            driver.findElement(Locators.SIGN_UP_USER_PASSWORD_FIELD).sendKeys(password);
            driver.findElement(Locators.SIGN_UP_LIST_OF_VALUE_DAY).sendKeys(day);
            driver.findElement(Locators.SIGN_UP_LIST_OF_VALUE_MONTH).sendKeys(month);
            driver.findElement(Locators.SIGN_UP_LIST_OF_VALUE_YEAR).sendKeys(year);
            driver.findElement(Locators.SIGN_UP_USER_PHONE_FIELD).sendKeys(phone);
            driver.findElement(Locators.SIGN_UP_USER_LOCATION_FIELD);
            driver.findElement(Locators.SIGN_UP_USER_LOCATION_FIELD).clear();
            driver.findElement(Locators.SIGN_UP_USER_LOCATION_FIELD).sendKeys(city);
            clickValueOfLists(Locators.LIST_OF_VALUE_LOCATION, location);
        }
        public void checkBoxNewsIsSelected() {
            WebElement checkboxNews = driver.findElement(Locators.CHECKBOX_LATEST_NEWS);
            checkboxNews.click();
        }
        public void checkBoxTermsIsSelected() {
            WebElement checkboxTerms = driver.findElement(Locators.CHECKBOX_TERMS_AND_CONDITIONS);
        }

        public void SignUpButtonRegister() {
            driver.findElement(Locators.SIGN_UP_BUTTON_REGISTER).click();
        }

    }
