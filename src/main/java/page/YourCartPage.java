package page;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.asserts.SoftAssert;
import utilities.WebPageBase;


public class YourCartPage extends WebPageBase {

        public YourCartPage(WebDriver driver) {
            super(driver);
        }

        @FindBy(id = "checkout")
        public WebElement checkOutButton;

        @FindBy(className = "title")
        public WebElement assertOnYourInformation;

        public void checkOutButton(WebDriver driver) {
            JavascriptExecutor js2 = (JavascriptExecutor) driver;
            js2.executeScript("arguments[0].click()", checkOutButton);
        }
    public void assertOnYourInformation(){
        SoftAssert softAssert = new SoftAssert();
        String ExpectedText = "Checkout: Your Information";
        String ActualText = assertOnYourInformation.getText();
        softAssert.assertEquals(ActualText,ExpectedText,"Title is not Matching");
        softAssert.assertAll();
    }


    }

