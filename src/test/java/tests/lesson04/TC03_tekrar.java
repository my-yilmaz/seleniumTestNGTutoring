package tests.lesson04;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HerokuAppPage;
import utilities.Driver;

import java.util.Set;

public class TC03_tekrar {
    @Test
    public void test03() {
        // 1- https://the-internet.herokuapp.com/windows adresine gidin.
        Driver.getDriver().get("https://the-internet.herokuapp.com/windows");
        // 4- Click Here butonuna
        HerokuAppPage herokuAppPage = new HerokuAppPage();
        String ilkSayfaWindowHandleDegeri = Driver.getDriver().getWindowHandle();
        herokuAppPage.clickHereLink.click();

        // 4- Click Here butonuna


    }
}
