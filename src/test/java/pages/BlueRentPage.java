package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class BlueRentPage {
    public BlueRentPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[@href='/login']")
    public WebElement loginButtonHomePage;
    @FindBy(xpath = "//*[@id='formBasicEmail']")
    public WebElement usernameBox;
    @FindBy(xpath = "//*[@id='formBasicPassword']")
    public WebElement passwordBox;
    @FindBy(xpath = "//*[@type='submit']")
    public WebElement submitButton;
    @FindBy(id = "dropdown-basic-button")
    public  WebElement kullaniciAdi;
}
