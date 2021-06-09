import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class FooterTests extends BaseUI {


    @Test //Lesson 16,17
//    (priority = 1, enabled = testCase1, groups = {"user", "admin"})

    public void testContactUsTestCase1() {
        searchPage.clickLinkSearch();
        searchPage.ajaxClick(Locators.FOOTER_TAB, 0);
        footerPage.completeContactUsForm(Data.nickname, Data.email, Data.subject, Data.message);

    }

    @Test //Lesson 14
    public void testLinksOnFooterMenu2() {
        searchPage.clickLinkSearch();
        searchPage.ajaxClick(Locators.FOOTER_TAB, 1);
        footerPage.checkLinksOnWebPage("//a", "href");
        footerPage.checkLinksOnWebPage("//li", "href");

    }

    @Test //Lesson 14
    public void testLinksOnFooterMenu3() {
        searchPage.clickLinkSearch();
        searchPage.ajaxClick(Locators.FOOTER_TAB, 2);

        List<WebElement> links = driver.findElements(Locators.BLOG_ALL_MENU);
        System.out.println(links.size());
        for (int i = 0; i < links.size(); i++) {
            String info = links.get(i).getText();
            System.out.println(info);
            links.get(i).click();
            blogPage.clickLinkBlog();
            links = driver.findElements(Locators.BLOG_ALL_MENU);
        }
    }

}


