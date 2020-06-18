package Interaction;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class WindowHandling {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/intl/en-GB/gmail/about/");
        //driver.findElement(By.xpath("//div[@class='WEQkZc']/span/div/div/a")).click();
        driver.findElement(By.linkText("Sign in")).click();
        Set<String> windowIds = driver.getWindowHandles();
        System.out.println(windowIds.size());
        Iterator<String> it = windowIds.iterator();
        String parentId = it.next();
        String childId = it.next();
        System.out.println("Before switching");
        System.out.println(driver.getTitle());
        driver.switchTo().window(childId);
        System.out.println("After Switching");
        System.out.println(driver.getTitle());

        driver.switchTo().window(parentId);
        System.out.println("Switching back to parent");
        System.out.println(driver.getTitle());

    }
}
/* String parentHandle = driverObj.getWindowHandle();
public String switchTab(String parentHandle){
    String currentHandle ="";
    Set<String> win  = ts.getDriver().getWindowHandles();

    Iterator<String> it =  win.iterator();
    if(win.size() > 1){
        while(it.hasNext()){
            String handle = it.next();
            if (!handle.equalsIgnoreCase(parentHandle)){
                ts.getDriver().switchTo().window(handle);
                currentHandle = handle;
            }
        }
    }
    else{
        System.out.println("Unable to switch");
    }
    return currentHandle;
}   */