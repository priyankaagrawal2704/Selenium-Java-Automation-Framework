package Selenium;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class sample {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\NiT\\IdeaProjects\\NIT-745AM-May2026\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
//        FirefoxDriver driver2 = new FirefoxDriver();
//        EdgeDriver driver3 = new EdgeDriver();
//        SafariDriver driver4 = new SafariDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        String url = driver.getCurrentUrl();
        String title = driver.getTitle();
        System.out.println(url);
        System.out.println(title);
//        driver.manage().window().minimize();
        driver.navigate().to("https://www.google.com/");
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();
    }
}
