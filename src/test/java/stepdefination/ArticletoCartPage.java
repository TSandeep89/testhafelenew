package stepdefination;

import PageObjects.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class ArticletoCartPage extends BaseClass {
    //WebDriver driver1;
   // WebElement AddtoCartpopup = driver.findElement(By.id("notificationGoToCartLink_new"));

    public ArticletoCartPage() throws InterruptedException {
        //super();
        //ArticletoCartPage articletoCartPage= new ArticletoCartPage();

        BaseClass bs = new BaseClass();
        bs.setup();
        //this.driver1 = super.driver;
        driver = bs.driver;
        //driver = bs.driver;

    }

    //WebDriver driver;
    @Given("User on Home Page.")
//    public void user_on_Home_Page() {
//        // Write code here that turns the phrase above into concrete actions
//        driver.findElement(By.id("inputSearchTerm")).sendKeys("26226533");
//}


        @When("User enters value in search box as {int}.")
        public void user_enters_value_in_search_box_as(Integer int1) throws InterruptedException {
        try{
            //driver = new ChromeDriver();
            // Write code here that turns the phrase above into concrete actions
            Thread.sleep(5000);
            //driver.findElement(By.xpath(".//input[@name='SearchTerm']")).sendKeys("26226533");
            driver.findElement(By.id("inputSearchTerm")).sendKeys("26226533");

        }
        catch(Exception e) {
            System.out.println("Something went wrong");
        }

    }


    @Then("USer clicks on search button.")
    public void user_clicks_on_search_button() throws InterruptedException {
       // new ArticletoCartPage();
        driver.findElement(By.xpath("//button[@value='Search']")).click();
        Thread.sleep(2000);

    }

    @Then("User navigates to cart-page & clicks on cart button.")
    public void user_navigates_to_cart_page_clicks_on_cart_button() throws InterruptedException {

        driver.findElement(By.id("addToCartButtonContainer")).click();
        Thread.sleep(4000);

    }

    @Then("A confirmation pop-up opens on cart-page.")
    public void a_confirmation_pop_up_opens_on_cart_page() {
        // Write code here that turns the phrase above into concrete actions

    }

    @Then("User clicks on {string} button.")
    public void user_clicks_on_button(String string) throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        //driver.switchTo().window(shoppingCartNotification);
        //wt.until(ExpectedConditions.visibilityOf(AddtoCartpopup));
        //AddtoCartpopup.click();
        driver.findElement(By.id("notificationGoToCartLink_new")).click();
        Thread.sleep(2000);

    }

    @Then("Verifies articles moved to cart-page.")
    public void verifies_articles_moved_to_cart_page() {
        // Write code here that turns the phrase above into concrete actions
        //JavascriptException js = new JavascriptException();
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("window.scrollBy(0,500)");
    }

    @Then("Use navigates to cart-page.")
    public void use_navigates_to_cart_page() {
        // Write code here that turns the phrase above into concrete actions

    }


}
