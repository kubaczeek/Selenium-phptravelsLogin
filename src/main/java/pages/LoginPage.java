package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage{

    @FindBy(css = ".form-group input[name='email']")
    WebElement emailInput;

    @FindBy(css = ".form-group input[name='password']")
    WebElement passwordInput;

//    @FindBy(className = ".btn.btn-default.btn-lg.btn-block.effect.ladda-button.waves-effect")
//    public
//    WebElement loginButton;

    @FindBy(className = ".btn-lg")
    public
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

    public void enterPasswordAndLogin(String text){
        passwordInput.sendKeys(text + Keys.ENTER);
    }
}
