package pageFactory;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
	
	WebDriver logDriver;
	Properties prop=new Properties();
	
	void initProperties() throws IOException {
		File file=new File("src\\test\\java\\Xpath.properties");
		FileInputStream fis= new FileInputStream(file);
		prop.load(fis);
	}
	public Login(WebDriver driver) throws IOException 
	{	
		logDriver = driver;
		PageFactory.initElements(logDriver, this);
		initProperties();
	}
	
	@FindBy(linkText = "Log in")
	WebElement loginText;
	
	@FindBy(id = "Email")
	WebElement email;
	
	@FindBy(id = "Password")
	WebElement psd;

	@FindBy(xpath = "//input[@value='Log in']")
	WebElement loginButton;
	
	@FindBy(xpath = "(//a[@class='account'])[1]")
	WebElement profile;
	
	public void selectLogin()
	{
		loginText.click();
	}
	
	public void loginDetails(String emailID, String password)
	{
		email.sendKeys(emailID);
		psd.sendKeys(password);
	}
	
	public void loginButton()
	{	
		//loginButton.click();   
		/*another approach with properties file*/ 
		By duplicateOfloginButton=By.xpath(prop.getProperty("loginButton"));
		logDriver.findElement(duplicateOfloginButton).click();
		
	}
	
	public String profileName()
	{
		return profile.getText();
	}
}