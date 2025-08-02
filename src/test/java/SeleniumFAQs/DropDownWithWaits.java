package SeleniumFAQs;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownWithWaits {
	public static WebDriver driver;
	public static WebDriverWait wait;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		driver.manage().window().fullscreen();
		WebElement domainName = driver.findElement(By.id("Form_submitForm_subdomain"));
		WebElement fullName = driver.findElement(By.id("Form_submitForm_Name"));
		WebElement email = driver.findElement(By.id("Form_submitForm_Email"));
		WebElement phoneNumber = driver.findElement(By.id("Form_submitForm_Contact"));
		WebElement country = driver.findElement(By.id("Form_submitForm_Country"));
		WebElement state = driver.findElement(By.id("Form_submitForm_State"));
		WebElement submit = driver.findElement(By.id("Form_submitForm_action_request"));
		enterText(domainName, "domainName1", 5);
		enterText(fullName, "fullName1", 5);
		enterText(email, "email@test.com", 5);
		enterText(phoneNumber, "9809888776", 5);
		selectValuesFromDropDown(country, "India", 5);
		selectValuesFromDropDown(state, "Telangana", 4);
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,250)");
		
		
		
		click(submit, 5);
		tearDown();

	}

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

	public static void tearDown() {
		driver.quit();
	}

}
