package drop.down;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class DropDown extends CommonAPI{

    public void dropDownmMnu() throws InterruptedException {

        clickByXpath("//*[@href='https://hbocareers.com/']");
        handleNewTab(driver);
        //clickByXpath("//*[@class='section-main-search-input']");
        driver.findElement(By.xpath("//*[@class='section-main-search-input']")).sendKeys("Testing Software", Keys.ENTER);
        driver.manage().window().fullscreen();
        clickByXpath("//button[@type='button' and @title='Area of Interest']");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        clickByXpath("//*[@title='Ad Buying and Inventory']");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        clickByXpath("/html/body/div[7]/div/ul/li[3]/a/span");

    }
}

