import org.testng.annotations.Test;

public class HeaderTest extends BaseUI {

       @Test
    public void testHeader (){
           howWeWorkPage.clickLinkHowWeWork();
           headerPage.clickHeaderDropDownMenu();
           headerPage.clickCloseHeaderDropDownMenu();
           headerPage.clickHeaderGigtSignIn();
           headerPage.clickHeaderTourToUkrain();
           headerPage.clickHeaderIndividualTripToUkraine();
           headerPage.clickHeadrlerLogoHeart();
           howWeWorkPage.clickLinkHowWeWork();
           headerPage.clickHeaderButtonFindPeople();
           headerPage.clickHeaderButtonLogin();


        }

    }

