package search.one.element;

import org.testng.annotations.Test;

public class SearchOneElementTest extends SearchOneElement{
    @Test
    public void test(){
        logIn();
        searchOneElement();
    }
}
