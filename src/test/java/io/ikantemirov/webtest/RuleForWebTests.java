package io.ikantemirov.webtest;


import org.junit.rules.TestRule;
import org.junit.runner.Description;
import org.junit.runners.model.Statement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RuleForWebTests implements TestRule {

    WebDriver driver;

    public void before() {
        driver = new ChromeDriver();
    }

    public void after() {
        driver.quit();
    }

    @Override
    public Statement apply(final Statement base, Description description) {
        return new Statement() {

            @Override
            public void evaluate() throws Throwable {
                before();
                try {
                    base.evaluate();
                }
                finally {
                    after();
                }
            }
        };
    }
}
