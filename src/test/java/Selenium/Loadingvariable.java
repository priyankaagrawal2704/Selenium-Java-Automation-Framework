package Selenium;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Loadingvariable {
    @FindBy(xpath="//button[@id='populate-text']")
    public WebElement button;
    @FindBy(xpath = "//div[@id='success-message']")
    public WebElement success;
    @FindBy(xpath = "//div[@id='timer-log']")
    public WebElement timer;

}
