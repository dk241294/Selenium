package Interaction;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class Mouse {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://amazon.in");
        action(driver);
        Thread.sleep(2000);
        driver.quit();

    }

    public static void action(WebDriver driver) throws InterruptedException {
        Actions a = new Actions(driver);
        a.moveToElement(driver.findElement(By.xpath("//a[@id='nav-link-prime']/span"))).build().perform();
        Thread.sleep(2000);
        //writing the search item in capital
        a.moveToElement(driver.findElement(By.id("twotabsearchtextbox")))
                .click().keyDown(Keys.SHIFT).sendKeys("mobile").build().perform();
        //selecting the text
        a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).doubleClick().build().perform();
    a.moveToElement(driver.findElement(By.xpath("//a[@id='nav-link-prime']/span"))).contextClick().build().perform();
    }
}
