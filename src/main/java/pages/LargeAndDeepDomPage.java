package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LargeAndDeepDomPage {

    public WebDriver driver;
    private By table = By.id("large-table");

    public LargeAndDeepDomPage(WebDriver driver){
        this.driver = driver;
    }

    public void scrollToTable(){
        //Selenium finds the table element and stores it in tableElement.
        WebElement tableElement = driver.findElement(table);
        // use javascript executor class bcz we don't have any built in method to scroll in table
        //Scroll the page until this element comes into view.”
        String script = "arguments[0].scrollIntoView();";
        /* We cast WebDriver to JavascriptExecutor because executeScript() is not part of the
         WebDriver interface, even though the actual driver implementation supports it.*/
        ((JavascriptExecutor)driver).executeScript(script,tableElement);

    }
}
