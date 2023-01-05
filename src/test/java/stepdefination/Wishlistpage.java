package stepdefination;
import PageObjects.BaseClass;
import Utility.MyUtility;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.List;

public class Wishlistpage extends BaseClass {
    MyUtility mute;
    public Wishlistpage() throws InterruptedException, IOException {
        BaseClass bsc = new BaseClass();
        bsc.setup();
        driver = bsc.driver;
        mute = new MyUtility(driver);
    }

    @When("User enter the article no. in search box as {int}")
    public void user_enter_the_article_no_in_search_box_as(Integer int1) throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        Thread.sleep(5000);
        driver.findElement(By.id("inputSearchTerm")).sendKeys("26226535");
    }

    @Then("User clicks on search button.")
    public void user_clicks_on_search_button() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        Thread.sleep(4000);
        driver.findElement(By.xpath("//button[@value='Search']")).click();

    }


    @Then("User clicks on Add to Wishlist button & pop-ups opens.")
    public void user_clicks_on_Add_to_Wishlist_button_pop_ups_opens() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        Thread.sleep(4000);
        driver.findElement(By.id("addToWishlistLinkContainer")).click();
    }

    @Then("User enter the wishlist name.")
    public void user_enter_the_wishlist_name() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        Thread.sleep(4000);
        driver.findElement(By.id("AddToWishlistForm_TargetWishlistIDNewWishlist")).click();
        Thread.sleep(2000);
        //ws.whishlistitems();
        //3qmute.whishlistitems();

        driver.findElement(By.xpath("//input[@value='Neuer Merkzettel']")).sendKeys("testnewlist");
    }

    @Then("User clicks on Add article to wishlist button.")
    public void user_clicks_on_Add_article_to_wishlist_button() {
        // Write code here that turns the phrase above into concrete actions
        driver.findElement(By.xpath("//button[@name='AddWishlistItem']")).click();

    }

}
