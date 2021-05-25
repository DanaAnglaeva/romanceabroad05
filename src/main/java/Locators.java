import org.openqa.selenium.By;

public class Locators {


    //Registration Tests
    public static final By BUTTON_REGISTRATION = By.xpath("//button[@id='show-registration-block']");
    public static final By TEXT_FIELD_EMAIL = By.cssSelector("input#email");
    public static final By TEXT_FIELD_PASSWORD = By.cssSelector("input#password");
    public static final By BUTTON_NEXT = By.xpath("//button[@data-action='next-page'][text()='Next']");
    public static final By TEXT_FIELD_NICKNAME = By.cssSelector("#nickname");
    public static final By TEXT_FIELD_PHONE = By.cssSelector("input[name='data[phone]']");
    public static final By DROP_DOWN_LIST_SELECT_BY_DAY = By.cssSelector("#daySelect");
    public static final By DROP_DOWN_LIST_SELECT_BY_MONTH = By.cssSelector("#monthSelect");
    public static final By USERS_BIRTHDAY_SELECTED_DAY_2 = By.xpath("//li[@data-handler='selectMonth']//a[text()='Jun']");
    public static final By USERS_BIRTHDAY_SELECTED_MONTH_JUNE = By.xpath("//li[@data-handler='selectDay']//a[text()='2']");
    public static final By USERS_BIRTHDAY_SELECTED_YEAR_2001 = By.xpath("//li[@data-handler='selectYear']//a[text()='2001']");
    public static final By DROP_DOWN_LIST_SELECT_BY_YEAR = By.cssSelector("#yearSelect");
    public static final By CHECKBOX_CONFIRMATION_BUTTON = By.cssSelector("input#confirmation");

    //MainPageTests
    public static final By LINK_HOME_PAGE = By.xpath("//a[text() = 'HOME']");
    public static final By IFRAME_YOUTUBE = By.xpath("//iframe[@src='https://www.youtube.com/embed/RRECuJzm3IY?start=85']");
    public static final By YOUTUBE_BUTTON_INSIDE_IFRAME_ = By.xpath("//button[@class='ytp-large-play-button ytp-button']");
    public static final By HOME_PAGE_BOOK_NOW = By.xpath("//a[@href='https://romanceabroad.com/store/sweets/20-tour_to_ukraine']");
    public static final By HOME_PAGE_JOIN_TODAY = By.xpath("//a[text()='JOIN TODAY!']");
    public static final By HOME_PAGE_SUPPORT_BY_EMAIL = By.xpath("//a[@href='mailto:support@romanceabroad.com']");
    public static final By HOME_PAGE_IMAGE_1 = By.xpath("//img[@src='/img/portfolio/slideimg9.jpg']");

    //HowWeWork Tests
    public static final By LINK_HOW_WE_WORK = By.xpath("//a[@href = 'https://romanceabroad.com/content/view/how-it-works']");

    //Search Tests
    public static final By LINK_SEARCH = By.xpath("//a[@href='https://romanceabroad.com/users/search']");
    public static final By DROP_DOWN_LIST_SORT_BY = By.xpath("//div[@class='form-inline']//select");
    public static final By DROP_DOWN_LIST_MIN_USER_AGE = By.cssSelector("#age_min");
    public static final By DROP_DOWN_LIST_MAX_USER_AGE = By.xpath("//div[@class='col-xs-5 no-padding-right']//select");
    public static final By BUTTON_SEARCH_BY_AGE = By.cssSelector("#main_search_button_user_advanced");

    //Media Tests
    public static final By LINK_MEDIA = By.xpath("//a[@href='https://romanceabroad.com/media/index']");

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

    //Header Tests
    public static final By HEADER_DROP_DOWN_MENU = By.cssSelector(".uam-top.link-open-menu.btn-slide");
    public static final By HEADER_GIFT_SIGN = By.cssSelector(".fa.fa-gift.fa-lg");
    public static final By HEADER_TOUR_TO_UKRAINE = By.xpath("//a[text()='Tour to Ukraine']");
    public static final By HEADER_INDIVIDUAL_TRIP_TO_UKRAINE = By.xpath("//a[text()='Individual trip to Ukraine']");
    public static final By HEADER_ROMANCE_LOGO_HEART = By.xpath("//img[@src='/application/views/flatty/logo/mini_logo.png']");
    public static final By HEADER_BUTTON_FIND_PEOPLE = By.xpath("//button[@id='main_search_button_user_line']");
    public static final By HEADER_LOGIN = By.cssSelector("#ajax_login_link");


    //Footer Tests



}