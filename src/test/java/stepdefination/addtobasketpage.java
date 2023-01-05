package stepdefination;

import PageObjects.BaseClass;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.rules.Timeout;
import org.openqa.selenium.By;

import java.io.IOException;

public class addtobasketpage extends BaseClass {

    public addtobasketpage() throws InterruptedException, IOException {
        BaseClass bscst = new BaseClass();
        bscst.setup();
        driver = bscst.driver;
        // MyUtility = new MyUtility();
    }

    @When("User enter cart button & navigates to basket page.")
    public void user_enter_cart_button_navigates_to_basket_page() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
       // driver.manage().timeouts().implicitlyWait(Timeout, 1000);
          Thread.sleep(2000);
//        driver.findElement(By.className("cartQuickViewButton a-text-link a-text-link--no-underline t-text-link t-text-link--secondary u-display-inline"));
//        Thread.sleep(2000);
//        driver.findElement(By.xpath("//input[@id='Product_SKU']")).click();
//        System.out.println("test data");

    }

    @Then("User enters article number on direct order text box.")
    public void user_enters_article_number_on_direct_order_text_box() {
        // Write code here that turns the phrase above into concrete actions

    }

    @Then("User enters the quantity on Crowd field.")
    public void user_enters_the_quantity_on_crowd_field() {
        // Write code here that turns the phrase above into concrete actions

    }

    @Then("User enters the commission text field.")
    public void user_enters_the_commission_text_field() {
        // Write code here that turns the phrase above into concrete actions

    }

    @Then("User clicks on enters button.")
    public void user_clicks_on_enters_button() {
        // Write code here that turns the phrase above into concrete actions

    }

}
