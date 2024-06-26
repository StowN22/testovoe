package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class TEST2 {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "D:\\ads\\ds\\chromedriver-win64\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://market.yandex.ru");

        WebElement katalog = driver.findElement(By.id("hamburger"));
        katalog.click();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.className("_3W4t0")));

        WebElement electronicsLink = driver.findElement(By.className("_3W4t0"));
        electronicsLink.click();

        WebElement smartfones1 = driver.findElement(By.className("w7Bf7"));
        smartfones1.click();

        WebElement smartfones2 = driver.findElement(By.className("_1tdYt CCS_Z"));
        smartfones2.click();

        WebElement filter = driver.findElement(By.className("_1_C0_ _1n-yE _16wT_ _1Dmnq"));
        filter.click();

        WebElement overprice = driver.findElement(By.className("_2xtC2"));
        overprice.sendKeys("20000");

        WebElement diagonal1 = driver.findElement(By.className("_8zv18"));
        diagonal1.click();

        WebElement diagonal2 = driver.findElement(By.className("_2xtC2"));
        diagonal2.sendKeys("3");

        WebElement blackview = driver.findElement(By.xpath("//*[@id=\"10380976\"]/div"));
        blackview.click();

        WebElement huawei = driver.findElement(By.xpath("//*[@id=\"459710\"]/div"));
        huawei.click();

        WebElement inoi = driver.findElement(By.xpath("//*[@id=\"15884616\"]/div"));
        inoi.click();

        WebElement itel = driver.findElement(By.xpath("//*[@id=\"15968424\"]/div"));
        itel.click();

        WebElement realme = driver.findElement(By.xpath("//*[@id=\"16713696\"]/div"));
        realme.click();

        WebElement apply = driver.findElement(By.className("_2qvOO _3qN-v _1Rc6L"));
        apply.click();

        wait.until(ExpectedConditions.numberOfElementsToBe(By.className("EQlfk Gqfzd"), 10));











    }
    }
