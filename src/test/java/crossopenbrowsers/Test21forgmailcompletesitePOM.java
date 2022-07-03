package crossopenbrowsers;

import java.util.Scanner;

import org.openqa.selenium.remote.RemoteWebDriver;

import pages.GmailCompose;
import pages.GmailHome;
import pages.GmailLogin;
import pages.GmailLogout;
import sun.misc.GC;

public class Test21forgmailcompletesitePOM {

	public static void main(String[] args) throws Exception
	{
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a browser name");
		String bn = sc.nextLine();
		System.out.println("Enter Userid");
		String uid = sc.nextLine();
		System.out.println("Enter Password");
		String pwd = sc.nextLine();
		System.out.println("Enter \"To\" address");
		String t = sc.nextLine();
		System.out.println("Enter Subject");
		String s = sc.nextLine();
		System.out.println("Enter body");
		String  b = sc.nextLine();
		System.out.println("Enter file path to attachment");
		String fp = sc.nextLine();
		sc.close();
		WebSiteUtilities uobj = new WebSiteUtilities();
		RemoteWebDriver driver = uobj.openBrowser("chrome");
		uobj.launchSite(driver, "http://www.gmail.com",5000);
		//create object to page classes and call methods
		GmailHome gh = new GmailHome(driver); 
		GmailLogin gl = new GmailLogin(driver);
		GmailCompose gc = new GmailCompose(driver);
		GmailLogout gLog =new GmailLogout(driver);
		gh.fillUid(uid);
		gh.ClickNext();
		Thread.sleep(4000);
		gl.fillpwd(pwd);
		gl.ClickNext();
		Thread.sleep(4000);
		gc.clickCompose();
		Thread.sleep(5000);
		gc.fillTo(t);
		gc.fillSubject(s);
		gc.fillBody("Hi\n"+b+"\nbye");
		gc.fillAttachement(fp);
		Thread.sleep(4000);
		gc.clickSend();
		Thread.sleep(5000);
		gLog.clickProfilePic();
		Thread.sleep(5000);
		gLog.clickSignOut();
		Thread.sleep(5000);
		uobj.closeSite(driver);
		

	}

}
