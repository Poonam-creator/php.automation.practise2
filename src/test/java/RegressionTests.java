import driver.BaseClass;
import org.junit.Assert;
import org.junit.Test;
import pageObjects.Homepage;
import pageObjects.ProductDescriptionpage;
import pageObjects.ResultsPage;
import pageObjects.ShoppingCartPage;

public class RegressionTests extends BaseClass {

        Homepage homepage = new Homepage();
        ResultsPage resultsPage = new ResultsPage();
        ProductDescriptionpage productDescriptionpage = new ProductDescriptionpage();
        ShoppingCartPage shoppingCartPage = new ShoppingCartPage();

  @Test
  public void search_Test(){
      String title = homepage.validatePageTitle();
      System.out.println(title);
      Assert.assertEquals("My Store",title);

      homepage.validateSearchbox("Printed Dress");
      String results =resultsPage.validateResultspage();
      System.out.println(results);
      Assert.assertEquals("5 results have been found.",results);

     boolean image= resultsPage.validate_Image();
     Assert.assertTrue(image);
  }





   // @Test  Till check out
   public void searchTest(){
        homepage.validatePageTitle();
        homepage.validateSearchbox("Printed Dress");
        String name = resultsPage.validateResultspage();
        System.out.println(name);
        resultsPage.selectproduct();
        productDescriptionpage.validateadd_to_cartbutn();
        productDescriptionpage.vlaidateproceedTocheckoutbutn();
        shoppingCartPage.validate_proceedToCheckout();
    }
}
