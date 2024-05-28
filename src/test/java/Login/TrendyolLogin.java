package Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static java.lang.Thread.sleep;

public class TrendyolLogin {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.trendyol.com");
        WebElement wait = driver.findElement(By.id("Combined-Shape"));
        wait.click();
        sleep(3000);
        WebElement hesabim = driver.findElement(By.xpath("//*[@id=\"account-navigation-container\"]/div/div[1]/div[1]/p"));
        hesabim.click();
        sleep(3000);
        driver.findElement(By.id("login-email")).sendKeys("");
        driver.findElement(By.id("login-password-input")).sendKeys("");
        sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"login-register\"]/div[3]/div[1]/form/button")).click();
    }
}
