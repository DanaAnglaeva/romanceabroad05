import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class BoundaryTesting extends BaseUI {

    @Test //homework Lesson 7/DropDown List
    public void BoundaryTestingFromAge_18_To_80() {

        searchPage.clickLinkSearch();
        WebElement dropDownListSortByMinAge = driver.findElement(Locators.DROP_DOWN_LIST_MIN_USER_AGE);
        searchPage.getDropDownListByIndex(dropDownListSortByMinAge, 0);
        WebElement dropDownListSortByMaxAge = driver.findElement(Locators.DROP_DOWN_LIST_MAX_USER_AGE);
        searchPage.getDropDownListByIndex(dropDownListSortByMaxAge, 62);
        System.out.println("List of brides sorted by age from 18 to 80 successfully!");
    }

    @Test
    public void BoundaryTestingFromAge_19_TO_79() {
        searchPage.clickLinkSearch();
        WebElement dropDownListMinPage = driver.findElement(Locators.DROP_DOWN_LIST_MIN_USER_AGE);
        searchPage.getDropDownListByIndex(dropDownListMinPage, 0);
        WebElement dropDownListMaxPage = driver.findElement(Locators.DROP_DOWN_LIST_MAX_USER_AGE);
        searchPage.getDropDownListByIndex(dropDownListMaxPage, 62);
        System.out.println("List of brides sorted by age from 18 to 80 successfully!");
    }
}
