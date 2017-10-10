package io.ikantemirov.webtest;


import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class WebTest {

    @Test
    public void searchByRequest() {
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.google.com");
        driver.findElement(By.id("lst-ib")).sendKeys("Artem Eroshenko" + Keys.ENTER);
    }
}