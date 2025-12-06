package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SecureAreaPage {

    private WebDriver driver;

    private By statusAlert = By.id("flash");

    public SecureAreaPage(WebDriver driver){
        this.driver = driver;
    }

    public String getAlertText(){
        // Wait for the alert element to be visible (up to 10 seconds)
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        String alertText = wait.until(ExpectedConditions.visibilityOfElementLocated(statusAlert)).getText();

        // Remove the close button (×) and trim whitespace/newlines
        // The flash message typically contains "×" at the beginning or end
        return alertText.replace("×", "").trim();
    }


}
