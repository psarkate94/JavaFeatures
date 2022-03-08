package naveenvideos;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.encryption.InvalidPasswordException;
import org.apache.pdfbox.text.PDFTextStripper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadingPDF2 {
	
	// when i have to read pdf from URL

	public static void main(String[] args) throws InvalidPasswordException, IOException 
	{
		System.setProperty("webdriver.chrome.driver", "C:/Users/king/Downloads/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.betterteam.com/downloads/employee-information-form-download-20170810.pdf");
String CurrentURL	=	driver.getCurrentUrl();
System.out.println(CurrentURL);
		URL url = new URL(CurrentURL);
		InputStream is= url.openStream();
		
		
		
		
		BufferedInputStream bs= new BufferedInputStream(is);
		PDDocument document =null;
		document=PDDocument.load(bs);
		String PDFContent=new PDFTextStripper().getText(document);
		System.out.println(PDFContent);

	}

}
