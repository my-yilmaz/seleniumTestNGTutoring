package tests.lesson03;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import pages.HerokuAppPage;
import utilities.ConfigReader;
import utilities.Driver;

import java.util.ArrayList;
import java.util.List;

public class TC02_Dropdown {
    @Test
    public void test01() {
        HerokuAppPage herokuAppPage = new HerokuAppPage();

        //● https://the-internet.herokuapp.com/dropdown adresine gidin.
        Driver.getDriver().get("https://the-internet.herokuapp.com/dropdown");

        //1.Index kullanarak Seçenek 1’i (Option 1) seçin ve yazdırın
        Select select = new Select(herokuAppPage.dropDownMenu);
        select.selectByIndex(1);
        System.out.println(select.getFirstSelectedOption().getText());

        //2.Value kullanarak Seçenek 2'yi (Option 2) seçin ve yazdırın
        select.selectByValue("2");
        System.out.println(select.getFirstSelectedOption().getText());

        //3.Visible Text(Görünen metin) kullanarak Seçenek 1’i (Option 1) seçin ve yazdırın
        select.selectByVisibleText("Option 1");
        System.out.println(select.getFirstSelectedOption().getText());

        //4.Tüm dropdown değerleri(value) yazdırın
        List<WebElement> allOptions = select.getOptions();
        for (WebElement w : allOptions
        ) {
            System.out.println(w.getText());
        }

        //5. Dropdown'un boyutunu bulun, Dropdown'da 4 öğe varsa konsolda True , degilse False yazdırın.
        int ddmBoyut = allOptions.size();
        if (ddmBoyut == 4) {
            System.out.println("TRUE");
        } else {
            System.out.println("FALSE");
        }
    }
}
