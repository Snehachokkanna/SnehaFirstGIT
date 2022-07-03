package crossopenbrowsers;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.remote.RemoteWebDriver;

public class TestRunner78 {
	
	
	
	//dont do this ,,, pagination concept for checking broken links in multiple pages(interview purpose)

	public static void main(String[] args) throws Exception  
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter browser name");
		String bn = sc.nextLine();
		//Take a word to be Searched from keyboard
		System.out.println("Enter a word");
		String word =sc.nextLine();
		sc.close();
		//open browser
		WebSiteUtilities wsobj = new WebSiteUtilities();
		RemoteWebDriver  driver = wsobj.openBrowser(bn);
		//Launch Site
		wsobj.launchSite(driver,"http://www.google.co.in",5000);
		//Search a word for results
		driver.findElement(By.name("q")).sendKeys(word,Keys.ENTER);
		Thread.sleep(5000);
		Test75Page pobj = new Test75Page(driver);
		//Pagination on results page
		int pn =1 ; //we are in first page of results
		
		while(true)//infinite loop for pagination
		{
			//all links testing for broken links
			List<String> results = pobj.findBrokenLinks();
			System.out.printf("count of broken links in page -%d is %d%n",pn,results.size());

		for(String result :results)
		{
			System.out.println(result);
		}
		//Goto next page
		try
		{
			pn++;
			driver.findElement(By.linkText(pn+"")).click();
			Thread.sleep(5000);
		}
		catch(Exception ex)
		{
			//"Exception" will be raised  in last page because no next page number link
			break;
		}
		}
driver.close();

	}

}
