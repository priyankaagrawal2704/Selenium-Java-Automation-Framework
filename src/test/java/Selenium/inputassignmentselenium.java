package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class inputassignmentselenium {
    public static void main(String[] args) throws InterruptedException {
        ChromeDriver driver=new ChromeDriver();
     String filepath= System.getProperty("user.dir");
     driver.get(filepath+"/src/test/java/Selenium/inputs.html");
     driver.manage().window().maximize();
     WebElement female=driver.findElement(By.xpath("//input[@value='female']"));
     if(!female.isSelected())
     {
         female.click();
     }
     Thread.sleep(3000);

        WebElement subscribe=driver.findElement(By.id("subscribe"));
     if(!subscribe.isSelected())
     {
         subscribe.click();
     }
     WebElement terms=driver.findElement(By.id("terms"));
     if(!terms.isSelected())
     {
         terms.click();
     }
     driver.findElement(By.id("username")).sendKeys("priya");
     driver.findElement(By.id("password")).sendKeys("priya");
     Select dropdown=new Select(driver.findElement(By.id("country")));
     dropdown.selectByIndex(1);

     WebElement skills=driver.findElement(By.id("skills"));
        System.out.println(skills.getText());
     Select sc= new Select(skills);
     if(sc.isMultiple())
     {
         System.out.print("Multi select dropdown");
         sc.selectByValue("java");
         sc.selectByValue("go");
     }     else{
         System.out.print("single select dropdown");

     }



    }
}
