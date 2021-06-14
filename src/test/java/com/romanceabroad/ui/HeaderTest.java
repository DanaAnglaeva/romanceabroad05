package com.romanceabroad.ui;
import org.testng.annotations.Test;

import java.util.List;

public class HeaderTest extends BaseUI {

       @Test
    public void testHeaderAllLinksTestCase1 (){//tc passed
           howWeWorkPage.clickLinkHowWeWork();
           headerPage.clickHeaderDropDownMenu();
           headerPage.clickCloseSignDropDownMenu();
           headerPage.clickHeaderGiftSignIn();
           headerPage.clickHeaderTourToUkraine();
           headerPage.clickHeaderIndividualTripToUkraine();
           headerPage.clickHeaderLogoHeart();
           howWeWorkPage.clickLinkHowWeWork();
           headerPage.clickHeaderButtonFindPeople();
           headerPage.clickHeaderButtonLogin();
        }
}


