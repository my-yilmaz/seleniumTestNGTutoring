package tests.lesson02;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.HepsiBuradaPage;
import utilities.ConfigReader;
import utilities.Driver;

import java.security.Key;
import java.time.Duration;

public class TC05_SoftAssertion {
    @Test
    public void softAssertion() {
        //1. “https://www.hepsiburada.com/” Adresine gidin
        Driver.getDriver().get("https://www.hepsiburada.com");
        //2. Basliginin “Turkiye’nin En Buyuk Alisveris Sitesi" icerdigini dogrulayin
        String actualTitle = Driver.getDriver().getTitle();
        String expected = "Turkiye’nin En Buyuk Alisveris Sitesi";
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(actualTitle.contains(expected));
        //3. search kutusuna araba yazip arattirin
        HepsiBuradaPage hepsiBuradaPage = new HepsiBuradaPage();
        Driver.wait(5);
        hepsiBuradaPage.cookiesAcceptButton.click();
        JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
        jse.executeScript("arguments[0].click();", hepsiBuradaPage.hepsiBuradaAramaKutusu);

        //hepsiBuradaPage.hepsiBuradaAramaKutusu.click();
        hepsiBuradaPage.hepsiBuradaAramaKutusu.sendKeys("araba", Keys.ENTER);
        //4. bulunan sonuc sayisini yazdirin
        System.out.println("sonucYaziElementi = " + hepsiBuradaPage.sonucYaziElementi.getText());
        //5. sonuc yazisinin "araba" icerdigini dogrulayin
        softAssert.assertTrue(hepsiBuradaPage.sonucYaziElementi.getText().contains("araba"));
        //6. Sonuc yazisinin “oto” kelimesi icerMEdigini dogrulayin
        softAssert.assertFalse(hepsiBuradaPage.sonucYaziElementi.getText().contains("oto"));
        softAssert.assertAll();
        Driver.closeDriver();
    }
}
