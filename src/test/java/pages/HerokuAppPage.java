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
}