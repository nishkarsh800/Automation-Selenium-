package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    private WebDriver driver;

    // a constructor that receives the driver from the test and saves it.
    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    public LoginPage clickFormAuthentication(){
        clickLink("Form Authentication");
        return new LoginPage(driver);
    }

    public DropDownPage clickDropDown(){
        clickLink("Dropdown");
        return new DropDownPage(driver);
    }

    public HoversPage clickHovers(){
        clickLink("Hovers");
        return new HoversPage(driver);
    }
    //made a generic method for clicking the link instead of creating a different function
    private void clickLink(String linkText){
        driver.findElement(By.linkText(linkText)).click();
    }

}

