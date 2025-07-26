package demoWebShop;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickBlockedByInvisibleElementsHandler {
	private WebDriver driver;
	public void clickInputAndEnterKeys() {
		By lifeCycleInput=By.xpath("");
		WebElement ele =driver.findElement(lifeCycleInput);

		String test =
				"var r = arguments[0].getBoundingClientRect();" +       //get the Element reactagle of ele.
				"var el= document.elementFromPoint(r.left + r.width/2, r.top+r.height/2); "+ //get the Elements surrounded by r rectangle element.
				"el.style.pointerEvents='none'; "+      //made surrounded element of ele/r transparent(disables mouse interactions (click/blocking) on that overlay) in order to pass the click through it.   
				"return el;";

		WebElement overlay=(WebElement) ((JavascriptExecutor)driver).executeScript (test, ele);
		driver.findElement(lifeCycleInput).click();
		driver.findElement(lifeCycleInput).sendKeys("ABC");

		((JavascriptExecutor) driver).executeScript(
				"arguments[0].style.pointerEvents='auto';", overlay); //roll back to normal UI page.
	}
	
	public static void main(String[] args) {
		ClickBlockedByInvisibleElementsHandler obj=new ClickBlockedByInvisibleElementsHandler();
		
		obj.driver=new ChromeDriver();
		obj.clickInputAndEnterKeys();
	}
}
