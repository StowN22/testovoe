package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class TEST1 {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "D:\\ads\\ds\\chromedriver-win64\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        //1. Открыть браузер и развернуть во весь экран.

        driver.manage().window().maximize();

        //2. Зайти на yandex.ru

        driver.get("https://market.yandex.ru");

        //3. В разделе Маркет выбрать Сотовые телефоны

        WebElement element = driver.findElement(By.id("hamburger"));
        element.click();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.className("_3W4t0")));

        WebElement electronicsLink = driver.findElement(By.className("_3W4t0"));
        electronicsLink.click();

        WebElement smartfones1 = driver.findElement(By.className("w7Bf7"));
        smartfones1.click();

        WebElement smartfones2 = driver.findElement(By.className("_1tdYt CCS_Z"));
        smartfones2.click();

        //4. Зайти в расширенный поиск

        WebElement filter = driver.findElement(By.className("_1_C0_ _1n-yE _16wT_ _1Dmnq"));
        filter.click();

        //5. Задать параметр поиска до 20000 рублей и Диагональ экрана от 3 дюймов

        WebElement overprice = driver.findElement(By.className("_2xtC2"));
        overprice.sendKeys("20000");

        WebElement diagonal1 = driver.findElement(By.className("_8zv18"));
        diagonal1.click();

        WebElement diagonal2 = driver.findElement(By.className("_2xtC2"));
        diagonal2.sendKeys("3");

        //6. Выбрать не менее 5 любых производителей, среди популярных

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

        //7. Нажать кнопку Подобрать

        WebElement apply = driver.findElement(By.className("_2qvOO _3qN-v _1Rc6L"));
        apply.click();

        //8. Проверить, что элементов на странице 10

        wait.until(ExpectedConditions.numberOfElementsToBe(By.className("EQlfk Gqfzd"), 10));

        //9. Запомнить первый элемент в списке

        







    }
}