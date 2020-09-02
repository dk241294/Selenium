package testCases;

import io.github.bonigarcia.wdm.WebDriverManager;
import objectRepository.RediffLoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class LoginApplication {
    @Test
    public void login() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
        RediffLoginPage r = new RediffLoginPage(driver);
        r.emailID().sendKeys("deepak");
        Thread.sleep(2000);
        r.password().sendKeys("kumar");
        r.signin().click();
    }
}
