package naveenvideos;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.pagefactory.ByAll;

public class ExtraLocators {
	
	/* ByAll,ByChained and ByIDOrName
	 * new locators present in class By(byid,byclassname,bypartical linktext,byTagname)
	 */
	//1. ByALL: in this we can provide multiple attribute and its value

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:/Users/king/Downloads/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");

		
		// driver find element either byid ,by name or byxpath
		//Exection sequence start from Left to Right(1. id, 2. name and 3. xpath )
		// if it is work with 1. id then directly entered pravinkumar , if 1st not matched then will move to second likewise and all locators failed to matched then
		// it will throw NoSuchElementException
		// we can merged all 8 locators also in ByALL (for BYAll we need call constructor of ByALL)
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		//driver.findElement(new ByAll(By.id("u_0_m"),By.name("firstname"),By.xpath("//input[@type='text']"))).sendKeys("pravinkumar");
		
		// now im sending incorrect id
		
		//driver.findElement(new ByAll(By.id("u_0_m1"),By.name("firstname"),By.xpath("//input[@type='text']"))).sendKeys("pravinkumar");
		// it will wait 5 sec for id if not matched then go for name 
		
		// if both id and name wrong 
		driver.findElement(new ByAll(By.id("u_0_m1"),By.name("firstname1"),By.xpath("//input[@type='text']"))).sendKeys("pravinkumar");
		// before entering pravinkumar uisng xpath it will wait for 10 sec (5 sec for id and 5 sec for name) so avoid implicit wait when we go for BYALL
	
		
		// if all wrong then it will wait 15 sec then throw NoSuchElementException 
		//driver.findElement(new ByAll(By.id("u_0_m1"),By.name("firstname1"),By.xpath("//input[@type='text1']"))).sendKeys("pravinkumar");
		
	}

	/*private static By ByAll() {
		// TODO Auto-generated method stub
		return null;
	}
*/
}
