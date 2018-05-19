package search;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class SearchTest extends SearchOneElement {
    @Test
    public void oneElement() {
       searchHBO();
    }

    @Test
    public void manyElemets(){
        SearchManyElemets searchManyElemets = PageFactory.initElements(driver, SearchManyElemets.class);
        searchManyElemets.searchNames();
    }
}
