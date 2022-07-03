package crossopenbrowsers;

import java.util.Scanner;

import org.openqa.selenium.remote.RemoteWebDriver;

public class Test51Runner {

	public static void main(String[] args) throws Exception
	 
	{
		// Take test data from keyboard
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter browser name");
		String bn = sc.nextLine();
		sc.close();
		//Create Object to utilities class
		WebSiteUtilities wsuobj = new WebSiteUtilities();
		//Open Browser
		RemoteWebDriver driver = wsuobj.openBrowser(bn);
		//Launch Site
		wsuobj.launchSite(driver,"https://spicejet.com", 5000);
		
		//Create Object to Page class
		Test51Page pobj = new Test51Page(driver);
		//Get details via way-1
		int result1 [] = pobj.getDetailsInWay1();
		for(int i=0;i<result1.length;i++)
		{
			System.out.println(result1[i]);
		}
		//Get details via way-2
		int result2 [] = pobj.getDetailsInWay2();
		{
			for(int temp:result2)
			{
				System.out.println(temp);
			}
			//close site
			wsuobj.closeSite(driver);
		}
		
	}

}
