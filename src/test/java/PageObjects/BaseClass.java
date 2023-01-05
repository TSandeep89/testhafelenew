package PageObjects;


import Utility.MyUtility;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.time.Clock;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.TimeUnit;


public class BaseClass {

//    public BaseClass() throws InterruptedException {
//        setup();
//    }

    //public WebDriverWait wt;
    public WebDriver driver;

    public void setup() throws InterruptedException, IOException {
        // wt = new WebDriverWait(driver, 30);
        // System.setProperty("webdriver.chrome.driver", "C://Users//tsandeep//Desktop//chromedriver_win32//chromedriver.exe");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://test-rg:rd1TPwxGrlafecxHO4VJ@oneweb-test.hafele.com/test-release2-rg40/de/de/");
        driver.manage().window().maximize();
        try {
            Thread.sleep(5000);
            driver.findElement(By.id("onetrust-accept-btn-handler")).click();
        } catch (Exception e) {
            System.out.println("Button not clicked");
        }


        Thread.sleep(2000);
        System.out.println("test1");
        // driver.findElement(By.xpath("(//*[@type=\"button\"])[13]")).click();
        Thread.sleep(2000);
        //driver.switchTo().alert().dismiss();
        //Alert alert = driver.switchTo().alert();
        //alert.dismiss();
//        Thread.sleep(5000);
//        String mainWindow = driver.getWindowHandle();
//        Set<String> allWindow = driver.getWindowHandles();
//        for(String s: allWindow) {
//            if (s!=mainWindow) {
//                driver.switchTo().window(s);
//                driver.close();
//            }
//        }
        Set<String> allWindow = driver.getWindowHandles();
        System.out.println(allWindow.size());

//        Alert alert = driver.switchTo().alert();
//        alert.accept();

        //driver.findElement(By.xpath("//a[contains(text(),'Hier bleiben.')]")).click();

//        boolean RedirectCountry = driver.findElement(By.xpath("//a[contains(text(),'Hier bleiben.')]")).isDisplayed();
//        if(RedirectCountry)
//        {
//            driver.findElement(By.xpath("//a[contains(text(),'Hier bleiben.')]")).click();
//        }


        // driver.switchTo().window(mainWindow);
        MyUtility utils = new MyUtility(driver);
        utils.acceptCookie();
        driver.findElement(By.linkText("Anmelden / Registrieren")).click();
        System.out.println("test2");
        driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS) ;
//        Thread.sleep(2000);

        driver.findElement(By.id("ShopLoginForm_Login_headerItemLogin")).sendKeys("1000437");
        driver.findElement(By.id("ShopLoginForm_Password_headerItemLogin")).sendKeys("1902");
      //  Assert.assertEquals(true,false);
//        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[contains(text(),'Anmelden')]")).click();
//        Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
      //  Assert.assertFalse(driver.findElement(By.xpath("//button[contains(text(),'Anmelden')]")).isSelected());
//            Assert.assertEquals(true,false);
    }


    public void setDriver() {
        driver = new ChromeDriver();

    }




}
