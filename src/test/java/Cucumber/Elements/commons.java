package Cucumber.Elements;

import org.openqa.selenium.chrome.ChromeDriver;

public class commons {
    public ChromeDriver driver;

    public ChromeDriver openApp(){
        driver = new ChromeDriver();
        driver.get("https://practicesoftwaretesting.com/");
        driver.manage().window().maximize();
        return driver;
    }

}
