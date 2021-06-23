package com.romanceabroad.ui;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class FooterTests extends BaseUI {


    @Test
    public void testFooterLoopWithCompletedContactUsFormTestCase1() {

        howWeWorkPage.clickLinkHowWeWork();
        howWeWorkPage.ajaxClick(Locators.FOOTER_TAB);

        WebElement footerTab = driver.findElement(Locators.FOOTER_LINKS);
        if (driver.findElement(Locators.FOOTER_LINKS).getText().contains("Contact us")) {
            footerTab.click();
        } else {
            footerPage.completeContactUsForm(Data.nickname, Data.email, Data.subject, Data.message);
        }driver.navigate().back();
        mainPage.javaWait(3);
        howWeWorkPage.ajaxClick(Locators.FOOTER_TAB);
        List<WebElement> links = driver.findElements(Locators.FOOTER_TAB);
        System.out.println(links.size());

        for (int i = 0; i < links.size(); i++) {
            String info = links.get(i).getText();
            System.out.println(info);
            driver.navigate().back();

            howWeWorkPage.ajaxClick(Locators.FOOTER_TAB);
            links = driver.findElements(Locators.FOOTER_LINKS);

        }
    }



    @Test
    public void testCheckAllFooterLinksWithLoopTestCase2() {

        howWeWorkPage.clickLinkHowWeWork();
        howWeWorkPage.ajaxClick(Locators.FOOTER_TAB);
        List<WebElement> links = driver.findElements(Locators.FOOTER_LINKS);
        System.out.println(links.size());

        for (int i = 0; i < links.size(); i++) {
            String info = links.get(i).getText();
            System.out.println(info);
            driver.navigate().back();

            howWeWorkPage.ajaxClick(Locators.FOOTER_TAB);
            links = driver.findElements(Locators.FOOTER_LINKS);

        }
    }
}


