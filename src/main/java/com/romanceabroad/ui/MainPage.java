package com.romanceabroad.ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class MainPage extends BaseActions {

    public MainPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public void clickJoinButton() {
        driver.findElement(Locators.BUTTON_REGISTRATION).click();
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
        driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
        driver.findElement(Locators.TEXT_FIELD_EMAIL).sendKeys(email);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(Locators.TEXT_FIELD_PASSWORD)));
        driver.findElement(Locators.TEXT_FIELD_PASSWORD).sendKeys(password);

    }
    public void clickNextButton() {
        wait.until(ExpectedConditions.elementToBeClickable(Locators.BUTTON_NEXT));
        driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
        driver.findElement(Locators.BUTTON_NEXT).click();
        try {
            driver.findElement(Locators.BUTTON_NEXT).click();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void completeSecondPartOfRegistration(String nickname, String phone, String month, String day, String year,
                                                 String city, String location) {

        driver.findElement(Locators.TEXT_FIELD_NICKNAME).sendKeys(nickname);

        driver.findElement(Locators.LIST_OF_DAYS).click();
        clickValueOfLists(Locators.LIST_OF_VALUE_DAY, day);

        driver.findElement(Locators.LIST_OF_MONTHS).click();
        clickValueOfLists(Locators.LIST_OF_VALUE_MONTH, month);

        driver.findElement(Locators.LIST_OF_YEARS).click();
        clickValueOfLists(Locators.LIST_OF_VALUE_YEAR, year);

        driver.findElement(Locators.TEXT_FIELD_PHONE).sendKeys(phone);
        driver.findElement(Locators.CHECKBOX_CONFIRMATION_BUTTON).click();

        driver.findElement(Locators.AUTOFILLING_FORM_LOCATION).clear();
        driver.findElement(Locators.AUTOFILLING_FORM_LOCATION).sendKeys(city);
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
}


