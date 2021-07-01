package com.romanceabroad.ui;

import com.automation.remarks.testng.VideoListener;
import com.automation.remarks.video.annotations.Video;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners (VideoListener.class)

public class RegistrationTests2 extends BaseUI {

    public static final boolean testCase1 = true;

    @Video(name = "Registration test" )
    @Test(priority = 1, enabled = testCase1, groups = {"user", "admin"})
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
