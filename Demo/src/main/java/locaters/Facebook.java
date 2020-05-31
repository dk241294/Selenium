package locaters;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://facebook.com");
        //id  locator
        // driver.findElement(By.id("email")).sendKeys("deepak");
        //name Locator
        // driver.findElement(By.name("pass")).sendKeys("12345");
        //linktext Locator
        //driver.findElement(By.linkText("Forgotten account?")).click();
        //xpath
        driver.findElement(By.xpath("//input[@type='email']")).sendKeys("dinesh");
        //by css
        driver.findElement(By.cssSelector("input[type='password']")).sendKeys("password");
        //linktext Locator
        driver.findElement(By.linkText("Forgotten account?")).click();
        Thread.sleep(3000);

        driver.close();


    }
}
