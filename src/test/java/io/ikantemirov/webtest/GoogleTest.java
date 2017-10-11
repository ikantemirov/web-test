package io.ikantemirov.webtest;

import org.junit.Rule;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class GoogleTest {

    @Rule
    public RuleForWebTests rule = new RuleForWebTests();

    @Test
    public void searchByRequest() {
        rule.driver.get("http://www.google.com");
        rule.driver.findElement(By.id("lst-ib")).sendKeys("Artem Eroshenko" + Keys.ENTER);
    }
}
