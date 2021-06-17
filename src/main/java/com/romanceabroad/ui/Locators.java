package com.romanceabroad.ui;

import org.openqa.selenium.By;

public class Locators {

    //Registration Tests
    public static final By BUTTON_REGISTRATION = By.xpath("//button[@id='show-registration-block']");
    public static final By TOOLTIP_ERROR = By.xpath("//div[@class='tooltip']");
    public static final By TEXT_FIELD_EMAIL = By.cssSelector("input#email");
    public static final By TEXT_FIELD_PASSWORD = By.cssSelector("input#password");
    public static final By BUTTON_NEXT = By.xpath("//button[@data-action='next-page'][text()='Next']");
    public static final By TEXT_FIELD_NICKNAME = By.cssSelector("#nickname");
    public static final By TEXT_FIELD_PHONE = By.cssSelector("input[name='data[phone]']");

    public static final By LIST_OF_DAYS = By.cssSelector("#daySelect");
    public static final By LIST_OF_MONTHS = By.cssSelector("#monthSelect");
    public static final By LIST_OF_YEARS = By.cssSelector("#yearSelect");

    public static final By LIST_OF_VALUE_DAY = By.xpath("//li[@data-handler='selectDay']");
    public static final By LIST_OF_VALUE_MONTH = By.xpath("//li[@data-handler='selectMonth']");
    public static final By LIST_OF_VALUE_YEAR = By.xpath("//li[@data-handler='selectYear']");
    public static final By CHECKBOX_CONFIRMATION_BUTTON = By.cssSelector("input#confirmation");
    public static final By AUTOFILLING_FORM_LOCATION = By.xpath("//input[@name='region_name']");
    public static final By LIST_OF_VALUE_LOCATION = By.xpath("//div[@class='dropdown dropdown_location']//ul/li");

    //MainPageTests
    public static final By LINK_HOME_PAGE = By.xpath("//a[text() = 'HOME']");
    public static final By IFRAME_YOUTUBE = By.xpath("//iframe[@src='https://www.youtube.com/embed/RRECuJzm3IY?start=85']");
    public static final By YOUTUBE_BUTTON_INSIDE_IFRAME_ = By.xpath("//button[@class='ytp-large-play-button ytp-button']");
    public static final By HOME_PAGE_BOOK_NOW = By.xpath("//a[@href='https://romanceabroad.com/store/sweets/20-tour_to_ukraine']");
    public static final By HOME_PAGE_LINK_JOIN_TODAY = By.xpath("//a[text()='JOIN TODAY!']");
    public static final By HOME_PAGE_SUPPORT_BY_EMAIL = By.xpath("//a[@href='mailto:support@romanceabroad.com']");
    public static final By TAB_OF_MAIN_PAGE = By.xpath("//ul[@class='navbar-nav']//li");


    //HowWeWork Tests
    public static final By LINK_HOW_WE_WORK = By.xpath("//a[@href = 'https://romanceabroad.com/content/view/how-it-works']");
    public static final By PAGES_CONTENT_LIST_OF_ALL_LINKS = By.xpath("//div[@class='info-content-block wysiwyg']//ul");
    public static final By LIST_OF_LINKS = By.xpath("//ul[@class='nav nav-pills nav-stacked content-pages-tree']//li");
    public static final By H1_TITLE_OF_PAGE = By.xpath("//h1");

