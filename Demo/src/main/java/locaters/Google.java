package locaters;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver =new ChromeDriver();
        driver.get("https://google.com");
        driver.findElement(By.xpath("//div[@class='RNNXgb']/div/div[2]/input")).sendKeys("sharukh");
        Thread.sleep(2000);
        //driver.findElement(By.xpath("//div[@class='FPdoLc tfB0Bf']/center/input")).click();
        driver.findElement(By.xpath("//div[@class='RNNXgb']/div/div[2]/input")).sendKeys(Keys.ENTER);
        Thread.sleep(2000);
        //driver.findElement(By.xpath("//div[@id='gb']/div/div/div/div/div[2]/a")).click();
        driver.findElement(By.xpath("//div[@id='hdtb-msb']/div/div/div[2]/a")).click();
        Thread.sleep(2000);
        driver.quit();
    }
}
