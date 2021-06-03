import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class FooterTests extends BaseUI {

    @Test //TC moved to FooterTC//Ajax.click lesson
    public void testWithAjaxByIndex() {
        searchPage.clickLinkSearch();
        searchPage.ajaxClick(Locators.FOOTER_TAB, 1);
    }
}
//    @Test
//
//    public void FooterTest (){
//        howWeWorkPage.clickLinkHowWeWork();
//        footerPage.clickFooterHelpContactUs();
//        footerPage.clickFooterHelpSiteMap();
//        footerPage.clickFooterAboutHowItWorks();
//        footerPage.clickFooterAboutNews();
//        footerPage.clickFooterPolicyPrivacy();
//        footerPage.clickFooterPolicyTermsOfUse();
//        footerPage.clickFooterOnlineAdvertisingLink();
//    }

