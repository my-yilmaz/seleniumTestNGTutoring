package tests.lesson02;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.BestBuyPage;
import utilities.ConfigReader;
import utilities.Driver;

public class TC_02_Assertion {
    BestBuyPage bestBuyPage;

    @BeforeClass
    public void beforeClass() {
        Driver.getDriver().get(ConfigReader.getProperty("bestbuyURL"));
    }
    @AfterClass
    public void afterClass() {
        Driver.quitDriver();
    }
    @Test
    public void test01() {
        // ○ Sayfa URL'inin https://www.bestbuy.com/ 'a esit oldugunu test edin
        String actualURL = Driver.getDriver().getCurrentUrl();
        String expectedURL = "https://www.bestbuy.com/";
        Assert.assertEquals(actualURL, expectedURL);
    }
    @Test
    public void test02() {
        // ○ titleTest => Sayfa başlığının "Rest" içermediğini(contains) test edin
        String actualTitle = Driver.getDriver().getTitle();
        String icermeyenTitle = "Rest";
        Assert.assertFalse(actualTitle.contains(icermeyenTitle));
    }
    @Test
    public void test03() {
//         ○ logoTest => BestBuy logosunun görüntülendigini test edin
        bestBuyPage = new BestBuyPage();
        Assert.assertTrue(bestBuyPage.bestbuyLogo.isDisplayed());
    }
    @Test
    public void test04() {
        //○ FrancaisLinkTest => Fransizca Linkin görüntülendiğini test edin
        bestBuyPage = new BestBuyPage();
        Assert.assertTrue(bestBuyPage.francaisLink.isDisplayed());
    }
}
