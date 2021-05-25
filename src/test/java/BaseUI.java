import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseUI {

    WebDriver driver;
    WebDriverWait wait;
    String mainUrl = "https://romanceabroad.com/";
    MainPage mainPage;
    SearchPage searchPage;
    BlogPage blogPage;
    GiftPage giftPage;
    HowWeWorkPage howWeWorkPage;
    MediaPage mediaPage;
    SignInPage signInPage;
    TourPage tourPage;
    HeaderPage headerPage;

    @BeforeMethod
    public void setUp() {

        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, 20);
        mainPage = new MainPage(driver, wait);
        searchPage = new SearchPage(driver, wait);
        blogPage = new BlogPage(driver, wait);
        giftPage = new GiftPage(driver, wait);
        howWeWorkPage = new HowWeWorkPage(driver, wait);
        mediaPage = new MediaPage(driver, wait);
        signInPage = new SignInPage(driver, wait);
        tourPage = new TourPage(driver, wait);
        headerPage = new HeaderPage(driver,wait);
        driver.manage().window().maximize();
        driver.get(mainUrl);
    }

    @AfterMethod
    public void afterActions() {
        //    driver.quit();
    }


}
