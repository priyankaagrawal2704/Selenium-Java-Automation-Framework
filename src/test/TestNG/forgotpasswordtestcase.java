package PriyankaAgrawal.TestNG;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import java.time.Duration;

public class forgotpasswordtestcase {
@Test
    public void forgotpassword() {
    ChromeDriver driver=new ChromeDriver();
    driver.get("https://practicesoftwaretesting.com/");
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
    homepage hp= PageFactory.initElements(driver,homepage.class);
    hp.signin.click();
    loginpage lp=PageFactory.initElements(driver, loginpage.class);
    lp.forgotpassword.click();
    forgotpassword fp=PageFactory.initElements(driver, forgotpassword.class);
    fp.email.sendKeys("priya@gmail.com");
    fp.submitbutton.click();


    }
}
