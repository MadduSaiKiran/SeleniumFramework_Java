package SeleniumFAQs;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDowns {
	public static WebDriver driver;
	public static WebDriverWait wait;
	public static WebElement domainName = driver.findElement(By.id("Form_submitForm_subdomain"));
	public static WebElement fullName = driver.findElement(By.id("Form_submitForm_Name"));
	public static WebElement email = driver.findElement(By.id("Form_submitForm_Email"));
	public static WebElement phoneNumber = driver.findElement(By.id("Form_submitForm_Contact"));
	public static WebElement country = driver.findElement(By.id("Form_submitForm_Country"));
	public static WebElement submit = driver.findElement(By.id("Form_submitForm_action_request"));

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		driver.manage().window().fullscreen();
		enterText(domainName, "domainName1", 5);
		enterText(fullName, "fullName1", 5);
		enterText(email, "email@test.com", 5);
		enterText(phoneNumber, "9809888776", 5);
		selectValuesFromDropDown(country, "India", 0);
		click(submit, 5);
		tearDown();

	}

	/*
	 * @BeforeTest public void launch() { WebDriverManager.chromedriver().setup();
	 * driver = new ChromeDriver();
	 * driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
	 * driver.manage().window().fullscreen();
	 * 
	 * }
	 * 
	 * @Test public static void register() { enterText(domainName, "domainName1",
	 * 5); enterText(fullName, "fullName1", 5); enterText(email, "email@test.com",
	 * 5); enterText(phoneNumber, "9809888776", 5);
	 * selectValuesFromDropDown(country, "India", 0); click(submit, 5);
	 * 
	 * }
	 */
	public static void selectValuesFromDropDown(WebElement e, String value, int time) {
		new WebDriverWait(driver, Duration.ofSeconds(time)).until(ExpectedConditions.visibilityOf(e));
		Select drp = new Select(e);
		List<WebElement> options = drp.getOptions();
		options.stream().filter(v -> v.getText().equals(value)).forEach(v -> v.click());

	}

	public static void enterText(WebElement e, String value, int time) {
		new WebDriverWait(driver, Duration.ofSeconds(time)).until(ExpectedConditions.visibilityOf(e));
		e.sendKeys(value);
	}

	public static void click(WebElement e, int time) {
		new WebDriverWait(driver, Duration.ofSeconds(time)).until(ExpectedConditions.visibilityOf(e));
		e.click();
	}

	
	public static  void tearDown() {
		driver.quit();
	}

}
