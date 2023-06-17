package test;

import org.testng.annotations.Test;
import page.YourCartPage;
import utilities.TestBase;

import java.util.concurrent.TimeUnit;

public class YourCartTest extends TestBase {

    page.YourCartPage yourCartPage;

    @Test
    public void yourCart(){
        // Confirm Your Order
        yourCartPage = new YourCartPage(driver);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        yourCartPage.checkOutButton(driver);
        yourCartPage.assertOnYourInformation();
    }
}
