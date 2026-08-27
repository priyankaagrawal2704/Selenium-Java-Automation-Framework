package TestNG;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class forgotpassword {
@FindBy(className = "ForgetPwd")
    public WebElement forgotpassword;
@FindBy(id="email")
    public WebElement email;
@FindBy(className="btnSubmit")
    public WebElement submitbutton;

}
