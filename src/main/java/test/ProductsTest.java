package test;

import org.testng.annotations.Test;
import page.ProductsPage;
import utilities.TestBase;

import java.util.concurrent.TimeUnit;

public class ProductsTest extends TestBase{

        page.ProductsPage productsPage;


        @Test
        public void products() {
            // Choose Your Product and Add It To Cart
            productsPage = new ProductsPage(driver);
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            productsPage.addToCart(driver);
            productsPage.shoppingCartContainer();
            productsPage.assertOnProducts();



        }
}
