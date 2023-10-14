package tests.lesson07;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;

public class TC01_DataProvider {
    @Test
    public void test01() {
        // amazon'a gidip
        Driver.getDriver().get(ConfigReader.getProperty("amazonURL"));
        // Java aratalim
        AmazonPage amazonPage = new AmazonPage();
        amazonPage.amazonSearch.sendKeys("java", Keys.ENTER);
        // ve arama sonuclarinin Java icerdigini test edelim
        Assert.assertTrue(amazonPage.result.getText().contains("java"));
        // sayfayi kapatalim
        Driver.closeDriver();
    }

    @DataProvider
    public static Object[] AranacakKelimeler() {
        String[] arananKelimeArray = {"java", "misvak", "nutella", "perfume"};
        return arananKelimeArray;
    }

    @Test(dataProvider = "AranacakKelimeler")
    public void dataProviderTest(String arananKelime) {
        // amazon gidip
        Driver.getDriver().get(ConfigReader.getProperty("amazonURL"));
        // java, misvak, nutella, perfume, Computer, Robe
        AmazonPage amazonPage = new AmazonPage();
        amazonPage.amazonSearch.sendKeys(arananKelime, Keys.ENTER);
        // ve arama sonuclarinda aradigimiz kelimeyi icerdigini test edelim
        String expectedKelime = arananKelime;
        String actualKelime = amazonPage.result.getText();
        Assert.assertTrue(actualKelime.contains(arananKelime));
        // sayfayi kapatalim
        Driver.closeDriver();

    }
}
