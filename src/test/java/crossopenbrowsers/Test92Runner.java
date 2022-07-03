package crossopenbrowsers;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.remote.RemoteWebDriver;

public class Test92Runner {

	public static void main(String[] args)  throws Exception
	{
		//Take browser name from keyboard
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter browser name");
		String bn =sc.nextLine();
		sc.close();
		//open browser
		WebSiteUtilities wsobj = new WebSiteUtilities();
		RemoteWebDriver driver = wsobj.openBrowser(bn); 
		//Launch Site
		wsobj.launchSite(driver,"https://www.amazon.in",5000);
		
		//Create an object to page class
		Test92PageolTagCarousel pobj=new Test92PageolTagCarousel(driver);
		System.out.println(pobj.getSlidesCountInCarouselSlider());
		System.out.println(pobj.getTypeofCarouselSlider());
		//driver.navigate().refresh();
		if(pobj.areSlidesMovingIncarouselSlider())
		{
			//Get Direction
			System.out.println(pobj.getMovingDirectionOfSlidesInCarouselSlider());
			//Get details
			List<String>res =pobj.getMovingSlidesAdditionalDetails();
			for(String r:res)
			{
				System.out.println(r);
			}
			//Verify order of slides in rotation
			//driver.navigate().refresh();
			if(pobj.VerifySlidesRotationInCoursalSlider())
			{
				System.out.println("Slides are rotating correctly");
			}
			else 
			{
				System.out.println("Slides are rotating incorrectly");

			}
			
		}
		
		//close site
		wsobj.closeSite(driver);

	}

}
