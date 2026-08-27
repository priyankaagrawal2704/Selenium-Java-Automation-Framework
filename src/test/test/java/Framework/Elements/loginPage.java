package Framework.Elements;

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

public class loginPage {
    WebDriver driver;

    public loginPage(WebDriver dr){
        driver = dr;
        PageFactory.initElements(driver,this);
    }

    Logger log = LoggerFactory.getLogger(loginPage.class);

    @FindBy(id="email")
    public WebElement email;

    @FindBy(id="password")
    public WebElement password;

    @FindBy(className="btnSubmit")
    public WebElement loginBtn;

    @FindBy(linkText = "Register your account")
    public WebElement register;

    public void login(){
        email.sendKeys("admin@practicesoftwaretesting.com");
        password.sendKeys("welcome01");
        //Wrong practice to give creds here. Use @parameters.
        //Use @DataProvider also
        loginBtn.click();
        log.info("===== Logged in =====");
    }


    /**
     * Logs in Creds as parameters
     * @param username
     * @param pass
     */
    public void loginWithParams(String username, String pass){
        email.sendKeys(username);
        password.sendKeys(pass);
        loginBtn.click();
        log.info("===== Logged in =====");
    }

    public void register(){
        register.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
        wait.until(ExpectedConditions.urlContains("register"));
        log.info("===== Navigated to Register Page ====");
    }
}
