package io.ikantemirov.webtest;


import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class WebTest {

    @Test
    public void searchByRequest() {
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.yandex.ru");
    }
}