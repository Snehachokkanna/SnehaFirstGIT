package crossopenbrowsers;

import java.util.List;
import java.util.Scanner;

import org.bouncycastle.cms.PKCS7ProcessableObject;
import org.openqa.selenium.remote.RemoteWebDriver;



public class Test87aRunner {

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
		Test87PageForDivTagSingleSelectDropdown pobj = new Test87PageForDivTagSingleSelectDropdown(driver);
		System.out.println(pobj.getDropdownItemsCount());
		List<String> names = pobj.getDropdownItemList();
		Thread.sleep(5000);
		
		//Test Items selection using items name
		for(String name :names)
		{
			pobj.SelectItemByName(name);
			String actual = pobj.getSelectedItem();
			if(name.equalsIgnoreCase(name))
			{
				System.out.println(name+"Selection test passed");
			}
			else
			{
				System.out.println(name+"Selection test failed");
			}
		}
		//Test items selection using item index
		for(int i=0;i<names.size();i++)
		{
			pobj.SelectItemByIndex(i);
			String actual = pobj.getSelectedItem();
			if(names.get(i).equalsIgnoreCase(actual))
			{
				System.out.println(names.get(i)+"Selection test passed");
			}
			else
			{
				System.out.println(names.get(i)+"Selection test failed");
			}
		}
		//close site
		wsobj.closeSite(driver);
	}

}
