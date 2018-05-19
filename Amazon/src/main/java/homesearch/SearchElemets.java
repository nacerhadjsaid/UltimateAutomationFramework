package homesearch;

import base.CommonAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class SearchElemets extends CommonAPI {

    @FindBy(css = "#twotabsearchtextbox")
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
        itemsList.add("java book");
        itemsList.add("selenium book");
        itemsList.add("laptop");
        itemsList.add("honney");
        itemsList.add("flour");
        itemsList.add("toys");
        itemsList.add("PS4games");
        itemsList.add("phone");
        itemsList.add("ball" +
                "");
        return itemsList;
    }
}
