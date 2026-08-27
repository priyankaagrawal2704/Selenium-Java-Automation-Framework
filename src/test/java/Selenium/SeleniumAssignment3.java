package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class SeleniumAssignment3
{
    public static void main(String[] args) {
        ChromeDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://practice.expandtesting.com/dropdown");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
       Select dropdown=new Select(driver.findElement(By.id("dropdown")));
       dropdown.selectByIndex(1);
       Select dropdown2=new Select(driver.findElement(By.id("elementsPerPageSelect")));
       dropdown2.selectByIndex(2);
       Select dropdown3=new Select(driver.findElement((By.name("country"))));
       dropdown3.selectByValue("AF");
    }
}
