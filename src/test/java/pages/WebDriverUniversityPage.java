package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class WebDriverUniversityPage {
    public WebDriverUniversityPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath = "//*[text()='Hover Over Me First!']")
    public WebElement hoverOverMeFirst;
    @FindBy(xpath = "(//a[text()='Link 1'])[1]")
    public WebElement link1;
    @FindBy(xpath = "//*[text()='Click and Hold!']")
    public WebElement clickAndHold;
    @FindBy(xpath = "//*[@id='click-box']")
    public WebElement wellDoneText;
    @FindBy(xpath = "//h2")
    public WebElement doubleClickMe;
}
