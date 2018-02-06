package testsEkUa;

import chromeSettings.ChromeSettings;
import org.junit.Test;
import pages.IndexPage;
import pages.PCPage;

public class Tests extends ChromeSettings {

    @Test
    public void selectProduct  () throws InterruptedException {
        IndexPage indexPage = new IndexPage(driver);
        PCPage pcPage = new PCPage(driver);
        indexPage.selectCategoryPC();
        pcPage.selectProduct();

    }
}
