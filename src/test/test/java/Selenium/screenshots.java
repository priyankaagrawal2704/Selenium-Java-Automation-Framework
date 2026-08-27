package Selenium;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.File;

public class screenshots {
    public static void main(String[] args) throws Exception
    {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito"); //enables incognito mode
//        options.addArguments("--start-maximized"); //starts in maximized mode
//        options.addArguments("--window-size=1920,1080"); //adjusts resolution
        options.addArguments("--headless=new"); //headless mode
        ChromeDriver driver = new ChromeDriver(options);
        driver.get("https://fast.com/");
        TakesScreenshot ts = driver;
        File src = driver.getScreenshotAs(OutputType.FILE);
        System.out.println(src);
        File dest = new File("./screenshot.jpg"); //root folder = NIT Project
        FileUtils.copyFile(src,dest);
    }
}
