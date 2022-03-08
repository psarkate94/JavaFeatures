package naveenvideos;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ByIdOrName;
import org.openqa.selenium.support.pagefactory.ByAll;
import org.openqa.selenium.support.pagefactory.ByChained;

public class ExtraLocators3 {
	
	// ByChained : it will when parent and child hierarchy is there
	
	/* ByAll,ByChained and ByIDOrName
	 * new locators present in class By(byid,byclassname,bypartical linktext,byTagname)
	 */
	//1. ByALL: in this we can provide multiple attribute and its value

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:/Users/king/Downloads/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// so creating chain from parent to child to perform some action 
		driver.findElement(new ByChained(By.xpath("//div[@class='uiStickyPlaceholderInput uiStickyPlaceholderEmptyInput']"),
				By.xpath("// input[@id='u_0_m']"))).sendKeys("zkjchfjk");
		

		
		
	}

	/*private static By ByAll() {
		// TODO Auto-generated method stub
		return null;
	}
*/
}
