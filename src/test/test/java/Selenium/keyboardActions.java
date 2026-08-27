package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class keyboardActions {
    public static void main(String[] args) {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        Actions actions = new Actions(driver);
        WebElement email = driver.findElement(By.name("email"));
        WebElement pass = driver.findElement(By.name("pass"));
        actions.sendKeys(email,"Hello World!!").keyDown(Keys.CONTROL)
                .sendKeys("a") //ctrl+a
                .sendKeys("c").keyUp(Keys.CONTROL)
                .click(pass).keyDown(Keys.CONTROL).sendKeys("v")
                .build().perform();
    }
}

/*
Press Key - keyDown()
Release Key - keyUp()
 */