    //Search Tests
    public static final By LINK_SEARCH = By.xpath("//a[@href='https://romanceabroad.com/users/search']");
    public static final By DROP_DOWN_LIST_SORT_BY = By.xpath("//div[@class='form-inline']//select");
    public static final By DROP_DOWN_LIST_MIN_USER_AGE = By.cssSelector("#age_min");
    public static final By DROP_DOWN_LIST_MAX_USER_AGE = By.xpath("//div[@class='col-xs-5 no-padding-right']//select");
    public static final By BUTTON_SEARCH = By.cssSelector("#main_search_button_user_advanced");
    public static final By USERS_DISPLAYED_INFO = By.xpath("//div[@class='text-overflow']");

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
    public static final By LIST_OF_BLOG_LINKS = By.xpath("//div[@class='info-content-block wysiwyg']//ul//li");

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
    public static final By HEADER_ROMANCE_LOGO_HEART = By.xpath("//div[@class='logo-mobile-version top-menu-item']//a[@href='https://romanceabroad.com/']");
    public static final By HEADER_BUTTON_FIND_PEOPLE = By.xpath("//button[@id='main_search_button_user_line']");
    public static final By HEADER_BUTTON_LOGIN = By.cssSelector("#ajax_login_link");
    public static final By HEADER_LIST_DROPDOWN_MENU = By.xpath("//div[@class='main-menu']//ul//li");
    public static final By HEADER_LEFT_DROPDOWN_MENU = By.xpath("//a[@class='uam-top link-open-menu btn-slide']");
    public static final By HEADER_SIGN_UP_FORM_LINK = By.xpath("//a[@id='user_main-menu-registration-item']");
    public static final By SIGN_UP_USER_EMAIL_FIELD = By.xpath("//div[@class='col-xs-12 col-sm-12 col-md-6 col-lg-6'] //input[@name='email']");
    public static final By SIGN_UP_USERNAME_FIELD = By.xpath("//div[@class='col-xs-12 col-sm-12 col-md-6 col-lg-6'] //input[@name='nickname']");
    public static final By SIGN_UP_USER_PASSWORD_FIELD = By.xpath("//div[@class='col-xs-12 col-sm-12 col-md-6 col-lg-6'] //input[@name='password']");
    public static final By SIGN_UP_USER_PHONE_FIELD = By.xpath("//div[@class='col-xs-12 col-sm-12 col-md-6 col-lg-6'] //input[@name='phone']");
    public static final By SIGN_UP_USER_LOCATION_FIELD = By.xpath("//input[@name='region_name']");

    public static final By SIGN_UP_LIST_OF_VALUE_DAY = By.xpath("//select[@class='form-control']");
    public static final By SIGN_UP_LIST_OF_VALUE_MONTH = By.xpath("//select[@class='ui-datepicker-month form-control']");
    public static final By SIGN_UP_LIST_OF_VALUE_YEAR = By.xpath("//select[@data-handler='selectYear']");

    public static final By CHECKBOX_LATEST_NEWS = By.xpath("//input[@type='checkbox'][@id='sub1']");
    public static final By CHECKBOX_TERMS_AND_CONDITIONS = By.xpath("//input[@type='checkbox'][@id='confirmation']");
    public static final By LINK_TERMS_AND_CONDITIONS = By.xpath("//div[@class='form-group']//a[@href='https://romanceabroad.com/content/view/legal-terms']");
    public static final By SIGN_UP_BUTTON_REGISTER = By.xpath("//input[@name='btn_register']");

    //Footer Tests
    public static final By FOOTER_CONTACT_US = By.xpath("//a[@href='https://romanceabroad.com/tickets/' and 'Contact us']");
    public static final By FOOTER_TAB = By.xpath("//div[@class='col-sm-3 col-md-2']//ul//li//a");
    public static final By CONTACT_US_TECH_QUESTIONS = By.xpath("//div[@class='col-xs-12 col-sm-12 col-md-10 col-lg-8']//option[@value=2]");
    public static final By CONTACT_US_USER_NAME_FIELD = By.xpath("//div[@class='col-xs-12 col-sm-12 col-md-10 col-lg-8']//input[@name='user_name']");
    public static final By CONTACT_US_USER_EMAIL_FIELD = By.xpath("//div[@class='col-xs-12 col-sm-12 col-md-10 col-lg-8']//input[@name='user_email']");
    public static final By CONTACT_US_SUBJECT_FIELD = By.xpath("//div[@class='col-xs-12 col-sm-12 col-md-10 col-lg-8']//input[@name='subject']");
    public static final By CONTACT_US_MESSAGE_FIELD = By.xpath("//div[@class='col-xs-12 col-lg-8']//textarea[@name='message']");
    public static final By CONTACT_US_SEND_FORM_BUTTON = By.xpath("//input[@type='submit']");
    public static final By FOOTER_SITE_MAP_LINK_MENU = By.xpath("//ul//li//a");




}