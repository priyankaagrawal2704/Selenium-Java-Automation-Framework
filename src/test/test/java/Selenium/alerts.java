package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class alerts {
    public static void main(String[] args) throws Exception {
        ChromeDriver driver = new ChromeDriver();
        String filePath = System.getProperty("user.dir"); //retrieves the path to this file
        System.out.println(filePath);
        driver.get(filePath+"/src/test/java/Selenium/test.html");
        driver.manage().window().maximize();
        driver.findElement(By.name("alert")).click();
        Thread.sleep(3000);
        driver.switchTo().alert().accept(); //clicks OK on alert
        driver.findElement(By.name("confirm")).click();
        Thread.sleep(3000);
        driver.switchTo().alert().dismiss(); //clicks Cancel on alert
        driver.findElement(By.name("prompt")).click();
        driver.switchTo().alert().sendKeys("NIT745AM");
        driver.switchTo().alert().accept();
        String text = driver.switchTo().alert().getText(); //alert's text value
        System.out.println(text);
    }
}
