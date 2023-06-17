package test;

import org.testng.annotations.Test;
import page.YourInformationPage;
import utilities.TestBase;

import java.util.concurrent.TimeUnit;

public class YourInformationTest extends TestBase {

    page.YourInformationPage yourInformationPage;


    @Test
    public void yourInformation(){
        // Insert Your Information
        yourInformationPage = new YourInformationPage(driver);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        yourInformationPage.firstName("Ahmed");
        yourInformationPage.lastName("Hamed");
        yourInformationPage.postalCode("123");
        yourInformationPage.continueButton(driver);
        yourInformationPage.assertOnOverView();

    }
}
