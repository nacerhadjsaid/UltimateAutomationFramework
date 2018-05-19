package sign.in;

import base.CommonAPI;

public class SignIn extends CommonAPI{
    public void logIn(){
        typeByXpath("//*[@name='email']", "nacer7hadj@gmail.com");
        typeByXpath("//*[@name='pass']", "newaccount123");
        clickByXpath("//*[@id='loginbutton']");
    }
}
