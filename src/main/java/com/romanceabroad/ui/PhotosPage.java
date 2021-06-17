package com.romanceabroad.ui;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PhotosPage extends BaseActions {

    public PhotosPage(WebDriver driver, WebDriverWait wait) {

        super(driver, wait);
    }

    public void clickLinkMedia() {
        driver.findElement(Locators.LINK_MEDIA).click();
    }
        public void clickButtonSearch () {
            driver.findElement(Locators.BUTTON_SEARCH).click();
    }
}


