package practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.base.Predicate;

public class HandlingDynamicTable 
{
	
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\king\\Downloads\\Driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://demo.guru99.com/test/web-table-element.php");

		//*[@id="customers"]/tbody/tr[2]/td[1]
		//*[@id="customers"]/tbody/tr[4]/td[1]
		//*[@id="customers"]/tbody/tr[7]/td[1]
		String BeforeXapth="//*[@id='customers']/tbody/tr[";
		String AfterXapth="]/td[1]";
		// i=2 because my actual data start from 2 and end at 7
		for(int i=2;i<=7;i++)
		{
			String xpath=BeforeXapth+i+AfterXapth;
			WebElement ele=driver.findElement(By.xpath(xpath));
			System.out.println(ele.getText());
			
		}
		
	}
}
