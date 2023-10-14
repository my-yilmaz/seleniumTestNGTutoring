package tests.lesson01;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ZeroBankPage;
import utilities.ConfigReader;
import utilities.Driver;

public class TC02 {
    @Test
    public void test01() {
        //1. http://zero.webappsecurity.com sayfasina gidin
        Driver.getDriver().get(ConfigReader.getProperty("zeroURL"));
        //2. Signin buttonuna tiklayin
        ZeroBankPage zeroBankPage = new ZeroBankPage();
        zeroBankPage.signIn.click();
        //3. Login alanine “username” yazdirin
        zeroBankPage.userLoginBox.sendKeys("username");
        //4. Password alanine “password” yazdirin
        zeroBankPage.userPasswordBox.sendKeys("password");
        //5. Sign in buttonuna tiklayin
        zeroBankPage.submitSignButton.click();
        Driver.wait(1);
        Driver.getDriver().navigate().back();
        //5.5 Online Banking e tiklayin
        zeroBankPage.onlineBanking.click();
        Driver.wait(2);
        //6. Pay Bills sayfasina gidin
        zeroBankPage.payBillsButon.click();
        //7. amount kismina yatirmak istediginiz herhangi bir miktari yazin
        zeroBankPage.amountBox.sendKeys("55");
        //8. tarih kismina “2020-09-10” yazdirin
        zeroBankPage.dateBox.sendKeys("2020-09-10");
        //9. Pay buttonuna tiklayin
        zeroBankPage.payButton.click();
        //10. “The payment was successfully submitted.” mesajinin ciktigini control edin
        Assert.assertTrue(zeroBankPage.paymentSuccessMessage.isDisplayed());
        Driver.wait(2);
        Driver.closeDriver();
    }
}
