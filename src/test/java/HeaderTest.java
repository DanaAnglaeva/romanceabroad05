import org.testng.annotations.Test;

public class HeaderTest extends BaseUI {

       @Test
    public void testHeader (){
           howWeWorkPage.clickLinkHowWeWork();
           headerPage.clickHeaderDropDownMenu();
           headerPage.clickCloseSignDropDownMenu();
           headerPage.clickHeaderGigtSignIn();
           headerPage.clickHeaderTourToUkrain();
           headerPage.clickHeaderIndividualTripToUkraine();
           headerPage.clickHeaderLogoHeart();
           howWeWorkPage.clickLinkHowWeWork();
           headerPage.clickHeaderButtonFindPeople();
           headerPage.clickHeaderButtonLogin();


        }

    }

