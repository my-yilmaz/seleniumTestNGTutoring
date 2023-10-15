package tests.lesson08;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TC04_BelirliElementSS {
    @Test
    public void test01() throws IOException {
        // Amazon sayfasina gidip
        Driver.getDriver().get(ConfigReader.getProperty("amazonURL"));
        // nutella aratalim
        AmazonPage amazonPage = new AmazonPage();
        amazonPage.amazonSearch.sendKeys("nutella", Keys.ENTER);
        WebElement sonucYazisi = amazonPage.ilkUrunResmi;
        // arama sonuc yazisinin ekran goruntusunu alalim
        TakesScreenshot takesScreenshot = (TakesScreenshot) Driver.getDriver();
        LocalDateTime localDateTime = LocalDateTime.now();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyMMddHHmmss");
        String tarih = localDateTime.format(dateTimeFormatter);

        File tumSayfaResim = new File("target/ekranResmi/"+ tarih + ".jpeg");
        File geciciSS = sonucYazisi.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(geciciSS, tumSayfaResim);
    }
}
