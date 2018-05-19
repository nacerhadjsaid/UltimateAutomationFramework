package homesearch;

import base.CommonAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SearchByExcel extends CommonAPI {

    @FindBy(how = How.CSS, using = "#twotabsearchtextbox")
    public static WebElement searchInputWebElement;

    @FindBy(how = How.CSS, using = ".nav-input")
    public static WebElement submitButtonWebElement;

    public static WebElement getSearchInputWebElement() {
        return searchInputWebElement;
    }

    public static WebElement getSubmitButtonWebElement() {
        return submitButtonWebElement;
    }

    public void searchFor(String value) {
        getSearchInputWebElement().sendKeys(value);
    }

    public void submitSearchButton() {
        getSubmitButtonWebElement().click();
    }

    public void clearInput() {
        getSearchInputWebElement().clear();
    }

    public void searchItemsAndSubmitutton() throws IOException {
        ItemsToBeSearched itemsToBeSearched = new ItemsToBeSearched();
        String[] value = itemsToBeSearched.getDataFromExcelFile();
        for (int i = 1; i < value.length; i++) {
            searchFor(value[i]);
            submitSearchButton();
            clearInput();
        }
    }
//    public static void main(String[] args) {
//        ConnectDB connectDB = new ConnectDB();
//        connectDB.insertDataFromArrayListToMySql1(getItemValue(), "shoppingList", "Items");
//    }
}
