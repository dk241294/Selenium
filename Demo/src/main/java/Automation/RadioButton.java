package Automation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://spicejet.com");
        Thread.sleep(2000);
        //it is not invisible its opacity is =0.5 that"s why its showing .isEnabled() true
        System.out.println(driver.findElement(By.xpath("//*[@id='Div1']")).isEnabled());
        driver.findElement(By.xpath("//*[contains(@id,'rbtnl_Trip_1')]")).click();
        System.out.println(driver.findElement(By.xpath("//*[contains(@id,'rbtnl_Trip_1')]")).isEnabled());
        System.out.println(driver.findElement(By.xpath("//*[@id='Div1']")).isEnabled());

        String e = driver.findElement(By.xpath("//*[@id='Div1']")).getAttribute("style");
        if (e.contains("0.5")) {
            System.out.println("round trip disabled");

        }
        else {
            System.out.println("round trip enabled");
        }
        Thread.sleep(4000);
        driver.quit();
    }
}
