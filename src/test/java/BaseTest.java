import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import pages.DashboardPage;
import pages.LoginPage;

import java.util.concurrent.TimeUnit;

public class BaseTest {

    WebDriver driver;
    String BASE_URL = "https://www.phptravels.net/login";
    LoginPage loginPage;
    DashboardPage dashboardPage;

    @Before
    public void setup(){
        System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
        driver = new ChromeDriver();
        loginPage = PageFactory.initElements(driver, LoginPage.class);
        dashboardPage = PageFactory.initElements(driver, DashboardPage.class);
        driver.get(BASE_URL);
        driver.manage ().window ().maximize ();
    }

    @After
    public void tearDown(){
//        driver.quit();
    }


//    WebDriver driver;
//    @Before
//    public void setUp(){
//        System.setProperty ("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe" );
//        driver = new ChromeDriver ();
//        driver.manage ().timeouts().implicitlyWait (1000, TimeUnit.MILLISECONDS);
//        driver.manage ().window ().maximize ();
//        driver.get ("http://automationpractice.com/index.php");
//        driver.toString ();
//    }
//
//    @Test
//    public void userRegistrationWithValidData() throws InterruptedException {
//        WebElement signInButton = driver.findElement (By.cssSelector ("[title=\"Log in to your customer account\"]"));
//        signInButton.click ();
//        Thread.sleep (5000);
//
//        WebElement emailInput = driver.findElement (By.id ("email_create"));
//        emailInput.sendKeys ("emailMojPierwszyTest@mirol.pl");
//        WebElement createAccountButton = driver.findElement (By.id ("SubmitCreate"));
//        createAccountButton.click ();
//        Thread.sleep (5000);
//    }
//
//    @Test
//    public void firstTest(){
//
//
////        driver.quit ();
//    }
//
//    @After
//    public void tearDown(){
////        driver.quit ();
//    }
}
