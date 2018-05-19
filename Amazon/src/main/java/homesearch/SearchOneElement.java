package homesearch;

import base.CommonAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchOneElement extends CommonAPI{

    @FindBy(css = "#twotabsearchtextbox")
    public WebElement searchInputField;

    public WebElement getSearchInputField() {
        return searchInputField;
    }

    public void searchOneElement(){
        getSearchInputField().sendKeys("Java Book",Keys.ENTER);
    }
}
