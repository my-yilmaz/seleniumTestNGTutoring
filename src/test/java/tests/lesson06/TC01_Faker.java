package tests.lesson06;

import com.github.javafaker.Faker;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;

public class TC01_Faker {
    @Test
    public void test01() {
        // Amazon sitesine gidelim
        Driver.getDriver().get(ConfigReader.getProperty("amazonURL"));
        // account menusunden "Start here." linkine tiklayalim
        AmazonPage amazonPage = new AmazonPage();
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(amazonPage.accountLists).perform();
        amazonPage.startHere.click();
        // isim kutusunu locate edelim ve...
        // geriye kalan alanlari TAB ile dolasip Faker classi kullanarak dolduralim.
        Faker faker = new Faker();
        String pasWord = faker.internet().password();
        actions.click(amazonPage.yourNameBox)
                .sendKeys(faker.name().name())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.internet().emailAddress())
                .sendKeys(Keys.TAB)
                .sendKeys(pasWord)
                .sendKeys(Keys.TAB)
                .sendKeys(pasWord)
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.ENTER)
                .perform();

        Driver.wait(3);
        Driver.closeDriver();

    }
}
