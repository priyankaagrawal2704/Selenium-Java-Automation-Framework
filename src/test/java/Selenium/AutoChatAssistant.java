package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class AutoChatAssistant {
@Test
    public void searchhammer(){
    WebDriver driver=new ChromeDriver();
    driver.get("https://practicesoftwaretesting.com/");
    driver.manage().window().maximize();

  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
 Autochatvariable acv= PageFactory.initElements(driver,Autochatvariable.class);
acv.chatbutton.click();
acv.findproduct.click();
acv.search.sendKeys("hammer");
acv.sendbutton.click();;

List<String> search_results=new ArrayList<>();

for(WebElement results:acv.results){
search_results.add(results.getText());
System.out.println(search_results);
}
}
}
