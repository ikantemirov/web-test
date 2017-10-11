package io.ikantemirov.webtest;


import org.junit.Test;
import org.junit.Rule;
import org.openqa.selenium.By;

public class YandexTest {

    @Rule
    public RuleForWebTests rule = new RuleForWebTests();

    @Test
    public void searchByRequest() {
        rule.driver.get("http://www.yandex.ru");
        rule.driver.findElement(By.id("text")).sendKeys("Илья Молодец!");
        rule.driver.findElement(By.xpath("//div[@class='search2__button']//button")).click();
    }


}
