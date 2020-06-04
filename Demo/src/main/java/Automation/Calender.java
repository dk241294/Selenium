package Automation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calender {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://spicejet.com");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id='ctl00_mainContent_view_date1']")).click();
        driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();
        Thread.sleep(2000);
        System.out.println( driver.findElement(By.xpath("//*[@id='ctl00_mainContent_txt_Fromdate']")).getAttribute("value"));
        Thread.sleep(2000);
        driver.quit();
    }
}
