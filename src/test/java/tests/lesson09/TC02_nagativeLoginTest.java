package tests.lesson09;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.BlueRentPage;
import utilities.ConfigReader;
import utilities.Driver;

public class TC02_nagativeLoginTest {
    @Test
    public void yanlisEmailDogruSifre() {
        // https://www.bluerentalcars.com/ adresine git
        Driver.getDriver().get(ConfigReader.getProperty("blueURL"));
        // login butonuna bas
        BlueRentPage blueRentPage = new BlueRentPage();
        blueRentPage.loginButtonHomePage.click();
        // test data user email
        blueRentPage.usernameBox.sendKeys(ConfigReader.getProperty("fakeEmail"));
        // test data password : 12345
        blueRentPage.passwordBox.sendKeys(ConfigReader.getProperty("blueRentalPassword"));
        // login butonuna tiklayin
        blueRentPage.submitButton.click();
        // Degerleri girildiginde sayfaya basarili sekilde girilebildigini test et
        Assert.assertTrue(blueRentPage.submitButton.isDisplayed());
        Driver.closeDriver();
    }

    @Test
    public void dogruEmailYanlisSifre() {   // https://www.bluerentalcars.com/ adresine git
        Driver.getDriver().get(ConfigReader.getProperty("blueURL"));
        // login butonuna bas
        BlueRentPage blueRentPage = new BlueRentPage();
        blueRentPage.loginButtonHomePage.click();
        // test data user email
        blueRentPage.usernameBox.sendKeys(ConfigReader.getProperty("blueRentalEmail"));
        // test data password : 12345
        blueRentPage.passwordBox.sendKeys(ConfigReader.getProperty("fakePassword"));
        // login butonuna tiklayin
        blueRentPage.submitButton.click();
        // Degerleri girildiginde sayfaya basarili sekilde girilebildigini test et
        Assert.assertTrue(blueRentPage.submitButton.isDisplayed());
        Driver.closeDriver();
    }

    @Test
    public void yanlisEmailYanlisSifre() {   // https://www.bluerentalcars.com/ adresine git
        Driver.getDriver().get(ConfigReader.getProperty("blueURL"));
        // login butonuna bas
        BlueRentPage blueRentPage = new BlueRentPage();
        blueRentPage.loginButtonHomePage.click();
        // test data user email
        blueRentPage.usernameBox.sendKeys(ConfigReader.getProperty("fakeEmail"));
        // test data password : 12345
        blueRentPage.passwordBox.sendKeys(ConfigReader.getProperty("fakePassword"));
        // login butonuna tiklayin
        blueRentPage.submitButton.click();
        // Degerleri girildiginde sayfaya basarili sekilde girilebildigini test et
        Assert.assertTrue(blueRentPage.submitButton.isDisplayed());
        Driver.closeDriver();
    }

}
