package com.romanceabroad.ui;
import org.testng.annotations.Test;

public class HeaderTest extends BaseUI {

       @Test
       public void testHeaderAllLinksTestCase1() {

              howWeWorkPage.clickLinkHowWeWork();
              howWeWorkPage.ajaxClick(Locators.HEADER_ALL_LINKS);
       }
}



