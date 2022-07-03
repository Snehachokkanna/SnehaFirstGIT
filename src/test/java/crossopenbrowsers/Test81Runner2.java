package crossopenbrowsers;

import java.util.Scanner;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Test81Runner2 {

	public static void main(String[] args) throws Exception
	{
		//Get expected date from keyboard
		
				Scanner sc = new Scanner(System.in);
				System.out.println("enter browser name");
				String bn =sc.nextLine();
				System.out.println("Enter trip type (0 for oneway and 1 for round-trip)");
				int tt =Integer.parseInt(sc.nextLine());
				System.out.println("Enter from city");
				String fc = sc.nextLine();
				System.out.println("Enter to city");
				String tc =sc.nextLine();
				System.out.println("Enter depature year");
				int dy = Integer.parseInt(sc.nextLine());
				System.out.println("Enter depature month name");
				String dmn =sc.nextLine();
				System.out.println("Enter depature day ");
				int dd=Integer.parseInt(sc.nextLine());
				int ry=0;
				String rmn ="";
				int rd=0;
				if(tt==1)
				{
					System.out.println("Enter Return year");
					ry=Integer.parseInt(sc.nextLine());
					System.out.println("Enter return month name");
					rmn=sc.nextLine();
					System.out.println("Enter return day");
					rd=Integer.parseInt(sc.nextLine());
				}
				sc.close();
				//open browser
				WebSiteUtilities wsobj =new WebSiteUtilities();
				RemoteWebDriver driver = wsobj.openBrowser(bn);
				//Launch site
				wsobj.launchSite(driver,"https://beta.spicejet.com",10000);
				//fill fields and click on "search"
				Test80Page pobj = new Test80Page(driver);
				if(tt==0)
				{
					pobj.selectoneway();
				}
				else
				{
					pobj.selectRoundTrip();
				}
				Thread.sleep(5000);
				pobj.setFromcity(fc);
				Thread.sleep(5000);
				pobj.setTocity(tc);
				Thread.sleep(5000);
				pobj.setDateofDepature(dy,dmn,dd);
				if(tt==1)
				{
					pobj.setDateofReturn(ry,rmn,rd);
				}
				pobj.clickSearch();
				Thread.sleep(10000);
				System.out.println(pobj.getCountofDepatureFlights());
				System.out.println(pobj.getDepatureFlightFare(0));
				System.out.println(pobj.getAlldepatureFlightsFares());
				if(tt==1)
				{
					System.out.println(pobj.getCountofReturnFlights());
					System.out.println(pobj.getReturnFlightFare(0));
					System.out.println(pobj.getAllreturnFlightsFares());
				}
				Thread.sleep(5000);
				//work with lowest fare flight
				pobj.selectLowestFaredDepatureFlight();
				//System.out.println(pobj.selectLowestFaredDepatureFlight());
				//System.out.println(pobj.selectLowestFaredDepatureFlight());
				Thread.sleep(5000);
				if(tt==1)
				{
					pobj.selectLowestFaredReturnFlight();
					
				}
			//	driver.close();

	}

}
