package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage{

    @FindBy(css = ".form-group input[name='email']")
    WebElement emailInput;

    @FindBy(css = ".form-group input[name='password']")
    WebElement passwordInput;

    @FindBy(css = ".container button[type='submit']")
    WebElement loginButton;

    public void enterEmail(String text){
        emailInput.sendKeys(text);
    }

    public void enterPassword(String text){
        passwordInput.sendKeys(text);
    }

    public void clickLoginButton(){
        loginButton.click ();
    }
}
