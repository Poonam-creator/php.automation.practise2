package pageObjects;

import driver.BaseClass;
import org.openqa.selenium.By;

public class ProductDescriptionpage extends BaseClass {
    public void validateadd_to_cartbutn(){
        driver.findElement(By.xpath("//button[@name='Submit']")).click();
    }
    public void vlaidateproceedTocheckoutbutn(){
        driver.findElement(By.xpath("//span[contains(text(),'Proceed to checkout')]")).click();
    }

}
