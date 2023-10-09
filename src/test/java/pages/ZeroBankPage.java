package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ZeroBankPage {
    public ZeroBankPage() {
        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy(xpath = "//button[@id= 'signin_button']")
    public WebElement signIn;

    @FindBy(xpath = "//input[@id='user_login']")
    public WebElement userLoginBox;

    @FindBy(xpath = "//input[@id= 'user_password']")
    public WebElement userPasswordBox;

    @FindBy(xpath = "//input[@type= 'submit']")
    public WebElement submitSignButton;

    @FindBy(xpath = "(//*[text()= 'Online Banking'])[1]")
    public WebElement onlineBanking;

    @FindBy(xpath = "//*[text()= 'Pay Bills']")
    public WebElement payBills;

    @FindBy(xpath = "//*[@id='sp_amount']")
    public WebElement amountBox;

    @FindBy(xpath = "//*[@id='sp_date']")
    public WebElement dateBox;

    @FindBy(xpath = "//*[@id='pay_saved_payees']")
    public WebElement payButton;

    @FindBy(xpath = "//*[text()='The payment was successfully submitted.']")
    public WebElement paymentSuccessMessage;


}
