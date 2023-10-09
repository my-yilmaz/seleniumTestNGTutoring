package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class SauceDemoPage {

    public SauceDemoPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "user-name")
    public WebElement userNameBox;

@FindBy(xpath = "//*[@id= 'password']")
    public WebElement passWordBox;

@FindBy(id = "login-button")
    public WebElement loginButonu;
@FindBy(xpath = "//*[text()='Sauce Labs Backpack']")
    public WebElement ilkUrun;
@FindBy(id = "add-to-cart-sauce-labs-backpack")
    public WebElement addtoCartButonu;
@FindBy(className = "shopping_cart_link")
    public WebElement shoppingCart;

@FindBy(id = "remove-sauce-labs-backpack")
    public WebElement removeButton;

}
