package tests.lesson04;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HerokuAppPage;
import utilities.Driver;

import java.util.Set;

public class TC03_HandleWindows {
    @Test
    public void test03() {
        // 1- https://the-internet.herokuapp.com/windows adresine gidin.
        Driver.getDriver().get("https://the-internet.herokuapp.com/windows");
        // 2- Sayfadaki textin "Opening a new window" olduğunu doğrulayın.
        HerokuAppPage herokuAppPage = new HerokuAppPage();
        String actualText = herokuAppPage.openingTitle.getText();
        String expectedText = "Opening a new window";
        Assert.assertEquals(actualText, expectedText);
        // 3- Sayfa başlığının(title) "The Internet" olduğunu doğrulayın.
        String actualTitle = Driver.getDriver().getTitle();
        String expectedTitle = "The Internet";
        Assert.assertEquals(actualTitle, expectedTitle);
        // 4- Click Here butonuna
        String ilkSayfaWindowHandleDegeri = Driver.getDriver().getWindowHandle();
        System.out.println("ilkSayfaWindowHandleDegeri = " + ilkSayfaWindowHandleDegeri);
        herokuAppPage.clickHereLink.click();

        Set<String> windowHandleSeti = Driver.getDriver().getWindowHandles();
        System.out.println("windowHandleSeti = " + windowHandleSeti);
        String ikinciSayfaWindowHandleDegeri = "";
        for (String w: windowHandleSeti
             ) {
            if(!w.equals(ilkSayfaWindowHandleDegeri))
                ikinciSayfaWindowHandleDegeri=w;
        }
        Driver.getDriver().switchTo().window(ikinciSayfaWindowHandleDegeri);
        // 5- Acilan yeni pencerenin sayfa başlığının (title) "New Window" oldugunu dogrulayin.
        String actualNewTitle= Driver.getDriver().getTitle();
        String expectedNewTitle = "New Window";
        Assert.assertEquals(actualNewTitle, expectedNewTitle);
        // 6- Sayfadaki textin "New Window" olduğunu doğrulayın.
        String actualYazi = herokuAppPage.newWindowText.getText();
        String expectedYazi = "New Window";
        Assert.assertEquals(actualYazi, expectedYazi);
        // 7- Bir önceki pencereye geri döndükten sonra sayfa başlığının "The Internet" olduğunu doğrulayın.
        Driver.getDriver().switchTo().window(ilkSayfaWindowHandleDegeri);
        Assert.assertEquals(actualTitle, expectedTitle);
        Driver.quitDriver();

    }
}
