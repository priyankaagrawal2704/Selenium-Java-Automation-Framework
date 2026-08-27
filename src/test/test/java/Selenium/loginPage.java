package Selenium;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class loginPage {
    @FindBy(xpath="//input[@type='email']")
    public WebElement email;

    @FindBy(id="password")
    public WebElement password;

    @FindBy(className="btnSubmit")
    public WebElement loginBtn;
}
