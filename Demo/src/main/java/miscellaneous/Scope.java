package miscellaneous;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class Scope {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        System.out.println(driver.findElement(By.className("blinkingText")).getText());
        Thread.sleep(2000);
        System.out.println(driver.findElements(By.tagName("a")).size());
        Thread.sleep(2000);
        //limiting webdriver scope
        WebElement footerSection = driver.findElement(By.id("gf-BIG"));
        System.out.println(footerSection.findElements(By.tagName("a")).size());
        Thread.sleep(2000);
        WebElement discountSection = footerSection.findElement(By.xpath("//*[@id='gf-BIG'] /table/tbody/tr/td[1]/ul"));
        System.out.println(discountSection.findElements(By.tagName("a")).size());
        int size = discountSection.findElements(By.tagName("a")).size();
        for (int i = 0; i < size; i++) {
            //  String keys=  Keys.chord(Keys.CONTROL,Keys.ENTER);
            discountSection.findElements(By.tagName("a")).get(i).sendKeys(Keys.CONTROL, Keys.ENTER);

        }
        Thread.sleep(2000);
        Set<String> windowIds = driver.getWindowHandles();
        Iterator<String> it = windowIds.iterator();
        //window handling and getting there title name
        while (it.hasNext()) {
            driver.switchTo().window(it.next());
            System.out.println(driver.getTitle());
        }


        System.out.println(driver.getTitle());
        Thread.sleep(2000);
        System.out.println(windowIds.size());
    }
}
