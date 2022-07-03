package crossopenbrowsers;

import java.util.Scanner;

import org.openqa.selenium.remote.RemoteWebDriver;

public class Test79Runner 
{

	public static void main(String[] args)  throws Exception
	{
		//Get expected date from keyboard
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter browser name");
		String bn=sc.nextLine();
		System.out.println("Enter day");
		int ed=Integer.parseInt(sc.nextLine()); 
		System.out.println("Enter month name");
		String em=sc.nextLine();
		System.out.println("Enter year");
		int ey=sc.nextInt ();
		sc.close();
		//Open browser 
		WebSiteUtilities wsobj=new WebSiteUtilities();
		RemoteWebDriver driver=wsobj.openBrowser (bn);
		//Launch site
		wsobj. launchSite (driver,"https://jqueryui.com/datepicker",5000); //Open calendar and select expected date
		Test79Page pobj=new Test79Page (driver);
		pobj.openCalendar(); 
		Thread.sleep(5000);
		pobj.selectDate(ey,em,ed);
		Thread.sleep(5000);
		//Close site
		wsobj.closeSite (driver);
		}

	}


