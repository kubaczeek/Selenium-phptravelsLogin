import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import pages.DashboardPage;
import pages.LoginPage;

public class BaseTest {

    WebDriver driver;
    String BASE_URL = "https://www.phptravels.net/login";
    LoginPage loginPage;
    DashboardPage dashboardPage;

    @Before
    public void setup(){
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver = new ChromeDriver();
        loginPage = PageFactory.initElements(driver, LoginPage.class);
        dashboardPage = PageFactory.initElements(driver, DashboardPage.class);
        driver.get(BASE_URL);
        driver.manage ().window ().maximize ();
    }

    @After
    public void tearDown(){
        driver.quit();
    }
}
