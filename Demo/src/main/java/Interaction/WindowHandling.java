package Interaction;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class WindowHandling {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/intl/en-GB/gmail/about/");
        //driver.findElement(By.xpath("//div[@class='WEQkZc']/span/div/div/a")).click();
        driver.findElement(By.linkText("Sign in")).click();
        Set<String> windowIds = driver.getWindowHandles();
        System.out.println(windowIds.size());
        Iterator<String> it = windowIds.iterator();
        String parentId = it.next();
        String childId = it.next();
        System.out.println(driver.getTitle());
        driver.switchTo().window(childId);
        System.out.println(driver.getTitle());
        driver.switchTo().window(parentId);
    }
}
