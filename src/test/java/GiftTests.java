import org.testng.Assert;
import org.testng.annotations.Test;

public class GiftTests extends BaseUI {

    String currentUrlGift;

    @Test
    public void testGiftPage() {
        driver.findElement(Locators.LINK_GIFT).click();
        currentUrlGift = driver.getCurrentUrl();
        System.out.println(currentUrlGift);
        Assert.assertEquals(currentUrlGift, Data.expectedUrlGift);

    }

    @Test    // Homework Lesson 4
    public void testGiftSearch() {
        driver.findElement(Locators.LINK_GIFT).click();
        driver.findElement(Locators.GIFT_SEARCH_FIELD).sendKeys(Data.searchGift);
        driver.findElement(Locators.BUTTON_GIFT_SEARCH).click();

        //: Use SendKeys and boolean if/else
    }
}
