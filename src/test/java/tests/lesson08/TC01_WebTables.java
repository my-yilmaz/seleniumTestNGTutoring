package tests.lesson08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import pages.HotelPage;
import utilities.Driver;

import java.util.List;

public class TC01_WebTables {
    @Test
    public void WebTable() {
        // siteye girisYap() methodu giris yap
        girisYap();
        Driver.wait(5);
        // 3 - Tüm table body’sinin boyutunu(sutun sayisi) bulun. /tbody
        HotelPage hotelPage = new HotelPage();
        System.out.println(hotelPage.sutunBasliklariListesi.size());

        // 4 - Table’daki tum body’i ve başlıkları(headers) konsolda yazdırın.
        System.out.println(hotelPage.tablo.getText());

        // 5 - table body’sinde bulunan toplam satir(row) sayısını bulun.
        System.out.println("satir sayisi= " + hotelPage.satirList.size());
        // 6 - Table body’sinde bulunan satirlari(rows) konsolda yazdırın.
        System.out.println("======== 6. step satir bilgileri ============");
        for (WebElement w : hotelPage.satirList
        ) {
            System.out.println(w.getText());
        }
        // 7 - 4. satirdaki(row) elementleri konsolda yazdırın.
        for (WebElement w : hotelPage.dorduncuSatir
        ) {
            System.out.println("dorduncu satir bilgileri = " + w.getText());
        }

        // 8 - IDHotel basligindaki tum elementleri(sutun) konsolda yazdirin
        int SutunuNoIndex = 0;
        for (int i = 0; i < hotelPage.sutunBasliklariListesi.size(); i++) {
            if (hotelPage.sutunBasliklariListesi.get(i).getText().equals("Price"))
                SutunuNoIndex = i;
        }
        List<WebElement> sutunList = Driver.getDriver().findElements(By.xpath("//tbody//td[" + (SutunuNoIndex + 1) + "]"));
        for (WebElement w : sutunList
        ) {
            System.out.println(w.getText());
        }
    }
    public static void girisYap() {
        // 1 - login( ) metodun oluşturun ve oturum açın.
        //     ○ Username : manager ○ Password : Manager1!
        // 2 - https://qa-environment.concorthotel.com/admin/HotelRoomAdmin adresine gidin
        Driver.getDriver().get("http://qa-environment.concorthotel.com/admin/HotelRoomAdmin");
        HotelPage hotelPage = new HotelPage();
        hotelPage.usernameBox.sendKeys("manager");
        hotelPage.passwordBox.sendKeys("Manager1!");
        hotelPage.submitButton.click();
    }
}
