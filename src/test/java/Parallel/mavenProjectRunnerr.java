package Parallel;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;




@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"./src/test/resources/Parallel/"},
		glue = {"Parallel"}, //this parallel relavant to applicationhooks
		monochrome =true,
		dryRun =false,
		plugin = {"pretty","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"


				
				
		}
		
		)

public class mavenProjectRunnerr {
	

	

}
