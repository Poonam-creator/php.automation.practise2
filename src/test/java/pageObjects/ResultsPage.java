package pageObjects;

import driver.BaseClass;
import org.openqa.selenium.By;

public class ResultsPage extends BaseClass {
    Homepage homePage= new Homepage();

    public String validateResultspage() {
        return driver.findElement(By.className("heading-counter")).getText();
    }

    public String thumbnail()
    {
        return driver.findElement(By.xpath("//span[@class='cat-name']")).getText();
    }

    public void selectproduct()
    {
        driver.findElement(By.linkText("Printed Dress")).click();
    }

    public boolean validate_Image(){
       return driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li[1]/div/div[1]/div/a[1]/img")).isDisplayed();
    }

}
