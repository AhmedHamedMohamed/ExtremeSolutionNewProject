package test;

import org.testng.annotations.Test;
import page.OverviewPage;
import utilities.TestBase;

public class OverviewTest extends TestBase {

    page.OverviewPage overviewPage;



    @Test
    public void overview(){
        // Confirm Order Cycle and Finish It
        overviewPage = new OverviewPage(driver);
        overviewPage.finish(driver);
        overviewPage.assertOnComplete();

    }


}
