package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class isEnabled {
    public static void main(String[] args) {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://practicesoftwaretesting.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
        WebElement testingGuide = driver.findElement(By.className("testing-guide-btn"));
        System.out.println(testingGuide.isDisplayed());
        System.out.println(testingGuide.isEnabled());
    }
}
