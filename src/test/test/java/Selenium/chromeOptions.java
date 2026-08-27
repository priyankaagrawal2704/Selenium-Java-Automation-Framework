package Selenium;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.logging.Logs;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;

public class chromeOptions {
    public static void main(String[] args) {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito"); //enables incognito mode
//        options.addArguments("--start-maximized"); //starts in maximized mode
//        options.addArguments("--window-size=1920,1080"); //adjusts resolution
//        options.addArguments("--disable-popup-blocking"); //blocks popups
//        options.addExtensions(new File("path to crx file")); //adblocker should be downloaded first
        options.addArguments("--headless=new"); //headless mode
        ChromeDriver driver = new ChromeDriver(options);
        driver.get("https://fast.com/");
        System.out.println(driver.getTitle());
        Logger log = LoggerFactory.getLogger(chromeOptions.class);
        log.info("===== Info Log ====="); //info like driver opening, closing, any user interaction
        log.info("===== Opened fast.com =====");
        log.info("====="+driver.getTitle()+" =====");

        log.debug("===== debug =====");
        log.warn("===== warn =====");
        log.error("===== error =====");
    }
}
