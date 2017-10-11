package io.kantemirov.webtest;


import org.junit.rules.ExternalResource;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class RuleForWebTests extends ExternalResource {

    public WebDriver driver;

        @Override
        protected void before() throws Throwable {
            driver = new ChromeDriver();
        }

        @Override
        protected void after() {
            driver.quit();
        }
}
