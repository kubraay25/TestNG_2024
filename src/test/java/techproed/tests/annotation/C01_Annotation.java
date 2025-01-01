package techproed.tests.annotation;

import org.testng.annotations.*;

public class C01_Annotation {

    @BeforeSuite
    public void beforeSuit(){
        System.out.println("Bütün testlerin öncesinde beforeSuit() anatosyonuna sahip metod 1 kez çalışır ");
    }

    @AfterSuite
    public void afterSuite(){
        System.out.println("Bütün testlerin sonrasında afterSuite() anatosyonuna sahip metod 1 kez çalışır");
    }

    @BeforeTest
    public void beforeTest(){
        System.out.println("Bütün testlerin öncesinde BeforeTest() anatosyonuna sahip metod 1 kez çalışır");
    }

    @AfterTest
    public void afterTest(){
        System.out.println("Bütün testlerin sonrasında AfterTest() anatosyonuna sahip metod 1 kez çalışır");
    }

    @BeforeClass
    public void beforeClass(){
        System.out.println("Bütün testlerin öncesinde @BeforeClass anatosyonuna sahip metod 1 kez çalışır");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("Bütün testlerin sonrasında @BeforeClass anatosyonuna sahip metod 1 kez çalışır");
    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("Her testten önce @BeforeMethod 1 kez çalışır");
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("Her testten sonra @AfterMethod 1 kez çalışır");
    }

    @Test
    public void test_001(){
        System.out.println("test_001 çalıştırılıyor");
    }

    @Test
    public void test_002(){
        System.out.println("test_002 çalıştırılıyor");
    }

    @Test
    public void test_003(){
        System.out.println("test_003 çalıştırılıyor");
    }
}
