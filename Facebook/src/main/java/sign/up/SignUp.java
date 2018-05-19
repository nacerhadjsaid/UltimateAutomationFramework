package sign.up;

import base.CommonAPI;

public class SignUp extends CommonAPI{
    public void enterFirstAndLastName(){
        typeByXpath("//input[@name='firstname']", "Alpha");
        typeByXpath("//input[@name='lastname']", "Beta");
    }
    public void enterEmailAndPassword(){
        typeByXpath("//input[@name='reg_email__']", "naver7hadj@gmail.com");
        typeByXpath("//input[@name='reg_passwd__']", "newaccount123");
    }
    public void enterDOB(){
        clickByXpath("//*[@id=\"month\"]/option[8]");
        clickByXpath("//*[@id=\"day\"]/option[1]");
        clickByXpath("//*[@id=\"year\"]/option[30]");
    }
    public void checkMalePoint(){
        clickByXpath("//*[@id='u_0_a']");
    }
    public void clickSignUpBotton(){
        clickByXpath("//*[@name='websubmit']");
    }
    public void signUpToFacebook() throws InterruptedException {
        enterFirstAndLastName();
        enterEmailAndPassword();
        enterDOB();
        checkMalePoint();
        clickSignUpBotton();

    }
}
