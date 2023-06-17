package page;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.asserts.SoftAssert;
import utilities.WebPageBase;

public class YourInformationPage extends WebPageBase {


    public YourInformationPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "first-name")
    public WebElement firstName;

    @FindBy(id = "last-name")
    public WebElement lastName;

    @FindBy(id = "postal-code")
    public WebElement postalCode;

    @FindBy(id = "continue")
    public WebElement continueButton;

    @FindBy(className = "title")
    public WebElement assertOnOverView;


    public void firstName(String FirstName) {
        firstName.sendKeys(FirstName);
    }

    public void lastName(String LastName){

        lastName.sendKeys(LastName);
    }
    public void postalCode(String PostalCode){
      postalCode.sendKeys(PostalCode);
    }

    public void continueButton(WebDriver driver) {
        JavascriptExecutor js2 = (JavascriptExecutor) driver;
        js2.executeScript("arguments[0].click()", continueButton);
    }
    public void assertOnOverView(){
    SoftAssert softAssert = new SoftAssert();
    String ExpectedText = "Checkout: Overview";
    String ActualText = assertOnOverView.getText();
        softAssert.assertEquals(ActualText,ExpectedText,"Title is not Matching");
        softAssert.assertAll();
}
}
