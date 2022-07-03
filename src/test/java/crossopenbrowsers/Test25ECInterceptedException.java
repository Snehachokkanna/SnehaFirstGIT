package crossopenbrowsers;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class Test25ECInterceptedException 
{
	//Elements as properties
	private RemoteWebDriver driver;
					
	//Visible and enabled element but covered by other element like banner
	@FindBy(linkText ="1")
	WebElement e;
					
	//constructor method 
	public Test25ECInterceptedException(RemoteWebDriver driver)
	{
		this.driver=driver;
		//for lazy initialization (with some delay if required) of elements in current page
		AjaxElementLocatorFactory afdriver =new AjaxElementLocatorFactory(driver,20);
		PageFactory.initElements(afdriver, this);
	}
	//operational methods
	public void clickElement()
	{
		
		e.click();
	}
				
	//Runner method
	public static void main(String []args) throws Exception
	{
		WebSiteUtilities uobj = new WebSiteUtilities();
		RemoteWebDriver driver = uobj.openBrowser("chrome");
		uobj.launchSite(driver,"http://demos.telerik.com/aspnet-ajax/ajaxloadingpanel"
				+"/functionality/explicit-show-hide/defaultcs.aspx",5000);
		//create object to page classes and call methods
		Test25ECInterceptedException pobj = new Test25ECInterceptedException(driver);
		pobj.clickElement(); //"ElementClickInterceptedException" exception is raised
		Thread.sleep(5000);
		//close site
		uobj.closeSite(driver);			
	}		
	}



