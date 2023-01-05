package Utility;

import PageObjects.BaseClass;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestResult;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class MyUtility extends BaseClass {
    public WebDriver driver;

    public MyUtility(WebDriver driver) throws InterruptedException {
        //super();
        // BaseClass base = new BaseClass();
        // base.setup();
        // base.setDriver();
        this.driver = driver;
    }


    public void whishlistitems() {
        //System.out.println(driver);
        List<WebElement> listOfWishList = driver.findElements(By.xpath("//label[@class='radiolabel']"));
        for (WebElement e : listOfWishList) {
            if (e.getText() == "testnewlist") {
                System.out.println("wishlist already exist");
            }
        }

    }

    public void clickFurtherButton() {
        WebElement furtherButton = driver.findElement(By.xpath("//*[contains(text(),'Weiter')]"));
        furtherButton.click();
    }

    public void acceptCookie() {
        try {
            boolean RedirectCountry = driver.findElement(By.xpath("//a[contains(text(),'Hier bleiben.')]")).isDisplayed();
            if (RedirectCountry) {
                System.out.println("test cookie method");
                driver.findElement(By.xpath("//a[contains(text(),'Hier bleiben.')]")).click();
                System.out.println("test cookie new method");

            }


        } catch (Exception e) {
            System.out.println("error message");
        }

    }

    public void CheckStatus() {
        boolean text = driver.findElement(By.xpath("//div[@class='orderTableInner']")).isDisplayed();
        if (text) {
            System.out.println("data is available");
        } else {
            System.out.println("data is not available");
        }
    }


    public void Screenshot() throws IOException {
        //Screenshot code
        TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
        File src = takesScreenshot.getScreenshotAs(OutputType.FILE);
        FileHandler.copy(src, new File("C:/Users/tsandeep/Desktop/testdata/sc2.jpeg"));
    }

    public void screenShot(ITestResult result){
        //using ITestResult.FAILURE is equals to result.getStatus then it enter into if condition
        if(ITestResult.FAILURE==result.getStatus()){
            try{
                // To create reference of TakesScreenshot
                TakesScreenshot screenshot=(TakesScreenshot)driver;
                // Call method to capture screenshot
                File src=screenshot.getScreenshotAs(OutputType.FILE);
                // Copy files to specific location
                // result.getName() will return name of test case so that screenshot name will be same as test case name
                FileUtils.copyFile(src, new File("D:\\"+result.getName()+".png"));
                System.out.println("Successfully captured a screenshot");
            }catch (Exception e){
                System.out.println("Exception while taking screenshot "+e.getMessage());
            }
        }
        driver.quit();
    }
}
