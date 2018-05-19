package search.element.list;

import base.CommonAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class SearchElementList extends CommonAPI{

    public void logIn(){
        typeByXpath("//*[@name='email']", "nacer7hadj@gmail.com");
        typeByXpath("//*[@name='pass']", "newaccount123");
        clickByXpath("//*[@id='loginbutton']");
    }

    @FindBy(xpath = "//*[@name='q']")
    public WebElement searchInputField;

    public WebElement getSearchInputField() {
        return searchInputField;
    }

    public void searchItems(){
        List<String> itemList = getItemValue();
        for (String st : itemList) {
            getSearchInputField().sendKeys(st, Keys.ENTER);
            getSearchInputField().clear();
        }
    }

    public static List<String> getItemValue(){
        List<String> itemsList = new ArrayList<String>();
        itemsList.add("Green Day");
        itemsList.add("Nikelback");
        itemsList.add("Metallica");
        return itemsList;
    }
}
