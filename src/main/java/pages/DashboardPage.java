package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashboardPage {
    @FindBy(css = ".author__meta")
    WebElement welcomeBackText;

    public boolean pageLoaded(){
        return welcomeBackText.isDisplayed ();
    }
}
