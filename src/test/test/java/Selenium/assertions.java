package Selenium;

import org.assertj.core.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class assertions {

    public static void main(String[] args) {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://practicesoftwaretesting.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
        String url = driver.getCurrentUrl();
//        Assertions.assertThat(url).contains("practicesoftwaretesting.com");
//        Assertions.assertThat(driver.getTitle()).contains("Practice software Testing");
//        Assertions.assertThat(driver.getTitle()).containsIgnoringCase("practice software testing");
//        Assertions.assertThat(driver.getTitle()).isEqualTo("Practice Software Testing - Toolshop - v5.0");
//        Assertions.assertThat(driver.findElement(By.xpath("//a[@class='navbar-brand']")).isDisplayed())
//                .isTrue();
//        Assertions.assertThat(driver.findElement(By.linkText("Sign in")).isEnabled())
//                .isTrue();
        driver.navigate().to("https://practicesoftwaretesting.com/auth/login");
        WebElement email = driver.findElement(By.id("email"));
        email.sendKeys("NIT745AM");
        Assertions.assertThat(email.getAttribute("value"))
                .isEqualTo("NIT745AM");
    }
}
