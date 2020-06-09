package Ecommerce;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class GreenKart {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        kart(driver);
        Thread.sleep(4000);
        driver.quit();

    }

    public static void kart(WebDriver driver) throws InterruptedException {
        driver.get("https://rahulshettyacademy.com/seleniumPractise");
        Thread.sleep(2000);
        List<WebElement> product = driver.findElements(By.cssSelector("h4.product-name"));
        for (int i = 0; i < product.size(); i++) {
            String productName = product.get(i).getText();
            if (productName.contains("Cucumber")) {
                System.out.println(productName);
                //find elements because all have same xpath then get(i) to differentiate and click the right one
                driver.findElements(By.xpath("//*[text()='ADD TO CART']")).get(i).click();
                break;
            }
        }

    }
}
