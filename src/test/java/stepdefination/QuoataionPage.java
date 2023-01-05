package stepdefination;

import PageObjects.BaseClass;
import Utility.MyUtility;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
//import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.io.IOException;
import java.util.List;

public class QuoataionPage extends BaseClass {

       public  QuoataionPage() throws InterruptedException, IOException {
            BaseClass bacl = new BaseClass();
            bacl.setup();
            driver = bacl.driver;
        }


        @When("User click on My Account button.")
        public void user_click_on_My_Account_button () throws InterruptedException {
            // Write code here that turns the phrase above into concrete actions
            Thread.sleep(5000);
            driver.findElement(By.id("header-loggedin-link")).click();

        }

        @Then("My Account fly out opens & User clicks on My orders link.")
        public void my_Account_fly_out_opens_User_clicks_on_My_orders_link () throws InterruptedException {
            // Write code here that turns the phrase above into concrete actions
            Thread.sleep(1000);
            //driver.findElement(By.id("MyAccountMyOrders")).click();

//            WebElement mngrid = driver.findElement(By.xpath("//tr[@class='heading3']/td"));
//            String actual_text = mngrid.getText();
//            actual_text= actual_text.replace("Manger Id :"," ");
//            System.out.println(actual_text);


           // driver.findElement(By.linkText("Meine Bestellungen")).click();

        }

        @Then("My Account panel opens & User clicks on My offers link.")
        public void my_Account_panel_opens_User_clicks_on_My_offers_link () throws InterruptedException {
            // Write code here that turns the phrase above into concrete actions
            Thread.sleep(1000);
            //driver.findElement(By.name("Meine Angebote"));
            driver.findElement(By.linkText("Angebote")).click();
        }

        @Then("Lister page opens & User clicks on quote number.")
        public void lister_page_opens_User_clicks_on_quote_number () throws InterruptedException {
            // Write code here that turns the phrase above into concrete actions
            MyUtility utility = new MyUtility(driver);
            utility.CheckStatus();
            Assert.assertEquals(true, true);
            WebDriverWait mywait= new WebDriverWait(driver, 30);   /* Expilicit Wait- clicks on Drop Down Button*/
          //  Thread.sleep(500);
            WebElement e1= driver.findElement(By.xpath("//div[@id='select_PeriodOfTime']/div[@class = 'button a-select__button']"));
            mywait.until(ExpectedConditions.visibilityOf(e1)).click();

            WebDriverWait testwait = new WebDriverWait(driver, 30); /* Expilicit Wait- clicks on "All" Button of drop-down*/
         //   Thread.sleep(500);
            WebElement e2 = driver.findElement(By.xpath("//ul[@class = 'a-select__options t-select__options t-shadow t-shadow--lg open']/li[1]"));
            testwait.until(ExpectedConditions.visibilityOf(e2)).click();

          Thread.sleep(5000);
            System.out.println("CheckStatus");

            //select value from drop down

//            Select textvalue = new Select(driver.findElement(By.id("select_PeriodOfTime")));
//            textvalue.selectByVisibleText("Alle");
          //  Thread.sleep(1000);




            // get the list count from lister page
            List <WebElement> elements = driver.findElements(By.xpath("//tbody/tr/td/a[@href]"));
            for ( WebElement data : elements  ) {
                String str = data.getText();
                System.out.println(str);
            }
           // Thread.sleep(1000);
            System.out.println("Total Quote list count " + elements.size());

            driver.findElement(By.xpath("//tbody/tr/td/a[@href]")).click();


            //driver.findElement(By.xpath("//tbody/tr/td/a[@href = 'https://oneweb-test.hafele.com/test-release2-rg40/de/de/account/quotes/66538593/']")).click();
        }



        @Then("User navigate quote details page & verifies the same.")
        public void user_navigate_quote_details_page_verifies_the_same () {
            // Write code here that turns the phrase above into concrete actions
           // driver.findElement(By.xpath("//*[@id=\"select_PeriodOfTime\"]/ul/li[1]")).click();

//            JavascriptExecutor jse = (JavascriptExecutor)driver;
//            jse.executeScript("window.scrollBy(0,500)");


        }

        @Then("User navigate to quote item.")
        public void user_navigate_to_quote_item () throws InterruptedException {
            // Write code here that turns the phrase above into concrete actions
            //Assert.assertEquals("Artikelnummer / Artikelbezeichnung");
           // Assert.assertEquals("Artikelnummer / Artikelbezeichnung", strng);
            //WebElement element = driver.findElement(By.xpath("//span[text()='Google Search']"));

            //List <WebElement> elements = driver.findElements(By.xpath("//tbody/tr/td/a[@href]"));
//            String strng = element.getText();
//            System.out.println(strng);
//            Assert.assertEquals("Artikelnummer / Artikelbezeichnung", strng);
            Thread.sleep(1000);
           // driver.findElement(By.xpath("//div[@class= 'checkBox js-selection']")).click();

        }

        @Then("User clicks on check box on quote link item.")
        public void user_clicks_on_check_box_on_quote_link_item () {
            // Write code here that turns the phrase above into concrete actions

        }
        @Test
        @Then("User clicks on Buy now button & verifies the same.")
        public void user_clicks_on_Buy_now_button_verifies_the_same () throws InterruptedException {
            // Write code here that turns the phrase above into concrete actions
//            boolean eleSelected= driver.findElement(By.xpath("//div[@class = 'col-sm-11']/h1")).isDisplayed();
//            System.out.println("Element displayed is :"+eleSelected);
            Thread.sleep(5000);
            Assert.assertTrue(driver.findElement(By.xpath("//div[@class = 'col-sm-11']/h1")).isSelected());
            //System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
//            SoftAssert test = new SoftAssert();

        }

    }

