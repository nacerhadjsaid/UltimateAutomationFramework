package menu;

import base.CommonAPI;
import menu.page.MenuPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import javax.xml.ws.WebEndpoint;
import java.util.List;

public class TestDropBoxMenu extends MenuPage {

    @Test
    public void menu () {
        readMenuText();
    }
}
