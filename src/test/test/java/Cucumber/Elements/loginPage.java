package Cucumber.Elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPage {
    public ChromeDriver driver;
    public loginPage(ChromeDriver dr){
        driver = dr;
        PageFactory.initElements(driver,this);
    }

    @FindBy(id="email")
    public WebElement email;

    public void login(){
        email.sendKeys("");
        /*
        password.sendKeys();
        loginBtnb.click();
         */
    }
}
