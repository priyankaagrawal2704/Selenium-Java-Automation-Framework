package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import javax.swing.plaf.synth.SynthTabbedPaneUI;

public class inputassignment2selenium {

    //method for checking whether element is enabled or not

    public static boolean isElementenabled(WebElement element)
    {
        if(element.isEnabled())
        {
            return true;

        }
        else {
            System.out.print("Element is disabled");
            return false;
        }

    }

    public static void main(String[] args) {
        ChromeDriver driver=new ChromeDriver();
        String filepath=System.getProperty("user.dir");
        driver.get(filepath +"/src/test/java/Selenium/inputs.html");
        driver.manage().window().maximize();

        //Radio buttons

        WebElement male=driver.findElement(By.xpath("//input[@value='male']"));
        WebElement female=driver.findElement(By.xpath("//input[@value='female']"));
        WebElement other=driver.findElement(By.xpath("//input[@value='other']"));

        //male is selected by default
        if(male.isSelected())
        {
            System.out.print("Male is printed by default");

        }

        //Select female
       if(isElementenabled(female) && !female.isSelected())
        {
            female.click();
            System.out.println("female is selected");

        }
        //other is disabled
        if(!other.isEnabled())
        {
            System.out.println("other radio button is disabled");

        }

        //checkboxes
        WebElement subscribe =
                driver.findElement(By.id("subscribe"));

        WebElement terms =
                driver.findElement(By.id("terms"));

        WebElement offers =
                driver.findElement(By.id("offers"));

        //Subscribe is selected by default
        if(subscribe.isSelected())
        {
            System.out.println("Subscribe selected by default");
        }
        if(isElementenabled(terms) && !terms.isSelected())
        {
            terms.click();
            System.out.println("Term checkbox is selected");

        }
        //offers is disabled
        if(!offers.isEnabled())
        {
            System.out.println("Offers checkbox is disabled");
        }

        // INPUT FIELDS

        WebElement username =
                driver.findElement(By.id("username"));

        WebElement email =
                driver.findElement(By.id("email"));

        WebElement password =
                driver.findElement(By.id("password"));

        WebElement disabledField =
                driver.findElement(By.id("disabledField"));
        if (isElementenabled(username))
        {
         username.sendKeys("priyanka");
        }
        if(isElementenabled(email))
        {
            email.sendKeys("priya@gmail.com");
        }
        if(isElementenabled(password))
        {
            password.sendKeys("Admin@123");
        }
        if(isElementenabled(disabledField))
        {
           disabledField.sendKeys("ABC");
        }
        //Single select dropdown
        Select dropdown=new Select(driver.findElement(By.id("country")));
        dropdown.selectByIndex(1);
        System.out.println("Country Selected Successfully.");

        //multi select dropdown

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
