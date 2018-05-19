package search;

import homesearch.SearchOneElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestSearchOneElement extends SearchOneElement{
    @Test
    public void search(){
        typeOnInputField("#twotabsearchtextbox","iPhone");
        clickOnElement(".nav-input");
    }
    @Test
    public void test(){
        SearchOneElement searchOneElement = PageFactory.initElements(driver, SearchOneElement.class);
        searchOneElement.searchOneElement();
    }
}
