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
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import general.BasePage;
import general.CommanSetpDef_Implemtation;

public class CommonStepDef {
	BasePage obj = new BasePage();
	WebDriver driver = obj.driver;
	CommanSetpDef_Implemtation obj_commonimplemetation = new CommanSetpDef_Implemtation();

	@Given("^I navigate to \"([^\"]*)\" Website$")
	public void i_navigate_to_Website(String url) throws Throwable {

		System.out.println(driver.getTitle().contains(url));

	}

	@Given("^I Click on \"([^\"]*)\" link$")
	public void i_click_On_anyLink(String linkText) throws Throwable {

		obj_commonimplemetation.clicOnAnyLinkFromPage(linkText);
	}

	@And("^I enter values in property inputbox under \"([^\"]*)\"$")
	public void i_set_values_values_in_property_inputbox(String section_page, DataTable table) throws Throwable {

		if (section_page.equals("page")) {
			List<List<String>> data = table.raw();
			for (int i = 1; i < data.size(); i++) {
				obj_commonimplemetation.setValuesinInputBox(data.get(i).get(0), data.get(i).get(1));
				Thread.sleep(3000);
			}
		} else {
			List<List<String>> data = table.raw();
			for (int i = 1; i < data.size(); i++) {
				obj_commonimplemetation.setValuesinInputBoxofSection(data.get(i).get(0), data.get(i).get(1));
			}
		}

	}

	@And("^I enter \"([^\"]*)\" values under \"([^\"]*)\" textbox$")
	public void i_set_values_textbox(String value, String textbox) throws Throwable {
		obj_commonimplemetation.setValuesinTextBox(value, textbox);
		Thread.sleep(3000);
	}

	@Given("^I validate values of inputbox from \"([^\"]*)\"$")
	public void i_validate_values_from_inputbox(String section_page, DataTable table) throws Throwable {

		if (section_page.equals("page")) {
			List<List<String>> data = table.raw();
			for (int i = 1; i < data.size(); i++) {
				obj_commonimplemetation.validateValuesinInputBox(data.get(i).get(0), data.get(i).get(1));
			}
		} else {
			List<List<String>> data = table.raw();
			for (int i = 1; i < data.size(); i++) {
				obj_commonimplemetation.validateValuesinInputBoxofSection(data.get(i).get(0), data.get(i).get(1));
			}

		}

	}

	@And("^I click on \"([^\"]*)\" button$")
	public void i_click_on_button(String sButtonName) throws Throwable {
		obj_commonimplemetation.clickOnWebButton(sButtonName);
	}

	@Given("^I (check|uncheck) \"([^\"]*)\" checkbox$")
	public void i_check_checkbox(String sAction, String sname) throws Throwable {
		Thread.sleep(8000);
		obj_commonimplemetation.checkboxOperation(sAction, sname);
		Thread.sleep(3000);
	}

	@Given("^I set \"([^\"]*)\" radiobutton$")
	public void i_set_radiobutton(String sname) throws Throwable {
		Thread.sleep(5000);
		obj_commonimplemetation.setRadioButton(sname);
	}

	@And("^I select \"([^\"]*)\" value from \"([^\"]*)\" dropdown$")
	public void i_select_dropdown(String svalue, String sname) throws Throwable {
		obj_commonimplemetation.selectfromDropdownn(svalue, sname);
	}

	@Then("^I validate text message \"([^\"]*)\" from page$")
	public void i_validateTectMessagae(String svalue) throws Throwable {
		obj_commonimplemetation.validateTextFromPgae(svalue);
	}
}
