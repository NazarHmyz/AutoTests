package pages;

import chromeSettings.ChromeSettings;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PCPage extends ChromeSettings{
    private WebDriver driver;

    @FindBy(xpath = "//a[text()='Apple']")
    @CacheLookup
    private WebElement vendorName;

    @FindBy(xpath = "//a[text()='Apple iMac 27\" 5K 2017']")
    @CacheLookup
    private WebElement productIMacLocator;

    public PCPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }
    public  void selectProduct() {
        vendorName.click();
        productIMacLocator.click();
    }
}
