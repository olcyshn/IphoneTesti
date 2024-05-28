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

public class Hepsiburada {
    @Test
    public void hepsiTest() throws InterruptedException, IOException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.hepsiburada.com");
        WebElement aramaIcon = driver.findElement(By.xpath("/html/body/div[1]/div/div/div[4]/div[5]/div/div/div/div[1]/div[2]/div[2]/div/div/div/div/div/div/div[1]/div[1]/i"));
        aramaIcon.click();
        sleep(3000);
        WebElement aramaText = driver.findElement(By.xpath("/html/body/div[1]/div/div/div[4]/div[5]/div/div/div/div[1]/div[2]/div[2]/div/div/div/div/div/div/div[1]/div[2]/input"));
        aramaText.sendKeys("iphone12");
        aramaText.sendKeys(Keys.ENTER);

        String urunAdi = driver.findElement(By.xpath("//*[@id=\"i0\"]/div/a/div[2]/div[2]/h3")).getText();
        String urunFiyati = driver.findElement(By.xpath("//*[@id=\"i0\"]/div/a/div[2]/div[4]")).getText();

        File file = new File("/Users/olcaysahin/IdeaProjects/IphoneTesti/src/test/java/Check/Hepsiburada.txt");
        FileWriter writer = new FileWriter(file);
        writer.write("Ürün Adı: " + urunAdi + "\n");
        writer.write("Ürün Fiyatı: " + urunFiyati + "\n");
        writer.close();
        driver.quit();
    }
}
