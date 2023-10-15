package tests.lesson08;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TC03_TumSayfaSS {
    @Test
    public void test01() throws IOException {
        // Amzon sayfasina gidip sayfanin ekran gorountusunu alalim
        Driver.getDriver().get(ConfigReader.getProperty("amazonURL"));

        TakesScreenshot takesScreenshot = (TakesScreenshot) Driver.getDriver();

        LocalDateTime date = LocalDateTime.now();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyMMddHHmmss");
        String tarih = date.format(dateTimeFormatter);

        File tumSayfaResim = new File("target/ekranResmi/tumSayfaResim" + tarih + ".jpeg");
        File geciciResim = takesScreenshot.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(geciciResim, tumSayfaResim);

        Driver.closeDriver();


    }
}
