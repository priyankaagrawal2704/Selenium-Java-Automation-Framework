package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class getAttribute {
    public static void main(String[] args) {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://tickets.paytm.com/flights/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
        driver.findElement(By.xpath("//button[@aria-label='Close']")).click();
        WebElement chkbox = driver.findElement(By.xpath("//i[contains(@aria-label,'Checkbox')]"));
        chkbox.click();
        String value = chkbox.getAttribute("aria-label");
        System.out.println(value);
    }
}
