package tests;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;

public class TC_01 {
    @Test
    public void test01() {
        //1- https://www.amazon.com/ sayfasina gidelim
        Driver.getDriver().get(ConfigReader.getProperty("AmazonURL"));
        //2- arama kutusunu locate edelim
        //3- “Samsung headphones” ile arama yapalim
        AmazonPage amazonPage = new AmazonPage();
        amazonPage.amazonSearch.sendKeys("Samsung headphones", Keys.ENTER);
        //4- Bulunan sonuc sayisini yazdiralim
        System.out.println(amazonPage.result.getText());
        //5- Ilk urunu tiklayalim
        amazonPage.ilkUrun.click();
        Driver.closeDriver();
        System.out.println("hello");
    }
}
