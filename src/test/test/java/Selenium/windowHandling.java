package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.Set;

public class windowHandling {
    public static void main(String[] args) throws Exception{
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        driver.findElement(By.linkText("Meta Store")).click();
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getTitle());
        String first =driver.getWindowHandle(); //tells the active window where Selenium is present
        System.out.println(first);
        Set<String> windows = driver.getWindowHandles();
        ArrayList<String> ar = new ArrayList<>(windows);
        driver.switchTo().window(ar.get(0));
        Thread.sleep(3000);
        driver.switchTo().window(ar.get(1));
//        driver.close();
        driver.quit();
    }
}
