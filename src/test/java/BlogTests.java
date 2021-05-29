import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class BlogTests extends BaseUI {

    String currentUrlBlog;

    @Test //Homework Lesson8 / POM

    public void BlogTests() {

        blogPage.clickLinkBlog();
        currentUrlBlog = driver.getCurrentUrl();
        System.out.println(currentUrlBlog);
        Assert.assertEquals(currentUrlBlog, Data.expectedUrlBlog);
    }

      @Test   // Homework Lesson 10/did not open links
    public void testBlogLoop () {  //for iteration with BlogPage
        blogPage.clickLinkBlog();
        List<WebElement> links = driver.findElements(Locators.BLOG_MENU);
        System.out.println(links.size());
        for (int i = 0; i < links.size(); i++) {
            String info = links.get(i).getText();
            System.out.println(info);

            links.get(i).click();
            driver.get(mainUrl);
            links = driver.findElements(Locators.HOME_PAGE_MAIN_LINK);
        }

    }

    @Test   // Homework Lesson 10 // did not open links
    public void testBlogLoopForAllMenuUlList () {  //for iteration with BlogPage
        blogPage.clickLinkBlog();
        List<WebElement> links = driver.findElements(Locators.BLOG_ALL_MENU);
        System.out.println(links.size());
        for (int i = 0; i < links.size(); i++) {
            String info = links.get(i).getText();
            System.out.println(info);

            links.get(i).click();
            driver.get(mainUrl);
            links = driver.findElements(Locators.HOME_PAGE_MAIN_LINK);
        }

    }
}
