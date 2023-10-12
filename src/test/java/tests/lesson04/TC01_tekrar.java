package tests.lesson04;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WindowType;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;

import java.security.Key;

public class TC01_tekrar {
    @Test
    public void test01() {
        // 1- amazon ana sayfaya gidin
        Driver.getDriver().get(ConfigReader.getProperty("amazonURL"));
        AmazonPage amazonPage = new AmazonPage();
        // 2- nutella icin arama yaptirin
        amazonPage.amazonSearch.sendKeys("nutella", Keys.ENTER);
        String ilksayfawHandleValue = Driver.getDriver().getWindowHandle();
        // 3- ilk urunun resmini tiklayarak farkli bir tab olarak acin
        // Bu komutu kullandigimizda driver yeni bir TAB'a gecer.
        // 4- yeni tab'da acilan urunun title'ini yazdirin
        Driver.getDriver().switchTo().newWindow(WindowType.TAB);
        Driver.getDriver().get(ConfigReader.getProperty("amazonURL"));
        amazonPage.amazonSearch.sendKeys("nutella", Keys.ENTER);
        amazonPage.ilkUrunResmi.click();
        // 5- ilk sayfaya gecip url'i yazdiralim
        Driver.getDriver().switchTo().window(ilksayfawHandleValue);
        System.out.println(Driver.getDriver().getCurrentUrl());

    }
}
