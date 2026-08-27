package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import java.util.List;

public class classTagName {
    public static void main(String[] args) {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.tgsrtcbus.in/");
        driver.manage().window().maximize();
        driver.findElement(By.className("close_icon"))
                .click();

        List<WebElement> elements = driver.findElements(By.tagName("input"));
        System.out.println(elements.size());
    }
}
