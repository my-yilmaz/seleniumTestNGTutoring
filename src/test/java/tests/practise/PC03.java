package tests.practise;

import com.github.javafaker.Faker;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ZeroBankPage;
import utilities.ConfigReader;
import utilities.Driver;

import java.security.Key;

public class PC03 {
    @Test
    public void dropDownMenuTest() {
        //1. http://zero.webappsecurity.com/ Adresine gidin
        Driver.getDriver().get(ConfigReader.getProperty("zeroURL"));
        //2. Sign in butonuna basin
        ZeroBankPage zeroBankPage = new ZeroBankPage();
        //3. Login kutusuna “username” yazin
      // boyle yapacaktim, sonra actions kullanayim dedim zeroBankPage.userLoginBox.sendKeys("username", Keys.TAB);
        //4. Password kutusuna “password.” yazin
        //5. Sign in tusuna basin
        Actions actions = new Actions(Driver.getDriver());
        zeroBankPage.signIn.click();
        actions.sendKeys(zeroBankPage.userLoginBox).sendKeys("username")
                .sendKeys(Keys.TAB)
                .sendKeys("password")
                .perform();
        zeroBankPage.submitSignButton.click();
        Driver.getDriver().navigate().back();
        //more services e tiklamak suretiyle
        //6. Pay Bills sayfasina gidin
        zeroBankPage.moreServicesButton.click();
        // payBillsButtona a tiklayin
        zeroBankPage.payBillsButon.click();
        //7. “Purchase Foreign Currency” tusuna basin
        zeroBankPage.purchaseForeCuButonu.click();
        //8. “Currency” drop down menusunden Eurozone’u secin
        Select select = new Select(zeroBankPage.currencyDDM);
       // zeroBankPage.currencyDDM.click();
        select.selectByVisibleText("Eurozone (euro)");
        //9. “amount” kutusuna bir sayi girin
        // TAB ile gecermisim, gereksiz locate almis bulundum
        actions.sendKeys(Keys.TAB).sendKeys("12").perform();
        //10. “US Dollars” in secilMEdigini test edin
        Assert.assertFalse(zeroBankPage.usDolarRadio.isSelected());
        //11. “Selected currency” butonunu secin
        zeroBankPage.selectedCurrency.click();
        //12. “Calculate Costs” butonuna basin sonra “purchase” butonuna basin
        zeroBankPage.calculateCosts.click();
        zeroBankPage.purchaseButonu.click();
        //13. “Foreign currency cash was successfully purchased.” yazisinin ciktigini kontrol edin.
        Assert.assertTrue(zeroBankPage.foreCurSuccessYazisi.isDisplayed());
                Driver.wait(2);
        Driver.quitDriver();
    }
}
