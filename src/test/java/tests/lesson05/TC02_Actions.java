package tests.lesson05;

import org.openqa.selenium.WindowType;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HerokuAppPage;
import utilities.Driver;

import java.util.Set;

public class TC02_Actions {
    @Test
    public void test01() {
        //1- https://the-internet.herokuapp.com/context_menu sitesine gidelim
        Driver.getDriver().get("https://the-internet.herokuapp.com/context_menu");
        String ilkSayfaWindowHandleDegeri = Driver.getDriver().getWindowHandle();
        System.out.println("ilkSayfaWindowHandleDegeri = " + ilkSayfaWindowHandleDegeri);
        //2- Cizili alan uzerinde sag click yapalim
        HerokuAppPage herokuAppPage = new HerokuAppPage();
        Actions actions = new Actions(Driver.getDriver());
        actions.contextClick(herokuAppPage.cizgiliAlan).perform();
        //3- Alert'te cikan yazinin "You selected a context menu" oldugunu test edelim.
        String actualText = Driver.getDriver().switchTo().alert().getText();
        String expectedText = "You selected a context menu";
        Assert.assertEquals(actualText, expectedText);
        //4- Tamam diyerek alert'i kapatalim
        Driver.getDriver().switchTo().alert().accept();
        //5- Elemental Selenium linkine tiklayalim
        herokuAppPage.elementalSelenium.click();
        Set<String> handleSeti = Driver.getDriver().getWindowHandles();
        String ikinciSayfaWindowHandleDegeri = "";
        for (String w : handleSeti
        ) {
            if (!w.equals(ilkSayfaWindowHandleDegeri))
                ikinciSayfaWindowHandleDegeri = w;
        }
        //6- Acilan sayfada h1 taginda "Make sure your code lands" yazdigini test edelim
        Driver.getDriver().switchTo().window(ikinciSayfaWindowHandleDegeri);
        String actualYazi = herokuAppPage.makeSureText.getText();
        String expectedYazi = "Make sure your code lands";
        Assert.assertEquals(actualYazi, expectedYazi);
        Driver.quitDriver();
    }
}
