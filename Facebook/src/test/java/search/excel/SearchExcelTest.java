package search.excel;

import org.testng.annotations.Test;
import java.io.IOException;

public class SearchExcelTest extends SearchExcel{
    @Test
    public void test() throws IOException{
        logIn();
        searchByExcel();
    }
}
