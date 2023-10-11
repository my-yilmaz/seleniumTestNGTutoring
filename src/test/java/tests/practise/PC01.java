package tests.practise;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.DemoqaPage;
import utilities.ConfigReader;
import utilities.Driver;

public class PC01 {
    @Test
    public void test01() {
        // 01 - https://demoqa.com/ sitesine gidiniz
        Driver.getDriver().get(ConfigReader.getProperty("demoqaURL"));
        // 02 - Sayfa basliginin "DEMOQA" oldugunu dogrulayiniz
        String actualTitle = Driver.getDriver().getTitle();
        String expectedTitle = "DEMOQA";
        Assert.assertEquals(actualTitle, expectedTitle);
        // 03 - Belitrilen URL ile actual URL'in ayni oldugunu dogrulayiniz
        String actualURL = Driver.getDriver().getCurrentUrl();
        String expectedURL = "https://demoqa.com/";
        Assert.assertEquals(actualURL, expectedURL);
        // 04 - Site logosunun gorunur ve tiklanabilir oldugunu dogrulayiniz
        DemoqaPage demoqaPage = new DemoqaPage();
        Assert.assertTrue(demoqaPage.demoqaLogo.isDisplayed());
        Assert.assertTrue(demoqaPage.demoqaLogo.isEnabled());
        // 05 - "Elements" sekmesinin tiklanabilir oldugunu dorulayiniz
        Assert.assertTrue(demoqaPage.demoqaElementsSekmesi.isEnabled());
        // 06 - "Elements" sekmesine tiklayiniz
        demoqaPage.demoqaElementsSekmesi.click();
        // 07 - Acilan sayfada "Text" sekmesine tiklayiniz
        demoqaPage.textBoxSekmesi.click();
        // 08 - Full Name kutusuna isim giriniz ve kutunun etkin oldugunu dogrulayiniz
        demoqaPage.fullNameBox.sendKeys("Ali Can");
        SoftAssert softAssert= new SoftAssert();
        softAssert.assertTrue(demoqaPage.fullNameBox.isEnabled());
        // 09 - Email kutusuna email giriniz ve kutunun etkin oldugunu dogrulayiniz
        demoqaPage.emailBox.sendKeys("abc@gmail.com");
        softAssert.assertTrue(demoqaPage.emailBox.isEnabled());
        // 10 - Current Address kutusuna adres giriniz ve kutunun etkin oldugunu dogrulayiniz
        demoqaPage.currentAdresKutusu.sendKeys("ornek adres 123");
        softAssert.assertTrue(demoqaPage.currentAdresKutusu.isEnabled());
        // 11 - Permanent Address kutusuna adres giriniz ve kutunun etkin oldugunu dogrulayiniz
        demoqaPage.permanentAdresKutusu.sendKeys("permanent adres ornegi11");
        softAssert.assertTrue(demoqaPage.permanentAdresKutusu.isEnabled());
        // 12 - Submit butonunun etkin oldugunu dogrulayip butona tiklayiniz
        softAssert.assertTrue(demoqaPage.submitButonu.isEnabled());
        demoqaPage.submitButonu.click();
        // 13 - Submit yapilabildigini dogrulayiniz
        softAssert.assertTrue(demoqaPage.submitButonu.isEnabled());
        softAssert.assertAll();
        // 14 - Sayfayi kapatiniz
        Driver.quitDriver();
    }

}
