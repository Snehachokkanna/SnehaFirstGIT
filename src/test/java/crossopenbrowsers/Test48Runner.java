package crossopenbrowsers;

import java.util.Scanner;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Test48Runner {

	public static void main(String[] args) throws Exception
	{
		//Take Test data from keyboard
		
		Scanner sc = new Scanner(System.in) ;
		System.out.println("enter a browser name");
		String bn = sc.nextLine();
		
		System.out.println("Enter userid");
		String u = sc.nextLine();
		
		System.out.println("Enter userid criteria");
		String uc =sc.nextLine();
		
		sc.close();
		
		//create object to utilities class
		
		WebSiteUtilities wsuobj = new WebSiteUtilities();
		
		//open browser
		
		RemoteWebDriver driver = wsuobj.openBrowser(bn);
		
		//Launch site
		wsuobj.launchSite(driver,"http://www.gmail.com",5000);
		
		//create object to page class
		Test48Page  pobj = new Test48Page(driver);
		
		//Enter userid and click on next
		
		pobj.fillUserid(u);
		pobj.clickUserIdNext();
		Thread.sleep(5000);  //wait for response
		
		//perform validations
		if(uc.equals("valid"))
		{
			if(pobj.verifyPasswordDisplayed())
			{
				System.out.println("Test passed for valid userid");
			}
			else
			{
				System.out.println("Test failed for valid userid");
			}
		}
		
		else if(uc.equals("invalid"))
		{
			if(pobj.verifyInvaliduidError())
			{
				System.out.println("Test passed for invalid userid");
			}
			else
			{
				System.out.println("Test failed for invalid userid");
			}
			
		}
		
		else if (uc.equals("blank"))
		{
			if(pobj.verifyBlankuidError())
			{
				System.out.println("Test passed for blank userid");
			}
			else
			{
				System.out.println("Test failed for blank userid");
			}
		}
		else
		{
			System.out.println("please ,enter correct criteria(valid/invalid/blank)");
		}
		
		
		//close site
		//wsuobj.closeSite(driver);
	

	}

}
