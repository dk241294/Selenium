package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {
    public WebDriver driver;
    By sign = By.xpath("//*[@class='pull-right']/ul/li[4]");
    By title =By.xpath("//section[@id='content']/div/div");
    By navBar=By.cssSelector(".navbar-header");

   public  LandingPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement login() {
        return driver.findElement(sign);
    }
    public WebElement getTitle() {
        return driver.findElement(title);
    }
    public WebElement getNavBar() {
        return driver.findElement(navBar);
    }
}
