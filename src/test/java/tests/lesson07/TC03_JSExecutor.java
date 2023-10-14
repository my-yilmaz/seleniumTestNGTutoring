package tests.lesson07;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class TC03_JSExecutor {
    @Test
    public void test01() {
        AmazonPage amazonPage = new AmazonPage();
        Driver.getDriver().get(ConfigReader.getProperty("amazonURL"));

        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].scrollIntoView(true);", amazonPage.signin2);

        js.executeScript("arguments[0].click();", amazonPage.signin2);
        Driver.wait(3);
    }
}
