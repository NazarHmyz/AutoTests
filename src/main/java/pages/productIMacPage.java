package pages;

import chromeSettings.ChromeSettings;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class productIMacPage extends ChromeSettings {
    private WebDriver driver;

    public productIMacPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }
}
