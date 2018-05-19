package search;

import homesearch.SearchElemets;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestSearchElemets extends SearchElemets {
    @Test
    public void test(){
        SearchElemets searchElemets = PageFactory.initElements(driver, SearchElemets.class);
        searchElemets.searchItems();
    }
}
