package runners;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/resources/features",   // path to your .feature file
    glue = {"stepDefinitions"},                 // package with step defs
    plugin = {"pretty", "html:target/cucumber-reports"}
)
public class runners {
}
