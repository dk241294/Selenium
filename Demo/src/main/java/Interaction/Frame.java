package Interaction;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class Frame {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://jqueryui.com/droppable/");
        drag(driver);
        Thread.sleep(2000);

    }
    public static  void drag(WebDriver driver){
        System.out.println(driver.findElements(By.tagName("iframe")).size());
        driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
        System.out.println(driver.findElement(By.id("draggable")).getText());

        Actions a =new Actions(driver);
        WebElement source=driver.findElement(By.id("draggable"));
        WebElement destination=driver.findElement(By.id("droppable"));
        a.dragAndDrop(source,destination).build().perform();


        driver.switchTo().defaultContent();
        driver.findElement(By.linkText("Accept")).click();


    }
}
