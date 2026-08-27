package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class alert {
    public static void main(String[] args) throws Exception {
        ChromeDriver driver=new ChromeDriver();
        String filepath=System.getProperty("user.dir");
        System.out.print(filepath);
        driver.get(filepath+"/src/test/java/Selenium/test.html");
        driver.manage().window().maximize();
        driver.findElement(By.name("alert")).click();
        Thread.sleep(3000);
        driver.switchTo().alert().accept();
        driver.findElement(By.name("confirm")).click();
        Thread.sleep(3000);
        driver.switchTo().alert().dismiss();
        driver.findElement(By.name("prompt")).click();
        Thread.sleep(3000);
        driver.switchTo().alert().sendKeys("Priyanka");
        driver.switchTo().alert().accept();
        String text=driver.switchTo().alert().getText();
        System.out.print(text);
        driver.switchTo().alert().accept();


    }
}
