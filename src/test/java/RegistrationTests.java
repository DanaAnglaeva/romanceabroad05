import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class RegistrationTests extends BaseUI {

    String name = "Al";
    By BUTTON_SUBMIT = By.xpath("//a");
    int number = 3;
    boolean reguirement = true;
    boolean requirement2 = false;

    @Test
    public void testRegistration() {

        mainPage.clickJoinButton();
        mainPage.completeFirstPartOfRegistration();
        mainPage.completeSecondPartOfRegistration();
    }

}




