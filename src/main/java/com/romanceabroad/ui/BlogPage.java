package com.romanceabroad.ui;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BlogPage extends BaseActions {

    public BlogPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public void clickLinkBlog() {
        driver.findElement(Locators.LINK_BLOG).click();
        //     driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

}
