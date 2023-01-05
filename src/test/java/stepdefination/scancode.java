package stepdefination;

import PageObjects.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.io.IOException;
import java.util.List;

public class scancode extends BaseClass {

    public scancode() throws InterruptedException, IOException {
        BaseClass bso = new BaseClass();
        bso.setup();
        driver = bso.driver;

    }


    @Given("User clicks on My profile button & flyout gets open.")
    public void user_clicks_on_my_profile_button_flyout_gets_open() throws InterruptedException {
        Thread.sleep(10000);
        driver.findElement(By.id("header-loggedin-link")).click();


    }

    @Then("User clicks on My wishlist link.")
    public void user_clicks_on_my_wishlist_link() throws InterruptedException {
        Thread.sleep(5000);
        driver.findElement(By.xpath("//a[@href= 'https://oneweb-test.hafele.com/test-release2-rg40/de/de/account/notepad/']")).click();

    }

    @Then("User navigates to My Wishlist page.")
    public void user_navigates_to_my_wishlist_page() {
//        List<String> list = new List<String>() {
//            list.add("Air B");
//            list.add("test");
//            //Iterating the List element using for-each loop
//            for(String wishlist:list)
//                    System.out.println("list");
//        }
      List<WebElement> ListOfwishList=  driver.findElements(By.xpath("//*[@class='a-text-link t-text-link']"));
      int n=ListOfwishList.size();
      System.out.println(n);
    }

    @Then("User scroll down the page & clicks on checkboxes.")
    public void user_scroll_down_the_page_clicks_on_checkboxes() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("User clicks on DownloadEAN\\/QR code link button.")
    public void user_clicks_on_download_ean_qr_code_link_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("Verifies pop-up opens & gets option to choose between QR & EAN code.")
    public void verifies_pop_up_opens_gets_option_to_choose_between_qr_ean_code() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("User clicks on QR or EAN scan code")
    public void user_clicks_on_qr_or_ean_scan_code() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("User clicks on drop down filter & choose the QR\\/EAN scanner")
    public void user_clicks_on_drop_down_filter_choose_the_qr_ean_scanner() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

}
