package com.romanceabroad.ui;

import com.automation.remarks.testng.VideoListener;
import com.automation.remarks.video.annotations.Video;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(VideoListener.class)

public class MediaTests extends BaseUI {

    String currentUrlMedia;

       @Test
       @Video(name = "Media test" )

    public void testGetLinkMediaAssertEqualTestCase1() {
        wait.until(ExpectedConditions.elementToBeClickable(Locators.LINK_MEDIA));
        mediaPage.clickLinkMedia();
        mediaPage.javaWait(5);
        currentUrlMedia = driver.getCurrentUrl();
        System.out.println(currentUrlMedia);
        Assert.assertEquals(currentUrlMedia, Data.expectedUrlMedia);
       }
}




