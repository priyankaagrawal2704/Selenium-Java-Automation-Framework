package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class linkPartialLinkText {
    public static void main(String[] args) {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        WebElement insta = driver.findElement(By.linkText("Instagram"));
        insta.click();
        driver.navigate().back();
        driver.findElement(By.partialLinkText("Quest"))
                .click();
    }
}
