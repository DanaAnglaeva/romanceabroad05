import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Conditions extends BaseUI {

    @Test
        public void testArrayListByElement() {
        blogPage.clickLinkBlog();
        List<String> tabs = new ArrayList<>(Arrays.asList("Kiev dating agency", "Mail order girls"));
        for (int i = 0; i < tabs.size(); i++) {
            if (driver.findElement(By.xpath("//div[@class='info-content-block wysiwyg']")).getText().contains(tabs.get(i))) {
                driver.findElement(Locators.HOME_PAGE_MAIN_LINK).click();
            }
        }
    }

    @Test  // don't understand how it work
        public void testArrayListByText() {

            List<WebElement> list = driver.findElements(By.xpath("//a"));
            for (int i = 3; i < list.size(); i++) {
                if (list.get(i).getText().contains("Gifts")) {
                    giftPage.clickLinkGift();
                }
            }
        }

    @Test // don't understand how it work
    public void testArrayListBySize () {
        List<WebElement> list1 = driver.findElements(By.xpath("//a"));
        for (int i = 0; i < list1.size(); i++) {
            if (i == 2) {
                searchPage.clickLinkSearch();
            }
        }
    }

        @Test //test have moved to Registration test /  Lesson 10
        public void testWebElementCheckboxIf () {
            mainPage.clickJoinButton();
            mainPage.completeFirstPartOfRegistration();
            mainPage.completeSecondPartOfRegistration();

            WebElement checkbox = driver.findElement((Locators.BUTTON_REGISTRATION));

            if (checkbox.isSelected()) {
                checkbox.click();
            }
        }

        @Test //test have moved to Registration test /  Lesson 10
        public void test6CheckboxConfirmationIfElse () {
            mainPage.clickJoinButton();
            mainPage.completeFirstPartOfRegistration();
            mainPage.completeSecondPartOfRegistration();
            WebElement checkbox = driver.findElement((Locators.CHECKBOX_CONFIRMATION_BUTTON));
//before running this case you have to  comment boolean for Checkbox completeSecondPartOfRegistration checkbox part
            //   if (checkbox.isSelected())
            if (!checkbox.isSelected()) {
                checkbox.click();
                System.out.println("Checkbox is selected!");
            }
        }

        @Test
        public void test7ArrayListSimple () {

            List<String> crunchifyList1 = new ArrayList<>(Arrays.asList("Kiwi", "orange", "melon"));
            String element = crunchifyList1.get(0);
            System.out.println(element);
        }
        @Test
        public void test8ArrayListWithIf () {

            List<String> crunchifyList1 = new ArrayList<>(Arrays.asList("Kiwi", "orange", "melon"));
            if (crunchifyList1.contains("orange")) {
                System.out.println(crunchifyList1);
            }
        }
        @Test
        public void test8ArrayListWithInteger () {  //integers are always without ""

            List<Integer> crunchifyList1 = new ArrayList<>(Arrays.asList(5, 10, 19));
            int sum = crunchifyList1.get(1) + crunchifyList1.get(2);
            System.out.println(sum);

        }

        @Test//test have moved to Registration test /  Lesson 9
        public void test9Loop () {  //for iteration

            List<WebElement> links = driver.findElements(Locators.HOME_PAGE_MAIN_LINK);
            System.out.println(links.size());
            for (int i = 0; i < links.size(); i++) {
            String info = links.get(i).getText();
            System.out.println(info);

                links.get(i).click();
                driver.get(mainUrl);
                links = driver.findElements(Locators.HOME_PAGE_MAIN_LINK);
            }

        }

        @Test    //test have moved to Registration test /  Lesson 10/ it does'n opened all list, did not get it why
        public void testBlogLoop () {  //for iteration with BlogPage
            blogPage.clickLinkBlog();
            List<WebElement> links = driver.findElements(Locators.BLOG_MENU);
            System.out.println(links.size());
            for (int i = 0; i < links.size(); i++) {
             String info = links.get(i).getText();
                System.out.println(info);
                links.get(i).click();
                driver.get(mainUrl);
                links = driver.findElements(Locators.BLOG_MENU);
            }

    }

}




