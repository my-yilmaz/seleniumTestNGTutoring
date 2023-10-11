package tests.lesson04;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WindowType;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;

public class TC01_HandleWindows {
    @Test
    public void test01() {
        // 1- amazon ana sayfaya gidin
        Driver.getDriver().get(ConfigReader.getProperty("amazonURL"));
        String ilkSayfaWindowHandleDegeri=Driver.getDriver().getWindowHandle();
        System.out.println("ilkSayfaWindowHandleDegeri = " + ilkSayfaWindowHandleDegeri);
        // 2- nutella icin arama yaptirin
        AmazonPage amazonPage = new AmazonPage();
        amazonPage.amazonSearch.sendKeys("nutella", Keys.ENTER);
        // 3- ilk urunun resmini tiklayarak farkli bir tab olarak acin
        Driver.getDriver().switchTo().newWindow(WindowType.TAB);
        Driver.getDriver().get(ConfigReader.getProperty("amazonURL"));
        amazonPage.amazonSearch.sendKeys("nutella", Keys.ENTER);
        amazonPage.ilkUrunResmi.click();
        // 4- yeni tab'da acilan urunun title'ini yazdirin
        System.out.println("urun adi: " + amazonPage.urunTitleElementi.getText());
        // 5- ilk sayfaya gecip url'i yazdiralim
        Driver.getDriver().switchTo().window(ilkSayfaWindowHandleDegeri);
        System.out.println("ilk sayfa url: " + Driver.getDriver().getCurrentUrl());
        Driver.closeDriver();
    }
}
