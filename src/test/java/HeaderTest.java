import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class HeaderTest extends BaseUI {

       @Test
    public void testHeader (){
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
        @Test //need fix

    public void test9LoopTestCase6() {  //for iteration   //test have moved to Registration test /  Lesson 9,16
        tourPage.clickLinkTourPage();
        headerPage.clickHeaderDropDownMenu();
 //       headerPage.clickHeaderLeftDropDownMenu();

        List<WebElement> links = driver.findElements(Locators.HEADER_LEFT_DROPDOWN_MENU);
        System.out.println(links.size());
        for (int i = 0; i < links.size(); i++) {
            String info = links.get(i).getText();
            System.out.println(info);

            links.get(i).click();
            driver.get(mainUrl);
            tourPage.clickLinkTourPage();
            headerPage.clickHeaderDropDownMenu();
            links = driver.findElements(Locators.HEADER_LEFT_DROPDOWN_MENU);
        }
    }

}


