package crossopenbrowsers;

import java.util.Scanner;

import org.openqa.selenium.remote.RemoteWebDriver;


public class Test50RunnerCboxRbtn {

	public static void main(String[] args) throws Exception 
	{
		//Take test data from keyboard
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter browser name");
		String bn = sc.nextLine();
		System.out.println("Enter Checkbox index");
		int cbi = sc.nextInt();
		System.out.println("Enter radio button index");
		int rbi = sc.nextInt();
		sc.close();
		
		//create object to utilities class
		WebSiteUtilities wsuobj = new WebSiteUtilities();
		
		//open browser
		RemoteWebDriver driver =wsuobj.openBrowser(bn);
		wsuobj.launchSite(driver,"https://www.phpforkids.com/html/html-form-check-boxes-radio-buttons.php", 5000);
		//Create Object to page class
		Test50pageCboxRbtn pobj = new Test50pageCboxRbtn(driver);
		
		//Check box Testing
		pobj.selectCheckBox(cbi);
		Thread.sleep(5000);
		
		if(pobj.verifyCheckBox(cbi))
		{
			System.out.print("checkbox test passed");
		}
		else
		{
			System.out.print("checkbox test failed");
		}
		Thread.sleep(5000);
		pobj.deselectcheckBox(cbi);
		Thread.sleep(5000);
		//Radio Button Testing
		pobj.clickRadiobutton(rbi);
		Thread.sleep(5000);
		if(pobj.verifyRadioButton(rbi))
		{
			System.out.println("Radio button test passed");
		}
		
		else
		{
			System.out.println("Radio button test failed");
		}
		Thread.sleep(5000);
		//close site
		wsuobj.closeSite(driver);
		
		
	}

}
