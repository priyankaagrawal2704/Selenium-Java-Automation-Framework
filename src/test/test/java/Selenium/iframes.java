package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframes {
    public static void main(String[] args) {
        ChromeDriver driver = new ChromeDriver();
        driver.get(System.getProperty("user.dir")+"//src//test//java//Selenium//test.html");
        driver.manage().window().maximize();
        driver.findElement(By.name("text"))
                .sendKeys("Hiiiiii");
//        driver.switchTo().frame(0); //switching based on iFrame index
//        driver.switchTo().frame("iFrame"); //based on name attribute's value of iframe tag
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@name='iFrame']")));
        driver.findElement(By.name("IframeText"))
                .sendKeys("Heyyyyyy");
//        driver.switchTo().parentFrame();
        driver.switchTo().defaultContent();
        driver.findElement(By.id("checkbox")).click();
    }
}
