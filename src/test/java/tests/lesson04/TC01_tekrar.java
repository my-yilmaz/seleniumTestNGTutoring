package tests.lesson04;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WindowType;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;

public class TC01_tekrar {
    @Test
    public void test01() {
        // 1- amazon ana sayfaya gidin
        // ilkSayfaWindowHandleDegeri = ED14E2D7DF54E2EF082801FBA8782780
        // Bu acilan ilk sayfanin unique hash kodudur.
        // 2- nutella icin arama yaptirin
        // 3- ilk urunun resmini tiklayarak farkli bir tab olarak acin
        // Bu komutu kullandigimizda driver yeni bir TAB'a gecer.
        // 4- yeni tab'da acilan urunun title'ini yazdirin
        // 5- ilk sayfaya gecip url'i yazdiralim
    }
}
