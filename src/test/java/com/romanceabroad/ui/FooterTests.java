package com.romanceabroad.ui;

import org.testng.annotations.Test;

public class FooterTests extends BaseUI {


    @Test //Lesson 16,17 tc passed
    public void testContactUsTestCase1() {
        searchPage.clickLinkSearch();
        searchPage.ajaxClick(Locators.FOOTER_TAB, 0);
        footerPage.completeContactUsForm(Data.nickname, Data.email, Data.subject, Data.message);

    }

}


