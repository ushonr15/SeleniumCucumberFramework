package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import general.BasePage;

public class LoginPage_Implemtation extends BasePage {

	WebDriver driver = BasePage.driver;

	public void setValuesInDropDown(String svalue, String sId) {
		WebElement dropdown = driver.findElement(By.xpath("//select[@id='"+sId+"']"));
		//smallwait.until(ExpectedConditions.visibilityOfElementLocated(By.id(sId)));
		Select objSelect = new Select(dropdown);
		try {
			objSelect.selectByValue(svalue);
		} catch (Exception e) {
			System.out.println(svalue + " value not found");
		}
	}

}
