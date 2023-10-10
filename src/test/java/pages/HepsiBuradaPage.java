package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HepsiBuradaPage {
    public HepsiBuradaPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath = "//*[@*='Ürün, kategori veya marka ara']")
    public WebElement hepsiBuradaAramaKutusu;
    @FindBy(xpath = "//*[text()=' ürün bulduk']")
    public WebElement sonucYaziElementi;
    @FindBy(xpath = "//*[@id='onetrust-accept-btn-handler']")
    public WebElement cookiesAcceptButton;


}
