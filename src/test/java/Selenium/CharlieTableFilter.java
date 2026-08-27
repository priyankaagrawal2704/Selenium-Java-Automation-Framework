package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class CharlieTableFilter {

    ChromeDriver driver=new ChromeDriver();
    @BeforeMethod
    public void setup(){
        driver.get(System.getProperty("user.dir")+ "\\src\\test\\java\\Selenium\\tableFilter.html");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));

    }
    @Test
    public void searchCharlie() throws InterruptedException
    {
        //search charlie
        WebElement search=driver.findElement(By.id("nameFilter"));
        search.sendKeys("Charlie");
        //result verify
        WebElement result=driver.findElement(By.xpath("//*[contains(text(),'Charlie')]"));
        Assert.assertTrue(result.isDisplayed());
        //verify page 1 of 3
        WebElement page1=driver.findElement((By.xpath("//*[contains(text(),'Page 1 of 3')]")));
        Assert.assertTrue(page1.isDisplayed());

        //Click next page 2 of 3
        WebElement next=driver.findElement(By.id("nextPage"));
        next.click();
        result=driver.findElement(By.xpath("//*[contains(text(),'Charlie')]"));
        Assert.assertTrue(result.isDisplayed());
        WebElement page2=driver.findElement((By.xpath("//*[contains(text(),'Page 2 of 3')]")));
        Assert.assertTrue(page2.isDisplayed());

        //click next page 3 of 3
        next=driver.findElement(By.id("nextPage"));
        next.click();
        result=driver.findElement(By.xpath("//*[contains(text(),'Charlie')]"));
        Assert.assertTrue(result.isDisplayed());
        WebElement page3=driver.findElement((By.xpath("//*[contains(text(),'Page 3 of 3')]")));
        Assert.assertTrue(page3.isDisplayed());
        //Total record count
        WebElement pageInfo = driver.findElement(By.id("pageInfo"));
        System.out.println(pageInfo.getText());



    }
}
