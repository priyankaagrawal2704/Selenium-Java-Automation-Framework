package TestNG;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;

public class AutomateDropdownTestCase {

    ChromeDriver driver;
    AutomateDropdownHomePage hp;

    @BeforeMethod
    public  void setup()
    {
        driver= new ChromeDriver();
        driver.get("https://practicesoftwaretesting.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
        hp=PageFactory.initElements(driver, AutomateDropdownHomePage.class);

    }

    @Test
    public void tcNameAZ() throws Exception
    {
      hp.selectDropdown("NameAZ");
      Thread.sleep(2000);
      ArrayList<String> actual=hp.getProductNames();

      ArrayList<String> expected=new ArrayList<>(actual);
      Collections.sort(expected);
        Assert.assertEquals(actual,expected);
    }
    @Test
    public void tcNameZA() throws InterruptedException {
        hp.selectDropdown("NameZA");
        Thread.sleep(3000);
        ArrayList<String> actual =hp.getProductNames();
        ArrayList<String> expected=new ArrayList<>(actual);
        Collections.sort(expected);
        Collections.reverse(expected);
        Assert.assertEquals(actual,expected);

    }

    @Test
    public void tcPriceLH() throws Exception
    {
        hp.selectDropdown("PriceLH");

        Thread.sleep(3000);

        ArrayList<Double> actual = hp.getProductPrices();
        ArrayList<Double> expected=new ArrayList<>(actual);
        Collections.sort(expected);
        Assert.assertEquals(actual,expected);

    }
    @Test
    public void tcPriceHL() throws Exception
    {
        hp.selectDropdown("PriceHL");

        Thread.sleep(3000);

        ArrayList<Double> actual = hp.getProductPrices();
        ArrayList<Double> expected=new ArrayList<>(actual);
        Collections.sort(expected);
        Collections.reverse(expected);
        Assert.assertEquals(actual,expected);

    }

    @Test
    public void tcCO2AE() throws Exception {

        hp.selectDropdown("CO2AE");

        Thread.sleep(2000);

        ArrayList<String> actual = hp.getCO2Ratings();

        ArrayList<String> expected = new ArrayList<>(actual);

        Collections.sort(expected);

        Assert.assertEquals(actual, expected);
    }
    @Test
    public void tcCO2EA() throws Exception {

        hp.selectDropdown("CO2EA");

        Thread.sleep(2000);

        ArrayList<String> actual = hp.getCO2Ratings();

        ArrayList<String> expected = new ArrayList<>(actual);

        Collections.sort(expected);

        Collections.reverse(expected);

        Assert.assertEquals(actual, expected);
    }


    }

