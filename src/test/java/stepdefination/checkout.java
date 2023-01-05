package stepdefination;

import PageObjects.BaseClass;
import Utility.MyUtility;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.jsoup.Connection;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.ITestResult;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.List;

public class checkout extends BaseClass {

   // private MyUtility myUtility;


    public checkout() throws InterruptedException, IOException {
        BaseClass bscs = new BaseClass();
        bscs.setup();
        driver = bscs.driver;
      // MyUtility = new MyUtility();


    }
    @When("User enters value a in search box as {int}.")
    public void user_enters_value_a_in_search_box_as(Integer int1) throws InterruptedException {


        try{
            MyUtility utility = new MyUtility(driver);
            utility.acceptCookie();
            //driver = new ChromeDriver();
            // Write code here that turns the phrase above into concrete actions

            Thread.sleep(10000);
            //driver.findElement(By.xpath(".//input[@name='SearchTerm']")).sendKeys("26226533");
            driver.findElement(By.id("inputSearchTerm")).sendKeys("26226533");


        }
        catch(Exception e) {
            System.out.println("Something went wrong");
        }

    }
    @Test(enabled = true)
    @Then("USer clicks on a search button.")
    public void user_clicks_on_a_search_button() throws InterruptedException, IOException {
        driver.findElement(By.xpath("//button[@value='Search']")).click();
        MyUtility utility = new MyUtility(driver);
        utility.Screenshot();

//        ITestResult result = null;
//        utility.screenShot(result);
        Thread.sleep(6000);
    }

    @Then("User navigates to a cart-page & clicks on cart button.")
    public void user_navigates_to_a_cart_page_clicks_on_cart_button() throws InterruptedException {

        MyUtility utility = new MyUtility(driver);
        utility.acceptCookie();

        driver.findElement(By.id("addToCartButtonContainer")).click();
        Thread.sleep(5000);

    }

    @Then("A confirmation pop-up opens on a cart-page.")
    public void a_confirmation_pop_up_opens_on_a_cart_page() {
        // Write code here that turns the phrase above into concrete actions

    }

    @Then("User clicks on a {string} button.")
    public void user_clicks_on_a_button(String string) throws InterruptedException {
        driver.findElement(By.id("notificationGoToCartLink_new")).click();
        Thread.sleep(2000);
    }

    @Then("Verifies articles moved to a cart-page.")
    public void verifies_articles_moved_to_a_cart_page() {
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("window.scrollBy(0,500)");
    }


    @Then("User clicks on check box.")
    public void user_clicks_on_check_box() throws InterruptedException {
        Thread.sleep(2000);
        System.out.println("testcheckout");
        WebElement basketCheckbox =  driver.findElement(By.xpath("//td[@class='c-table__column hidden-xs u-bold js-product-checkbox']/div/div"));
        basketCheckbox.click();
        //driver.findElement(By.id("//td[@class='c-table__column hidden-xs u-bold js-product-checkbox']/div/div")).click();
        //List<WebElement> did = driver.findElement(By.id("divwjUKAOuiRjcAAAF__HtmW7FD")).click();
//        List<WebElement> dyid = driver.findElements(By.id("divwjUKAOuiRjcAAAF__HtmW7FD"));
//
//        for(WebElement e : dyid)
//            System.out.println(e.getText());
    }

    @Then("User scroll down to bottom & clicks on proceed to checkout button.")
    public void user_scroll_down_to_bottom_clicks_on_proceed_to_checkout_button() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@name='checkout']")).click();
    }

    @Then("User moved to My order page & clicks on further button.")
    public void user_moved_to_My_order_page_clicks_on_further_button() {
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("window.scrollBy(0,4000)");

    }

    @Then("User moved to Shipping deatils page & clicks on further button.")
    public void user_moved_to_Shipping_deatils_page_clicks_on_further_button() throws InterruptedException {
        Thread.sleep(2000);
//        MyUtility click = new MyUtility();
       // myUtility.clickFurtherButton();
        WebElement furtherbutton = driver.findElement(By.xpath("//*[contains(text(),'Weiter')]"));
        furtherbutton.click();

    }

    @Then("User moved to Check order page & clicks on Buy button.")
    public void user_moved_to_Check_order_page_clicks_on_Buy_button() throws InterruptedException {

        WebElement furtherbutton = driver.findElement(By.xpath("//*[contains(text(),'Weiter')]"));
        furtherbutton.click();
      //  myUtility.clickFurtherButton();

        Thread.sleep(2000);
        //driver.findElement(By.id("checkoutBuyButton")).click();

    }


}
