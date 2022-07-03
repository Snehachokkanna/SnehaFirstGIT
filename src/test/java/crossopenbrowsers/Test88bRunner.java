package crossopenbrowsers;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.remote.RemoteWebDriver;

public class Test88bRunner {

	public static void main(String[] args) throws Exception
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
		wsobj.launchSite(driver,"https://semantic-ui.com/modules/dropdown.html",5000);
		//Create an object to page class
		Test88pageForDivTagMultiSelectDropdown pobj = new Test88pageForDivTagMultiSelectDropdown(driver);
		pobj.openDropdown();
		pobj.selectItemByIndex(2);
		pobj.closeDropdown();
		Thread.sleep(5000);
		pobj.deselectItemByIndex(0); //1st one in selected list
		Thread.sleep(5000);
		pobj.openDropdown();
		pobj.selectItemsInRange(0,10); //1st item to 11th item
		pobj.closeDropdown();
		Thread.sleep(5000);
		List<String> snames =pobj.getAllSelectedItems();
		for(String name :snames)
		{
			pobj.deselectItemByName(name);
		}
		pobj.openDropdown();
		pobj.selectAll();
		pobj.closeDropdown();
		//close site
		wsobj.closeSite(driver);
	}

}
