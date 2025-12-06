package login;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
import pages.SecureAreaPage;

public class LoginTests extends BaseTests {

    @Test
    public void testSuccessfulLogin(){
        LoginPage loginPage = homePage.clickFormAuthentication(); // hover on clickFormAuthentication() to get return type
        loginPage.setUserName("tomsmith");
        loginPage.setPassword("SuperSecretPassword");
        SecureAreaPage secureAreaPage = loginPage.clickLoginButton(); // hover on clickLoginButton() to get return type
        Assert.assertTrue(secureAreaPage.getAlertText().contains("You logged into a secured area!"),
                "Alert text is incorrect");

    }
}
