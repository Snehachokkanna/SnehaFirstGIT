package crossopenbrowsers;

import java.util.Scanner;
import java.util.concurrent.CountDownLatch;

import org.openqa.selenium.remote.RemoteWebDriver;

public class Test84Runnergmail {

	public static void main(String[] args) throws Exception 
	{
		// Get expected data from keyboard
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter browser name");
		String bn=sc.nextLine();
		System.out.println("Enter User id");
		String u=sc.nextLine();
		System.out.println("Enter Password");
		String p =sc.nextLine();
		sc.close();
		//open Browser
		WebSiteUtilities wsobj =new WebSiteUtilities();
		RemoteWebDriver driver = wsobj.openBrowser(bn);
		//Launch site
		wsobj.launchSite(driver, "https://www.gmail.com",5000);
		//Login to site
		Test83Page pobj = new Test83Page(driver);
		pobj.fillUid(u);
		pobj.clickUidNext();
		Thread.sleep(5000);
		pobj.fillPwd(p);
		pobj.clickPwdNext();
		Thread.sleep(5000);
		//Get Count of all mails
		System.out.println("count of allmails "+pobj.getCountofAllmails());
		System.out.println("count of readmails "+pobj.getCountofReadMails());
		System.out.println("count of unreadmails "+pobj.getCountofUnreadmails());
		System.out.println("count of attachement mails "+ pobj.getCountofMailswithAttachments());
		System.out.println("count of mails from specific mailid "+pobj.getCountofMailsFromId("no-reply@accounts.google.com"));
		System.out.println("count of mails from specific date "+pobj.getCountofmailsOnDate(2021, "august", 12));
		Thread.sleep(5000);
		//do logout
		pobj.clickProfilePic();
		Thread.sleep(5000);
		pobj.clickSignOut();
		Thread.sleep(5000);
		//close site
		wsobj.closeSite(driver);
		

	}

}
