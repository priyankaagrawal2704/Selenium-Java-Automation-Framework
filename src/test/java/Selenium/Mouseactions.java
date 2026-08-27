package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class Mouseactions {
    public static void main(String[] args) throws InterruptedException {
        ChromeDriver driver=new ChromeDriver();
        String filepath=System.getProperty("user.dir");
        driver.get(filepath +"/src/test/java/Selenium/mouseActions.html");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
        Actions act=new Actions(driver);
        //click
        WebElement click=driver.findElement(By.id("clickBox"));
        act.click(click).perform();
        Thread.sleep(3000);
        System.out.println("Click performed Successfully");

        //Double click

        WebElement dblclick=driver.findElement(By.id("dblClickBox"));
        act.doubleClick(dblclick).perform();
        Thread.sleep(3000);
        System.out.println("Double Click performed Successfully");


        //Right click

        WebElement rightclick=driver.findElement(By.id("rightClickBox"));
        act.contextClick(rightclick).perform();
        Thread.sleep(3000);
        System.out.println("Right Click performed Successfully");

        //Mouse hover
        WebElement hover=driver.findElement(By.id("hoverBox"));
        act.moveToElement(hover).perform();
        Thread.sleep(3000);
        System.out.println("Mouse hover performed Successfully");

        //Drag and Drop
        WebElement source=driver.findElement(By.id("dragBox"));
        WebElement target=driver.findElement(By.id("dropZone"));
        act.dragAndDrop(source,target).perform();
        Thread.sleep(3000);
        System.out.println("Drag and Drop performed Successfully");


        //Click and Hold
        WebElement hold=driver.findElement(By.id("holdBox"));
        act.clickAndHold(hold).pause(Duration.ofSeconds(30)).release().perform();
        Thread.sleep(3000);
        System.out.println("Click and Hold performed Successfully");

        driver.quit();

    }
}
