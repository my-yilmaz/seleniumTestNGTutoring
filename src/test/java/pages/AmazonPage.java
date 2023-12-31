package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;


public class AmazonPage {
    public AmazonPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[@id='twotabsearchtextbox']")
    public WebElement amazonSearch;
    @FindBy(xpath = "//span[@class='a-color-state a-text-bold']")
    public WebElement result;
    @FindBy(xpath = "(//span[@class='a-size-medium a-color-base a-text-normal'])[1]")
    public WebElement ilkUrun;
    @FindBy(xpath = "//select[@id='searchDropdownBox']")
    public WebElement allDropDownBox;
    @FindBy(xpath = "(//div[@class='a-section aok-relative s-image-square-aspect'])[1]")
    public WebElement ilkUrunResmi;
    @FindBy(xpath = "//span[@id='productTitle']")
    public WebElement urunTitleElementi;
    @FindBy(xpath = "//*[text()='Account & Lists']")
    public WebElement accountLists;
    @FindBy(xpath = "//*[text()='Create a List']")
    public WebElement createAList;
    @FindBy(id = "my-lists-tab")
    public  WebElement yourLists;
    @FindBy(xpath = "(//a[text()='Start here.'])[1]")
    public WebElement startHere;
    @FindBy(xpath = "//*[@id='ap_customer_name']")
    public WebElement yourNameBox;
    @FindBy(xpath = "(//span[text()='Sign in'])[2]")
    public WebElement signin2;

}
