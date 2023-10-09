package tests.lesson02;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;

public class TC_03_HardAssertion {
    @Test
    public void test01() {
// 1- amazon anasayfaya gidin
        Driver.getDriver().get(ConfigReader.getProperty("amazonURL"));
// 2- title'in Amazon icerdigini test edin
        String actualTitle = Driver.getDriver().getTitle();
        String expectedTitle = "Amazon";
        Assert.assertTrue(actualTitle.contains(expectedTitle));
// 3- Arama kutusunun erisilebilir oldugunu test edin
        AmazonPage amazonPage = new AmazonPage();
        Assert.assertTrue(amazonPage.amazonSearch.isEnabled());
// 4- arama kutusuna nutella yazip aratin
        amazonPage.amazonSearch.sendKeys("nutella", Keys.ENTER);
// 5- arama yapildigini test edin
        Assert.assertTrue(amazonPage.result.isDisplayed());
// 6- arama sonucunun Nutella icerdigini test edin
        Assert.assertTrue(amazonPage.result.getText().contains("nutella"));
        Driver.closeDriver();

    }
}
