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
        //● Bir class oluşturun: DropDown
        //● https://the-internet.herokuapp.com/dropdown adresine gidin.
        //1.Index kullanarak Seçenek 1’i (Option 1) seçin ve yazdırın
        //2.Value kullanarak Seçenek 2'yi (Option 2) seçin ve yazdırın
        //3.Visible Text(Görünen metin) kullanarak Seçenek 1’i (Option 1) seçin ve yazdırın
        //4.Tüm dropdown değerleri(value) yazdırın
        //5. Dropdown'un boyutunu bulun, Dropdown'da 4 öğe varsa konsolda True , degilse False yazdırın.
        HerokuAppPage herokuAppPage = new HerokuAppPage();
        Driver.getDriver().get("https://the-internet.herokuapp.com/dropdown");
        Select select = new Select(herokuAppPage.dropDownMenu);
        select.selectByIndex(1);
        System.out.println(select.getFirstSelectedOption().getText());
        select.selectByValue("2");
        System.out.println(select.getFirstSelectedOption().getText());
        select.selectByVisibleText("Option 1");
        System.out.println(select.getFirstSelectedOption().getText());
        List<WebElement> allOptions = select.getOptions();
        for (WebElement w : allOptions
        ) {
            System.out.println(w.getText());
        }

        int ddmBoyut = allOptions.size();

        if (ddmBoyut == 4) {
            System.out.println("TRUE");
        } else {
            System.out.println("FALSE");
        }


    }

}
