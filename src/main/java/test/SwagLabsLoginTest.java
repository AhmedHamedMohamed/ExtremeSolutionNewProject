package test;

import org.openqa.selenium.WebDriver;
import utilities.TestBase;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class SwagLabsLoginTest extends TestBase {

   page.SwagLabsLoginPage  swagLabsLoginTest;


    @Test
    public void login() {
        // Login With UserName and Password
        swagLabsLoginTest = new page.SwagLabsLoginPage(driver);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        swagLabsLoginTest.userName("standard_user");
        swagLabsLoginTest.password("secret_sauce");
        swagLabsLoginTest.loginButton();
        swagLabsLoginTest.assertOnProducts();



    }
}