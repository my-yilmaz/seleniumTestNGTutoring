package tests.lesson07;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;

import java.util.Set;

public class TC02_Cookies {
    @Test
    public void test01() {
        Driver.getDriver().get(ConfigReader.getProperty("amazonURL"));
        //2- tum cookie’leri listeleyin
        Set<Cookie> cookiesSet = Driver.getDriver().manage().getCookies();
        for (Cookie w : cookiesSet
        ) {
            System.out.println("cooki name = " + w.getName());
            System.out.println("value = " + w.getValue());
        }

        //3- Sayfadaki cookies sayisinin 5’den buyuk oldugunu test edin
        int cookieSayisi = cookiesSet.size();
        Assert.assertTrue(cookieSayisi > 5);

        //4- ismi i18n-prefs olan cookie degerinin USD oldugunu test edin
        for (Cookie w : cookiesSet
        ) {
            if (w.getName().equals("i18n-prefs"))
                Assert.assertEquals(w.getValue(), "USD");
        }

        //5- ismi “en sevdigim cookie” ve degeri “cikolatali” olan bir cookie olusturun ve sayfaya ekleyin
        Cookie cookie = new Cookie("en sevdigim cookie", "cikolatali");
        Driver.getDriver().manage().addCookie(cookie);
        cookiesSet = Driver.getDriver().manage().getCookies();
        //6- eklediginiz cookie’nin sayfaya eklendigini test edin
        for (Cookie w : cookiesSet
        ) {
            System.out.println(w);
            if (w.equals(cookie))
                Assert.assertEquals(w.getName(), "en sevdigim cookie");
        }
        //7- ismi skin olan cookie’yi silin ve silindigini test edin
        for (Cookie w : cookiesSet
        ) {
            if (w.getName().equals("skin"))
                Driver.getDriver().manage().deleteCookie(w);
        }
        System.out.println("============================");
        cookiesSet = Driver.getDriver().manage().getCookies();
        for (Cookie w : cookiesSet
        ) {
            System.out.println(w);
            Assert.assertFalse(w.getName().contains("skin"));
        }
        //8- tum cookie’leri silin ve silindigini test edin
        System.out.println("============================");
        Driver.getDriver().manage().deleteAllCookies();
        cookiesSet = Driver.getDriver().manage().getCookies();
        for (Cookie w : cookiesSet
        ) {
            System.out.println(w);
        }
        Assert.assertTrue(cookiesSet.isEmpty());
        Driver.closeDriver();
    }
}
