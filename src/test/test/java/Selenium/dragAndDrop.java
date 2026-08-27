package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dragAndDrop {
    public static void main(String[] args) throws Exception{
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://emicalculator.net/");
        driver.manage().window().maximize();
        WebElement loanSlider = driver.findElement(By.id("loanamountslider"));
        Actions actions = new Actions(driver);
        actions.dragAndDropBy(loanSlider,50,0)
                .build().perform();
        Thread.sleep(3000);
        actions.dragAndDropBy(loanSlider,-50,0)
                .build().perform();
        Dimension dim = loanSlider.getSize();
        int width = dim.getWidth();
        int height = dim.getHeight();
        System.out.println(width);
    }
}
