import org.testng.Assert;
import org.testng.annotations.Test;

public class HowWeWorkTests extends BaseUI {

    String currentUrlHowWeWork;

    @Test //use boolean for homework 30min move mouse action and drop down select to Base class;

    public void testHowWeWorkPage() {
        howWeWorkPage.clickLinkHowWeWork();

        currentUrlHowWeWork = driver.getCurrentUrl();
        System.out.println(currentUrlHowWeWork);
        Assert.assertEquals(currentUrlHowWeWork, Data.expectedUrlHowWeWork);
    }

}


