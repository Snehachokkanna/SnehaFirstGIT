package crossopenbrowsers;

import java.sql.Driver;
import java.util.NoSuchElementException;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.remote.RemoteWebDriver;



public class Test77 {

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
		//Pagination on results page
		int pn =1 ; //we are in first page of results
		int flag = 0;
		while(true)//infinite loop for pagination
		{
			//Get page title and Test
			String t =driver.getTitle();
			if(!t.contains(word))
			{
				flag =1;
				break; //terminate from loop
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
				break;
			}
		}
		if(flag==0)
		{
			System.out.println("Title test passed");
		}
		else
		{
			System.out.println("Title test failed");
		}

	
	//close site
	driver.close();
}
}
