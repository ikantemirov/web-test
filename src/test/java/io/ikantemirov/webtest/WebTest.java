package io.ikantemirov.webtest;



import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class WebTest {

    @Test
    public void searchByRequestOnYandex() {
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.yandex.ru");
        driver.findElement(By.id("text")).sendKeys("Илья Молодец!");
        driver.findElement(By.xpath("//div[@class='search2__button']//button")).click();
    }

    @Test
    public void searchByRequestOnGoogle() {
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.google.com");
        driver.findElement(By.id("lst-ib")).sendKeys("Artem Eroshenko" + Keys.ENTER);
    }

   @Test
    public void searchByRequestOnWikipedia() {
        WebDriver driver = new ChromeDriver();
        driver.get("http://ru.wikipedia.org");
        driver.findElement(By.id("searchInput")).sendKeys("Петр 1");
        driver.findElement(By.id("searchButton")).click();
    }
}