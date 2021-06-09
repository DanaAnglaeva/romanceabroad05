import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

    public class RegistrationTests<fori> extends BaseUI {

        public static final boolean testCase1 = true;
        public static final boolean testCase2 = true;
        public static final boolean testCase3 = true;
        public static final boolean testCase4 = false;
        public static final boolean testCase5 = true;
        public static final boolean testCase6 = true;

        @Test(priority = 1, enabled = testCase1, groups = {"user", "admin"})
        //Lesson 16
        public void testRegistrationTestCase1() {
            wait.until(ExpectedConditions.elementToBeClickable(Locators.BUTTON_REGISTRATION));
            mainPage.clickJoinButton();
            mainPage.completeFirstPartOfRegistration(Data.email, Data.password);
            mainPage.completeSecondPartOfRegistration(mainPage.generateNewNumber(Data.nickname, 5),
                    Data.day, Data.month, Data.year, Data.phone, Data.city, Data.location);
        }


        @Test(priority = 1, enabled = testCase2, groups = {"user", "admin"}) //Lesson9,16 // homework// If / Else
        public void testCheckboxConfirmationTestIfSelectedTestCase2() {
            mainPage.clickJoinButton();
            mainPage.completeFirstPartOfRegistration(Data.email, Data.password);
            mainPage.completeSecondPartOfRegistration(mainPage.generateNewNumber(Data.nickname, 5), Data.phone,
                    Data.day, Data.month, Data.year, Data.city, Data.location);
            WebElement checkbox = driver.findElement((Locators.CHECKBOX_CONFIRMATION_BUTTON));
            if (!checkbox.isSelected()) {
                checkbox.click();
            }
        }

        @Test(priority = 2, enabled = testCase3, groups = {"user", "admin", "ie"})
        //  Lesson 9,16 //Homework //   If/Else

        public void testWebElementIfCheckboxIsSelectedTestCase3() {
            mainPage.clickJoinButton();
            mainPage.completeFirstPartOfRegistration(Data.email, Data.password);
            mainPage.completeSecondPartOfRegistration(mainPage.generateNewNumber(Data.nickname, 5), Data.phone,
                    Data.day, Data.month, Data.year, Data.city, Data.location);
            WebElement checkbox = driver.findElement((Locators.CHECKBOX_CONFIRMATION_BUTTON));

            if (!checkbox.isSelected()) {
                checkbox.click();
                System.out.println("Checkbox is selected!");
            }
        }

        @Test(priority = 3, enabled = testCase4, groups = {"user", "admin", "ie"})//  Lesson 10,16 Assertions

        public void testWebElementIfCheckboxIsNotSelectedAssertFailTestCase4() {
            mainPage.clickJoinButton();
            mainPage.completeFirstPartOfRegistration(Data.email, Data.password);
            mainPage.completeSecondPartOfRegistration(mainPage.generateNewNumber(Data.nickname, 5), Data.phone,
                    Data.day, Data.month, Data.year, Data.city, Data.location);
//        mainPage.clickCheckboxConfirmation();
            WebElement checkboxConfirmation = driver.findElement(Locators.CHECKBOX_CONFIRMATION_BUTTON);
            if (checkboxConfirmation.isSelected()) {
                checkboxConfirmation.click();
            } else {
                Assert.fail("Checkbox is already selected");
            }
        }

        @Test(priority = 3, enabled = testCase5, groups = {"user", "admin", "ie"}) //  Lesson 10,16 Assertions
        public void testWebElementAssertTrueTestCase5() {
            mainPage.clickJoinButton();
            mainPage.completeFirstPartOfRegistration(Data.email, Data.password);
            mainPage.completeSecondPartOfRegistration(mainPage.generateNewNumber(Data.nickname, 5),
                    Data.month, Data.day, Data.year, Data.phone, Data.city, Data.location);
//            mainPage.clickCheckboxConfirmation();
            WebElement checkboxConfirmation = driver.findElement((Locators.CHECKBOX_CONFIRMATION_BUTTON));
            if (!driver.findElement(Locators.LINK_SEARCH).isSelected()) {
                checkboxConfirmation.click();
            } else {
                Assert.fail("Checkbox is already selected");
            }
        }

        @Test(priority = 2, enabled = testCase6, groups = {"user", "admin", "ie"})

        public void test9LoopTestCase6() {  //for iteration   //test have moved to Registration test /  Lesson 9,16

            List<WebElement> links = driver.findElements(Locators.TAB_OF_MAIN_PAGE);
            System.out.println(links.size());
            for (int i = 0; i < links.size(); i++) {
                String info = links.get(i).getText();
                System.out.println(info);

                links.get(i).click();
                driver.get(mainUrl);
                links = driver.findElements(Locators.TAB_OF_MAIN_PAGE);
            }
        }

        @DataProvider(name = "Registration")
        public static Object[][] testRegistration() throws Exception {
            ArrayList<Object[]> out = new ArrayList<>();
            Files.readAllLines(Paths.get("Registration.csv")).stream().forEach(s -> {
                String[] data = s.split(",");
                out.add(new Object[]{data[0], data[1], data[2], data[3], data[4], data[5], data[6], data[7]});
            });
            return out.toArray(new Object[out.size()][]);
        }

        @Test(dataProvider = "Registration")
        public void testRegistration(String email, String password, String day, String month, String year,
                                     String phone, String city, String location) {

            mainPage.clickJoinButton();
            mainPage.completeFirstPartOfRegistration(email, password);
            mainPage.completeSecondPartOfRegistration(mainPage.generateNewNumber(Data.nickname, 5), phone,
                    month, day, year, city, location);
        }

        @DataProvider(name = "RegistrationContactUs")
        public static Object[][] testRegistrationContuctUs() throws Exception {
            ArrayList<Object[]> out = new ArrayList<>();
            Files.readAllLines(Paths.get("RegistrationContactUs.csv")).stream().forEach(s -> {
                String[] data = s.split(",");
                out.add(new Object[]{data[0], data[1], data[2], data[3]});
            });
            return out.toArray(new Object[out.size()][]);
        }

        @Test (dataProvider = "RegistrationContactUs")
        public void testContactUsTestCase1(String name, String email, String subject, String message) {
            searchPage.clickLinkSearch();
            searchPage.ajaxClick(Locators.FOOTER_TAB, 0);
            footerPage.completeContactUsForm(name, email, subject, message);
        }
    }









