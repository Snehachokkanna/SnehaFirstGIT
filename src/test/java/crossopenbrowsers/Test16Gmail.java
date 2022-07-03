package crossopenbrowsers;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.Scanner;
import org.openqa.selenium.remote.RemoteWebDriver;


public class Test16Gmail {

	public static void main(String[] args) throws Exception {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter browser name");
		String bn = sc.nextLine();
		System.out.println("Enter Userid");
		String uid = sc.nextLine();
		System.out.println("Enter Password");
		String pwd = sc.nextLine();
		System.out.println("Enter to address");
		String t = sc.nextLine();
		System.out.println("Enter Subject");
		String s = sc.nextLine();
		System.out.println("Enter body");
		String  b = sc.nextLine();
		System.out.println("Enter file path to attach");
		String fp = sc.nextLine();
		WebSiteUtilities obj = new WebSiteUtilities();
		RemoteWebDriver driver = obj.openBrowser("chrome"); 
		obj.launchSite(driver,"https://www.gmail.com/",3000);
		driver.findElement(By.name("identifier")).sendKeys(uid);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Weiter']/parent::button")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("password")).sendKeys(pwd);
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Weiter']/parent::button")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@role='button'][@gh='cm']")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("to")).sendKeys(t);
		driver.findElement(By.name("subjectbox")).sendKeys(s);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@g_editable='true'][@role='textbox']")).sendKeys(b);
		Thread.sleep(2000);
		driver.findElement(By.name("Filedata")).sendKeys(fp);
		driver.findElement(By.xpath("//div[text()='Send']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[starts-with(@aria-label,'Google Account:')]/img")).click();
		Thread.sleep(5000);
		obj.closeSite(driver);
		
		driver.close();
		
		// TODO Auto-generated method stub

	}

}