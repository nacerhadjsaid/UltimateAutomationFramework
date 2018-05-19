package search.element.list;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class SearchElementListTest extends SearchElementList{
    @Test
    public void test(){
        logIn();
        SearchElementList searchElementList = PageFactory.initElements(driver, SearchElementList.class);
        searchElementList.searchItems();
    }
}
