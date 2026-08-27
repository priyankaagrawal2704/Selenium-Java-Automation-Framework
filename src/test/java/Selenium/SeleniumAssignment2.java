package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class SeleniumAssignment2 {
    public static void main(String[] args) {
        ChromeDriver driver=new ChromeDriver();
        driver.get("https://practicesoftwaretesting.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
        driver.findElement(By.id("search-query")).sendKeys("Pliers");
       WebElement searchbutton= driver.findElement(By.xpath("//button[@data-test='search-submit']"));
       searchbutton.click();
       List<WebElement> name=driver.findElements(By.xpath("//h5[contains(text(),'Pliers')]"));
        List<WebElement> prices=driver.findElements(By.xpath("//span[@data-test='product-price']"));
        for(int i=0; i<name.size(); i++)
        {
            System.out.println(name.get(i).getText() + " "+
           prices.get(i).getText());

        }


    }


}
