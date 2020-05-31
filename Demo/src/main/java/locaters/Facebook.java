package locaters;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://facebook.com");
        //id  locator
        driver.findElement(By.id("email")).sendKeys("deepak");
        //name Locator
        driver.findElement(By.name("pass")).sendKeys("12345");
        //linktext Locator
        driver.findElement(By.linkText("Forgotten account?")).click();

        driver.close();


    }
}
