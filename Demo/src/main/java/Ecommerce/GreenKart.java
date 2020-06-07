package Ecommerce;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class GreenKart {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        kart(driver);

    }

    public static void kart(WebDriver driver) {
        driver.get("https://rahulshettyacademy.com/seleniumPractise");
        List<WebElement> product = driver.findElements(By.cssSelector("h4.product-name"));
        for(int i=0;i<product.size();i++){
            String productName=product.get(i).getText();
        }

    }
}
