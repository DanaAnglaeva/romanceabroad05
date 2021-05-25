import org.testng.Assert;
import org.testng.annotations.Test;

public class MediaTests extends BaseUI {

    String currentUrlMedia;

    @Test
    public void testLinkMedia() {
        mediaPage.clickLinkMedia();

        currentUrlMedia = driver.getCurrentUrl();
        System.out.println(currentUrlMedia);
        Assert.assertEquals(currentUrlMedia, Data.expectedUrlMedia);

        //add test case and boolean
    }
}
