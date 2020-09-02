package homepage;

import base.Base;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pageObject.LandingPage;
import pageObject.LoginPage;

import java.io.IOException;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class HomePage extends Base {
    public static Logger log = LogManager.getLogManager().getLogger(Base.class.getName());

    @BeforeTest
    public void initialize() throws IOException {
        driver = initializeDriver(); //it return driver and we have driver object in base class which we inherited
        log.info("Driver is initialized");
    }

    @Test(dataProvider = "getData")
    public void basePageNavigation(String name, String password) throws IOException, InterruptedException {
        driver.get(prop.getProperty("url"));
        log.info("navigated to home page");
        //driver.getTitle();
        // driver.findElement(B)
        LandingPage lp = new LandingPage(driver);
        lp.login().click();
        //Thread.sleep(2000);
        LoginPage loginPage = new LoginPage(driver);
        loginPage.getEmail().sendKeys(name);
        loginPage.getPassword().sendKeys(password);
        loginPage.getLoginButton().click();
        log.info("successfully validate");
    }

    @AfterTest
    public void tearDown() {
        driver.close();
        log.info("");
    }

    @DataProvider
    public Object[][] getData() {
        Object[][] data = new Object[2][2];
        data[0][0] = "24121994@gmail.com";
        data[0][1] = "deepaaaaaaaaaaa";
        data[1][0] = "hhhhh@gmail.com";
        data[1][1] = "deeak";
        return data;
    }

}
