package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

public class WindowhandlingMain {

    public static void main(String[] args) {
        WebDriver driver= new ChromeDriver();
        driver.get(System.getProperty("user.dir")+"\\src\\test\\java\\Selenium\\main.html");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6000));

        String parent=driver.getWindowHandle();
        driver.findElement(By.linkText("Open Tab 1")).click();
        driver.findElement(By.linkText("Open Tab 2")).click();
        driver.findElement(By.linkText("Open Tab 3")).click();
        driver.findElement(By.linkText("Open Tab 4")).click();
        driver.findElement(By.linkText("Open Tab 5")).click();
        driver.findElement(By.linkText("Open Window")).click();

        Set<String> windows= driver.getWindowHandles();
        ArrayList<String> ar= new ArrayList<>(windows);
        System.out.println("Total no of windows" + ar.size());
       driver.switchTo().window(ar.get(1));
       System.out.println("Tab1:" + driver.getTitle());

       driver.switchTo().window(ar.get(2));
       System.out.println("Tab2:"+ driver.getTitle());

       driver.switchTo().window(ar.get(3));
       System.out.println("tab 3" + driver.getTitle());

       driver.switchTo().window(ar.get(4));
       System.out.println("Tab 4" +driver.getTitle());

       driver.switchTo().window(ar.get(5));
       System.out.println("Tab 5" +driver.getTitle());

       driver.switchTo().window(ar.get(6));
       System.out.println("Tab6" + driver.getTitle());

       driver.switchTo().window(parent);
       System.out.println("Switch to main page");
       System.out.println("Main page title" +driver.getTitle());

    }

}
