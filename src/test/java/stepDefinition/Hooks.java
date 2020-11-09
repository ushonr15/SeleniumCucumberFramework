package stepDefinition;


import java.io.IOException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import general.BasePage;

public class Hooks {

	@Before
	public void startSetup() {
		try {
			BasePage.initiaisDriver("Practise_Ecommerce_url");
		} catch (IOException e) {

			e.printStackTrace();
		}
	}

	@After
	public void closeSetup(Scenario scn) throws IOException {

		if (scn.isFailed()) {
			System.out.println(scn.getName() + " is failed");
			final byte[] Screenshot = ((TakesScreenshot) BasePage.driver).getScreenshotAs(OutputType.BYTES);
			try {
				scn.embed(Screenshot, "image/png");
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else {
			System.out.println(scn.getName() + " is passed");
		}
		BasePage.driver.quit();
	}

}
