package page;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.asserts.SoftAssert;
import utilities.WebPageBase;

public class OverviewPage extends WebPageBase {

    public OverviewPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "finish")
    public WebElement finish;

    @FindBy(className = "complete-header")
    public WebElement assertOnComplete;

    public void finish(WebDriver driver){

        JavascriptExecutor js2 = (JavascriptExecutor) driver;
        js2.executeScript("arguments[0].click()", finish);
    }

    public void assertOnComplete(){
        SoftAssert softAssert = new SoftAssert();
        String ExpectedText = "Thank you for your order!";
        String ActualText = assertOnComplete.getText();
        softAssert.assertEquals(ActualText,ExpectedText,"Title is not Matching");
        softAssert.assertAll();
    }
}
