package tests.lesson09;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.BlueRentPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

public class TC01_positiveLoginTest extends TestBaseRapor {
    @Test
    public void dogruEmailDogruSifre() {
        extentTest=extentReports.createTest("Positive Test","Dogru Email Dogru Sifre ile siteye girilebilmeli");
        // https://www.bluerentalcars.com/ adresine git
        Driver.getDriver().get(ConfigReader.getProperty("blueURL"));
        extentTest.info("anasayfaya gidildi");
        // login butonuna bas
        BlueRentPage blueRentPage = new BlueRentPage();
        blueRentPage.loginButtonHomePage.click();
        extentTest.info("login butonuna tiklandi");
        // test data user email
        blueRentPage.usernameBox.sendKeys(ConfigReader.getProperty("blueRentalEmail"));
        extentTest.info("dogru email girildi");
        // test data password : 12345
        blueRentPage.passwordBox.sendKeys(ConfigReader.getProperty("blueRentalPassword"));
        extentTest.info("dogru password girildi");
        // login butonuna tiklayin
        blueRentPage.submitButton.click();
        extentTest.info("Submit butonuna tiklandi");
        // Degerleri girildiginde sayfaya basarili sekilde girilebildigini test et
        Assert.assertTrue(blueRentPage.kullaniciAdi.isDisplayed());
        extentTest.pass("Basarili bir sekilde giris yapildi.");
        Driver.closeDriver();
    }
}
