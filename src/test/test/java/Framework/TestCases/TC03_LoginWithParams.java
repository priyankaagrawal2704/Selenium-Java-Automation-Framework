package Framework.TestCases;

import Framework.Elements.homePage;
import Framework.Elements.loginPage;
import Framework.Utility.commons;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TC03_LoginWithParams {
    WebDriver driver;
    commons cm = new commons();

    @BeforeMethod
    public void preCondition(){
        driver = cm.openDriver();
    }

    @Parameters({"username","password"})
    @Test
    public void tc03(String username, String password){
        homePage hp = new homePage(driver);
        hp.goToSignIn();
        loginPage lp = new loginPage(driver);
        lp.loginWithParams(username,password);
    }

    @AfterMethod
    public void postCondition(){
//        cm.quitDriver();
    }
}
