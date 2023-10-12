package tests.lesson05;

import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;

import javax.swing.*;

public class TC01_Actions {
    @Test
    public void test01() {
        // amazon anasayfa'ya gidip
        Driver.getDriver().get(ConfigReader.getProperty("amazonURL"));
        // account menusunden create a list linkine tiklayalim
        Actions actions = new Actions(Driver.getDriver());
        AmazonPage amazonPage = new AmazonPage();
        actions.moveToElement(amazonPage.accountLists).perform();
        Driver.wait(3);
        amazonPage.createAList.click();
        // signin butonuna tikla\
        //Your Lists yazisinin gorunurlugunu dogrulayiniz
        Assert.assertTrue(amazonPage.yourLists.isDisplayed());
        Driver.closeDriver();
    }
}
