package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WysiwygEditorPage {

    private WebDriver driver;
    private String editorIdFrame = "mce_0_ifr";
    private By textArea = By.id("tinymce");
    private By decreaseIndentButton = By.cssSelector("#mceu_12 button");


    public WysiwygEditorPage(WebDriver driver){
        this.driver = driver;
    }

    //clear text in iframe and exit by switching to main area
    public void clearTextArea(){
        switchToEditArea();
        driver.findElement(textArea).clear();
        switchToMainArea();
    }

    // after clearing set ur own text
    public void setTextArea(String text){
        switchToEditArea();
        driver.findElement(textArea).sendKeys(text);
        switchToMainArea();
    }

    //to verify the entered text
    public String getTextFromEditor(){
        switchToEditArea();
        String text = driver.findElement(textArea).getText();
        switchToMainArea();
        return text;
    }

    //this btn is not inside an iframe so don't worry about switching the context
    public void decreaseIndention(){
        driver.findElement(decreaseIndentButton).click();
    }

    //switching to the iframe
    private void switchToEditArea(){
        driver.switchTo().frame(editorIdFrame);
    }

    //now we need to exit the iframe after performing the certain action
    private void switchToMainArea(){
        driver.switchTo().parentFrame();
    }
}
