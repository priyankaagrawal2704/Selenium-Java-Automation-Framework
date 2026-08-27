package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class cssSelector {
    public static void main(String[] args) {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.tgsrtcbus.in/");
        driver.manage().window().maximize();
//        driver.findElement(By.cssSelector("div[class='close_icon']")).click();
        driver.findElement(By.cssSelector("div.close_icon")).click();
    }
}
