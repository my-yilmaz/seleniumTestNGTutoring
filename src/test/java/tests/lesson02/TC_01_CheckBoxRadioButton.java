package tests.lesson02;


import org.testng.Assert;
import org.testng.annotations.Test;
import pages.FacebookPage;
import pages.HerokuAppPage;
import utilities.ConfigReader;
import utilities.Driver;

public class TC_01_CheckBoxRadioButton {

    @Test
    public void checkBoxTest() {
        //1. Bir test method oluşturun : CheckBoxTest
        //    2. Gerekli yapiyi olusturtuktan sonra aşağıdaki görevi tamamlayın.
        //        1. Verilen web sayfasına gidin.
        //        https://the-internet.herokuapp.com/checkboxes
        Driver.getDriver().get(ConfigReader.getProperty("herokuappURL"));
        //        2. Checkbox1 ve checkbox2 elementlerini locate edin.
        //        3. Checkbox1 seçili değilse onay kutusunu tıklayın
        HerokuAppPage herokuAppPage = new HerokuAppPage();
        if(!herokuAppPage.checkBox1.isSelected()) {
            herokuAppPage.checkBox1.click();
        }
        //        4. Checkbox2 seçili değilse onay kutusunu tıklayın
        if(!herokuAppPage.checkBox2.isSelected()){
            herokuAppPage.checkBox2.click();
        }
        //5. Sayfa basliginin Checkboxes oldugunu dogrulayin
        String actualTitle = herokuAppPage.titleCheckboxes.getText();
        String expectedTitle = "Checkboxes";
        Assert.assertEquals(actualTitle, expectedTitle);

        Driver.closeDriver();}

    @Test
    public void radioButtonTest() {
        // 1. Bir test method oluşturun : RadioButtonTest
        //    2. Gerekli yapiyi olusturtuktan sonra aşağıdaki görevi tamamlayın.
        Driver.getDriver().get(ConfigReader.getProperty("faceURL"));
        //         1- https://www.facebook.com adresine gidin
        //         2- Cookies’i kabul edin
        FacebookPage facebookPage = new FacebookPage();
        facebookPage.allowCookiesButton.click();
        //         3- “Create an Account” button’una basin
        facebookPage.createNewButton.click();
        //         4- “radio buttons” elementlerini locate edin
        //         5- Secili degilse cinsiyet butonundan size uygun olani secin
        if(!facebookPage.maleRadioButonu.isSelected()){
            facebookPage.maleRadioButonu.click();
        }
        //6. Signup yazisinin gorunur old, dogrula
        Assert.assertTrue(facebookPage.signUpText.isDisplayed());
        Driver.quitDriver();
    }
}
