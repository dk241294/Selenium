package miscellaneous;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Practice {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        WebElement checkbox = driver.findElement(By.id("checkBoxOption2"));
        String selectedCheckBox = checkbox.getAttribute("value");

        checkbox.click();
        System.out.println(checkbox.getAttribute("value"));
        // String selectedCheckBox = checkbox.getText();
        System.out.println(selectedCheckBox);
        Thread.sleep(2000);
        WebElement select = driver.findElement(By.id("dropdown-class-example"));
        select.click();
        Select s = new Select(select);
        Thread.sleep(2000);
        s.selectByValue(selectedCheckBox);//By(selectedCheckBox);


        Thread.sleep(2000);
        driver.findElement(By.id("name")).sendKeys(selectedCheckBox);
        driver.findElement(By.id("alertbtn")).click();
        Alert alert = driver.switchTo().alert();
        String text = alert.getText();


        if (text.contains(selectedCheckBox)) {
            System.out.println("success");
        }
        alert.accept();

    }
}
