package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class alertasssignment {
    public static void main(String[] args) throws Exception{
        ChromeDriver driver=new ChromeDriver();
        String filePath = System.getProperty("user.dir"); //retrieves the path to this file
        System.out.print(filePath);
        driver.get(filePath+"/src/test/java/Selenium/alert-assignment.html");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//button[@onclick='showAlert()']")).click();
        Thread.sleep(3000);
        driver.switchTo().alert().accept();
        driver.findElement(By.xpath("//button[@onclick='showConfirm()']")).click();
        Thread.sleep(3000);
        driver.switchTo().alert().accept();
        driver.findElement(By.xpath("//button[@onclick='showPrompt()']")).click();
        Thread.sleep(3000);
        driver.switchTo().alert().sendKeys("Priyanka");

        String text=driver.switchTo().alert().getText();
        driver.switchTo().alert().accept();
        System.out.print(text);


    }
}
