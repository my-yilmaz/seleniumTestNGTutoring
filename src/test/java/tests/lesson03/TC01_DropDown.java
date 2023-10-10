package tests.lesson03;

import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;

public class TC01_DropDown {
    /**
     * amazon'a gidip
     * dropdown'dan books secenegini secip
     * Java aratalim
     * ve arama sonuclarinin Java icerdigini test edelim
     */

    @Test
    public void test01() {
        Driver.getDriver().get(ConfigReader.getProperty("amazonURL"));
        AmazonPage amazonPage = new AmazonPage();
        Select select = new Select(amazonPage.allDropDownBox);
        select.selectByVisibleText("Books");
        //select.selectByIndex(5); //index ile
        amazonPage.amazonSearch.sendKeys("java", Keys.ENTER);
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(amazonPage.result.getText().contains("java"));
        softAssert.assertAll();
        Driver.closeDriver();
    }
}
