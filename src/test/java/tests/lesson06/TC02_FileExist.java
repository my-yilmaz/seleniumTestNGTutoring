package tests.lesson06;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.nio.file.Files;
import java.nio.file.Paths;

public class TC02_FileExist {
    @Test
    public void test01() {
        String pathYolu = System.getProperty("user.dir");
        System.out.println("user.dir pathYolu = " + pathYolu);  // C:\Users\my\IdeaProjects\seleniumTestNGTutoring

        String dosyaYolu = System.getProperty("user.home");
        System.out.println("user.home userYolu = " + dosyaYolu); // C:\Users\my

        String textDosyaYolu = System.getProperty("user.home") + "\\Desktop\\text.txt";  // "C:\Users\my\Desktop\text.txt"

        Assert.assertTrue(Files.exists(Paths.get(textDosyaYolu)));
    }
}
