package pageObjects;

import driver.BaseClass;
import org.openqa.selenium.By;

public class Homepage extends BaseClass {
    public static String searchitem;

    public String validatePhpAutomationUrl(){
        return driver.getCurrentUrl();
    }

    public String validatePageTitle(){
        return driver.getTitle();
    }

    public void validateSign_up(){
        driver.findElement(By.className("login")).click();
    }

    public void ValidateSearchbox(String item){
        searchitem = item;
        driver.findElement(By.id("search_query_top")).sendKeys(item);
        driver.findElement(By.name("submit_search")).click();

    }


}
