package Automation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://spicejet.com");
        // xpath regular expression
        Thread.sleep(4000);
        driver.findElement(By.xpath("//*[contains(@id,'friendsandfamily')]")).click();
        Thread.sleep(4000);
        // css regular expression
        driver.findElement(By.cssSelector("[id*='IndArm']")).click();
        //number of check boxes
        System.out.println(driver.findElements(By.xpath("//*[@type='checkbox']")).size());
        Thread.sleep(4000);
        driver.quit();
    }
}
