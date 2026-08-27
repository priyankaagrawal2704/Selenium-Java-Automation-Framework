package PriyankaAgrawal.TestNG;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class loginpage {
@FindBy(id= "email")
    public WebElement email;
@FindBy(id="password")
    public WebElement password;
@FindBy(className = "btnSubmit")
    public WebElement loginBtn;
@FindBy(linkText = "Forgot your Password?")
    public WebElement forgotpassword;

}


