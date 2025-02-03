package jc.belajar.cucumber.runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/features",
        glue = "jc.belajar.cucumber.definitions",
        plugin = {"pretty", "html:target/cucumber-reports.html"}
)
public class RunnerTest extends AbstractTestNGCucumberTests {
}
