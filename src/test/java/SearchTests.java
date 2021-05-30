import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;
public class SearchTests extends BaseUI {

    String currentUrlSearch;

    @Test //homework Lesson7 Dropdown list + try catch
    public void testLinkSearch() {
        searchPage.clickLinkSearch();
        currentUrlSearch = driver.getCurrentUrl();
        System.out.println(currentUrlSearch);
                Assert.assertEquals(currentUrlSearch, Data.expectedUrlSearch);
            try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        searchPage.getDropDownListByDefault();
        System.out.println("List sorted by Default!");

        searchPage.getDropDownListByViews();
        System.out.println("List sorted by View!");

        searchPage.getDropDownListByName();
        System.out.println("List sorted by Name!");

        searchPage.getDropDownListByRegistrationDate();
        System.out.println("List sorted by Registration date!");

    }

    @Test //homework Lesson 7. Dropdown list + Explicit wait
    public void testSearchPeopleByIndex() {
        searchPage.clickLinkSearch();
        WebElement dropDownListSortBy = driver.findElement(Locators.DROP_DOWN_LIST_SORT_BY);
        searchPage.getDropDownListByIndex(dropDownListSortBy, 0);
        System.out.println("Success! Index 0 selected!");
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

        searchPage.getDropDownListByIndex(dropDownListSortBy, 1);
        System.out.println("Success! Index 1 selected!");

        searchPage.getDropDownListByIndex(dropDownListSortBy, 2);
        System.out.println("Success! Index 2 selected!");

        searchPage.getDropDownListByIndex(dropDownListSortBy, 3);
        System.out.println("Success! Index 3 selected!");
    }

       @Test
    public void TestSearchRandomAgeValue() {
        searchPage.clickLinkSearch();
        WebElement dropDownListMinAge = driver.findElement(Locators.DROP_DOWN_LIST_MIN_USER_AGE);
        searchPage.getDropDownListByIndex(dropDownListMinAge, 2);
        WebElement dropDownListMaxAge = driver.findElement(Locators.DROP_DOWN_LIST_MAX_USER_AGE);
        searchPage.getDropDownListByIndex(dropDownListMaxAge, 36);
        System.out.println("Success!List of brides sorted by age from 20 to 54!");
        searchPage.clickButtonSearchByAge();
    }
    @Test //Lesson 9

    public void testAssertionWebElementGetText () {
        WebElement tabSearch = driver.findElement((Locators.LINK_SEARCH));
        if (tabSearch.getText().contains("PRETTY WOMEN")) {
            tabSearch.click();
        } else {
            Assert.fail("We can't find Pretty Women Tab");
        }
    }

    @Test //Lesson 10 Ask Alex maybe we need move this method to other Test Class?
    public void testAssertionWebElementIsDisplayed () {
        WebElement tabSearch = driver.findElement((Locators.LINK_SEARCH));
        if (tabSearch.isDisplayed()) {
            tabSearch.click();
        } else {
            Assert.fail("We can't find Pretty Women Tab");
        }
    }
}









