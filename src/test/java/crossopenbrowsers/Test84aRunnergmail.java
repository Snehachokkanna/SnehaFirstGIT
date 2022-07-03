package crossopenbrowsers;

import java.util.Scanner;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.sun.org.apache.xalan.internal.xsltc.compiler.sym;

public class Test84aRunnergmail {

	public static void main(String[] args)  throws Exception
	
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
				//Get count of all mails 
				int amcbd = pobj.getCountofAllmails();
				int dmc =pobj.deleteMailFromId("no-reply@accounts.google.com");
				int amcad =pobj.getCountofAllmails();
				if(amcbd==amcad+dmc)
				{
					System.out.println("test passed");
				}
				else
				{
					
					System.out.println("test failed");
				}
				//do logout
				pobj.clickProfilePic();
				Thread.sleep(5000);
				pobj.clickSignOut();
				Thread.sleep(5000);
				//close site
				wsobj.closeSite(driver);

	}

}
