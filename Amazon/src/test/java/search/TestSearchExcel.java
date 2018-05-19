package search;

import base.CommonAPI;
import homesearch.SearchByExcel;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import java.io.IOException;

public class TestSearchExcel extends CommonAPI {
    @Test
    public void testReadFromFile() throws IOException{
        SearchByExcel searchPage = PageFactory.initElements(driver, SearchByExcel.class);
        searchPage.searchItemsAndSubmitutton();
    }
}
