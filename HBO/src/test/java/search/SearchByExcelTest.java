package search;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import java.io.IOException;

public class SearchByExcelTest extends CommonAPI{
    @Test
    public void testReadFromFile() throws IOException {
        SearchByExcel searchByExcel = PageFactory.initElements(driver, SearchByExcel.class);
        searchByExcel.searchItemsAndSubmitutton();
    }
}
