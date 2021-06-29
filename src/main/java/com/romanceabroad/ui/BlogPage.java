package com.romanceabroad.ui;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class BlogPage extends BaseActions {

    public BlogPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public void clickLinkBlog() {
        driver.findElement(Locators.LINK_BLOG).click();
        //     driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }
    public void getListOfLinksWebElementBlogLinkByLoop() {
        List<WebElement> links = driver.findElements(Locators.LIST_OF_BLOG_LINKS);
        System.out.println(links.size());
        for (int i = 0; i < links.size(); i++) {
            String info = links.get(i).getText();
            System.out.println(info);
            links.get(i).click();
            driver.findElement(Locators.LINK_BLOG).click();
            links = driver.findElements(Locators.LIST_OF_BLOG_LINKS);
        }
    }
}
