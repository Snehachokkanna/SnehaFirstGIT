package crossopenbrowsers;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Test15 {

	public static void main(String[] args) throws Exception
	{
		WebSiteUtilities obj = new WebSiteUtilities();
		RemoteWebDriver driver = obj.openBrowser("chrome");
		obj.launchSite(driver,"https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_link_target",5000);
		driver.switchTo().frame("iframeResult");
		driver.findElement(By.linkText("Visit W3Schools.com!")).click();
		Thread.sleep(5000);
		List <String> l = obj.getWindowHandlesList(driver);
		obj.closeWindowOrTab(driver,l.get(1));
		Thread.sleep(5000);
		obj.closeSite(driver);
		

	}

}
