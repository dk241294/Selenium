package Automation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicDropDown {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://spicejet.com");
        Thread.sleep(2000);
        Travel(driver);
        Thread.sleep(2000);
        driver.quit();
    }

    public static void Travel(WebDriver driver) throws InterruptedException {
        driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
        driver.findElement(By.xpath("//a[@value='IXB']")).click();
        Thread.sleep(2000);
        //dynamic dropdown with indexes
        //driver.findElement(By.xpath("(//a[@value='GAU'])[2]")).click();
        //another way  to select without index and by parent child relationship
        driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='GAU']")).click();


    }
}
