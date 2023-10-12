package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class DemoqaPage {
public DemoqaPage(){
    PageFactory.initElements(Driver.getDriver(), this);
}
@FindBy(xpath = "//img[@src='/images/Toolsqa.jpg']")
    public WebElement demoqaLogo;
@FindBy(xpath = "(//div[@class='avatar mx-auto white'])[1]")
    public WebElement demoqaElementsSekmesi;
    @FindBy(xpath = "//span[text()='Text Box']")
    public WebElement textBoxSekmesi;
    @FindBy(xpath = "//input[@id='userName']")
    public WebElement fullNameBox;
    @FindBy(xpath = "//input[@id='userEmail']")
    public  WebElement emailBox;
    @FindBy(xpath = "//*[@id='currentAddress']")
    public WebElement currentAdresKutusu;
    @FindBy(xpath = "//*[@id='permanentAddress']")
    public WebElement permanentAdresKutusu;
    @FindBy(xpath = "//*[@id='submit']")
    public WebElement submitButonu;
    @FindBy(xpath = "//p[@id='permanentAddress']")
    public WebElement dynamicBoxfilledAfterSubmit;
    @FindBy(xpath = "//*[text()='Alerts, Frame & Windows']")
    public WebElement alertsFrameWindows;
    @FindBy(xpath = "//*[text()='Alerts']")
    public WebElement alerts;
    @FindBy(xpath = "(//div[@class='avatar mx-auto white'])[5]")
    public WebElement interactions;
    @FindBy(xpath = "//*[text()='Droppable']")
    public WebElement droppableSekmesi;
    @FindBy(xpath = "//*[text()='Drag me']")
    public WebElement dragMe;
    @FindBy(xpath = "(//div[@id='droppable'])[1]")
    public WebElement droppleBox;
    @FindBy(linkText = "Dropped!")
    public WebElement droppedText;

}
