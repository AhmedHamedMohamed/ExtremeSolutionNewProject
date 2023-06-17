package page;

import org.testng.asserts.SoftAssert;
import utilities.WebPageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SwagLabsLoginPage extends WebPageBase {

        public SwagLabsLoginPage(WebDriver driver) {
            super(driver);
        }

        @FindBy(id = "user-name")
        public WebElement userName;

        @FindBy(id = "password")
        public WebElement password;

        @FindBy(id = "login-button")
        public WebElement loginButton;

        @FindBy(className = "title")
        public WebElement assertOnProducts;

        public void userName(String UserName)  {
                userName.sendKeys(UserName);
        }

        public void password(String Password){
                password.sendKeys(Password);
        }
        public void loginButton(){
                loginButton.click();
        }
        public void assertOnProducts(){
                SoftAssert softAssert = new SoftAssert();
                String ExpectedText = "Products";
                String ActualText = assertOnProducts.getText();
                softAssert.assertEquals(ActualText,ExpectedText,"Title is not Matching");
                softAssert.assertAll();
        }
}
