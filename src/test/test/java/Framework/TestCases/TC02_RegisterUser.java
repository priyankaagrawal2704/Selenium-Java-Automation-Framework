package Framework.TestCases;

import Framework.Elements.homePage;
import Framework.Elements.loginPage;
import Framework.Utility.commons;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC02_RegisterUser {
    WebDriver driver;
    commons cm = new commons();

    @BeforeMethod
    public void preCondition(){
        driver = cm.openDriver();
    }


    @Test
    public void tc02(){
        homePage hp = new homePage(driver);
        hp.goToSignIn();
        loginPage lp = new loginPage(driver);
        lp.register();
    }

    @AfterMethod
    public void postCondition(){
//        cm.quitDriver();
    }
}
