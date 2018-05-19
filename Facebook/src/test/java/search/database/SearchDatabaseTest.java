package search.database;

import org.testng.annotations.Test;

public class SearchDatabaseTest extends SearchDataBase{
    @Test
    public void testSearchByDB() throws Exception {
        logIn();
        searchByDB();
    }
}
