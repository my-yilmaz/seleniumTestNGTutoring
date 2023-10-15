package tests.lesson08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import utilities.Driver;

public class TC02_WebTables {
    @Test
    public void test01() {
        // onceki class'daki girisYap method'unu kullanarak sayafaya giris yapin
        TC01_WebTables.girisYap();
        // input olarak verilen satir sayisi ve sutun sayisi'na sahip
        int satirNo = 5;
        int sutunNo = 2;
        // cell'deki text'i yazdirin
        WebElement arananHucre = Driver.getDriver().findElement(By.xpath("//tbody//tr[" + satirNo + "]//td[" + sutunNo + "]"));
        System.out.println(arananHucre.getText());

    }
}
