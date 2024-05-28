package Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static java.lang.Thread.sleep;

public class HepsiburadaLogin {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.hepsiburada.com");
        WebElement hesabim = driver.findElement(By.id("myAccount"));
        hesabim.click();
        sleep(3000);
        WebElement login = driver.findElement(By.id("login"));
        login.click();
        sleep(3000);
        driver.findElement(By.id("txtUserName")).sendKeys("");
        driver.findElement(By.id("txtPassword")).sendKeys("");
        sleep(2000);
        driver.findElement(By.id("btnLogin")).click();
    }
}