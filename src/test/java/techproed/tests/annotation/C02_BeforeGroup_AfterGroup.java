package techproed.tests.annotation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

import java.time.Duration;

public class C02_BeforeGroup_AfterGroup {

    WebDriver driver;

    @BeforeGroups("chrome")
    public void chromeSetUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }

    @BeforeGroups("firefox")
    public void fireFoxSetUp() {
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }

    @Test(groups = "firefox")
    public void test01() {
        driver.get("https://amazon.com");
    }

    @Test(groups = "chrome")
    public void test02() {
        driver.get("https://google.com");
    }

    @Test(groups = "chrome")
    public void test03() {
        driver.get("https://facebook.com");
    }

    @AfterGroups("chrome")
    public void tearDown() {
        driver.quit();
    }
}
