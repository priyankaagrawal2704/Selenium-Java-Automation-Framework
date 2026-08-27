package PriyankaAgrawal.TestNG;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.time.Duration;

public class AutomateDropdownTestCase {
    @Test

    public void dropdownTc() throws InterruptedException {
        ChromeDriver driver=new ChromeDriver();
        driver.get("https://practicesoftwaretesting.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));

        AutomateDropdownHomePage dp= PageFactory.initElements(driver, AutomateDropdownHomePage.class);
        Select sc=new Select(dp.sortDropdown);
        sc.selectByVisibleText("");
        Thread.sleep(3000);

        sc.selectByVisibleText("Name (A - Z)");
        Thread.sleep(3000);

        sc.selectByVisibleText("Name (Z - A)");
        Thread.sleep(3000);
        sc.selectByValue("price,desc");
        Thread.sleep(3000);
        sc.selectByVisibleText("Price (Low - High)");
        Thread.sleep(3000);
        sc.selectByVisibleText("CO₂ Rating (A - E)");
        Thread.sleep(3000);
        sc.selectByVisibleText("CO₂ Rating (E - A)");
        Thread.sleep(3000);


    }
}
