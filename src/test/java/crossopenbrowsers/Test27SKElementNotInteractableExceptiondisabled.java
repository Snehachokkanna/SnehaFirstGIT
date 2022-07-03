package crossopenbrowsers;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class Test27SKElementNotInteractableExceptiondisabled 
{
	//Elements as properties
	
	private RemoteWebDriver driver;
	
	//Visible element,but disabled
	@FindBy(name = "lname")
	private WebElement e;
	
	public Test27SKElementNotInteractableExceptiondisabled (RemoteWebDriver driver)
	{
		this.driver=driver;
		//for lazy initialization (with some delay if required) of elements in current page
		AjaxElementLocatorFactory afdriver =new AjaxElementLocatorFactory(driver,20);
		PageFactory.initElements(afdriver, this);	
		}
	   //Operational methods
		public void fillElement(String data)
		{
			driver.switchTo().frame("iframeResult");
		    e.sendKeys(data);
		}
		
		//Runner method

	public static void main(String[] args) throws Exception 
	{
		//create object to our utilities class and call methods
		WebSiteUtilities uobj = new WebSiteUtilities();
		RemoteWebDriver driver = uobj.openBrowser("chrome");
		uobj.launchSite(driver,"https://www.w3schools.com/tags/tryit.asp?filename="
				+"tryhtml_input_disabled",5000);
		
		//create object to page classes and call methods
		Test27SKElementNotInteractableExceptiondisabled pobj = new Test27SKElementNotInteractableExceptiondisabled(driver);
		pobj.fillElement("abdul kalam"); //"ElementNotInteractableException " exception will be raised
		Thread.sleep(5000);
		//close site
		uobj.closeSite(driver);

	}

}
