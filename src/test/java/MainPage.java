import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MainPage {

    String mainUrl = "https://romanceabroad.com/";
    WebDriver driver;

    String currentUrlHome;
    String currentUrlHowWeWork;
    String currentUrlSearch;
    String currentUrlMedia;
    String currentUrlGift;
    String currentUrlTour;
    String currentUrlBlog;
    String currentLoginForm;

    String expectedUrlHome = "https://romanceabroad.com/#";
    String expectedUrlHowWeWork = "https://romanceabroad.com/content/view/how-it-works";
    String expectedUrlSearch = "https://romanceabroad.com/users/search";
    String expectedUrlMedia = "https://romanceabroad.com/media/index";
    String expectedUrlGift = "https://romanceabroad.com/store/category-sweets";
    String expectedUrlTour = "https://romanceabroad.com/store/sweets/20-tour_to_ukraine";
    String expectedUrlBlog = "https://romanceabroad.com/content/view/blog";


    By LINK_HOME_PAGE = By.xpath("//a[text() = 'HOME']");
    By LINK_HOW_WE_WORK = By.xpath("//a[@href = 'https://romanceabroad.com/content/view/how-it-works']");
    By LINK_SEARCH = By.xpath("//a[@href='https://romanceabroad.com/users/search']");
    By LINK_MEDIA = By.xpath("//a[@href='https://romanceabroad.com/media/index']");
    By LINK_GIFT = By.xpath("//a[@href='https://romanceabroad.com/store/category-sweets']");
    By LINK_TOUR = By.xpath("//a[@href='https://romanceabroad.com/store/sweets/20-tour_to_ukraine']");
    By LINK_BLOG = By.xpath("//a[@href='https://romanceabroad.com/content/view/blog']");
    By LINK_SIGN_IN = By.xpath("//a[@href='https://romanceabroad.com/users/login_form']");
    By BUTTON_REGISTRATION = By.xpath("//button[@id='show-registration-block']");
    By BUTTON_NEXT = By.xpath("//button[@data-action='next-page'][text()='Next']");
    By GIFT_SEARCH_FIELD = By.xpath("//input[@name='search_product']");
    By BUTTON_GIFT_SEARCH = By.xpath("//button[@id ='search_friend']");
    By TOUR_SEARCH_FIELD = By.cssSelector("#search_product");
    By BUTTON_SEARCH_TOUR = By.xpath("//button[@id='search_friend']");

    By HOME_PAGE_RANDOM_IMAGE_1 = By.cssSelector("//img[@src='/img/portfolio/slideimg5.jpg']");
    By HOME_PAGE_RANDOM_IMAGE = By.cssSelector("//img[@src='/img/portfolio/slideimg5.jpg']");

    int indexLinkSignIn = 0;


    String name = "Al";
    By BUTTON_SUBMIT = By.xpath("//a");
    int number = 3;


    @BeforeMethod
    public void setUp() {

        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(mainUrl);
    }

    @Test
    public void testHomePage() {
        driver.findElement(LINK_HOME_PAGE).click();
        currentUrlHome = driver.getCurrentUrl();
        System.out.println(currentUrlHome);
        Assert.assertEquals(currentUrlHome, expectedUrlHome);
    }

    @Test
    public void testHowWeWorkPage() {
        driver.findElement(LINK_HOW_WE_WORK).click();
        currentUrlHowWeWork = driver.getCurrentUrl();
        System.out.println(currentUrlHowWeWork);
        Assert.assertEquals(currentUrlHowWeWork, expectedUrlHowWeWork);
    }

    @Test
    public void testSearchPage() {
        driver.findElement(LINK_SEARCH).click();
        currentUrlSearch = driver.getCurrentUrl();
        System.out.println(currentUrlSearch);
        Assert.assertEquals(currentUrlSearch, expectedUrlSearch);
    }

    @Test
    public void testMediaPage() {
        driver.findElement(LINK_MEDIA).click();
        currentUrlMedia = driver.getCurrentUrl();
        System.out.println(currentUrlMedia);
        Assert.assertEquals(currentUrlMedia, expectedUrlMedia);
    }

    @Test
    public void testGiftPage() {
        driver.findElement(LINK_GIFT).click();
        currentUrlGift = driver.getCurrentUrl();
        System.out.println(currentUrlGift);
        Assert.assertEquals(currentUrlGift, expectedUrlGift);

    }

    @Test    // Homework: Use SendKeys
    public void testGiftSearch() {
        driver.findElement(LINK_GIFT).click();
        driver.findElement(GIFT_SEARCH_FIELD).sendKeys("Teddy bear");
        driver.findElement(BUTTON_GIFT_SEARCH).click();

    }

    @Test
    public void testTourPage() {
        driver.findElement(LINK_TOUR).click();
        currentUrlTour = driver.getCurrentUrl();
        System.out.println(currentUrlTour);
        Assert.assertEquals(currentUrlTour, expectedUrlTour);
    }
    @Test  // Home work: Use sendKeys
    public void testSearchTourPage() {
        driver.findElement(LINK_TOUR).click();
        driver.findElement(TOUR_SEARCH_FIELD).sendKeys("VIP Individual tour to Ukraine");
        driver.findElement(BUTTON_SEARCH_TOUR).click();
    }

    @Test
    public void testBlogPage() {
        driver.findElement(LINK_BLOG).click();
        currentUrlBlog = driver.getCurrentUrl();
        System.out.println(currentUrlBlog);
        Assert.assertEquals(currentUrlBlog, expectedUrlBlog);
    }

    @Test
    public void SignInPage() {
        driver.findElements(LINK_SIGN_IN).get(indexLinkSignIn).click();
        currentLoginForm = driver.getCurrentUrl();
        System.out.println(currentLoginForm);

    }

    @Test
    public void SignInWebElement() {

        //  in some test cases we can to collect many Web elements and after use it;
        //   WebElement element = driver.findElement(LINK_SIGN_IN);
        //  driver.findElement(LINK_SIGN_IN).click(); //for one element

       //for many elements
           WebElement element = driver.findElement(LINK_SIGN_IN);
           driver.findElements(LINK_SIGN_IN).get(indexLinkSignIn).click();

//        WebElement linkSignIn = driver.findElement(LINK_SIGN_IN);
//        linkSignIn.click();
    }

        @Test
        public void testRegistration () {
            driver.findElement(BUTTON_REGISTRATION).click();
            driver.findElement(By.cssSelector("input#email")).sendKeys("tester123@gmail.com");
            driver.findElement(By.cssSelector("input#password")).sendKeys("123456789");
            driver.findElement(BUTTON_NEXT).click();

            try {
                driver.findElement(BUTTON_NEXT).click();

            } catch (Exception e) {
                e.printStackTrace();
            }
        }

          @AfterMethod
        public void afterActions () {
        //    driver.quit();
        }
    }




