
 package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

 public class DavidAscDescSort {

     ChromeDriver driver;
    @BeforeMethod
    public void setup() {
        driver = new ChromeDriver();
        driver.get(System.getProperty("user.dir") + "\\src\\test\\java\\Selenium\\tableFilter.html");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));

    }
    @Test
     public void searchdavid() throws InterruptedException{
        WebElement searchname=driver.findElement(By.id("nameFilter"));
        searchname.sendKeys("David");

        WebElement searchresult=driver.findElement((By.xpath("//table[@id='dataTable'] //td[contains(text(),'David')]")));
        Assert.assertTrue(searchresult.isDisplayed());

        WebElement agecoulmn=driver.findElement(By.xpath("//th[@data-col='age']"));
        agecoulmn.click();
        Thread.sleep(6000);


       WebElement ageasc=driver.findElement(By.xpath("//th[@data-col='age' and @data-sort='asc']"));
       Assert.assertTrue(ageasc.isDisplayed());
       String asc=ageasc.getAttribute("data-sort");
       Assert.assertEquals(asc,"asc");
        Thread.sleep(6000);
       agecoulmn.click();

       WebElement agedes=driver.findElement(By.xpath("//th[@data-col='age' and @data-sort='desc']"));
       Assert.assertTrue(agedes.isDisplayed());
       agedes.getAttribute("data-sort");
        Thread.sleep(6000);
    }
    @AfterMethod
     public void after(){
        driver.quit();
    }


}