package io.ikantemirov.webtest;


import io.kantemirov.webtest.RuleForWebTests;
import org.junit.Rule;
import org.junit.Test;
import org.openqa.selenium.By;

public class WikipediaTest {

    @Rule
    public RuleForWebTests rule = new RuleForWebTests();

    @Test
    public void searchByRequest(){
        rule.driver.get("http://ru.wikipedia.org");
        rule.driver.findElement(By.id("searchInput")).sendKeys("Петр 1");
        rule.driver.findElement(By.id("searchButton")).click();
    }
}
