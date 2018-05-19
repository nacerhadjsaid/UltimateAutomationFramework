package search.google.sheet;

import org.testng.annotations.Test;

import java.io.IOException;

public class SearchGoogleSheetTest extends SearchGoogleSheet{
    @Test
    public void test()throws IOException, InterruptedException{
        logIn();
        searchItemsByName("1MWJclr9eRpCx1fr9MVoiqMLyuxVe2UPpODvjQlogisQ","Sheet1!A1:A");
    }
}
