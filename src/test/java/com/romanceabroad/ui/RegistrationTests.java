package com.romanceabroad.ui;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RegistrationTests extends BaseUI {

    public static final boolean testCase1 = true;
    public static final boolean testCase2 = false;
    public static final boolean testCase3 = false;
    public static final boolean testCase4 = false;
    public static final boolean testCase5 = false;
    public static final boolean testCase6 = false;

    @Test(priority = 1, enabled = testCase1, groups = {"user", "admin"})
     public void testRegistrationTestCase1() {
        wait.until(ExpectedConditions.elementToBeClickable(Locators.BUTTON_REGISTRATION));
        mainPage.clickJoinButton();
        mainPage.completeFirstPartOfRegistration(Data.email, Data.password);
        mainPage.clickNextButton();

        mainPage.completeSecondPartOfRegistration(mainPage.generateNewNumber(Data.nickname, 5), Data.phone,
                Data.day, Data.month, Data.year, Data.city, Data.location);
    }

    @Test(priority = 1, enabled = testCase2, groups = {"user", "admin"})
    public void testCheckboxConfirmationTestIfSelectedTestCase2() {
        mainPage.clickJoinButton();
        mainPage.completeFirstPartOfRegistration(Data.email, Data.password);
        mainPage.clickNextButton();
        mainPage.completeSecondPartOfRegistration(mainPage.generateNewNumber(Data.nickname, 5),
                Data.phone, Data.day, Data.month, Data.year, Data.city, Data.location);
        WebElement checkbox = driver.findElement((Locators.CHECKBOX_CONFIRMATION_BUTTON));
        if (!checkbox.isSelected()) {
            checkbox.click();
        }
    }

    @Test(priority = 2, enabled = testCase3, groups = {"user", "admin", "ie"})

    public void testWebElementIfCheckboxIsSelectedTestCase3() {
        mainPage.clickJoinButton();
        mainPage.completeFirstPartOfRegistration(Data.email, Data.password);
        mainPage.clickNextButton();
        mainPage.completeSecondPartOfRegistration(mainPage.generateNewNumber(Data.nickname, 5), Data.phone,
                Data.day, Data.month, Data.year, Data.city, Data.location);
        WebElement checkbox = driver.findElement((Locators.CHECKBOX_CONFIRMATION_BUTTON));

        if (checkbox.isSelected()) {
            System.out.println("Checkbox is selected!");
        }
    }

    @Test(priority = 3, enabled = testCase4, groups = {"user", "admin", "ie"})

    public void testWebElementIfCheckboxIsNotSelectedAssertFailTestCase4() {
        mainPage.clickJoinButton();
        mainPage.completeFirstPartOfRegistration(Data.email, Data.password);
        mainPage.clickNextButton();
        mainPage.completeSecondPartOfRegistration(mainPage.generateNewNumber(Data.nickname, 5),
                Data.phone, Data.day, Data.month, Data.year, Data.city, Data.location);
         WebElement checkboxConfirmation = driver.findElement(Locators.CHECKBOX_CONFIRMATION_BUTTON);
        if (checkboxConfirmation.isSelected()) {
            checkboxConfirmation.click();
        } else {
            Assert.fail("Checkbox is already selected");
        }
    }

    @Test(priority = 3, enabled = testCase5, groups = {"user", "admin", "ie"})
     public void testWebElementAssertTrueTestCase5() {
        mainPage.clickJoinButton();
        mainPage.completeFirstPartOfRegistration(Data.email, Data.password);
        mainPage.clickNextButton();
        mainPage.completeSecondPartOfRegistration(mainPage.generateNewNumber(Data.nickname, 5),
                Data.phone, Data.day, Data.month, Data.year, Data.city, Data.location);
         WebElement checkboxConfirmation = driver.findElement((Locators.CHECKBOX_CONFIRMATION_BUTTON));
        if (!driver.findElement(Locators.LINK_SEARCH).isSelected()) {
            checkboxConfirmation.click();
        } else {
            Assert.fail("Checkbox is already selected");
        }
    }

     @Test(dataProvider = "Registration", dataProviderClass = DataProviders.class)
    public void testRegistrationTestCase6(String email, String password, String day, String month, String year,
                                          String phone, String city, String location) {

        mainPage.clickJoinButton();
        mainPage.completeFirstPartOfRegistration(email, password);
        mainPage.clickNextButton();
        mainPage.completeSecondPartOfRegistration(mainPage.generateNewNumber(Data.nickname, 5), phone,
                month, day, year, city, location);
    }

    @Test(priority = 3, enabled = testCase6, groups = {"user", "admin"},
            dataProvider = "Registration3", dataProviderClass = DataProviders.class)
    public void testRegistrationNegativeTestCase6(String email, String password, boolean requirement) {

        mainPage.clickJoinButton();
        mainPage.completeFirstPartOfRegistration(email, password);
        if (!requirement) {
            Assert.assertTrue(driver.findElement
                    (Locators.TOOLTIP_ERROR).isDisplayed());
        } else {
            mainPage.clickNextButton();
            mainPage.completeSecondPartOfRegistration(Data.nickname, Data.phone,
                    Data.month, Data.day, Data.year, Data.city, Data.location);
        }
    }
     @Test(dataProvider = "RegistrationContactUs", dataProviderClass = DataProviders.class)
    public void testContactUsTestCase7(String name, String email, String subject, String message) {
        searchPage.clickLinkSearch();
        searchPage.ajaxClick(Locators.FOOTER_TAB, 0);
        footerPage.completeContactUsForm(name, email, subject, message);
    }

     @Test(dataProvider = "SignUpUserRegistrationForm", dataProviderClass = DataProviders.class)
    public void signUpUserRegistrationFormTestCase8(String email, String username, String password, String day, String month,
                                                    String year, String phone, String city, String location) {
        howWeWorkPage.clickLinkHowWeWork();
        headerPage.clickHeaderLeftDropDownMenu();
        headerPage.clickSignUpForm();
        headerPage.completeFullSignUpRegistrationForm(email, username, password, day, month, year,
                phone, city, location);
        headerPage.checkBoxNewsIsSelected();
        headerPage.checkBoxTermsIsSelected();
        WebElement checkboxTerms = driver.findElement(Locators.CHECKBOX_TERMS_AND_CONDITIONS);

        if (!checkboxTerms.isSelected()) {
            driver.findElement(Locators.LINK_TERMS_AND_CONDITIONS).click();
            System.out.println("Checkbox is not selected. Terms and conditions link is opened.");
        }
    }

     @Test(dataProvider = "Registration2", dataProviderClass = DataProviders.class)
    public void testRegistration9(String email, String nickname, boolean requirement) {
        System.out.println(email);

        mainPage.clickJoinButton();
        mainPage.completeFirstPartOfRegistration(email, Data.password);

        if (!requirement) {
            Assert.assertTrue(driver.findElement
                    (Locators.TOOLTIP_ERROR).isDisplayed());
        } else {
            mainPage.clickNextButton();
            mainPage.completeSecondPartOfRegistration(nickname, Data.phone,
                    Data.month, Data.day, Data.year, Data.city, Data.location);
        }
    }

}












