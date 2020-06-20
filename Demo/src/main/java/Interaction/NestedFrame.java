package Interaction;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedFrame {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        nested(driver);

    }

    public static void nested(WebDriver driver) throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/");
        driver.findElement(By.linkText("Nested Frames")).click();
        Thread.sleep(2000);
        driver.switchTo().frame("frame-top");

        driver.switchTo().frame("frame-middle");

        System.out.println(driver.findElement(By.id("content")).getText());

    }
}
