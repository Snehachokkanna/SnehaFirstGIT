package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class PFGmailLogout 
{
	
	//elements as private properties
	
	private RemoteWebDriver driver;
	
	@FindBy(xpath="//a[starts-with(@aria-label,'Google Account:')]/img")
	private WebElement e1;
	
	@FindBy(linkText ="Sign out")
	private WebElement e2;
	
	
	 public PFGmailLogout(RemoteWebDriver driver) 
	
	{
		  this.driver=driver;
		  AjaxElementLocatorFactory afdriver =new AjaxElementLocatorFactory(driver,20);
		  PageFactory.initElements(afdriver, this);
	}
	
	
	
	
	public void clickProfilePic()
	{
		e1.click();
		
	}
	public void clickSignOut()
	{
		e2.click();
	}
	
	
	
	
	
	
	
	
	
	

}
