package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataProvider {

    @DataProvider(name = "sample", parallel = true)
    public Object[][] dataProvider(){
        return new Object[][]{{"1","1"},{"2","2"},{"3","3"}};
    }

    @Test(dataProvider = "sample")
    public void test(String name, String pass){
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        WebElement email = driver.findElement(By.name("email"));
        WebElement password = driver.findElement(By.name("pass"));
        email.sendKeys(name);
        password.sendKeys(pass);

    }

}
