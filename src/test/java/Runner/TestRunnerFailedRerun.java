package Runner;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
		
		features= {"@target/failedrerun.txt"},//location of feature files
		glue="StepDefinition",//location of step definition files
		plugin= {"pretty","rerun:target/failedrerun.txt"},//report purpose
		monochrome=true//console output
			)

public class TestRunnerFailedRerun {
    
}