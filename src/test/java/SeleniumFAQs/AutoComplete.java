package SeleniumFAQs;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoComplete {
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.twoplugs.com/");
		driver.manage().window().fullscreen();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(),'Live Posting')]")).click();
		WebElement searchBox = driver.findElement(By.id("autocomplete"));
		searchBox.clear();

		searchBox.sendKeys("Toronto");

		Thread.sleep(2000);
		String text;
		do {
			searchBox.sendKeys(Keys.ARROW_DOWN);
			Thread.sleep(2000);
			text = searchBox.getAttribute("value");
			if (text.equals("Toronto, OH, USA")) {
				searchBox.sendKeys(Keys.ENTER);
				break;
			}
		}

		while (!text.isEmpty());
		System.out.println("Completed");
		driver.quit();
	}

}
