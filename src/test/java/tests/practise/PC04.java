package tests.practise;

import org.testng.annotations.Test;
import pages.DemoqaPage;
import utilities.ConfigReader;
import utilities.Driver;

public class PC04 {
    @Test
    public void alertsTest() {
        // 01 - https://demoqa.com/ sitesine gidiniz
         Driver.getDriver().get("https://demoqa.com");
        // 02 - "Alerts, Frame & Windows" sekmesine tiklayiniz
        
        // 03 - Acilan sayfada "Alerts" sekmesine tiklayiniz
        // 04 - "Alerts" sayfasında oldugunuzu dogrulayınız
        // 05 - "Click Button to see alert" alert butonuna tiklayiniz
        // 06 - Cikan alert'i "tamam" diyerek kapatiniz
        // 07 - "On button click, alert will appear after 5 seconds" alert butonuna tiklayiniz
        // 08 - 5 saniye sonra cikan alert'i "tamam" diyerek kapatiniz
        // 09 - "On button click, confirm box will appear" alert butonuna tiklayiniz
        // 10 - Cikan alert'i "iptal" diyerek kapatiniz
        // 11 - "You selected Cancel" yazisinin ciktigini dogrulayiniz
        // 12 - "On button click, prompt box will appear" alert butonuna tiklayiniz
        // 13 - Cikan promt alert'e "adinizi" yazarak tamam deyiniz
        // 14 - Sonuc yazisinda adinizin icerdigini dogrulayiniz
        // 15 - Sayfayi kapatiniz
    }
}
