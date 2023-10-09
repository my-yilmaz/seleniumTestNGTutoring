package tests.lesson02;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;

import java.security.Key;

public class TC_04_Soft_Assertion {
    @Test
    public void test01() {
// 1- amazon anasayfaya gidin
        Driver.getDriver().get(ConfigReader.getProperty("amazonURL"));
// 2- title'in Amazon icerdigini test edin
        String actualTitle = Driver.getDriver().getTitle();
        String expectedTitle = "Amazon";
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(actualTitle.contains(expectedTitle));
// 3- Arama kutusunun erisilebilir oldugunu test edin
        AmazonPage amazonPage = new AmazonPage();
        softAssert.assertTrue(amazonPage.amazonSearch.isEnabled());
// 4- arama kutusuna nutella yazip aratin
        amazonPage.amazonSearch.sendKeys("nutella", Keys.ENTER);
// 5- arama yapildigini test edin
        softAssert.assertTrue(amazonPage.result.isDisplayed());
// 6- arama sonucunun Nutella icerdigini test edin
        softAssert.assertTrue(amazonPage.result.getText().contains("nutella"));
        softAssert.assertAll();
        Driver.closeDriver();
    }

}
