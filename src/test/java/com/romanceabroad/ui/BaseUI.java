package com.romanceabroad.ui;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.asserts.SoftAssert;

import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;


public class BaseUI<alwaysRun> {

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
    FooterPage footerPage;
    PhotosPage photosPage;
    SoftAssert softAssert = new SoftAssert();


    protected TestBox testBox;
    protected TestBrowser testBrowser;

    protected enum TestBox {
        WEB, MOBILE, SAUCE
    }

    protected enum TestBrowser {
        CHROME, FIREFOX, IE
    }

    @BeforeMethod(groups = {"user", "admin", "ie"}, alwaysRun = true)
    @Parameters({"browser", "testBox", "platform", "version", "deviceName"})

    public void setup(@Optional("chrome") String browser, @Optional("web") String box,
                      @Optional("null") String platform,
                      @Optional("null") String version, @Optional("null") String device,
                      Method method, ITestContext context) throws MalformedURLException {
        Reports.start(method.getDeclaringClass().getName() + " : " + method.getName());

        if (box.equalsIgnoreCase("web")) {
            testBox = TestBox.WEB;
        } else if (box.equalsIgnoreCase("mobile")) {
            testBox = TestBox.MOBILE;
        } else if (box.equalsIgnoreCase("sauce")) {
            testBox = TestBox.SAUCE;
        }
        if (browser.equalsIgnoreCase("chrome")) {
            testBrowser = TestBrowser.CHROME;
        } else if (browser.equalsIgnoreCase("firefox")) {
            testBrowser = TestBrowser.FIREFOX;
        } else if (browser.equalsIgnoreCase("ie")) {
            testBrowser = TestBrowser.IE;

        }
        switch (testBox) {
            case WEB:
                switch (testBrowser) {

                    case FIREFOX:
                        System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
                        driver = new FirefoxDriver();
                        break;

                    case CHROME:
                        System.out.println("Chrome");
                        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
                        driver = new ChromeDriver();
                        driver.get("chrome://settings/clearBrowserData");
                        break;
                    case IE:
                        System.setProperty("webdriver.ie.driver", "IEDriverServer.exe");
                        driver = new InternetExplorerDriver();
                        driver.manage().deleteAllCookies();
                        break;

                    default:
                        System.out.println("Default!!!");
                        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
                        driver = new ChromeDriver();
                        driver.get("chrome://settings/clearBrowserData");
                        break;
                }
                break;

            case MOBILE:
                switch (testBrowser) {
                    case CHROME:
                        System.out.println("Mobile Chrome");
                        Map<String, String> mobileEmulation = new HashMap<String, String>();
                        mobileEmulation.put("deviceName", "Galaxy S5");
                        ChromeOptions chromeOptions = new ChromeOptions();
                        chromeOptions.setExperimentalOption("mobileEmulation", mobileEmulation);
                        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
                        driver = new ChromeDriver(chromeOptions);
                        driver.get("chrome://settings/clearBrowserData");
                        break;
                }
                break;

            case SAUCE:
                DesiredCapabilities capabilities = new DesiredCapabilities();
                capabilities.setCapability("username", "oauth-dana194355-bb83a");
                capabilities.setCapability("accessKey", "50eba6c1-09ba-464d-957a-8d4bb42a1cac");
//        capabilities.setCapability("browserName", browser);
                capabilities.setCapability("platform", platform);
                capabilities.setCapability("version", version);
                capabilities.setCapability("name", method.getName());
                driver = new RemoteWebDriver(
                        //       new URL("https://oauth-dana194355-bb83a:50eba6c1-09ba-464d-957a-8d4bb42a1cac@ondemand.us-west-1.saucelabs.com:443/wd/hub"),
                        new URL("https://" + System.getenv("SAUCE_USERNAME") + ":" + System.getenv("SAUCE_ACCESS_KEY") + "@ondemand.us-west-1.saucelabs.com:443/wd/hub"),
                        capabilities);
                break;
        }

        //     driver = new ChromeDriver();
        wait = new WebDriverWait(driver, 20);
        mainPage = new MainPage(driver, wait);
        searchPage = new SearchPage(driver, wait);
        blogPage = new BlogPage(driver, wait);
        giftPage = new GiftPage(driver, wait);
        howWeWorkPage = new HowWeWorkPage(driver, wait);
        mediaPage = new MediaPage(driver, wait);
        signInPage = new SignInPage(driver, wait);
        tourPage = new TourPage(driver, wait);
        headerPage = new HeaderPage(driver, wait);
        footerPage = new FooterPage(driver, wait);
        photosPage = new PhotosPage(driver, wait);

        driver.manage().window().maximize();
        driver.get(mainUrl);
    }

    @AfterMethod
    public void afterActions(ITestResult testResult) {
        if (testResult.getStatus() == ITestResult.FAILURE) {
            Reports.fail(driver, testResult.getName());
        }
        Reports.stop();

        //    driver.quit();
    }
}

