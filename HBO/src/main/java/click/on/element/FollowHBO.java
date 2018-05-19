package click.on.element;

import base.CommonAPI;

public class FollowHBO extends CommonAPI{

    public void clickOnFollowHBOTwitter(){
        clickOnCss("#twitter-logo");
    }
    public void clickOnFollowHBOFacebbok(){
        clickOnCss("#facebook-logo");
    }
    public void clickOnFollowHBOInstagram(){
        clickByXpath("//*[@class='components/SocialMediaIcon--instagram']");
    }
    public void clickOnFollowHBOYouTube(){
        clickByXpath("//*[@id='btn-follow-youtube-blue']");
    }
}
