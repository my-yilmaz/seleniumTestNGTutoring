package tests.practise;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import pages.WebDriverUniversityPage;
import utilities.ConfigReader;
import utilities.Driver;

public class PC05 {
    @Test
    public void actionsTest() {
        // 1. "http://webdriveruniversity.com/Actions" sayfasina gidin
        Driver.getDriver().get("http://webdriveruniversity.com/Actions");
        // 2. "Hover over Me First" kutusunun ustune gelin
        WebDriverUniversityPage wDPage = new WebDriverUniversityPage();
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(wDPage.hoverOverMeFirst).perform();
        // 3. "Link 1" e tiklayin
        wDPage.link1.click();
        // 4. Popup mesajini yazdirin
        System.out.println(Driver.getDriver().switchTo().alert().getText());
        // 5. Popup'i tamam diyerek kapatin
        Driver.getDriver().switchTo().alert().accept();
        // 6. "Click and hold" kutusuna basili tutun
        actions.clickAndHold(wDPage.clickAndHold).perform();
        // 7. "Click and hold" kutusunda cikan yaziyi yazdirin
        System.out.println(wDPage.wellDoneText.getText());
        // 8. "Double click me" butonunu cift tiklayin
        actions.doubleClick(wDPage.doubleClickMe).perform();

    }
}
