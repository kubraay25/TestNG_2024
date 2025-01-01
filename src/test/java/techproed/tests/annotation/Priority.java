package techproed.tests.annotation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class Priority {

    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }


    //priotry değerleri vermeden önce testler harf sırasına göre çalışacaktır amazon,google,youTube çalışacaktır
    //priority değeri verirsek küçükten büyüğe doğru çalışacaktır

    @Test(priority = 1)
    public void youTube(){
        driver.get("https://youTube.com");
        System.out.println("1. olarak çalışan prioritysi 1 olan youTube testidir");
    }

    @Test(priority = 4)
    public void google(){
        driver.get("https://google.com");
        System.out.println("3. olarak çalışan test prioritysi 4 olan google testidir");
    }

    @Test(priority = 2)
    public void amazon(){
        driver.get("https://amazon.com");
        System.out.println("2. olan çalışan test prioritysi 2 olan amazon testidir");
    }


    //Tüm testlerde açılan browserları tek tek kapatır
    @AfterMethod
    public void dropDawn(){
        driver.quit();
    }
}
