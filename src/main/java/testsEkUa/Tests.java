package testsEkUa;

import chromeSettings.ChromeSettings;
import org.junit.Test;
import pages.IndexPage;

public class Tests extends ChromeSettings {

    @Test
    public void selectProduct  () throws InterruptedException {
        IndexPage indexPage = new IndexPage(driver);
        indexPage.selectCategoryPC();
    }
}
