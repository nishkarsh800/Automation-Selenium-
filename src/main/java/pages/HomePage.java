package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    private WebDriver driver;

    //By = a tool that tells WebDriver how to find elements on a webpage.
    private By formAuthenticationLink = By.linkText("Form Authentication");


    // a constructor that receives the driver from the test and saves it.
    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    public LoginPage clickFormAuthentication(){
        driver.findElement(formAuthenticationLink).click();
        return new LoginPage(driver);
    }
    /* same as : WebElement formAuthenticationLink = driver.findElement(By.linkText("Form Authentication"));
         formAuthenticationLink.click();*/

}

