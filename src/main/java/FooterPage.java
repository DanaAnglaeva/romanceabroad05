import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class FooterPage extends BaseActions {
    public FooterPage(WebDriver driver, WebDriverWait wait) {

        super(driver, wait);

    }

    public void clickFooterHelpContactUs() {
        driver.findElement(Locators.FOOTER_CONTACT_US).click();
    }

    public void completeContactUsForm(String nickname, String email, String subject, String message) {
        driver.findElement(Locators.CONTACT_US_TECH_QUESTIONS).click();
        driver.findElement(Locators.CONTACT_US_USER_NAME_FIELD).sendKeys(nickname);
        driver.findElement(Locators.CONTACT_US_USER_EMAIL_FIELD).sendKeys(email);
        driver.findElement(Locators.CONTACT_US_SUBJECT_FIELD).sendKeys(subject);
        driver.findElement(Locators.CONTACT_US_MESSAGE_FIELD).sendKeys(message);
        //driver.findElement(Locators.CONTACT_US_SEND_FORM).click();
    }
    public void clickFooterSiteMapLinkMenu () {
            driver.findElement(Locators.FOOTER_SITE_MAP_LINK_MENU).click();
        }
    }

