package SeleniumFAQs;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;

import java.net.URL;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PdfReader {
	static WebDriver driver;

	@Test
	public static void pdfReaderText() throws IOException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		//driver.get("file:///C:/Users/SAI KIRAN/OneDriveDesktop/pdf-sample.pdf");
		driver.get("D:\\SeleniumJava\\SeleniumFramework_Java\\testData\\pdf-sample.pdf");
		String currentURL = driver.getCurrentUrl();
		URL url = new URL(currentURL);
		// Open URL
		InputStream is = url.openStream();
		// Read data
		BufferedInputStream bis = new BufferedInputStream(is);
		PDDocument document = PDDocument.load(bis);
		String pdfContent = new PDFTextStripper().getText(document);
		System.out.println(pdfContent);

	}

}
