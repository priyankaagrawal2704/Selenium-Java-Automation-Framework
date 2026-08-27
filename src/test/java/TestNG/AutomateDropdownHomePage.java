package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class AutomateDropdownHomePage {
    @FindBy(xpath = "//select[@aria-label='sort']")
    WebElement sortDropdown;
    @FindBy(xpath = "//h5")
    List<WebElement> products;
    @FindBy(xpath = "//span[@data-test='product-price']")
    List<WebElement> prices;
    @FindBy(xpath = "//div[@data-test='co2-rating-badge']")
    List<WebElement> co2Ratings;

    public void selectDropdown(String option) {
        Select sc = new Select(sortDropdown);
        switch (option) {
            case "NameAZ":
                sc.selectByVisibleText("Name (A - Z)");
                break;

            case "NameZA":
                sc.selectByVisibleText("Name (Z - A)");
                break;

            case "PriceHL":
                sc.selectByVisibleText("Price (High - Low)");
                break;

            case "PriceLH":
                sc.selectByVisibleText("Price (Low - High)");
                break;

            case "CO2AE":
                sc.selectByVisibleText("CO₂ Rating (A - E)");
                break;

            case "CO2EA":
                sc.selectByVisibleText("CO₂ Rating (E - A)");
                break;
            default:
                System.out.println("Invalid option");
        }

    }

    public ArrayList<String> getProductNames() {
        ArrayList<String> list = new ArrayList<>();
        for (WebElement e : products) {
            list.add(e.getText());
        }
        return list;
    }

    public ArrayList<Double> getProductPrices() {
        ArrayList<Double> list = new ArrayList<>();

        for (WebElement e : prices) {
            String price = e.getText();

            // Remove currency symbol
            price = price.replace("$", "");

            list.add(Double.parseDouble(price));
        }

        return list;
    }
    public ArrayList<String> getCO2Ratings()
    {
        ArrayList<String> list = new ArrayList<>();

        for(WebElement e : co2Ratings)
        {
            WebElement active = e.findElement(
                    By.xpath(".//span[contains(@class,'active')]"));
            System.out.println(active.getText());
            list.add(active.getText());
        }

        return list;
    }
}

