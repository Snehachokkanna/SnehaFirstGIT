package crossopenbrowsers;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;


public class Test76 {

	public static void main(String[] args) throws Exception
	{
		//take browser name from keyboard
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
		//Pagination on results page
		int pn =1 ;
		int total = 0;
		
		while(true) //infinite loop for pagination
		{
			//Get count of results in each page
			List <WebElement> allresults = driver.findElements(By.xpath("//div[@class='g']")); // every result including hidden
			List <WebElement> visibleresults = new ArrayList<WebElement>();
			for(WebElement result:allresults)
			{
				if(result.isDisplayed())
				{
					visibleresults.add(result);
				}
			}
			System.out.printf("page -%d has %d results %n ",pn,visibleresults.size());
			total = total+visibleresults.size();
			//Goto next page by clicking on page number link
			try 
			{
			
				pn++;
				driver.findElement(By.linkText(pn+"")).click();
				Thread.sleep(20000);
				
			}
			catch(Exception ex)
			{
				//Thread.sleep(5000);
				//no link with given page number ,because that is last page
				break ; //terminate from loop
			}	
		}
		System.out.println("total results count is "+total);
		//close site
		wsobj.closeSite(driver);

	}

}
