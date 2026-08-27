package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class mouseActions {

    public static void main(String[] args) {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://practicesoftwaretesting.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
        WebElement signIn = driver.findElement(By.linkText("Sign in"));

        Actions actions = new Actions(driver);
//        actions.contextClick(signIn).build().perform();
        signIn.click();
        WebElement email = driver.findElement(By.id("email"));
        actions.sendKeys(email, "NIT745AM").doubleClick(email)
                .build().perform();
        WebElement privacyPolicy = driver.findElement(By.linkText("Privacy Policy"));
        actions.moveToElement(privacyPolicy).click().build().perform();
    }
}


/*
Right Click - contextClick()
Left Click - click()
Double Click - doubleClick()
Scroll - moveToElement(), moveByOffset()
Drag & Drop - dragAndDrop(), dragAndDropBy()
Click and Hold - clickAndHold()
Release - release()
 */