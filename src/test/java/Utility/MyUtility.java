package Utility;

import PageObjects.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

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
}