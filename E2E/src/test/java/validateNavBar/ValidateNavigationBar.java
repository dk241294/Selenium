package validateNavBar;

import base.Base;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObject.LandingPage;

import java.io.IOException;

public class ValidateNavigationBar extends Base {
    @Test
    public void basePageNavigation() throws IOException {
        driver = initializeDriver(); //it return driver and we have driver object in base class which we inherited
        driver.get(prop.getProperty("url"));
        driver.getTitle();
        // driver.findElement(B)
        LandingPage lp = new LandingPage(driver);

        Assert.assertTrue(lp.getNavBar().isDisplayed());

    }

}
