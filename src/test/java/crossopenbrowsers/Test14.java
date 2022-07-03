package crossopenbrowsers;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Test14 {

	public static void main(String[] args) throws Exception
	{
		
		WebSiteUtilities obj = new WebSiteUtilities();
		RemoteWebDriver driver = obj.openBrowser("chrome");
		
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_link_target");
		Thread.sleep(2000);
		driver.switchTo().frame("iframeResult");
		driver.findElement(By.linkText("Visit W3Schools.com!")).click();
		
		Thread.sleep(5000);
		Set <String> S = driver.getWindowHandles();
		List<String> l = new ArrayList <String>(S);
		obj.closeWindowOrTab(driver, l.get(1));
		
		Thread.sleep(5000);
	   //obj.closeSite(driver);
	
	
	}

}
