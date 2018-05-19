package search;

import base.CommonAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class SearchManyElemets extends CommonAPI {

    @FindBy(xpath = "//*[@class='components/Search--searchInput']")
    public WebElement searchInputField;
    @FindBy(xpath = "//div[@class='bands/MainNavigation--searchIcon']")
    public WebElement searchField;

    public WebElement getSearchField() {
        return searchField;
    }

    public WebElement getSearchInputField() {
        return searchInputField;
    }
    public List<String> getItemValue() {
        List<String> itemList = new ArrayList<String>();
        itemList.add("Spartacus");
        itemList.add("Rome");
        itemList.add("Gladiator");
        return itemList;
    }
    public void searchNames() {
        List<String> itemlist = getItemValue();
        for (String items : itemlist) {
            getSearchField().click();
            getSearchInputField().sendKeys(items, Keys.ENTER);
        }
    }


}
