import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features",
				 glue = { "stepdefinitions" },
				 plugin = {"pretty", "html:target/cucumber-reports/cucumber-pretty" })

public class TestRunner 
{

}