package stepDefinition;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import general.BasePage;
import general.CommanSetpDef_Implemtation;
import pages.LoginPage_Implemtation;

public class Login {
	BasePage obj = new BasePage();
	WebDriver driver = obj.driver;
	LoginPage_Implemtation obj_LoginPage_Implemtation = new LoginPage_Implemtation();

	@And("^I select \"([^\"]*)\" value from \"([^\"]*)\" dropdown under login page$")
	public void i_select_dropdown(String svalue, String sId) throws Throwable {
		obj_LoginPage_Implemtation.setValuesInDropDown( svalue,  sId);
	}
}
