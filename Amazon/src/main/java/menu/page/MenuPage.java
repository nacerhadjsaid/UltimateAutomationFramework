package menu.page;

import base.CommonAPI;
import org.testng.Assert;

import java.util.List;

public class MenuPage extends CommonAPI{

    public void readMenuText(){
        List<String> menu = getTextFromWebElements(".nav-search-dropdown.searchSelect option");
        for (String text:menu) {
            System.out.println(text);
        }
        List<String> expectMenu = menu;
        Assert.assertEquals(menu, expectMenu);
        /*expectMenu values will come from excel sheet or databases and it will be compared to text retured from webelement */
    }

}
