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
	public  WebDriver driver;
	public  WebDriverWait wait;
	public  By domainName = By.xpath("//input[@id='Form_getForm_subdomain']");
	public  By fullName = By.xpath("//input[@id='Form_getForm_Name']");
	public  By email = By.xpath("//input[@id='Form_getForm_Email']");
	public  By phoneNumber = By.xpath("//input[@id='Form_getForm_Contact']");
	public  By country = By.xpath("//select[@id='Form_getForm_Country']");
	//public  By submit = By.xpath("//input[@id='Form_getForm_action_request']");
@Test
	public void MyTest() {
		click(getWebElement(domainName),10);
		enterText(getWebElement(domainName), "domainName1", 5);
		enterText(getWebElement(fullName), "fullName1", 5);
		enterText(getWebElement(email), "email@test.com", 5);
		enterText(getWebElement(phoneNumber), "9809888776", 5);
		click(getWebElement(country),10);
		selectValuesFromDropDown(getWebElement(country), "India", 0);
	//	click(getWebElement(submit), 5);
		tearDown();

	}

	
	  @BeforeTest public void launch() { 
		  WebDriverManager.chromedriver().setup();
		  driver = new ChromeDriver();
		  driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		  driver.manage().window().maximize();
	 
	  }
	  /*
	 * 
	 * @Test public static void register() { enterText(domainName, "domainName1",
	 * 5); enterText(fullName, "fullName1", 5); enterText(email, "email@test.com",
	 * 5); enterText(phoneNumber, "9809888776", 5);
	 * selectValuesFromDropDown(country, "India", 0); click(submit, 5);
	 * 
	 * }
	 */
	public WebElement getWebElement(By e) {
		return driver.findElement(e);
	}
	public  void selectValuesFromDropDown(WebElement e, String value, int time) {
		new WebDriverWait(driver, Duration.ofSeconds(time)).until(ExpectedConditions.visibilityOf(e));
		Select drp = new Select(e);
		List<WebElement> options = drp.getOptions();
		options.stream().filter(v -> v.getText().equals(value)).forEach(v -> v.click());

	}

	public  void enterText(WebElement e, String value, int time) {
		new WebDriverWait(driver, Duration.ofSeconds(time)).until(ExpectedConditions.visibilityOf(e));
		e.sendKeys(value);
	}

	public  void click(WebElement e, int time) {
		new WebDriverWait(driver, Duration.ofSeconds(time)).until(ExpectedConditions.visibilityOf(e));
		e.click();
	}

	
	public  void tearDown() {
		driver.quit();
	}

}
