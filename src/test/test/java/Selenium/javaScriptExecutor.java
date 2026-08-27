package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class javaScriptExecutor {
    public static void main(String[] args) {
        ChromeDriver driver = new ChromeDriver();
        driver.get(System.getProperty("user.dir")+"\\src\\test\\java\\Selenium\\test.html");
        driver.manage().window().maximize();
        JavascriptExecutor jse = driver;
        jse.executeScript("document.getElementById('text').value='heyyyyy!!!!'");
        //alternative for sendKeys()
//        jse.executeScript("document.getElementById('text').type='hidden'");
        jse.executeScript("document.getElementById('Male').click();");
        WebElement checkbox = driver.findElement(By.id("checkbox"));
        jse.executeScript("arguments[0].scrollIntoView();",checkbox);
        //alternative for moveToElement()
        jse.executeScript("window.open()");
        //alternative to open a blank tab
    }
}
