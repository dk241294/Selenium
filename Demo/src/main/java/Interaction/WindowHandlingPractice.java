package Interaction;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class WindowHandlingPractice {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        driver.findElement(By.linkText("Multiple Windows")).click();
        driver.findElement(By.linkText("Click Here")).click();
        window(driver);

    }
    public static void window(WebDriver driver){
        Set<String>windowsId=driver.getWindowHandles();
        Iterator<String>it=windowsId.iterator();
        String parentId=it.next();
        String childID=it.next();
        System.out.println(driver.findElement(By.xpath("//*[@class='example']/h3")).getText());
        driver.switchTo().window(childID);
        System.out.println(driver.findElement(By.className("example")).getText());
        driver.switchTo().window(parentId);
        System.out.println(driver.findElement(By.xpath("//*[@class='example']/h3")).getText());


    }
}
