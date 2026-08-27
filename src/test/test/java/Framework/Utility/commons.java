package Framework.Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.Duration;

public class commons {
    public WebDriver driver; //null
    Logger log = LoggerFactory.getLogger(commons.class);

    public WebDriver openDriver(){
        System.out.println("Before opening driver: "+driver);
        driver = new ChromeDriver();
        System.out.println("After opening driver: "+driver);
        driver.manage().window().maximize();
        log.info("===== Opening the app =====");
        driver.get("https://practicesoftwaretesting.com/");
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
        return driver;
    }

    public void quitDriver(){
        log.info("===== Quitting the driver ====");
        driver.quit();
    }

}
