package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class MultipleWindowsPage {

    private WebDriver driver;
    private By clickHereLink = By.linkText("Click Here");

    public MultipleWindowsPage(WebDriver driver){
        this.driver = driver;
    }

    public void clickHere(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(clickHereLink)).click();
    }
}
