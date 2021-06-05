import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class BlogPage extends BaseActions {

    public BlogPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public void clickLinkBlog() {

        driver.findElement(Locators.LINK_BLOG).click();
   //     driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

    }
}
