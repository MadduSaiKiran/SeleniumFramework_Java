package seleniumwebdriver;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class JunitTest {
	@Test
	public void jUnitDemo() {
			WebDriver driver=new ChromeDriver();
			driver.get("https://demowebshop.tricentis.com/");
			String title=driver.getTitle();
			System.out.println(title);
			Assert.assertEquals(title,"Demo Web Shop");
			if(title.equals("Demo Web Shop"))
				System.out.println("Passed !!!");
			else
				System.out.println("Failed !!!");
			driver.close();
	}
}
