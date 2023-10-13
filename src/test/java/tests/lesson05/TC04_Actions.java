package tests.lesson05;

import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;

public class TC04_Actions {
    @Test
    public void test01() {
        // 1- https://amazon.com adresine gidelim
        Driver.getDriver().get(ConfigReader.getProperty("amazonURL"));
        // 2- once arama kutusuna click yapip
        AmazonPage amazonPage = new AmazonPage();

        // 3- sonra harf harf Nutella yazisini yazdiralim
        // 4- sonra da ENTER tusuna basalim
    }
}
