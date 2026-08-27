package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class countnoofresults {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","D:\\Users\\MANGALDEEP\\IdeaProjects\\Test2026\\chromedriver.exe");
        ChromeDriver driver=new ChromeDriver();
        driver.get("https://www.amazon.in/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
        WebElement searchbox=driver.findElement(By.name("field-keywords"));
        searchbox.sendKeys("Iphone 16 pro");
        WebElement button=driver.findElement(By.id("nav-search-submit-button"));
        button.click();
        String s= driver.findElement(By.xpath("//span[contains(text(),'results')]")).getText();
        System.out.print(s);

    }


}
