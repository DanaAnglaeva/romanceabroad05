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
    public static final By DROP_DOWN_LIST_SELECT_BY_YEAR = By.cssSelector("#yearSelect");

    public static final By USERS_BIRTHDAY_SELECTED_MONTH = By.xpath("//li[@data-handler='selectMonth']//a[text()='Jun']");
    public static final By USERS_BIRTHDAY_SELECTED_DAY = By.xpath("//li[@data-handler='selectDay']//a[text()='2']");
    public static final By USERS_BIRTHDAY_SELECTED_YEAR = By.xpath("//li[@data-handler='selectYear']//a[text()='2001']");
    public static final By CHECKBOX_CONFIRMATION_BUTTON = By.cssSelector("input#confirmation");

    //MainPageTests
    public static final By LINK_HOME_PAGE = By.xpath("//a[text() = 'HOME']");
    public static final By IFRAME_YOUTUBE = By.xpath("//iframe[@src='https://www.youtube.com/embed/RRECuJzm3IY?start=85']");
    public static final By YOUTUBE_BUTTON_INSIDE_IFRAME_ = By.xpath("//button[@class='ytp-large-play-button ytp-button']");
    public static final By HOME_PAGE_BOOK_NOW = By.xpath("//a[@href='https://romanceabroad.com/store/sweets/20-tour_to_ukraine']");
    public static final By HOME_PAGE_JOIN_TODAY = By.xpath("//a[text()='JOIN TODAY!']");
    public static final By HOME_PAGE_SUPPORT_BY_EMAIL = By.xpath("//a[@href='mailto:support@romanceabroad.com']");
    public static final By TAB_OF_MAIN_PAGE = By.xpath("//ul[@class='navbar-nav']//li/a");


    //HowWeWork Tests
    public static final By LINK_HOW_WE_WORK = By.xpath("//a[@href = 'https://romanceabroad.com/content/view/how-it-works']");
    public static final By TITLE_OF_PAGE = By.xpath("//h1");

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
    public static final By TOUR_GALLERY_WITH_GIFTS = By.xpath("//ul[@class='user-gallery']//li");
    public static final By BUTTON_PAY_WITH_PAYPAL = By.xpath("//a[@class='btn btn-primary btn-block']");
    public static final By BUTTON_QUICK_VIEW = By.xpath("//input[@type='button'][@value='Quick view']");

    //Blog Tests
    public static final By LINK_BLOG = By.xpath("//a[@href='https://romanceabroad.com/content/view/blog']");
    public static final By BLOG_ALL_MENU = By.xpath("//div[@class='info-content-block wysiwyg']//ul");
    public static final By BLOG_TAB_MENU = By.xpath("//ul[@class='nav nav-pills nav-stacked content-pages-tree']//li");

    //SignIn Tests
    public static final By LINK_SIGN_IN = By.xpath("//a[@href='https://romanceabroad.com/users/login_form']");
    public static final By SIGN_IN_EMAIL_FIELD = By.xpath("//div[@class='col-xs-8'] //input[contains(@name,'email')]");
    public static final By SIGN_IN_PASSWORD_FIELD = By.xpath("//div[@class='col-xs-8'] //input[contains(@name,'password')]");
    public static final By SIGN_IN_BUTTON = By.xpath("//button[@type='submit']");
    public static final By LINK_REGISTER = By.xpath("//i[@class='fa fa-arrow-right']");
    public static final By SIGN_IN_WITH_FACEBOOK = By.xpath("//a[@href='https://romanceabroad.com/users_connections/oauth_login/1']");
    public static final By LINK_FORGOT_PASSWORD = By.xpath("//a[@href='https://romanceabroad.com/users/restore']");
    public static final By RESTORE_PASSWORD_EMAIL_FIELD = By.cssSelector("#email");
    public static final By RESTORE_PASSWORD_BUTTON_SAVE = By.xpath("//input[@type='submit']");

    //Header Tests
    public static final By HEADER_DROPDOWN_BUTTON = By.xpath("//header[@id='main-menu-container']//i[@class='fa fa-bars fa-lg item']");
    public static final By HEADER_DROP_DOWN_MENU_CLOSE_SIGN = By.cssSelector(".fa.fa-times.close_left_menu");
    public static final By HEADER_GIFT_SIGN = By.cssSelector(".fa.fa-gift.fa-lg");
    public static final By HEADER_TOUR_TO_UKRAINE = By.xpath("//a[text()='Tour to Ukraine']");
    public static final By HEADER_INDIVIDUAL_TRIP_TO_UKRAINE = By.xpath("//a[text()='Individual trip to Ukraine']");
    public static final By HEADER_ROMANCE_LOGO_HEART = By.xpath("//img[@src='/application/views/flatty/logo/mini_logo.png']");
    public static final By HEADER_BUTTON_FIND_PEOPLE = By.xpath("//button[@id='main_search_button_user_line']");
    public static final By HEADER_BUTTON_LOGIN = By.cssSelector("#ajax_login_link");
    public static final By HEADER_LEFT_DROPDOWN_MENU = By.cssSelector("//div[@class='main-menu']//ul");

    //Footer Tests
    public static final By FOOTER_HELP_CONTACT_US = By.xpath("//a[@href='https://romanceabroad.com/tickets/']");
   // public static final By FOOTER_TAB = By.xpath("//div[@class='footer-menu']");
    public static final By FOOTER_TAB = By.xpath("//div[@class='footer-menu']//li//a");
//    public static final By FOOTER_HELP_SITEMAP= By.xpath("//a[@id='footer_footer-menu-help-item_footer-menu-map-item']");
//    public static final By FOOTER_ABOUT_HOW_IT_WORKS= By.xpath("//a[@href='https://romanceabroad.com/content/view/how-it-works']");
//    public static final By FOOTER_ABOUT_NEWS= By.xpath("//a[@href='https://romanceabroad.com/news/']");
//    public static final By FOOTER_POLICY_PRIVACY= By.xpath("//a[@href='https://romanceabroad.com/content/view/privacy-and-security']");
//    public static final By FOOTER_POLICY_TERMS_OF_USE= By.xpath("//a[@href='https://romanceabroad.com/content/view/legal-terms']");
//    public static final By FOOTER_ONLINE_ADVERTISING_LINK= By.xpath("//a[@href='http://westwebart.ru']");






}