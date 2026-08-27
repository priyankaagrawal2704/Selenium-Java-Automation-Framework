package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
public class Iframe {
    public static void main(String[] args) {
        ChromeDriver driver = new ChromeDriver();
        String filepath = System.getProperty("user.dir");
        driver.get(filepath + "/src/test/java/Selenium/iframes.html");
        driver.manage().window().maximize();

        //IFrame 1
        driver.switchTo().frame(0);
        driver.findElement(By.xpath("//input[@placeholder='Input inside Iframe 1']")).sendKeys("Priyanka");
        driver.findElement(By.xpath("//button[text()='Button in Iframe 1']")).click();
        driver.switchTo().defaultContent();
        //Parent Frame 1.1
        driver.switchTo().frame(1);
        driver.findElement(By.xpath("//input[@placeholder='Input inside Iframe 1.1']")).sendKeys("Parent frame 1.1");
        driver.findElement(By.xpath("//button[text()='Button in Iframe 1.1']")).click();
        //child frame 1.2
        driver.switchTo().frame(0);
        driver.findElement(By.xpath("//input[@placeholder='Input inside Iframe 1.2']")).sendKeys("child frame 1.2");
        driver.findElement(By.xpath("//button[text()='Button in Iframe 1.2']"));
        driver.switchTo().parentFrame();
        //Back to main page
        driver.switchTo().defaultContent();

    }

    }

