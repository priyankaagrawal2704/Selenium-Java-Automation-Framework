package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class XPath {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","D:\\Users\\MANGALDEEP\\IdeaProjects\\Test2026\\chromedriver.exe");
        ChromeDriver driver=new ChromeDriver();
        driver.get("https://practicesoftwaretesting.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
        driver.findElement(By.xpath("//button[@aria-label='Open chat']")).click();

        driver.findElement(By.xpath("//input[@data-test='search-query']")).sendKeys("Hammer");
        driver.findElement(By.xpath("//button[@data-test='search-submit']")).click();
       driver.findElement(By.xpath("//h5[contains(text(),'Combination Pliers')]")).click();



    }
}
