package general;

import java.io.File;
import java.io.IOException;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
	public static WebDriver driver;
	public static WebDriverWait miniwait, smallwait, longwait;
	public static Actions action;

	public static void initiaisDriver(String url) throws IOException {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium_All\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
		String urlFrmfile = UtilitiesFunctions.getValue(url);
		System.out.println(urlFrmfile);
		driver.get(urlFrmfile);
		driver.manage().window().maximize();
		miniwait = new WebDriverWait(driver, 2);
		smallwait = new WebDriverWait(driver, 3);
		longwait = new WebDriverWait(driver, 5);
		action = new Actions(driver);

		Random rnd = new Random();
		String randomNoInString = Integer.toString(rnd.nextInt(1000000));
		File file = new File("D:\\Selenium_All\\SeleniumCucumber\\SharedReports\\cucumber-html-reports");
		File dest = new File(
				"D:\\Selenium_All\\SeleniumCucumber\\SharedReports\\cucumber-html-reports_" + randomNoInString);
		if (file.exists()) {
			file.renameTo(dest);
		}

	}

}
