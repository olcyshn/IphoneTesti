package UrunArama;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import static java.lang.Thread.sleep;

public class Trendyol {
    @Test
    public void trendCase() throws InterruptedException, IOException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.trendyol.com");
        WebElement wait = driver.findElement(By.id("Combined-Shape"));
        wait.click();
        sleep(3000);
        WebElement aramaIcon = driver.findElement(By.xpath("//*[@id=\"sfx-discovery-search-suggestions\"]/div/div[1]/input"));
        aramaIcon.click();
        aramaIcon.sendKeys("iphone12");
        aramaIcon.sendKeys(Keys.ENTER);
        sleep(3000);
        WebElement pclick = driver.findElement(By.xpath("//*[@id=\"search-app\"]/div/div[1]/div[2]/div[4]/div[1]/div/div[1]/div[1]/a/div[2]"));
        pclick.click();

        String urunAdi = driver.findElement(By.xpath("//*[@id=\"search-app\"]/div/div[1]/div[2]/div[4]/div[1]/div/div[1]/div[1]/a/div[2]/div[1]/div/h3/span[2]")).getText();
        String urunFiyati = driver.findElement(By.xpath("//*[@id=\"search-app\"]/div/div[1]/div[2]/div[4]/div[1]/div/div[5]/div[1]/a/div[2]/div[4]/div/div")).getText();


        File file = new File("/Users/olcaysahin/IdeaProjects/IphoneTesti/src/test/java/Check/Trendyol.txt");
        FileWriter writer = new FileWriter(file);
        writer.write("Ürün Adı: " + urunAdi + "\n");
        writer.write("Ürün Fiyatı: " + urunFiyati + "\n");
        writer.close();
        driver.quit();


    }
}
