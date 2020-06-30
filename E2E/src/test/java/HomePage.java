import org.testng.annotations.Test;

import java.io.IOException;

public class HomePage extends BaseClass {
    @Test
    public void basePageNavigation() throws IOException {
        driver=initializeDriver(); //it return driver and we have driver object in base class which we inherited
        driver.get("https://google.com");
        driver.getTitle();
    }

}
