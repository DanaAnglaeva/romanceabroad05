import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

public class BlogTests extends BaseUI {

    String currentUrlBlog;
    @Test
    public void testBlogPage() {

        driver.findElement(Locators.LINK_BLOG).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        currentUrlBlog = driver.getCurrentUrl();
        System.out.println(currentUrlBlog);
        Assert.assertEquals(currentUrlBlog, Data.expectedUrlBlog);
    }

    @Test //added implicit wait for homework / Lesson7
    public void testBlogPage1() {
        driver.findElement(Locators.LINK_BLOG).click();
    }


}
