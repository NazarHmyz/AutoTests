package testsEkUa;

import chromeSettings.ChromeSettings;
import org.junit.Assert;
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
        Assert.assertEquals("Apple iMac 27\" 5K 2017 - купить персональный компьютер: цены, отзывы, характеристики > стоимость в магазинах Украины: Киев, Днепропетровск, Львов, Одесса", driver.getTitle());

    }

}
