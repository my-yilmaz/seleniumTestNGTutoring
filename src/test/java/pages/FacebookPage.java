package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class FacebookPage {

    public FacebookPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[@title= 'Allow all cookies']")
    public WebElement allowCookiesButton;
    @FindBy(xpath = "(//a[@role= 'button'])[2]")
    public WebElement createNewButton;
    @FindBy(xpath = "(//input[@type= 'radio'])[2]")
    public WebElement maleRadioButonu;
    @FindBy(xpath = "//div[text()= 'Sign Up']")
    public WebElement signUpText;

}
