package crossopenbrowsers;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.remote.RemoteWebDriver;



import io.github.bonigarcia.wdm.WebDriverManager;

public class WebSiteUtilities {
	
	public RemoteWebDriver driver;
	public WebSiteUtilities()
	{
		driver = null;
	}
	public RemoteWebDriver openBrowser(String bn)
	{
		if(bn.equals("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		else if(bn.equals("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		else if(bn.equals("opera"))
		{
			WebDriverManager.operadriver().setup();
			driver = new OperaDriver();
		}
		else if(bn.equals("edge"))
		{
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		else
		{

			WebDriverManager.iedriver().setup();
			driver = new InternetExplorerDriver();
		}
	
	return(driver);

}
	public void closeSite(RemoteWebDriver driver)
	{
		driver.quit();
	}
	
	public void closeWindowOrTab(RemoteWebDriver driver,String handle)
	{
		driver.switchTo().window(handle);
		driver.close();
	}
	
	public void launchSite(RemoteWebDriver driver,String url,long wait) throws Exception
	{
		
		
		driver.get(url);
		driver.manage().window().maximize();
		Thread.sleep(wait);
	}
	
	public List <String> getWindowHandlesList(RemoteWebDriver driver)
	{
		Set <String> S = driver.getWindowHandles();
	    List <String> l = new ArrayList <String> (S);
	
	return (l);
	}

}	
	
