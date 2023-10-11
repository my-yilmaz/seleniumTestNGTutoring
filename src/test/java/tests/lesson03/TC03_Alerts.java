package tests.lesson03;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.HerokuAppPage;
import utilities.Driver;

public class TC03_Alerts {
    HerokuAppPage herokuAppPage = new HerokuAppPage();

    @BeforeClass
    public void beforeClass() {
        Driver.getDriver().get("https://the-internet.herokuapp.com/javascript_alerts");
    }

    @Test
    public void acceptAlert() {
// ● https://the-internet.herokuapp.com/javascript_alerts adresine gidin.
// ● Bir metod olusturun: acceptAlert
//        ○ 1. butona tıklayın, uyarıdaki OK butonuna tıklayın ve result mesajının
//        "You successfully clicked an alert" oldugunu test edin.
        herokuAppPage.clickforJsAlert.click();
        Driver.getDriver().switchTo().alert().accept();
        String actualSuccess = herokuAppPage.successfullyClickedAlert.getText();
        String expectedSuccess = "You successfully clicked an alert";
        Assert.assertEquals(actualSuccess, expectedSuccess);
    }

    @Test
    public void dismissAlert() {
        // ● Bir metod olusturun: dismissAlert
//        ○ 2. butona tıklayın, uyarıdaki Cancel butonuna tıklayın ve result mesajının
        herokuAppPage.clickForJSConfirm.click();
        Driver.getDriver().switchTo().alert().dismiss();
//        "successfuly" icermedigini test edin.
        String actualMessage = herokuAppPage.sonucYazisi.getText();
        String expectedMessage = "successfuly";
        Assert.assertFalse(actualMessage.contains(expectedMessage));
    }

    @Test
    public void sendKeysAlert() {
        // ● Bir metod olusturun: sendKeysAlert
//        ○ 3. butona tıklayın, uyarıdaki metin kutusuna isminizi yazin,
        herokuAppPage.clickforJsPrompt.click();
        Driver.getDriver().switchTo().alert().sendKeys("Korkut");
//        OK butonuna tıklayın ve result mesajında isminizin görüntülendiğini doğrulayın.
        Driver.getDriver().switchTo().alert().accept();
        Assert.assertTrue(herokuAppPage.sonucYazisi.getText().contains("Korkut"));
    }

    @AfterClass
    public void afterClass() {
        Driver.closeDriver();
    }
}
