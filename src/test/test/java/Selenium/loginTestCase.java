package Selenium;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import java.time.Duration;

public class loginTestCase {
    @Test
    public void tcLogin(){
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://practicesoftwaretesting.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
//        homePage hp = new homePage();
//        hp.signIn;
        homePage hp = PageFactory.initElements(driver, homePage.class);
        hp.signIn.click();
        loginPage lp = PageFactory.initElements(driver, loginPage.class);
        lp.email.sendKeys("NIT745AM@gmail.com");
        lp.password.sendKeys("0132456789");
        lp.loginBtn.click();


    }
}
