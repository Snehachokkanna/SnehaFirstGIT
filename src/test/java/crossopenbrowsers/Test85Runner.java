package crossopenbrowsers;

import java.util.Scanner;

import org.openqa.selenium.remote.RemoteWebDriver;

public class Test85Runner {

	public static void main(String[] args) throws Exception 
	{
		// Get Expected date from keyboard
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter browser name");
		String bn =sc.nextLine();
		System.out.println("Enter a word");
		String w =sc.nextLine();
		sc.close();
		
		//open Browser
		WebSiteUtilities wsobj =new WebSiteUtilities();
		RemoteWebDriver driver = wsobj.openBrowser(bn);
		//Launch site
		wsobj.launchSite(driver, "https://www.google.co.in",5000);
		//Login to site
		Test85page pobj = new Test85page(driver);
		pobj.fillSearchbox(w);
		Thread.sleep(5000);
		//Test Cache
		System.out.println(pobj.getCountofSuggestions());
		System.out.println(pobj.getTextofSuggestion(3));
		System.out.println(pobj.getTextofAllSuggestions());
		if(pobj.VerifyAllSuggestionns(w))
		{
			System.out.println("Test passed");
		}
		else
		{
			System.out.println("Test failed");
			System.out.println(pobj.getMismatchedSuggestions(w));
		}
		
		//close site
		wsobj.closeSite(driver);
		

	}

}
