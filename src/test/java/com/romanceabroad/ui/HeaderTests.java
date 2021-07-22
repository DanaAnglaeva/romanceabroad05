package com.romanceabroad.ui;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class HeaderTests extends BaseUI {

       @Test
       public void testHeaderAllLinksTestCase1() {

              howWeWorkPage.clickLinkHowWeWork();
              howWeWorkPage.ajaxClick(Locators.HEADER_ALL_LINKS);
       }

       @Test
       public void clickHeaderDropDownMenuWithSoftAssertionTestCase2 () {
              howWeWorkPage.clickLinkHowWeWork();
              driver.findElement(Locators.HEADER_DROPDOWN_MENU).click();

              List<WebElement> links = driver.findElements(Locators.HEADER_LINKS_OF_DROPDOWN_MENU);
              System.out.println(links.size());

              for (int i = 0; i < links.size(); i++) {
                     String info = links.get(i).getText();
                     System.out.println(info);

                     links.get(i).click();
                     links = driver.findElements(Locators.HEADER_LINKS_OF_DROPDOWN_MENU);
              }

       }
}





