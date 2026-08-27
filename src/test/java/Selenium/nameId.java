package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class nameId {
    public static void main(String[] args) {
        ChromeDriver driver=new ChromeDriver();
        driver.get("https://www.amazon.in");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
        WebElement searchbox=driver.findElement(By.name("field-keywords"));
        searchbox.sendKeys("Iphone16");
        WebElement searchbtn=driver.findElement(By.id("nav-search-submit-button"));
        searchbtn.click();
        String s= driver.findElement(By.xpath("//span[contains(text(),'results')]")).getText();
        System.out.print(s);

    }



}
