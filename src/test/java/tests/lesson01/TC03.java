package tests.lesson01;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.SauceDemoPage;
import utilities.ConfigReader;
import utilities.Driver;

public class TC03 {
    @Test
    public void test01() {

        //1. “https://www.saucedemo.com” Adresine gidin
        Driver.getDriver().get(ConfigReader.getProperty("saucedemoURL"));
        //2. Username kutusuna “standard_user” yazdirin
        SauceDemoPage demoPage = new SauceDemoPage();
        demoPage.userNameBox.sendKeys("standard_user");
        //3. Password kutusuna “secret_sauce” yazdirin
        demoPage.passWordBox.sendKeys("secret_sauce");
        //4. Login tusuna basin
        demoPage.loginButonu.click();
        //5. Ilk urunun ismine tiklayin  ve bu urunun sayfasina girin
        demoPage.ilkUrun.click();
        //6. Add to Cart butonuna basin
        demoPage.addtoCartButonu.click();
        //7. Alisveris sepetine tiklayin
        demoPage.shoppingCart.click();
        //8. Sectiginiz urunun basarili olarak sepete eklendigini control edin
        Assert.assertTrue(demoPage.removeButton.isDisplayed());
        //9. Sayfayi kapatin
        Driver.closeDriver();
    }

}
