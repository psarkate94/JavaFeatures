package naveenvideos;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ByIdOrName;
import org.openqa.selenium.support.pagefactory.ByAll;
import org.openqa.selenium.support.pagefactory.ByChained;

public class ExtraLocators2 {
	
	/* ByAll,ByChained and ByIDOrName
	 * new locators present in class By(byid,byclassname,bypartical linktext,byTagname)
	 */
	//1. ByALL: in this we can provide multiple attribute and its value

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:/Users/king/Downloads/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		// in page both id and name there but i want to use either of them 
		//driver.findElement(new ByIdOrName("u_0_m")).sendKeys("pravin");// id
		driver.findElement(new ByIdOrName("firstname")).sendKeys("pravin");//name

		
		
	}

	/*private static By ByAll() {
		// TODO Auto-generated method stub
		return null;
	}
*/
}
