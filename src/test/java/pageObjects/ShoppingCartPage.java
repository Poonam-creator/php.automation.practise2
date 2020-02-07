package pageObjects;

import driver.BaseClass;
import org.openqa.selenium.By;

public class ShoppingCartPage extends BaseClass {

    public void validate_proceedToCheckout(){
        driver.findElement(By.xpath("//*[@id=\"center_column\"]/p[2]/a[1]/span"));
    }
}
////a[@class='button btn btn-default standard-checkout button-medium']//span[contains(text(),'Proceed to checkout')]