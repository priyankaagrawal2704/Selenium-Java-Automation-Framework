package Selenium;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class Autochatvariable {
    @FindBy(xpath="//button[@aria-label='Open chat']")
    public WebElement chatbutton;

    @FindBy(xpath = "//button[contains(@data-test,'find-product')]")
    public  WebElement findproduct;

   @FindBy(xpath = "//input[@name='userInput']")
    public WebElement search;

   @FindBy(xpath="//button[@data-test='chat-send']")
    public WebElement sendbutton;

    @FindBy(xpath="//div[@class='product-list']")
    List<WebElement> results;





}
