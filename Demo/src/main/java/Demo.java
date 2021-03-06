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
        //validate if  the page name is correct
        System.out.println(driver.getTitle());
        //to check whether you land on the page you looking for or re_directed to other site
        driver.get("https://gmail.com");
        //validate if you are landed on correct url
        System.out.println("the url you directed to : "+driver.getCurrentUrl());
        //to print page source
       // System.out.println(driver.getPageSource());

        //to navigate back
        driver.navigate().back();
        System.out.println(driver.getTitle());
        //to navigate forward
        driver.navigate().forward();
        System.out.println(driver.getTitle());

        //to close current browser
        driver.close();
        //to close all the browser open by selenium script
        driver.quit();

    }
}
