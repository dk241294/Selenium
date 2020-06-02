package Automation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://spicejet.com");
        Thread.sleep(2000);
        //currency(driver);
        passenger(driver);
        driver.quit();
    }
    public static void currency(WebDriver driver) throws InterruptedException {
        Select s =new Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));
        driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")).click();
        s.selectByValue("INR");
        Thread.sleep(2000);
        s.selectByVisibleText("USD");
        Thread.sleep(2000);
        s.selectByIndex(1);
        System.out.println(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")).getText());
        Thread.sleep(2000);
    }
    public static void passenger(WebDriver driver){
        driver.findElement(By.id("divpaxinfo")).click();
        driver.findElement(By.id("ctl00_mainContent_ddl_Adult")).click();
        Select Adult=new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Adult")));
        System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
       // Adult.selectByValue("2");
        Adult.selectByIndex(4);
        Select  child =new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Child")));
        child.selectByValue("2");
        driver.findElement(By.id("divpaxinfo")).click();
        System.out.println(driver.findElement(By.id("divpaxinfo")).getText());

    }
}
