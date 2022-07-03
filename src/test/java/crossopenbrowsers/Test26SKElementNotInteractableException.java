package crossopenbrowsers;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class Test26SKElementNotInteractableException 
{

		//Elements as properties
		private RemoteWebDriver driver;
		
		//Hidden Element
		@FindBy(name = "hiddenPassword")
		private WebElement e ;
		
		//Constructor method
		public  Test26SKElementNotInteractableException(RemoteWebDriver driver)
		{
		this.driver=driver;
		//for lazy initialization (with some delay if required) of elements in current page
		AjaxElementLocatorFactory afdriver =new AjaxElementLocatorFactory(driver,20);
		PageFactory.initElements(afdriver, this);	
		}
	   //Operational methods
		public void fillElement(String data)
		{
		  e.sendKeys(data);
		}
		
		//Runner method
		public static void main(String []args) throws Exception
		{
		//Create object to our utilities class and call methods
		WebSiteUtilities uobj = new WebSiteUtilities();
		RemoteWebDriver driver = uobj.openBrowser("chrome");
		uobj.launchSite(driver,"https://www.gmail.com",5000);
		//create object to page classes and call methods
		Test26SKElementNotInteractableException pobj = new Test26SKElementNotInteractableException(driver);
		pobj.fillElement("abdul kalam"); //"ElementNotInteractableException " exception will be raised
		Thread.sleep(5000);
		//close site
		uobj.closeSite(driver);
	}
		

}
