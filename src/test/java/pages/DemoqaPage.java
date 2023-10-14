package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class DemoqaPage {
    public DemoqaPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//img[@src='/images/Toolsqa.jpg']")
    public WebElement demoqaLogo;
    @FindBy(xpath = "//*[text()='Elements']")
    public WebElement demoqaElementsSekmesi;
    @FindBy(xpath = "//span[text()='Text Box']")
    public WebElement textBoxSekmesi;
    @FindBy(xpath = "//*[text()='Check Box']")
    public WebElement checkBoxSekmesi;
    @FindBy(xpath = "(//*[@class='rct-icon rct-icon-uncheck'])[3]")
    public WebElement notesCheckBox;
    @FindBy(xpath = "//*[@class='text-success']")
    public WebElement notesSuccessYazisi;
    @FindBy(xpath = "//*[@class='rct-title']")
    public WebElement homeButonCheckBoxSayfasi;
    @FindBy(xpath = "//*[@class='rct-icon rct-icon-expand-all']")
    public WebElement plusSign;
    @FindBy(xpath = "//*[@class='rct-icon rct-icon-collapse-all']")
    public WebElement minusSign;
    @FindBy(xpath = "//input[@id='userName']")
    public WebElement fullNameBox;
    @FindBy(xpath = "//input[@id='userEmail']")
    public WebElement emailBox;
    @FindBy(xpath = "//*[@id='currentAddress']")
    public WebElement currentAdresKutusu;
    @FindBy(xpath = "//*[@id='permanentAddress']")
    public WebElement permanentAdresKutusu;
    @FindBy(xpath = "//*[@id='submit']")
    public WebElement submitButonu;
    @FindBy(xpath = "//p[@id='permanentAddress']")
    public WebElement dynamicBoxfilledAfterSubmit;
    @FindBy(xpath = "(//div[@class='avatar mx-auto white'])[5]")
    public WebElement interactions;
    @FindBy(xpath = "//*[text()='Droppable']")
    public  WebElement droppableSekmesi;
    @FindBy(xpath = "//*[text()='Drag me']")
    public WebElement dragMe;
    @FindBy(xpath = "(//div[@id='droppable'])[1]")
    public WebElement droppableBox;
    @FindBy(xpath = "//*[text()='Dropped!']")
    public WebElement droppedText;
    @FindBy(xpath = "//*[text()='Radio Button']")
    public WebElement radioButton;
    @FindBy(xpath = "//*[@for='yesRadio']")
    public WebElement yesRadio;
    @FindBy(xpath = "//*[@class='text-success']")
    public WebElement yesSuccess;
    @FindBy(xpath = "//*[@for='impressiveRadio']")
    public WebElement impressiveRadio;
    @FindBy(xpath = "//*[@class='text-success']")
    public WebElement impressiveSuccess;
    @FindBy(xpath = "//*[@for='noRadio']")
    public WebElement noRadio;




}
