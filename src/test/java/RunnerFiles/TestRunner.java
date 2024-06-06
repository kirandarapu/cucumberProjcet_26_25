package RunnerFiles;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions
(
		features= "C:\\Kiran\\MyWorkspace\\Cucumber_Project001\\src\\test\\java\\Features\\Ad_Login.feature",
		glue="StepDefinitions",
		tags = "@Smoke",
		plugin= {"pretty",
				"html:Reports/newreport.html",
				"json:Reports/newreport.json",
				"rerun:target/rerun.txt",    //Mandatory to capture failures
		}
		)
public class TestRunner {
	

}
