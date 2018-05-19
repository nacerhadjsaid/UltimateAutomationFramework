package follow.hbo;

import click.on.element.FollowHBO;
import org.testng.annotations.Test;

public class FollowHBOTest extends FollowHBO{
    @Test
    public void testFacebook(){
        clickOnFollowHBOFacebbok();
    }
    @Test
    public void testTwitter(){
        clickOnFollowHBOTwitter();
    }
    @Test
    public void testInstagram(){
        clickOnFollowHBOInstagram();
    }
    @Test
    public void testYouTube(){
        clickOnFollowHBOYouTube();
    }

}
