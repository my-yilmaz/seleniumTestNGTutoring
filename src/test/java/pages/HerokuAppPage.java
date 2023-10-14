package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HerokuAppPage {
    public HerokuAppPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "(//input[@type= 'checkbox']) [1]")
    public WebElement checkBox1;
    @FindBy(xpath = "(//input[@type= 'checkbox']) [2]")
    public WebElement checkBox2;
    @FindBy(xpath = "//h3[text()= 'Checkboxes']")
    public WebElement titleCheckboxes;
    @FindBy(xpath = "//select[@id='dropdown']")
    public WebElement dropDownMenu;
    @FindBy(xpath = "//*[text()='Click for JS Alert']")
    public WebElement clickforJsAlert;
    @FindBy(xpath = "//*[text()='Click for JS Confirm']")
    public WebElement clickForJSConfirm;
    @FindBy(xpath = "//*[text()='Click for JS Prompt']")
    public WebElement clickforJsPrompt;
    @FindBy(xpath = "//*[text()='You successfully clicked an alert']")
    public WebElement successfullyClickedAlert;
    @FindBy(xpath = "//*[@id='result']")
    public WebElement sonucYazisi;
    @FindBy(xpath = "//h3")
    public WebElement iFrameTitle;
    @FindBy(id = "mce_0_ifr")
    public WebElement iframe;
    @FindBy(xpath = "//*[@id='tinymce']")
    public WebElement textBox;
    @FindBy(linkText = "Elemental Selenium")
    public WebElement elementalSelenium;
    @FindBy(xpath = "//input[@type='text']")
    public WebElement dynamicTextBox;
    @FindBy(xpath = "(//button[@type='button'])[2]")
    public WebElement enableButonu;
    @FindBy(xpath = "//*[@id='message']")
    public WebElement enabledMesaji;
    @FindBy(xpath = "//h3")
    public WebElement openingTitle;
    @FindBy(linkText = "Click Here")
    public WebElement clickHereLink;
    @FindBy(xpath = "//h3")
    public WebElement newWindowText;
    @FindBy(id = "hot-spot")
    public WebElement cizgiliAlan;
    @FindBy(tagName = "h1")
    public WebElement makeSureText;
    @FindBy(xpath = "//a[text()='test.txt']")
    public WebElement testTxt;
    @FindBy(id = "file-upload")
    public WebElement fileUpload;
    @FindBy(id = "file-submit")
    public WebElement fileSubmit;
    @FindBy(tagName = "h3")
    public WebElement fileUploadedText;

}