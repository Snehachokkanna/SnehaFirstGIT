package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

public class GmailLogout {
	
	private RemoteWebDriver driver;
	private By b1;
	private By b2;
	
	public GmailLogout(RemoteWebDriver driver)
	{
		this.driver=driver;
	     b1=By.xpath("//a[starts-with(@aria-label,'Google Account:')]/img");
	     b2=By.linkText("Sign out");
	     
	}
	
	//operational methods for operations and Observations on Elements
	public void clickProfilePic()
	{
		driver.findElement(b1).click();
		
	}
	public void clickSignOut()
	{
		driver.findElement(b2).click();
	}

}
