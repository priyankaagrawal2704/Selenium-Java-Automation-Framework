package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class dynamicXpath {

    public String buildXpath(String s){
        String xpath = "//a[text()='"+s+"']";
        return xpath;
    }

    public static void main(String[] args) {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://practicesoftwaretesting.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
//        String xpath = "//a[text()='%s']";
//        String option = "Sign in";
//        String xpath = "//a[text()='"+option+"']";
        dynamicXpath dxp = new dynamicXpath();
        String xpath = dxp.buildXpath("Contact");
        System.out.println(xpath);
//        option = "Contact";
        driver.findElement(By.xpath(xpath)).click();
    }
}
/*
if we use %s & String format method, it will be concrete.
 */