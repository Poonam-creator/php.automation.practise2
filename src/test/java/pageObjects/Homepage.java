package pageObjects;

import driver.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage extends BaseClass {
    public static String searchitem;

    public String validatePhpAutomationUrl()
    {
        return driver.getCurrentUrl();
    }

    public String validatePageTitle()
    {
        return driver.getTitle();
    }

    public void validateSign_up()
    {
        driver.findElement(By.className("login")).click();
    }

    public void validateSearchbox(String item){
        searchitem = item;
        driver.findElement(By.id("search_query_top")).sendKeys(item);
        driver.findElement(By.name("submit_search")).click();

    }


}
