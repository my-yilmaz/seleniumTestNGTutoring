package tests.lesson04;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WindowType;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AmazonPage;
import pages.BestBuyPage;
import utilities.ConfigReader;
import utilities.Driver;

public class TC02_HandleWindows {
    @Test
    public void test02() {
        // 1- amazon anasayfaya gidelim
        Driver.getDriver().get(ConfigReader.getProperty("amazonURL"));
        String ilkSayfaWindowHandleDegeri = Driver.getDriver().getWindowHandle();
        // 2- url'in  amazon icerdigini test edelim
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("amazon"));
        // 3- yeni bir pencere acip bestbuy ana sayfaya gidelim
        Driver.getDriver().switchTo().newWindow(WindowType.WINDOW);
        Driver.getDriver().get(ConfigReader.getProperty("bestbuyURL"));
        String ikinciSayfaWindowHandleDegeri = Driver.getDriver().getWindowHandle();
        // 4- title'in Best Buy icerdigini test edelim
        Assert.assertTrue(Driver.getDriver().getTitle().contains("Best Buy"));
        // 5- ilk sayfaya donup sayfada java aratalim
        Driver.getDriver().switchTo().window(ilkSayfaWindowHandleDegeri);
        AmazonPage amazonPage = new AmazonPage();
        amazonPage.amazonSearch.sendKeys("java", Keys.ENTER);
        // 6- arama sonuclarinin java icerdigini test edelim
        Assert.assertTrue(amazonPage.result.getText().contains("java"));
        // 7- yeniden bestbuy'in acik oldugu sayfaya gidelim
        Driver.getDriver().switchTo().window(ikinciSayfaWindowHandleDegeri);
        // 8- logonun gorundugunu test edelim
        BestBuyPage bestBuyPage = new BestBuyPage();
        Assert.assertTrue(bestBuyPage.bestbuyLogo.isDisplayed());
        Driver.closeDriver();

    }
}
