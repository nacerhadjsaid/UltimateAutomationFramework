package search;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class SearchOneElement extends CommonAPI{

    public void searchHBO() {
        clickByXpath("//div[@class='bands/MainNavigation--searchIcon']");
        driver.findElement(By.xpath("//*[@class='components/Search--searchInput']")).sendKeys("Game of thrones", Keys.ENTER);
    }

}
