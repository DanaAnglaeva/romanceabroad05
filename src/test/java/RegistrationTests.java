import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

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
    @Test  //Lesson9 If / Else
    public void test6CheckboxConfirmationTestIfSelected () {
        mainPage.clickJoinButton();
        mainPage.completeFirstPartOfRegistration();
        mainPage.completeSecondPartOfRegistration();
        WebElement checkbox = driver.findElement((Locators.CHECKBOX_CONFIRMATION_BUTTON));
        if (!checkbox.isSelected()) {
            checkbox.click();
            System.out.println("Checkbox is selected!");
        }
    }
        @Test //  Lesson 10 need add action?????

        public void testWebElementCheckboxIfNotSelected () {
        mainPage.clickJoinButton();
        mainPage.completeFirstPartOfRegistration();
        mainPage.completeSecondPartOfRegistration();

        WebElement checkbox = driver.findElement((Locators.BUTTON_REGISTRATION));

        if (checkbox.isSelected()) {
            checkbox.click();
        }
    }

       @Test //  Lesson 10 Assertions

        public void testWebElementAssertFail () {
        mainPage.clickJoinButton();
        mainPage.completeFirstPartOfRegistration();
        mainPage.completeSecondPartOfRegistration();
        mainPage.clickCheckboxConfirmation();
        WebElement checkboxConfirmation = driver.findElement((Locators.CHECKBOX_CONFIRMATION_BUTTON));
        if (driver.findElement(Locators.LINK_SEARCH).isSelected()) {
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

    // 3 types of hard assertions
    public void validateAssertions(){
      Assert.assertEquals("Web", "Web is");
      Assert.assertTrue((driver.findElement(By.xpath("//a")).isSelected()), "Element is not displayed");
      Assert.fail("Element is not displayed");


    }
}






