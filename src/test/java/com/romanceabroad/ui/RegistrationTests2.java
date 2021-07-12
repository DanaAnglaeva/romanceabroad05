package com.romanceabroad.ui;

import com.automation.remarks.testng.VideoListener;
import com.automation.remarks.video.annotations.Video;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners (VideoListener.class)

public class RegistrationTests2 extends BaseUI {

//     @Test(dataProvider = "Registration2", dataProviderClass = DataProviders.class)
//    public void testRegistration9(String email, String nickname) {
//        System.out.println(email);
//
//        mainPage.clickJoinButton();
//        mainPage.completeFirstPartOfRegistration(email, Data.password);
//
//    }
//   // @Video(name = "Registration test" )
    @Test()
    public void testRegistrationTestCase1() {

        wait.until(ExpectedConditions.elementToBeClickable(Locators.BUTTON_REGISTRATION));
        mainPage.clickJoinButton();
        mainPage.completeFirstPartOfRegistration(Data.email, Data.password);
        wait.until(ExpectedConditions.elementToBeClickable(Locators.BUTTON_NEXT));
        mainPage.clickNextButton();
        mainPage.completeSecondPartOfRegistration(mainPage.generateNewNumber(Data.nickname, 5), Data.phone,
                Data.day, Data.month, Data.year, Data.city, Data.location);
    }
}
