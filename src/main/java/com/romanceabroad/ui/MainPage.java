package com.romanceabroad.ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class MainPage extends BaseActions {

    @FindBy(xpath = "//button[@id='show-registration-block']")
    WebElement registrationButton;

    public MainPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public void clickJoinButton() {

        Reports.log("Click Button Registration");
        registrationButton.click();
    }

    public void javaWait(int ms) {
        System.out.println("Child!!!");
        try {
            Thread.sleep(ms);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void completeFirstPartOfRegistration(String email, String password) {

        //     Reports.log("Wait email text field");
        //      driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
        javaWaitSec(3);
        Reports.log("Type email text field: " + email);
        driver.findElement(Locators.TEXT_FIELD_EMAIL).sendKeys(email);

        Reports.log("Wait password text field");
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(Locators.TEXT_FIELD_PASSWORD)));

        Reports.log("Type password in text field: " + password);
        driver.findElement(Locators.TEXT_FIELD_PASSWORD).sendKeys(password);

    }

    public void clickNextButton() {

        Reports.log("Wait Next Button");
        driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
        wait.until(ExpectedConditions.elementToBeClickable(Locators.BUTTON_NEXT));

        Reports.log("Click Next Button");
        driver.findElement(Locators.BUTTON_NEXT).click();
        try {
            driver.findElement(Locators.BUTTON_NEXT).click();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void completeSecondPartOfRegistration(String nickname, String phone, String month, String day, String year,
                                                 String city, String location) {

        Reports.log("Type nickname: " + nickname);
        driver.findElement(Locators.TEXT_FIELD_NICKNAME).sendKeys(nickname);

        Reports.log("Click list of days");
        driver.findElement(Locators.LIST_OF_DAYS).click();

        Reports.log("Select specific day: " + day);
        clickValueOfLists(Locators.LIST_OF_VALUE_DAY, day);

        Reports.log("Click list of month");
        driver.findElement(Locators.LIST_OF_MONTHS).click();

        Reports.log("Select specific month: " + month);
        clickValueOfLists(Locators.LIST_OF_VALUE_MONTH, month);

        Reports.log("Click list of years");
        driver.findElement(Locators.LIST_OF_YEARS).click();

        Reports.log("Select specific year: " + year);
        clickValueOfLists(Locators.LIST_OF_VALUE_YEAR, year);

        Reports.log("Type phone number: " + phone);
        driver.findElement(Locators.TEXT_FIELD_PHONE).sendKeys(phone);

        Reports.log("Select confirmation checkbox");
        driver.findElement(Locators.CHECKBOX_CONFIRMATION_BUTTON).click();

        Reports.log("Clean location autofilling form");
        driver.findElement(Locators.AUTOFILLING_FORM_LOCATION).clear();

        Reports.log("Type city: " + city);
        driver.findElement(Locators.AUTOFILLING_FORM_LOCATION).sendKeys(city);

        Reports.log("Wait list of locations");
        driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);

        Reports.log("Type user location: " + location);
        clickValueOfLists(Locators.LIST_OF_VALUE_LOCATION, location);
    }

    public void clickLinkHomePage() {
        driver.findElement(Locators.LINK_HOME_PAGE).click();
    }

    public void clickHomePageBookNow() {
        driver.findElement(Locators.HOME_PAGE_BOOK_NOW).click();
    }

    public void clickHomePageLinkJoinToday() {
        driver.findElement(Locators.HOME_PAGE_LINK_JOIN_TODAY).click();
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

    public int verifyIframeYoutubeSize() {
        int size = driver.findElements(By.xpath("//iframe")).size();
        System.out.println(size + "" + "iFrame number");
        return size;
    }

    public void clickMobileMenu(String valueOfBox) {
        if (valueOfBox.contains("mobile")) {
            driver.findElement(Locators.MOBILE_MENU).click();
        }
    }

    public void clickSearchParameters(String valueOfBox) {
        if (valueOfBox.contains("mobile")) {
            driver.findElement(Locators.MOBILE_LINK_SEARCH_PARAMETERS).click();
        }
    }
    public void clickMobileMenu() {
        try {
            driver.findElement(Locators.MOBILE_MENU).click();
        } catch (Exception e) {

        }
    }

    public void clickMobileMenu2() {
        if (driver.findElement(Locators.MOBILE_MENU).isDisplayed()) {
            driver.findElement(Locators.MOBILE_MENU).click();
        }
    }

    public void clickMobileMenu3() {
        if (driver.findElements(Locators.MOBILE_MENU).size() > 0) {
            driver.findElement(Locators.MOBILE_MENU).click();
        }
    }
}







