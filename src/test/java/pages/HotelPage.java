package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class HotelPage {
    public HotelPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[@id='UserName']")
    public WebElement usernameBox;
    @FindBy(xpath = "//*[@id='Password']")
    public WebElement passwordBox;
    @FindBy(xpath = "//*[@type='submit']")
    public WebElement submitButton;
    @FindBy(xpath = "//thead//tr[1]//th")
    public List<WebElement> sutunBasliklariListesi;
    @FindBy(xpath = "//tbody")
    public WebElement tablo;

    @FindBy(xpath = "//tbody//tr")
    public List<WebElement> satirList;
    @FindBy(xpath = "//tbody//tr[4]//td")
    public List<WebElement> dorduncuSatir;


}
