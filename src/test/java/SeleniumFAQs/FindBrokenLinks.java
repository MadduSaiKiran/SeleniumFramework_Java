package SeleniumFAQs;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FindBrokenLinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().fullscreen();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		List<WebElement> links = driver.findElements(By.tagName("a"));
		Stream<WebElement> workingLink = links.stream().filter(a -> a.getAttribute("href") != null);
		long workingLinkCount = workingLink.count();
		System.out.println("Working link  count " + workingLinkCount);

		List<Object> workingLinkNames = links.stream().map(v -> v.getText()).collect(Collectors.toList());
		System.out.println("Working link " + workingLinkNames);

		Stream<WebElement> brokenLink = links.stream().filter(a -> a.getAttribute("href") == null);
		long brokenLinkCount = brokenLink.count();
		System.out.println("Working link   " + brokenLinkCount);
		//List<String> brokenLinkNames = (List<String>) brokenLink.map(v -> v.getText());
		// System.out.println("Working link count " + brokenLinkNames);

		driver.close();
	}

}
