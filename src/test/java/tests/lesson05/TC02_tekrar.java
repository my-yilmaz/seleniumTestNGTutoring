package tests.lesson05;

import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HerokuAppPage;
import utilities.Driver;

import java.util.Set;

public class TC02_tekrar {
    @Test
    public void test01() {
        //1- https://the-internet.herokuapp.com/context_menu sitesine gidelim

        //2- Cizili alan uzerinde sag click yapalim
        //3- Alert'te cikan yazinin "You selected a context menu" oldugunu test edelim.
        //4- Tamam diyerek alert'i kapatalim
        //5- Elemental Selenium linkine tiklayalim
        //6- Acilan sayfada h1 taginda "Make sure your code lands" yazdigini test edelim
    }
}
