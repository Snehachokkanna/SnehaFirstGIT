package crossopenbrowsers;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.remote.RemoteWebDriver;

public class Test87bRunner {

	public static void main(String[] args) throws Exception
	{

		//Take browser name from keyboard
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter browser name");
		String bn =sc.nextLine();
		//Take details to select an item from keyboard
		System.out.println("Enter a item name");
		String name = sc.nextLine();
		System.out.println("Enter an index");
		int index =sc.nextInt();
		sc.close();
		//open browser
		WebSiteUtilities wsobj = new WebSiteUtilities();
		RemoteWebDriver driver = wsobj.openBrowser(bn); 
		//Launch Site
		wsobj.launchSite(driver,"https://semantic-ui.com/modules/dropdown.html",5000);
		//Create an object to page class
		Test87PageForDivTagSingleSelectDropdown pobj = new Test87PageForDivTagSingleSelectDropdown(driver);
		System.out.println(pobj.getDropdownItemsCount());
		System.out.println(pobj.getDropdownItemList());
		pobj.SelectItemByIndex(index);
		System.out.println(pobj.getSelectedItem());
		Thread.sleep(5000);
		pobj.SelectItemByName(name);

		String actual = pobj.getSelectedItem();
		if(name.equalsIgnoreCase(actual))
		{
			System.out.println("test passed");
		}
		else
		{
			System.out.println("test failed");
		}
		//close site
		wsobj.closeSite(driver);
		

	}

}
