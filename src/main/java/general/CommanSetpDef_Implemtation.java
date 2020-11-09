package general;

import java.util.HashSet;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import general.BasePage;

public class CommanSetpDef_Implemtation extends BasePage {

	WebDriver driver = BasePage.driver;

	public void clicOnAnyLinkFromPage(String linkText) {
		WebElement link = this.driver.findElement(By.linkText(linkText));
		smallwait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText(linkText)));
		link.click();
	}

	public void clickOnWebButton(String sButtonName) throws InterruptedException {

		List<WebElement> buttons = driver.findElements(By.tagName("button"));
		buttons.stream().filter(s -> s.getText().contains(sButtonName)).limit(1).forEach(s -> s.click());

	}

	public void setValuesinInputBox(String sInputbox, String sValue) {
		String xpath = String.format("//label[contains(text(), '%s')]//following-sibling::input", sInputbox);
		smallwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
		String formatedValue = UtilitiesFunctions.getRandomString(sValue);
		driver.findElement(By.xpath(xpath)).clear();
		driver.findElement(By.xpath(xpath)).sendKeys(formatedValue);
	}

	public void setValuesinTextBox(String sTextBox, String sValue) {
		String xpath = String.format("//label[contains(text(), '%s')]//following-sibling::textarea", sTextBox);
		smallwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
		String formatedValue = UtilitiesFunctions.getRandomString(sValue);
		driver.findElement(By.xpath(xpath)).sendKeys(formatedValue);
	}

	public void setValuesinInputBoxofSection(String sInputbox, String sValue) {
		String xpath = String.format("//label[contains(text(), '%s')]//following-sibling::input", sInputbox);
		List<WebElement> inputboxes = driver.findElements(By.xpath(xpath));
		String formatedValue = UtilitiesFunctions.getRandomString(sValue);
		inputboxes.get(1).sendKeys(formatedValue);

	}

	public void validateValuesinInputBox(String sInputbox, String sValue) {

		String xpath = String.format("//label[contains(text(), '%s')]//following-sibling::input", sInputbox);
		smallwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
		String expectedformatedValue = UtilitiesFunctions.getRandomString(sValue);
		String actualfrombox = driver.findElement(By.xpath(xpath)).getAttribute("value");

		org.junit.Assert.assertEquals(expectedformatedValue, actualfrombox);

	}

	public void validateValuesinInputBoxofSection(String sInputbox, String sValue) {
		String xpath = String.format("//label[contains(text(), '%s')]//following-sibling::input", sInputbox);
		List<WebElement> inputboxes = driver.findElements(By.xpath(xpath));
		String expectedformatedValue = UtilitiesFunctions.getRandomString(sValue);
		String actualfrombox = inputboxes.get(1).getAttribute("value");
		org.junit.Assert.assertEquals(expectedformatedValue, actualfrombox);

	}

	public void checkboxOperation(String sAction, String sname) {
		String xpathcheckboxesLable = String.format("//label[contains(text(), '%s')]", sname);
		WebElement checkboxesLable = driver.findElement(By.xpath(xpathcheckboxesLable));
		smallwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpathcheckboxesLable)));
		String checkboxId = checkboxesLable.getAttribute("for");
		String xpathcheckboxId = String.format("//input[@id = '%s' and @type='checkbox']", checkboxId);
		WebElement checkbox = driver.findElement(By.xpath(xpathcheckboxId));
		if (sAction.equalsIgnoreCase("check")) {
			if (!checkbox.isSelected()) {
				checkbox.click();
			}

		} else {
			if (checkbox.isSelected()) {
				checkbox.click();
			}
		}
	}

	public void setRadioButton(String sname) {
		String xpathRadioLable = String.format("//label[contains(text(), '%s')]", sname);
		WebElement radioLable = driver.findElement(By.xpath(xpathRadioLable));
		smallwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpathRadioLable)));
		String radiobuttonId = radioLable.getAttribute("for");
		String xpathRadioId = String.format("//input[@id = '%s' and @type='radio']", radiobuttonId);
		WebElement radiobutton = driver.findElement(By.xpath(xpathRadioId));
		if (!radiobutton.isSelected()) {
			radiobutton.click();
		}
	}

	public void selectfromDropdownn(String svalue, String sname) {
		String xpathDropdownLable = String.format("//label[contains(text(), '%s')]", sname);
		WebElement dropdownLable = driver.findElement(By.xpath(xpathDropdownLable));
		smallwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpathDropdownLable)));
		String dropdownId = dropdownLable.getAttribute("for");
		WebElement dropdown = driver.findElement(By.id(dropdownId));
		Select objSelect = new Select(dropdown);
		try {
			objSelect.selectByVisibleText(svalue);
		} catch (Exception e) {
			System.out.println(svalue + " value not found");
		}
	}

	public void validateTextFromPgae(String sValue) {
		String xpath = String.format("//*[contains(text(), '%s')]", sValue);
		smallwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
		WebElement messagearea = driver.findElement(By.xpath(xpath));

		org.junit.Assert.assertTrue(messagearea.isDisplayed());

	}

}
