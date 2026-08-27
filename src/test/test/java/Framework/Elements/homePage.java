package Framework.Elements;

import org.assertj.core.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.Duration;

public class homePage {
    WebDriver driver;

    Logger log = LoggerFactory.getLogger(homePage.class);

    public homePage(WebDriver dr){
        driver = dr;
        PageFactory.initElements(driver,this);
    }

    @FindBy(linkText = "Sign in")
    public WebElement signIn;

    public void goToSignIn(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
        signIn.click();
//        Assertions.assertThat(driver.getCurrentUrl())
//                .contains("login");
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(60));
        wait.until(ExpectedConditions.urlContains("login"));
        log.info("===== Navigated to Login Page =====");
    }
}
