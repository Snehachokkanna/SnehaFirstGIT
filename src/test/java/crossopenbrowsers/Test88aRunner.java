package crossopenbrowsers;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.remote.RemoteWebDriver;

public class Test88aRunner {

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
		System.out.println(pobj.getDropdownItemsCount());
		List<String> names =pobj.getDropdownItemsList();
		Thread.sleep(5000);
		//Test items selection one by one using items name
		for(String name : names)
		{
			pobj.openDropdown();
			pobj.selectItemByName(name);
			String actual = pobj.getFirstSelectedItem();
			if(name.equalsIgnoreCase(actual))
			{
				System.out.println(name+"selection test passed");
			}
			else
			{
				System.out.println(name+"selection test failed");
			}
			pobj.deselectItemByName(name);
			pobj.closeDropdown();
		}
		//multiple items selection testing
		pobj.openDropdown();
		for(String name:names)
		{
			pobj.selectItemByName(name);
			String actual = pobj.getLastSelectedItem();
			if(name.equalsIgnoreCase(actual))
			{
				System.out.println(name+"selection test passed");
			}
			else
			{
				System.out.println(name+"selection test failed");
			}

		}
		pobj.closeDropdown();
		pobj.deselectAll();
		if(pobj.getAllSelectedItems().size()==0)
		{
			System.out.println("Deselection all test passed");
		}
		else
		{
			System.out.println("Deselection all test failed");
		}
		//close site
		wsobj.closeSite(driver);

	}

}
