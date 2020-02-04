package stepdef;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import driver.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pageObjects.Homepage;
import pageObjects.ProductDescriptionpage;
import pageObjects.ResultsPage;

public class Stepdefinations {
    Homepage homepage = new Homepage();
    ResultsPage resultsPage = new ResultsPage();
    ProductDescriptionpage productDescriptionpage = new ProductDescriptionpage();

    @Given("^customer is on homepage$")
    public void customer_is_on_homepage() throws Throwable {
        homepage.validatePageTitle();
       }

    @When("^customer enters desire product$")
    public void customer_enters_desire_product() throws Throwable {
        homepage.ValidateSearchbox("dress");
        }

    @Then("^customer should see desied product$")
    public void customer_should_see_desied_product() throws Throwable {
        resultsPage.validateResultspage();
       }

    @Then("^customer clicked on product$")
    public void customer_clicked_on_product() throws Throwable {
        resultsPage.selectproduct();
        }

    @Then("^customer clicked on addToCart$")
    public void customer_clicked_on_addToCart() throws Throwable {
        productDescriptionpage.validateadd_to_cartbutn();
    }

    @Then("^customer clicked on checkout$")
    public void customer_clicked_on_checkout() throws Throwable {
    productDescriptionpage.vlaidateproceedTocheckoutbutn();
    }


}
