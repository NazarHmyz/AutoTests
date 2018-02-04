package chromeSettings;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class ChromeSettings {
    protected WebDriver driver;

    @Before
    public void setUp () {
        System.setProperty("webdriver.chrome.driver","C:\\chromeDriver\\chromedriver.exe");
        driver.get("http://ek.ua/");
        System.out.println("Test Start");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    };
    @After
    public void tearDown () {
        driver.close();
        System.out.println("Test Complete");
    }
}
