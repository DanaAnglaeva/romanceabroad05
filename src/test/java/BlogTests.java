import org.testng.Assert;
import org.testng.annotations.Test;

public class BlogTests extends BaseUI {

    String currentUrlBlog;

    @Test //Homework Lesson8 / POM

    public void BlogTests() {

        blogPage.clickLinkBlog();

        currentUrlBlog = driver.getCurrentUrl();
        System.out.println(currentUrlBlog);
        Assert.assertEquals(currentUrlBlog, Data.expectedUrlBlog);
    }
}
