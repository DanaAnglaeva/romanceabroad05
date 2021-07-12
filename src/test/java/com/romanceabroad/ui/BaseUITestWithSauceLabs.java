package com.romanceabroad.ui;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.asserts.SoftAssert;

import java.lang.reflect.MalformedParameterizedTypeException;
import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URL;

public class BaseUITestWithSauceLabs<alwaysRun> {

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


    @BeforeMethod
    @Parameters({"browser", "version", "platform"})

    public void setup(String browser, String version, String platform, Method method) throws MalformedURLException {

        Reports.start(method.getName());

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("username", "oauth-dana194355-bb83a");
        capabilities.setCapability("accessKey", "50eba6c1-09ba-464d-957a-8d4bb42a1cac");
        capabilities.setCapability("browserName", browser);
        capabilities.setCapability("platform", platform);
        capabilities.setCapability("version", version);
        capabilities.setCapability("name", method.getName());
        driver = new RemoteWebDriver (
      //  new URL("https://oauth-dana194355-bb83a:50eba6c1-09ba-464d-957a-8d4bb42a1cac@ondemand.us-west-1.saucelabs.com:443/wd/hub"),
          new URL ("https://" + System.getenv("SAUCE_USERNAME") + ":" + System.getenv("SAUCE_ACCESS_KEY") + "@ondemand.us-west-1.saucelabs.com:443/wd/hub"),
               capabilities);


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
        headerPage = new HeaderPage(driver,wait);
        footerPage = new FooterPage(driver,wait);
        photosPage = new PhotosPage(driver,wait);

        driver.manage().window().maximize();
        driver.get(mainUrl);
    }

    @AfterMethod (groups = {"admin", "user"})
    public void tearDown(ITestResult testResult) {
            //Local Reports
        if (testResult.getStatus() ==  ITestResult.FAILURE) {
            Reports.fail(driver, testResult.getName());
        }
        Reports.stop();
        //Sauce Lab
        ((JavascriptExecutor) driver).executeScript("sauce:job-result=" + (testResult.isSuccess() ? "passed" : "failed"));

            driver.quit();
    }
}
