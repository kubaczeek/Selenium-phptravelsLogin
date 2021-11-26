import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.support.PageFactory;
import pages.DashboardPage;

public class TestLogin extends BaseTest{
    @Test
    public void loggingWithValidData(){
        loginPage.enterEmail ("user@phptravels.com");
        loginPage.enterPassword ("demouser");
        loginPage.clickLoginButton ();
        Assert.assertEquals ("Dashboard - PHPTRAVELS", driver.getTitle ());
        Assert.assertNotEquals ("Login - PHPTRAVELS", driver.getTitle ());
        DashboardPage dashboardPage1 =  PageFactory.initElements(driver, DashboardPage.class);
        Assert.assertTrue (dashboardPage1.pageLoaded ());
        String URL = driver.getCurrentUrl ();
        Assert.assertEquals (URL, "https://www.phptravels.net/account/dashboard");
    }
}
