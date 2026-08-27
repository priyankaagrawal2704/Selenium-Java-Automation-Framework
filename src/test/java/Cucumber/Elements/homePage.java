package Cucumber.Elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

public class homePage {
    ChromeDriver driver;

    public homePage(ChromeDriver dr){
        driver = dr;
        PageFactory.initElements(driver,this);
    }

    @FindBy(linkText = "Sign in" )
    public WebElement signIn;


    public void clickSignIn(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
        signIn.click();
    }
}
