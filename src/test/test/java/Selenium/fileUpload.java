package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class fileUpload {
    public static void main(String[] args) {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://practice.expandtesting.com/upload");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//input[@type='file']"))
                .sendKeys(System.getProperty("user.dir")+"\\src\\test\\java\\TestNG\\testAnnotation.xml");
        //xpath for upload button
    }
}
