package TestNG;

import com.google.common.annotations.VisibleForTesting;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import java.time.Duration;

public class logintestcase {
        @Test
        public void tcLogin(){
            ChromeDriver driver=new ChromeDriver();
            driver.get("https://practicesoftwaretesting.com/");
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
        homepage hp= PageFactory.initElements(driver, homepage.class);
        hp.signin.click();
        loginpage lp=PageFactory.initElements(driver, loginpage.class);
        lp.email.sendKeys("priyanka@gmail.com");
        lp.password.sendKeys("admin@123");
        lp.loginBtn.click();



    }
}
