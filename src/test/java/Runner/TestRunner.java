package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)//Junit execution

	@CucumberOptions(
			
			features= {"src/test/resources/Features/"},//location of feature files
			glue="StepDefinition",//location of step definition files
			plugin= {"pretty","json:target/cucumber.json"
					,"io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"
					,"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
					,"rerun:target/failedrerun.txt"},//report purpose
			monochrome=true,//console output
			dryRun=false
			)

	public class TestRunner {

	}
	

