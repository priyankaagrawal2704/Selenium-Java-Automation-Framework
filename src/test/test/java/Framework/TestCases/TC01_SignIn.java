package Framework.TestCases;

import Framework.Elements.homePage;
import Framework.Elements.loginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import Framework.Utility.commons;
import org.testng.annotations.Test;

public class TC01_SignIn {
    WebDriver driver;
    commons cm = new commons();

    @BeforeMethod
    public void preCondition(){
        driver = cm.openDriver();
    }

    @Test
    public void tc01(){
        homePage hp = new homePage(driver);
        hp.goToSignIn();
        loginPage lp = new loginPage(driver);
        lp.login();
    }

    @AfterMethod
    public void postCondition(){
//        cm.quitDriver();
    }
}
