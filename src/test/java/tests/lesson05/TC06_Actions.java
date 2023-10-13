package tests.lesson05;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.Driver;

public class TC06_Actions {
    @Test
    public void test01() {
        //1- https://html.com/tags/iframe/ sayfasina gidelim
        Driver.getDriver().get("https://html.com/tags/iframe/");
        //2- video'yu gorecek kadar asagi inin
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN)
                .sendKeys(Keys.PAGE_DOWN)
                .perform();
        //3- videoyu calistirdiginizi test edin
        WebElement iframe = Driver.getDriver().findElement(By.xpath("//iframe[@src='https://www.youtube.com/embed/owsfdh4gxyc']"));
        Driver.getDriver().switchTo().frame(iframe);
        Driver.getDriver().findElement(By.xpath("//*[@class='ytp-large-play-button ytp-button ytp-large-play-button-red-bg']")).click();
        Driver.wait(3);
        WebElement duraklatButon = Driver.getDriver().findElement(By.xpath("//*[@data-title-no-tooltip='Duraklat']"));
        Assert.assertTrue(duraklatButon.isDisplayed());
        Driver.closeDriver();
    }
}
