package search;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class TestLandingPage extends CommonAPI {

        @Test
        public void test(){
            driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Books",Keys.ENTER);
        }



    }
