package locaters;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SalesForce {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.salesforce.com/in");
        driver.findElement(By.linkText("Login")).click();

        Thread.sleep(2000);
        driver.findElement(By.id("username")).sendKeys("rajkapoor");
        driver.findElement(By.name("pw")).sendKeys("789456");
        //compound class name not accepted throw error
        // driver.findElement(By.className("button r4 wide primary")).click();
        driver.findElement(By.id("Login")).click();
        System.out.println(driver.findElement(By.id("error")).getText());
        // System.out.println(driver.findElement(By.cssSelector("div[class='loginError']")).getText());

        Thread.sleep(2000);

        driver.close();
    }
}
