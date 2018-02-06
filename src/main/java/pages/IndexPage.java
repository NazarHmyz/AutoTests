package pages;

import chromeSettings.ChromeSettings;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class IndexPage extends ChromeSettings {
    private WebDriver driver;

    @FindBy(xpath ="//a[text()='Компьютеры']")
    private WebElement menuItem;

    @FindBy(xpath = "//a[@href='/k170.htm']")
    private WebElement categoryMenuItem;

    @FindBy(xpath = "//a[text()='Apple']")
    private WebElement vendorName;

    public IndexPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public void selectCategoryPC() throws InterruptedException {
        menuItem.click();
        System.out.println("Menu Item selected");
        categoryMenuItem.click();
        System.out.println("Subcategory selected");
        vendorName.click();
        System.out.println("Vendor name selected");
    }
}
