package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class nameId {
    public static void main(String[] args) {
//        System.setProperty("webdriver.chrome.driver","");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.in/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
        WebElement searchBox = driver.findElement(By.name("field-keywords"));
        searchBox.sendKeys("Iphone 16");
        WebElement searchBtn = driver.findElement(By.id("nav-search-submit-button"));
        searchBtn.click();
    }
}
