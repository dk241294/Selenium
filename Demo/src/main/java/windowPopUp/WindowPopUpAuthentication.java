package windowPopUp;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowPopUpAuthentication {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.get("https://admin:admin@the-internet.herokuapp.com/");
        driver.navigate().to("https://admin:admin@the-internet.herokuapp.com/");
        driver.findElement(By.linkText("Basic Auth")).click();
        System.out.println(driver.findElement(By.id("content")).getText());;

    }
}
