package tests.lesson06;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HerokuAppPage;
import utilities.Driver;

import java.nio.file.Files;
import java.nio.file.Paths;

public class TC03_FileDownload {
    @Test
    public void test01() {
        // 1. https://the-internet.herokuapp.com/download adresine gidelim.
        Driver.getDriver().get("https://the-internet.herokuapp.com/download");
        // 2. code.txt dosyasını indirelim
        HerokuAppPage herokuAppPage = new HerokuAppPage();
        herokuAppPage.testTxt.click();
        Driver.wait(5);
        // 3. dosyanın başarıyla indirilip indirilmediğini test edelim
        String dosyaYolu = System.getProperty("user.home") + "\\Downloads\\test.txt";
        Assert.assertTrue(Files.exists(Paths.get(dosyaYolu)));

    }
}
