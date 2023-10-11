package tests.lesson03;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HerokuAppPage;
import utilities.Driver;

import java.time.Duration;

public class TC05_ExplicitlyWait {
    HerokuAppPage herokuAppPage = new HerokuAppPage();

    @Test
    public void test01() {
//3. https://the-internet.herokuapp.com/dynamic_controls adresine gidin.
        Driver.getDriver().get("https://the-internet.herokuapp.com/dynamic_controls");
//4. Textbox'in etkin olmadigini(enabled) dogrulayın
        Assert.assertFalse(herokuAppPage.dynamicTextBox.isEnabled());
//5. Enable butonuna tıklayın ve textbox etkin oluncaya kadar bekleyin
        herokuAppPage.enableButonu.click();
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(herokuAppPage.dynamicTextBox));
//6. "It's enabled!" mesajinin goruntulendigini dogrulayın.
        Assert.assertTrue(herokuAppPage.enabledMesaji.isDisplayed());
//7. Textbox'in etkin oldugunu(enabled) dogrulayın.
        Assert.assertTrue(herokuAppPage.dynamicTextBox.isEnabled());
        Driver.closeDriver();
    }
}
