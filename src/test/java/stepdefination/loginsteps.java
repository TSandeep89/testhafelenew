package stepdefination;

import PageObjects.BaseClass;
import Utility.MyUtility;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.Assert;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class loginsteps extends BaseClass {

//    public loginsteps() throws InterruptedException, IOException {
//        BaseClass bst = new BaseClass();
//        bst.setup();
//    }

//    WebDriver driver;
  @Given("^I launch chrome browser$")
   public void i_launch_chrome_browser() {
        // Write code here that turns the phrase above into concrete actions
        System.setProperty("webdriver.chrome.driver", "C://Users//tsandeep//Desktop//chromedriver_win32//chromedriver.exe");
        driver = new ChromeDriver();

   }

    @When("User opens URL {string}")
    public void user_opens_url(String url) throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions

        driver.get("https://test-rg:rd1TPwxGrlafecxHO4VJ@oneweb-test.hafele.com/test-release2-rg40/de/de/");
        driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        //Thread.sleep(5000);

    }

    @Then("User close the dialog box")
    public void user_close_the_dialog_box() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions

        //driver.findElement(By.linkText("Hier bleiben.")).click();
        driver.findElement(By.xpath("(//*[@type=\"button\"])[13]")).click();
//        Alert alert = driver.switchTo().alert();
//        System.out.println(alert.getText());
//        alert.accept();
    }


    @Then("User clicks on Register button")
    public void user_clicks_on_register_button() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        //Thread.sleep(1000);
        try {
            Thread.sleep(5000);
            driver.findElement(By.id("onetrust-accept-btn-handler")).click();
        } catch (Exception e) {
            System.out.println("Button not clicked");
        }

        MyUtility utils = new MyUtility(driver);
        utils.acceptCookie();
        Thread.sleep(2000);
        driver.findElement(By.linkText("Anmelden / Registrieren")).click();
    }

    @Then("^User enters Customer as (.*) and (.*)$")
    public void user_enters_customer_as_and_password_as_hq3(String username, String password) {
        // Write code here that turns the phrase above into concrete actions
//            driver.findElement(By.id("ShopLoginForm_Login_headerItemLogin")).sendKeys("2622299");
//            driver.findElement(By.id("ShopLoginForm_Password_headerItemLogin")).sendKeys("HQ3-");

        driver.findElement(By.id("ShopLoginForm_Login_headerItemLogin")).sendKeys(username);
        driver.findElement(By.id("ShopLoginForm_Password_headerItemLogin")).sendKeys(password);



    }

    @Then("Click on Register submit button")
    public void click_on_register_submit_button() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        //Thread.sleep(1000);
        driver.findElement(By.xpath("//button[contains(text(),'Anmelden')]")).click();
        Thread.sleep(1000);

    }

    @Then("Page Title should be {string}")
    public void page_title_should_be(String string) {
        // Write code here that turns the phrase above into concrete actions
            String title = driver.getTitle();
            System.out.println("page title is "+title);
            String expectedtitle = "Möbelbeschläge, Baubeschläge, elektronische Schließsysteme | HÄFELE";
        Assert.assertEquals( title, expectedtitle);
        System.out.println("title match successfully");

    }

    @Then("Close the Browser")
    public void close_the_browser() {
        // Write code here that turns the phrase above into concrete actions

     driver.quit();
    }

}
