import org.junit.Assert;
import org.junit.Test;

public class TestLogin  extends BaseTest{
    @Test
    public void loggingWithValidData(){
        loginPage.enterEmail ("user@phptravels.com");
        loginPage.enterPasswordAndLogin ("demouser");
//        Assert.assertEquals ("Dashboard - PHPTRAVELS", driver.getTitle ());
        Assert.assertNotEquals ("Login - PHPTRAVELS", driver.getTitle ());
    }
}
