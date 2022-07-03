package crossopenbrowsers;

import java.util.Scanner;

import org.openqa.selenium.remote.RemoteWebDriver;

public class Test54Runner {

	public static void main(String[] args) throws Exception 
	{
		//Take test data from keyboard
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter browser name");
		String bn = sc.nextLine();
		sc.close();
		//Create object to utilities class
		WebSiteUtilities wsuobj = new WebSiteUtilities();
		//open browser 
		RemoteWebDriver driver = wsuobj.openBrowser(bn);
		//Launch site
		wsuobj.launchSite(driver,"https://www.spicejet.com", 5000);
		//Create object to page class
		Test54Page pobj = new Test54Page(driver);
		//Get screenshot of element
		String fp = pobj.getElementScreenshot();
		System.out.println(fp);
		//close site
		wsuobj.closeSite(driver);
		

	}

}
