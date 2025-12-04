package base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class BaseTests {

    public void setUp() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        driver.manage().window().fullscreen(); // maximize window

        // Click on "Shifting Content" link on the home page
        WebElement shiftingContentLink = driver.findElement(By.linkText("Shifting Content"));
        shiftingContentLink.click();

        // Click on "Example 1: Menu Element" link on the Shifting Content page
        WebElement exampleMenuElementLink = driver.findElement(By.linkText("Example 1: Menu Element"));
        exampleMenuElementLink.click();

        // On the Menu Element example page, find all menu items and print their count
        // The menu items are the list items in the example menu
        List<WebElement> menuItems = driver.findElements(By.cssSelector("div.example ul li"));
        System.out.println("Number of menu elements: " + menuItems.size());

        System.out.println("Page title: " + driver.getTitle());
        System.out.println("Current URL: " + driver.getCurrentUrl());

        // Optional wait just to visually confirm if you run it manually
        Thread.sleep(3000);
        driver.close();
    }

    public static void main(String[] args) throws InterruptedException {
        BaseTests tests = new BaseTests(); //Creates a real object in memory using new BaseTests()
        tests.setUp();
    }
}
