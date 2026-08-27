package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

public class dropdowns {
    public static void main(String[] args) {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://practicesoftwaretesting.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
        Select dropdown = new Select(driver.findElement(By.xpath("//select[@aria-label='sort']")));
        dropdown.selectByIndex(4);
        dropdown.selectByIndex(0);
        dropdown.selectByValue("name,desc");
        dropdown.selectByVisibleText("CO₂ Rating (A - E)");
        List<WebElement> list = dropdown.getOptions();
        System.out.println(list.size());
        System.out.println(dropdown.getFirstSelectedOption().getText());
        System.out.println(dropdown.isMultiple());

    }
}
