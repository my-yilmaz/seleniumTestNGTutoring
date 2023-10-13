package tests.lesson05;

import com.github.javafaker.Faker;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import pages.FacebookPage;
import utilities.ConfigReader;
import utilities.Driver;

public class TC05_Actions {
    @Test
    public void test01() {
        // facebook anasayfaya gidip
        Driver.getDriver().get(ConfigReader.getProperty("faceURL"));
        // yeni kayit olustur butonuna basin
        FacebookPage facebookPage = new FacebookPage();
        // facebookPage.allowCookiesButton.click();
        facebookPage.createNewButton.click();
        // isim kutusunu locate edip,
        // geriye kalan alanlari TAB ile dolasarak formu doldurun
        Actions actions = new Actions(Driver.getDriver());
        Faker faker = new Faker();
        String fakeMail = faker.internet().emailAddress();
        actions.click(facebookPage.nameBox)
                .sendKeys(faker.name().firstName())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.name().lastName())
                .sendKeys(Keys.TAB)
                .sendKeys(fakeMail)
                .sendKeys(Keys.TAB)
                .sendKeys(fakeMail)
                .sendKeys(Keys.TAB)
                .sendKeys(faker.internet().password())
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys("12")
                .sendKeys(Keys.TAB)
                .sendKeys("May")
                .sendKeys(Keys.TAB)
                .sendKeys("2000")
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.ARROW_UP)
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.ENTER)
                .perform();
        Driver.wait(5);
        Driver.closeDriver();
    }
}
