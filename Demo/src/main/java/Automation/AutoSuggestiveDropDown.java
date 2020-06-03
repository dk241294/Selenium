package Automation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestiveDropDown {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.makemytrip.com/");
        driver.findElement(By.id("fromCity")).click();
        WebElement source = driver.findElement(By.xpath("//*[@placeholder='From']"));
        //   source.click();
        // Thread.sleep(2000);
        source.sendKeys("mum");
        Thread.sleep(2000);
        source.sendKeys(Keys.ARROW_DOWN);
        Thread.sleep(2000);
        source.sendKeys(Keys.ENTER);
        System.out.println(driver.findElement(By.id("fromCity")).getAttribute("value"));
        System.out.println(driver.findElement(By.xpath("//span[@class='truncate airPortName']")).getText());

        WebElement destination = driver.findElement(By.xpath("//*[@placeholder='To']"));
        destination.sendKeys("rai");
        Thread.sleep(3000);
        destination.sendKeys(Keys.ARROW_DOWN);
        Thread.sleep(2000);
        destination.sendKeys(Keys.ENTER);
        System.out.println(driver.findElement(By.id("toCity")).getAttribute("value"));
        System.out.println(driver.findElement(By.xpath("(//span[@class='truncate airPortName'])[2]")).getText());
        //parent child relationship
        System.out.println(driver.findElement(By.xpath("//label[@for='toCity']//span[@class='truncate airPortName']")).getText());
        Thread.sleep(4000);
        driver.quit();
    }
}
