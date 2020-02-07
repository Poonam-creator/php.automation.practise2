package stepdef;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import driver.BaseClass;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pageObjects.Homepage;
import pageObjects.ResultsPage;

public class StepDefinations {
    Homepage homepage = new Homepage();
    ResultsPage resultsPage = new ResultsPage();

    @Given("^customer is on homepage$")
    public void customer_is_on_homepage() throws Throwable {
        String title =homepage.validatePageTitle();
        Assert.assertEquals("My Store", title);
       }

    @When("^customer enters desired product$")
    public void customer_enters_desire_product() throws Throwable {
        homepage.validateSearchbox("Printed Dress");
        }

    @Then("^customer should see desired product$")
    public void customer_should_see_desied_product() throws Throwable
    {
        String headline =resultsPage.validateResultspage();
        System.out.println(headline);
        Assert.assertEquals("5 results have been found.",headline);

        boolean image= resultsPage.validate_Image();
        Assert.assertTrue(image);
       }
   }
