package tests.lesson06;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HerokuAppPage;
import utilities.Driver;

public class TC04_FileUpload {
    @Test
    public void test01() {
        // 1.https://the-internet.herokuapp.com/upload adresine gidelim
        Driver.getDriver().get("https://the-internet.herokuapp.com/upload");
        // 2.chooseFile butonuna basalim
        
        // macBOOK
        // String dosyaYolu = System.getProperty("user.home")+ "/Downloads/test.txt";
        // 3.Yuklemek istediginiz dosyayi secelim.
        // HerokuAppPage herokuAppPage = new HerokuAppPage();

        HerokuAppPage herokuAppPage = new HerokuAppPage();
        // 3.Yuklemek istediginiz dosyayi secelim.
        String dosyaYolu = System.getProperty("user.home") + "\\Desktop\\text.txt";
        herokuAppPage.fileUpload.sendKeys(dosyaYolu);
        // 4.Upload butonuna basalim.
        herokuAppPage.fileSubmit.click();
        // 5."File Uploaded!" textinin goruntulendigini test edelim.
        Assert.assertTrue(herokuAppPage.fileUploadedText.isDisplayed());
        Driver.wait(2);
        Driver.closeDriver();
    }
}
