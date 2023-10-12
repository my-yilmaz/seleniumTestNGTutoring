package tests.lesson05;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import pages.DemoqaPage;
import utilities.ConfigReader;
import utilities.Driver;

import java.security.Key;

public class TC03_Actions {
    @Test
    public void test01() {
        // 1- https://demoqa.com/ adresine gidelim
        Driver.getDriver().get(ConfigReader.getProperty("demoqaURL"));
        // 2- Interactions sayfa linkine tiklayiniz
        DemoqaPage demoqaPage = new DemoqaPage();
        demoqaPage.interactions.click();
        // 3- Droppable sekmesine tiklayiniz
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        demoqaPage.droppableSekmesi.click();
        // 4- "Drag me" butonunu tutup "Drop here" kutusunun ustune birakalim

        // 5- "Drop here" yazisi yerine "Dropped!" oldugunu test edin
    }
}
