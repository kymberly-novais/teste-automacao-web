package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/features",
		glue = "steps",
		tags = "@executa",
		dryRun = false,
		monochrome = true,
		plugin = {"pretty", "html:target/reports.html"}
)

public class Executa {
	

}
