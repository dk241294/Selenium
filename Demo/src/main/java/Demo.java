import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        //to hit the url and gets it title
        driver.get("https://google.com");
        System.out.println(driver.getTitle());
        //to check whether you land on the page you looking for or re_directed to other site
        driver.get("https://gmail.com");
        System.out.println("the url you directed to : "+driver.getCurrentUrl());

    }
}
