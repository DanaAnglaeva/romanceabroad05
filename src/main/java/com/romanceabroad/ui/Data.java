package com.romanceabroad.ui;

public class Data {

    //Registration data
    public static final String email = "tester123@gmail.com";
    public static final String password = "123456789";
    public static final String nickname= "Tester123";
    public static final String generated_nickname= MainPage.generateNewNumber(Data.nickname,
            Data.lengthSecondPartOfNickname);

    public static final String day = "1";
    public static final String month = "June";
    public static final String year = "1990";
    public static final String phone = "(987) 654 3210";
    public static final String city = "New York City";
    public static final String location = "New York City, United States";
    public static final int lengthSecondPartOfNickname = 5;

    public static final String email_gmail = "tester123@gmail.com";
    public static final String invalid_email_yahoo = "tester123yahoo.com";
    public static final String email_hotmail = "tester123@hotmail.com";

    //Footer
    public static final String subject = "Tech question";
    public static final String message = "I need technical support";

    //Home data
    public static final String mainUrl = "https://romanceabroad.com";
    public static final String expectedUrlHome = "https://romanceabroad.com/#";
    public static final String expectedHomePageBookNow = "https://romanceabroad.com/store/sweets/20-tour_to_ukraine";
    public static final String expectedHomePageJoinToday = "https://romanceabroad.com/#";

    //HowWeWork com.romanceabroad.ui.Data
    public static final String expectedUrlHowWeWork = "https://romanceabroad.com/content/view/how-it-works";

    //Media data
    public static final String expectedUrlMedia = "https://romanceabroad.com/media/index";
    public static final String textMedia = "On our website you have access to photos of all different kinds of women";

    //Search data
    public static final String expectedUrlSearch = "https://romanceabroad.com/users/search";

    //Gifts com.romanceabroad.ui.Data
    public static final String expectedUrlGift = "https://romanceabroad.com/store/category-sweets";
    public static final String searchGiftSpa = "Spa";

    //Tour data
    public static final String expectedUrlTour = "https://romanceabroad.com/store/sweets/20-tour_to_ukraine";
    public static final String searchFieldVipTourToUkraine = "VIP Individual tour to Ukraine";

    //Blog data
    public static final String expectedUrlBlog = "https://romanceabroad.com/content/view/blog";

    //User profile

    public static final String expectedTitleAllPhotos = "Ukrainian women photos";
    public static final String expectedTitleGallery = "Gallery";
    public static final String expectedTitlePhotoGallery = "Photo gallery";
    public static final String expectedTitleVideoGallery = "Video gallery";
    public static final String expectedTitleGalleryAlbums = "Gallery albums";

}