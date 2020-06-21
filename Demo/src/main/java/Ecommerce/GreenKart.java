package Ecommerce;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Arrays;
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
        int count = 0;
        int loopRun = 0;
        driver.get("https://rahulshettyacademy.com/seleniumPractise");
        Thread.sleep(2000);
        String[] itemToPurchase = {"Beetroot", "Brinjal", "Pumpkin", "Cucumber", "Apple", "Banana",};
        List<WebElement> product = driver.findElements(By.cssSelector("h4.product-name"));
        for (int i = 0; i < product.size(); i++) {
            loopRun++;
            //convert array to arrayList for easy search
            List<String> itemToAdd = Arrays.asList(itemToPurchase);
            //format to get actual product name
            String[] productName = product.get(i).getText().split("-");
            String actualProductName = productName[0].trim();

            if (itemToAdd.contains(actualProductName)) {
                count++;
                System.out.println(actualProductName);
                //find elements because all have same xpath then get(i) to differentiate and click the right one

                //driver.findElements(By.xpath("//*[text()='ADD TO CART']")).get(i).click();
                //never depend on text its changes .find its parent

                driver.findElements(By.cssSelector(".product-action")).get(i).click();
                if (itemToPurchase.length == count) {
//                    System.out.println(count);
//                    System.out.println(loopRun);
                    break;
                }
            }
        }
        System.out.println(count);
        System.out.println(loopRun);

    }
}
