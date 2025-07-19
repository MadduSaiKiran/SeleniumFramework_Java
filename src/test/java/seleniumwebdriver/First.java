package seleniumwebdriver;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//import junit.framework.Assert;
public class First {
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		String title=driver.getTitle();
		System.out.println(title);
		//Assert.assertEquals(title,"Demo Web Shop");
		if(title.equals("Demo Web Shop"))
			System.out.println("Passed !!!");
		else
			System.out.println("Failed !!!");
		
		
		driver.close();
		}

}
