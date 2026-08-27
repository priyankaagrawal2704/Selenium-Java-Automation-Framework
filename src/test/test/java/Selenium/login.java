package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class login {
    public static void main(String[] args) {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://indusayush.in/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
        driver.findElement(By.name("loginid"))
                .sendKeys("");
        driver.findElement(By.name("password"))
                .sendKeys("");
        WebElement signIn = driver.findElement(By.xpath("//button[@class='btn btn-signin']"));
        JavascriptExecutor jse = driver;
//        jse.executeScript("document.getElementById('').click();");
        jse.executeScript("arguments[0].scrollIntoView();",signIn); //scrolls to element
        signIn.click();
    }
}
