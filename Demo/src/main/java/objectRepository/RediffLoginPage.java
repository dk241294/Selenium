package objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RediffLoginPage {
    WebDriver driver;

    public RediffLoginPage(WebDriver driver) {
        this.driver = driver;

    }

    By userName = By.name("login");
    By passWord = By.xpath("//input[@name='passwd']");
    By signIn = By.name("proceed");

    public WebElement emailID() {
        return driver.findElement(userName);
    }

    public WebElement password() {
        return driver.findElement(passWord);
    }

    public WebElement signin() {
        return driver.findElement(signIn);
    }

}

