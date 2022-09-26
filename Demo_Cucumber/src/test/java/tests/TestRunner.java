package tests;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
//		dryRun=true,
		strict=true,
		monochrome = true,       
		features = "src/test/resources/Features/CoursewareSEED.feature",
		glue="stepdefinations",
		plugin= {"pretty", "html:html-report"}
//		tags= {"@pri1"}
//		tags= {"@pri1 or @login"}
//		tags= {"@pri1 and @login"}
//		tags= {"not @pri1"}
		)
public class TestRunner {

}
