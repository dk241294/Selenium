package locaters;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rediff {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://rediff.com");
        //xpath regular expression
        driver.findElement(By.xpath("//a[contains(@title,'Sign in')]")).click();
        driver.findElement(By.cssSelector("#login1")).sendKeys("raj");
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("simran");
        driver.findElement(By.cssSelector("[value='Sign in']")).click();
        System.out.println(driver.findElement(By.id("div_login_error")).getText());
        Thread.sleep(2000);
        driver.quit();
    }
}
