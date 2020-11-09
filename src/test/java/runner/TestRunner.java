package runner;

import org.junit.AfterClass;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "FeatureFiles", glue = "stepDefinition", tags = { "@test1234" },

		plugin = { "pretty", "html:target/site/cucumber-pretty", "json:Report/cucumber.json" })
public class TestRunner {

	@AfterClass
	public static void jvmReport() {

		String[] commnad = { "cmd.exe", "/C", "Start", "GenerateReport.bat" };
		try {
			Runtime.getRuntime().exec(commnad);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}