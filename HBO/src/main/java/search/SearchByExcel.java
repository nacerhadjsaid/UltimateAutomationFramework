package search;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.io.IOException;

public class SearchByExcel {
    @FindBy(how = How.XPATH, using = "/html/body/main/div[1]/div/div/header/div[1]/div/div[2]/div/div/div")
    public static WebElement searchField;

    @FindBy(how = How.XPATH, using = "//*[@class='components/Search--searchInput']")
    public static WebElement searchInputWebElement;

    public static WebElement getSearchInputWebElement() {
        return searchInputWebElement;
    }

    public static WebElement getSearchField() {
        return searchField;
    }

    public void searchFor(String value){
        getSearchInputWebElement().sendKeys(value);
    }
    public void clickOnSearchWebElement(){
        getSearchField().click();
    }
    public void clearInput(){
        getSearchInputWebElement().clear();
    }

    public void searchItemsAndSubmitutton() throws IOException {
        ItemsToBeSearched itemsToBeSearched = new ItemsToBeSearched();
        String [] value = itemsToBeSearched.getDataFromExcelFile();
        for(int i = 1; i< value.length; i++){
            clickOnSearchWebElement();
            searchFor(value[i]);
            clearInput();
        }
    }
}
