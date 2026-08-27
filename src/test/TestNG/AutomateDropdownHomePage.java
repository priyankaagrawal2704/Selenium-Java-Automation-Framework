package PriyankaAgrawal.TestNG;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AutomateDropdownHomePage {
    @FindBy(xpath="//select[@aria-label='sort']")
    WebElement sortDropdown;

}
