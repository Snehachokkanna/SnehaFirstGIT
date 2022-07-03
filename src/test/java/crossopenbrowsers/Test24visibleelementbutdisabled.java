package crossopenbrowsers;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class Test24visibleelementbutdisabled {
	
	//Elements as properties
		private RemoteWebDriver driver;
			
		//Visible element,but disabled
		@FindBy(name="lname")
		WebElement e;
			
		//constructor method 
		public Test24visibleelementbutdisabled(RemoteWebDriver driver)
		{
			this.driver=driver;
			//for lazy initialization (with some delay if required) of elements in current page
			AjaxElementLocatorFactory afdriver =new AjaxElementLocatorFactory(driver,20);
			PageFactory.initElements(afdriver, this);

		}
		//operational methods
		public void clickElement()
		{
			driver.switchTo().frame("iframeResult");
			e.click();
		}
		
		//Runner method
		public static void main(String []args) throws Exception
		{
			WebSiteUtilities uobj = new WebSiteUtilities();
			RemoteWebDriver driver = uobj.openBrowser("chrome");
			uobj.launchSite(driver, "https://www.w3schools.com/tags/tryit.asp?filename="
					+"tryhtml_input_disabled",5000);
			//create object to page classes and call methods
			Test24visibleelementbutdisabled pobj = new Test24visibleelementbutdisabled(driver);
			pobj.clickElement(); //"no reaction"
			Thread.sleep(5000);
			//close site
			uobj.closeSite(driver);
		}
			

	}


