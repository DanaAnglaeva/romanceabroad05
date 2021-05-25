import okhttp3.internal.http2.Header;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HeaderPage extends BaseActions {
    public HeaderPage(WebDriver driver, WebDriverWait wait){

        super(driver, wait);
    }

    public void clickHeaderDropDownMenu (){
        driver.findElement(Locators.HEADER_DROP_DOWN_MENU).click();
        






    }


}
