import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class RegistrationTests extends BaseUI {

//    String name = "Al";
//    By BUTTON_SUBMIT = By.xpath("//a");
//    int number = 3;
//    boolean requirement = true;
//    boolean requirement2 = false;

    @Test
    public void testRegistration() {
        wait.until(ExpectedConditions.elementToBeClickable(Locators.BUTTON_REGISTRATION));
        mainPage.clickJoinButton();
        mainPage.completeFirstPartOfRegistration();
        mainPage.completeSecondPartOfRegistration();

    }

    @Test  //Lesson9 // homework// If / Else
    public void testCheckboxConfirmationTestIfSelected() {
        mainPage.clickJoinButton();
        mainPage.completeFirstPartOfRegistration();
        mainPage.completeSecondPartOfRegistration();
        WebElement checkbox = driver.findElement((Locators.CHECKBOX_CONFIRMATION_BUTTON));
        if (!checkbox.isSelected()) {
            checkbox.click();
        }
    }

    @Test //  Lesson 9 //Homework //   If/Else

    public void testWebElementIfCheckboxIsSelected() {
        mainPage.clickJoinButton();
        mainPage.completeFirstPartOfRegistration();
        mainPage.completeSecondPartOfRegistration();
        WebElement checkbox = driver.findElement((Locators.CHECKBOX_CONFIRMATION_BUTTON));

        if (!checkbox.isSelected()) {
            checkbox.click();
            System.out.println("Checkbox is selected!");

        }
    }

    @Test //  Lesson 10 Assertions

    public void testWebElementIfCheckboxIsNotSelectedAssertFail() {
        mainPage.clickJoinButton();
        mainPage.completeFirstPartOfRegistration();
        mainPage.completeSecondPartOfRegistration();
        mainPage.clickCheckboxConfirmation();
        WebElement checkboxConfirmation = driver.findElement(Locators.CHECKBOX_CONFIRMATION_BUTTON);
        if (checkboxConfirmation.isSelected()) {
            checkboxConfirmation.click();
        } else {
            Assert.fail("Checkbox is already selected");
        }
    }

        @Test //  Lesson 10 Assertions
        public void testWebElementAssertTrue () {
        mainPage.clickJoinButton();
        mainPage.completeFirstPartOfRegistration();
            mainPage.completeSecondPartOfRegistration();
            mainPage.clickCheckboxConfirmation();
            WebElement checkboxConfirmation = driver.findElement((Locators.CHECKBOX_CONFIRMATION_BUTTON));
            if (!driver.findElement(Locators.LINK_SEARCH).isSelected()) {
                checkboxConfirmation.click();
            } else {
                Assert.fail("Checkbox is already selected");
            }

        }

    @Test//test have moved to Registration test /  Lesson 9
    public void test9Loop() {  //for iteration

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


}






