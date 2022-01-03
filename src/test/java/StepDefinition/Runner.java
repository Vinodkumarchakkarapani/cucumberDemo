package StepDefinition;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class) 
@CucumberOptions(
		features="src/test/resources/Features/DataExample.feature",
		glue = { "StepDefinition"/* ,"Hooks" */},
		dryRun=false,
monochrome = true,

		plugin = { "html:report/WebReport", "json:report/jsonreport.json",
				"junit:report/xmlreport.xml" }/*
												 * , tags="@TaggHooks"
												 */	)
public class Runner {

}
