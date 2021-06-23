package com.romanceabroad.ui;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class HeaderTest extends BaseUI {

       @Test
       public void testHeaderAllLinksTestCase1() {

              howWeWorkPage.clickLinkHowWeWork();
              howWeWorkPage.ajaxClick(Locators.HEADER_ALL_LINKS);
              List<WebElement> links = driver.findElements(Locators.LIST_OF_HEADER_LINKS);
              System.out.println(links.size());

              for (int i = 0; i < links.size(); i++) {
                     String info = links.get(i).getText();
                     System.out.println(info);

                     howWeWorkPage.clickLinkHowWeWork();
                     howWeWorkPage.ajaxClick(Locators.HEADER_ALL_LINKS);
                     links = driver.findElements(Locators.LIST_OF_HEADER_LINKS);

              }
       }
}



