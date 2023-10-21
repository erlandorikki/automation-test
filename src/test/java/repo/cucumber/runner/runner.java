import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
//import cucumber.api.CucumberOptions;
//import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/repo/cucumber/features",
        glue     = "repo.cucumber.stepDefinition",
        plugin   = {"html:target/HTML_report.html"}
)

public class runner {
}