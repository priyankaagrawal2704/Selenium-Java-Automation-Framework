package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class explicitWait {
    public static void main(String[] args) {
        ChromeDriver driver = new ChromeDriver();
        driver.get(System.getProperty("user.dir")+"\\src\\test\\java\\Selenium\\test.html");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
        WebElement btn = driver.findElement(By.xpath("//button[text()='Click the button']"));
        btn.click();
        WebElement hw = driver.findElement(By.xpath("//p[@id='result']"));
//        WebElement hw = driver.findElement(By.xpath("//p[text()='Hello World!!!']"));
//        System.out.println(hw.isDisplayed());
//        System.out.println(hw.getText());

        WebDriverWait wait = new WebDriverWait(driver,Duration.ofMinutes(60));
        wait.until(ExpectedConditions.textToBePresentInElement(hw,"Hello World!!!"));
        System.out.println("visible");
        driver.findElement(By.name("delay")).click();
        wait.until(ExpectedConditions.alertIsPresent());
        driver.switchTo().alert().accept();
        driver.navigate().to("https://www.facebook.com/");
        driver.findElement(By.partialLinkText("More languages")).click();
        WebElement zaza = driver.findElement(By.xpath("//div[text()='Zaza']"));
        wait.until(ExpectedConditions.visibilityOf(zaza));
        zaza.click();
    }
}
