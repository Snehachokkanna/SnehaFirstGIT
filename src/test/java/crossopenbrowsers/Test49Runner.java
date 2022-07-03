package crossopenbrowsers;
import java.util.Scanner;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.sun.jndi.url.corbaname.corbanameURLContextFactory;

import io.github.bonigarcia.wdm.WebDriverManager;



public class Test49Runner {

	public static void main(String[] args) throws Exception
	{
		//Take test data from keyboard
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter browser name");
		String bn = sc.nextLine();
		System.out.println("Enter Userid");
		String u = sc.nextLine();
		System.out.println("Enter Password");
		String p = sc.nextLine();
		System.out.println("Enter criteria like both_valid/blank_uid/invalid_uid/blank_pwd,invalid_pwd");
		String c = sc.nextLine();
		sc.close();
		//Create Object to page class
		WebSiteUtilities	wsuobj	= new WebSiteUtilities();
		
		//open browser
		RemoteWebDriver driver;
		if(bn.equalsIgnoreCase("chrome"))
		{
			//Disable notifications of chrome browser
			WebDriverManager.chromedriver().setup();
			ChromeOptions co = new ChromeOptions();
			co.addArguments("--disable-notifications");
			//co.addArguments("--disable_notifications");
			//co.addArguments("--lang=en");
			//chrome internal commands
			driver = new ChromeDriver(co);
		}
		else
		{
			driver=wsuobj.openBrowser(bn);
		}
		//Launch site
		wsuobj.launchSite(driver, "http://www.facebook.com",5000);
		
		//create object to page class
		Test49Page pobj = new Test49Page(driver);
		
		//Enter userid and password and then click on login
		pobj.fillUserid(u);
		Thread.sleep(2000);
		pobj.fillPassword(p);
		Thread.sleep(2000);
		pobj.clickLogin();
		Thread.sleep(5000);
		//perform validations
		if(c.equalsIgnoreCase("both_valid"))
		{
			if(pobj.VerifyLogoutIsDisplayed())
			{
				System.out.println("Test passed for valid data in "+bn);
			}
			else
			{
				System.out.println("Test failed for valid data in "+bn);
				
			}
		}
		else if (c.equalsIgnoreCase("blank_uid"))
		{
			if(pobj.verifyBlankuidError())
			{
				System.out.println("Test passed for blank userid in "+bn);
			}
			else
			{
				System.out.println("Test failed for blank userid in "+bn);
			}
		}
		
		else if(c.equalsIgnoreCase("invalid_uid"))
		{
			if(pobj.verifyInvaliduidError())
			{
				System.out.println("Test Passed for invalid userid");
			}
			
			else
			{
				System.out.println("Test failed for invalid userid");
			}
		}
		else if(c.equalsIgnoreCase("blank_pwd")||c.equalsIgnoreCase("invalid_pwd"))
		{
			if(pobj.verifyBlankorInvalidpwdError())
			{
				System.out.println("Test passed for blank or invalid password");
			}
			else
			{
				System.out.println("test failed for blank or invalid password");
			}
		}
		
		
		//close site
		wsuobj.closeSite(driver);		
		
	}	

}
