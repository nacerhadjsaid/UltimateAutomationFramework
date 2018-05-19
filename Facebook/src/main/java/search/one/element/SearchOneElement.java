package search.one.element;

import base.CommonAPI;

public class SearchOneElement extends CommonAPI{

    public void logIn(){
        typeByXpath("//*[@name='email']", "nacer7hadj@gmail.com");
        typeByXpath("//*[@name='pass']", "newaccount123");
        clickByXpath("//*[@id='loginbutton']");
    }
    public void searchOneElement(){
        typeByXpathEnter("//*[@name='q']", "Green Day");
    }
}
