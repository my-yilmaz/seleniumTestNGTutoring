package tests.practise;

import com.beust.ah.A;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DemoqaPage;
import utilities.ConfigReader;
import utilities.Driver;

public class PC02 {
    @Test
    public void checkBox() {
        // 01 - https://demoqa.com/ sitesine gidiniz
        Driver.getDriver().get(ConfigReader.getProperty("demoqaURL"));
        // 02 - Site logosunun gorunur oldugunu dogrulayiniz
        DemoqaPage demoqaPage = new DemoqaPage();
        Assert.assertTrue(demoqaPage.demoqaLogo.isDisplayed());
        // 03 - "Elements" sekmesine tiklayiniz
        demoqaPage.demoqaElementsSekmesi.click();
        // 04 - Acilan sayfada "Check Box" sekmesine tiklayiniz
        demoqaPage.checkBoxSekmesi.click();
        // 05 - "Check Box" sayfasında oldugunuzu dogrulayınız
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("checkbox"));
        // 06 - "+" ve "-" butonlarinin etkin oldugunu dogrulayiniz
        Assert.assertTrue(demoqaPage.plusSign.isEnabled());
        Assert.assertTrue(demoqaPage.minusSign.isEnabled());
        // 07 - "+ isaretine basarak Home" ve "Desktop" u acip "Notes" check box tiklayiniz
        demoqaPage.plusSign.click();
        // 08 - "Notes" check boxa tiklanabildigini dogrulayiniz
        Assert.assertTrue(demoqaPage.notesCheckBox.isEnabled());
        // 09 - Sonuc yazisinin "notes" icerdigini dogrulayiniz
        demoqaPage.notesCheckBox.click();
        Driver.wait(2);
        Assert.assertTrue(demoqaPage.notesSuccessYazisi.getText().contains("notes"));
        // 10 - Sayfayi kapatiniz
        Driver.wait(1);
       // Driver.quitDriver();
    }

    @Test
    public void radioButton() {
        // 01 - https://demoqa.com/ sitesine gidiniz
        Driver.getDriver().get(ConfigReader.getProperty("demoqaURL"));
        // 02 - "Elements" sekmesine tiklayiniz
        DemoqaPage demoqaPage = new DemoqaPage();
        Driver.scroll(demoqaPage.demoqaElementsSekmesi);
        demoqaPage.demoqaElementsSekmesi.click();
        // 03 - Acilan sayfada "Radio Button" sekmesine tiklayiniz
        demoqaPage.radioButton.click();
        // 04 - "Radio Button" sayfasında oldugunuzu dogrulayınız
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("radio-button"));
        // 05 - "Yes" radio butonuna tiklayiniz
        demoqaPage.yesRadio.click();
        // 06 - "Yes" radio butonunun etkin oldugunu dogrulayiniz
        Assert.assertTrue(demoqaPage.yesRadio.isEnabled());
        // 07 - Sonuc yazisinin "Yes" icerdigini dogrulayiniz
        Assert.assertTrue(demoqaPage.yesSuccess.getText().contains("Yes"));
        // 08 - "Impressive" radio butonuna tiklayiniz
        demoqaPage.impressiveRadio.click();
        // 09 - "Impressive" radio butonunun etkin oldugunu dogrulayiniz
        Assert.assertTrue(demoqaPage.impressiveRadio.isEnabled());
        // 10 - Sonuc yazisinin "Impressive" icerdigini dogrulayiniz
        Assert.assertTrue(demoqaPage.impressiveSuccess.getText().contains("Impressive"));
        // 11 - "No" radio butonunun etkin OLMADIGINI dogrulayiniz
        Assert.assertFalse(demoqaPage.noRadio.isSelected());
        Driver.wait(2);
        // 12 - Sayfayi kapatiniz
        Driver.quitDriver();
    }
}
