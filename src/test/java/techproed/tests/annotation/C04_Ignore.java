package techproed.tests.annotation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class C04_Ignore {

    WebDriver driver;


    //1.kullanim
    @BeforeMethod()
    public  void setUp(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }

    @Test(enabled = false)
    public void amazon(){
        driver.get("https://amazon.com");
    }

    @Test(enabled = true)
    public void google(){
        driver.get("https://google.com");
    }

    //2.kullanım
    @Test @org.testng.annotations.Ignore
    public void trendYol(){
        driver.get("https://trendyol.com");
    }

    @AfterMethod
    public void dropDawn(){
        driver.quit();
    }
}
