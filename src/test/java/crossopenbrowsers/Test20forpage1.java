package crossopenbrowsers;

import java.util.Scanner;

import org.openqa.selenium.remote.RemoteWebDriver;

import pages.page1;

public class Test20forpage1 
{

	public static void main(String[] args) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a browser name");
		String browser= sc.nextLine();
		System.out.println("Enter a word to Search");
		String word = sc.nextLine();
		sc.close();
		
		//create object for our utilities class
      WebSiteUtilities uobj = new WebSiteUtilities();
      
      //open browser (By default without any history and cookies)
      
      RemoteWebDriver driver = uobj.openBrowser(browser);
      
      //Launch site using base URL
      
      uobj.launchSite(driver,"https://www.google.co.in",5000);
      
      //create object to page class
      
      page1 pobj = new page1(driver);
      pobj.fillSearchBox(word);
      Thread.sleep(5000);
      pobj.clickSearch();
      Thread.sleep(5000);
      
      //test title
      
      if(pobj.titleValidation(word))
      {
    	 System.out.println("Title Test is passed");
      }
      
      else
    	  
      {
    	  System.out.print("Title test is failed");
      }
      
      //close site
      
      uobj.closeSite(driver);
      

	}

}
