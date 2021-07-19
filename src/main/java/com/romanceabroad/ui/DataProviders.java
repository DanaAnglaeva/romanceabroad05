package com.romanceabroad.ui;



import org.testng.annotations.DataProvider;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class DataProviders {

    @DataProvider(name = "Registration")
    public static Object[][] testRegistration() throws Exception {
        ArrayList<Object[]> out = new ArrayList<>();
        Files.readAllLines(Paths.get("Registration.csv")).stream().forEach(s -> {
            String[] data = s.split(",");
            out.add(new Object[]{data[0], data[1], data[2], data[3], data[4], data[5], data[6], data[7]});
        });
        return out.toArray(new Object[out.size()][]);
    }

    @DataProvider(name = "SignUpUserRegistrationForm")
    public static Object[][] SignUpUserRegistrationForm() throws Exception {
        ArrayList<Object[]> out = new ArrayList<>();
        Files.readAllLines(Paths.get("Registration1.csv")).stream().forEach(s -> {
            String[] data = s.split(",");
            out.add(new Object[]{data[0], data[1], data[2], data[3], data[4], data[5], data[6], data[7], data[8]});
        });
        return out.toArray(new Object[out.size()][]);
    }

    @DataProvider(name = "RegistrationContactUs")
    public static Object[][] testRegistrationContactUs() throws Exception {
        ArrayList<Object[]> out = new ArrayList<>();
        Files.readAllLines(Paths.get("RegistrationContactUs.csv")).stream().forEach(s -> {
            String[] data = s.split(",");
            out.add(new Object[]{data[0], data[1], data[2], data[3]});
        });
        return out.toArray(new Object[out.size()][]);
    }

    @DataProvider(name = "Registration2")
    public static Object[][] testRegistration2() {
        return new Object[][]{
                {Data.email_gmail, Data.generated_nickname, true},
//                {Data.invalid_email_yahoo, Data.generated_nickname, false},
//                {Data.email_hotmail, Data.generated_nickname, true},
        };
    }

    @DataProvider(name = "Search")
    public static Object[][] searchDifferentResultsTestCase15() {
        return new Object[][]{
                {"18", "80", "Default"},
                {"18", "25", "Name"},
                {"31", "53", "Views"},
                {"42", "51", "Registration date"},
        };
    }

    @DataProvider(name = "Registration3") //Lesson25
    public static Object[][] testRegistration3() throws IOException {
        ArrayList<Object[]> out = new ArrayList<>();
        Files.readAllLines(Paths.get("Registration3.csv")).stream().forEach(s -> {
            String[] data = s.split(",");
            out.add(new Object[]{data[0], data[1], false});
        });
        return out.toArray(new Object[out.size()][]);
    }

    @DataProvider(name = "NewRequirementsForPassword")
    public static Object[][] testPassword() {
        return new Object[][]{
                {"Nyc1!", true},
                {"Nyc2@", true},
                {"#3Nyc", true},
                {"$Nyc4", true},
                {"Nyc%5", true},
                {"Nyc6&", true},
                {"Nyc&7", true},
                {"Nyc*11", true},
                {"Nyc*12-", true},
                {"Nyc*13+", true},
                {"Nyc*14/", true},
                {"Nyc-15/", true},
                {"Nyc-(16)", true},
                {"NYC", false},
                {"///", false},
                {"222", false},
                {"@@@aaa", false},
                {"", false},
//                {Data.invalid_email_yahoo, Data.generated_nickname, false},
//                {Data.email_hotmail, Data.generated_nickname, true},
        };
    }
}
