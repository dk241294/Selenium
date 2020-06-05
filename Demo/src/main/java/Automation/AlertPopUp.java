package Automation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUp {
    //1.Simple Alert   (just ok button for confirmation)
    //2.Prompt Alert  (give some input)
    //3.Confirmation Alert (ok,cncel)
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        alert1(driver);
        alert2(driver);
        Thread.sleep(2000);
        driver.quit();

    }

    static void alert1(WebDriver driver) throws InterruptedException {
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.findElement(By.id("name")).sendKeys("deepak");
        driver.findElement(By.id("alertbtn")).click();
        Thread.sleep(2000);
        //driver(browser) don't have knowledge of popup its in javascript so use switch to
        Alert alert = driver.switchTo().alert();
        System.out.println(alert.getText());
        alert.accept();

        Thread.sleep(2000);

        driver.findElement(By.id("confirmbtn")).click();
        System.out.println(alert.getText());
        alert.dismiss();


    }

    static void alert2(WebDriver driver) {
        driver.get("http://demo.guru99.com/test/delete_customer.php");
        driver.findElement(By.name("cusid")).sendKeys("deepak");
        driver.findElement(By.name("cusid")).sendKeys(Keys.ENTER);
        Alert alert = driver.switchTo().alert();
        System.out.println(alert.getText());
        alert.accept();


    }
}
