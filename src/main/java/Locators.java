import org.openqa.selenium.By;

public class Locators {

    //Media Tests
    public static final By LINK_MEDIA = By.xpath("//a[@href='https://romanceabroad.com/media/index']");

    //Registration Tests
    public static final By BUTTON_REGISTRATION = By.xpath("//button[@id='show-registration-block']");
    public static final By TEXT_FIELD_EMAIL = By.cssSelector("input#email");
    public static final By TEXT_FIELD_PASSWORD = By.cssSelector("input#password");
    public static final By BUTTON_NEXT = By.xpath("//button[@data-action='next-page'][text()='Next']");
    public static final By TEXT_FIELD_NICKNAME = By.cssSelector("#nickname");
    public static final By TEXT_FIELD_PHONE = By.cssSelector("input[name='data[phone]']");

    //HowWeWork Tests
    public static final By LINK_HOW_WE_WORK = By.xpath("//a[@href = 'https://romanceabroad.com/content/view/how-it-works']");

    //HomePageTests
    public static final By LINK_HOME_PAGE = By.xpath("//a[text() = 'HOME']");
    public static final By IFRAME_YOUTUBE = By.xpath("//iframe[@src='https://www.youtube.com/embed/RRECuJzm3IY?start=85']");
    public static final By IFRAME_YOUTUBE_BUTTON = By.xpath("//button[@class='ytp-large-play-button ytp-button']");
    public static final By HOME_PAGE_BOOK_NOW = By.xpath("//a[@href='https://romanceabroad.com/store/sweets/20-tour_to_ukraine']");
    public static final By HOME_PAGE_JOIN_TODAY = By.xpath("//a[text()='JOIN TODAY!']");
    public static final By HOME_PAGE_SUPPORT_EMAIL = By.xpath("//a[@href='mailto:support@romanceabroad.com']");
    public static final By HOME_PAGE_IMAGE_1 = By.xpath("//img[@src='/img/portfolio/slideimg9.jpg']");

    //Search Tests
    public static final By LINK_SEARCH = By.xpath("//a[@href='https://romanceabroad.com/users/search']");
    public static final By DROP_DOWN_LIST_SORT_BY = By.xpath("//div[@class='form-inline']//select");
    public static final By DROP_DOWN_LIST_MIN_USER_AGE = By.cssSelector("#age_min");
    public static final By DROP_DOWN_LIST_MAX_USER_AGE = By.xpath("//div[@class='col-xs-5 no-padding-right']//select");
    public static final By BUTTON_SEARCH_BY_AGE = By.cssSelector("#main_search_button_user_advanced");

    //Gift Tests
    public static final By LINK_GIFT = By.xpath("//a[@href='https://romanceabroad.com/store/category-sweets']");
    public static final By GIFT_SEARCH_FIELD = By.xpath("//input[@name='search_product']");
    public static final By BUTTON_GIFT_SEARCH = By.xpath("//button[@id ='search_friend']");

    //Tour Tests
    public static final By LINK_TOUR = By.xpath("//a[@href='https://romanceabroad.com/store/sweets/20-tour_to_ukraine']");
    public static final By TOUR_SEARCH_FIELD = By.cssSelector("#search_product");
    public static final By BUTTON_SEARCH_TOUR = By.xpath("//button[@id='search_friend']");

    //Blog Tests
    public static final By LINK_BLOG = By.xpath("//a[@href='https://romanceabroad.com/content/view/blog']");
    public static final By BLOG_MENU = By.xpath("//div[@class='inside account_menu']");

    //SignIn Tests
    public static final By LINK_SIGN_IN = By.xpath("//a[@href='https://romanceabroad.com/users/login_form']");
    //   image    img[@src='/img/portfolio/slideimg1.jpg']





}