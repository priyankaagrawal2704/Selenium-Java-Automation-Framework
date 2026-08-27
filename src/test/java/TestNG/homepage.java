package TestNG;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class homepage {
@FindBy(linkText = "Sign in") //driver.findElement(By.linkText("Sign in"));
    public WebElement signin;



}
