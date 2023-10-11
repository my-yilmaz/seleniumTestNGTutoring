package tests.lesson03;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HerokuAppPage;
import utilities.Driver;

public class TC04_IFrame {
    @Test
    public void test01() {
        //   ● https://the-internet.herokuapp.com/iframe adresine gidin.
        Driver.getDriver().get("https://the-internet.herokuapp.com/iframe");
//   ● Bir metod olusturun: iframeTest
//      ○ "An IFrame containing…." textinin erisilebilir oldugunu test edin
        HerokuAppPage herokuAppPage = new HerokuAppPage();
        Assert.assertTrue(herokuAppPage.iFrameTitle.isDisplayed());
        System.out.println(herokuAppPage.iFrameTitle.getText());
//      ve  konsolda    yazdirin.
//      ○ Text Box'a "Merhaba Dunya!" yazin.
        Driver.getDriver().switchTo().frame(herokuAppPage.iframe);

        herokuAppPage.textBox.sendKeys("Merhaba Dunya!");
//      ○ TextBox'in altinda bulunan "Elemental Selenium"
//      linkinin textinin gorunur oldugunu  dogrulayin ve  konsolda yazdirin.
        Driver.getDriver().switchTo().defaultContent();
        Assert.assertTrue(herokuAppPage.elementalSelenium.isDisplayed());
        Driver.closeDriver();
    }
}
