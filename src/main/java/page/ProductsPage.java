package page;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.asserts.SoftAssert;
import utilities.WebPageBase;

public class ProductsPage extends WebPageBase {

    public ProductsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "add-to-cart-sauce-labs-backpack")
    public WebElement addToCart;

    @FindBy(id = "shopping_cart_container")
    public WebElement shoppingCartContainer;

    @FindBy(className = "title")
    public WebElement assertOnYourCart;


    public void addToCart(WebDriver driver) {
        JavascriptExecutor js2 = (JavascriptExecutor) driver;
        js2.executeScript("arguments[0].click()", addToCart);
    }

    public void shoppingCartContainer(){
        shoppingCartContainer.click();
    }
    public void assertOnProducts(){
        SoftAssert softAssert = new SoftAssert();
        String ExpectedText = "Your Cart";
        String ActualText = assertOnYourCart.getText();
        softAssert.assertEquals(ActualText,ExpectedText,"Title is not Matching");
        softAssert.assertAll();
    }
}
