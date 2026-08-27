package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.testng.Assert;
import java.time.Duration;

public class LoadingPage {
    @Test
    public void loadingTest(){
        WebDriver driver=new ChromeDriver();
        String filepath=System.getProperty("user.dir");
        driver.get(filepath +"/src/test/java/Selenium/loading.html");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));

        Loadingvariable lv= PageFactory.initElements(driver,Loadingvariable.class);
        lv.button.click();
        WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(6000));
        wait.until(ExpectedConditions.visibilityOf(lv.success));
        String timer=lv.timer.getText();
        Assert.assertTrue(timer.contains("Loaded in"));




    }
}
