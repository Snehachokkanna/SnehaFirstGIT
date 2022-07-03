package crossopenbrowsers;



import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class Test28SKvisibleandenabled 
{
	
	//Elements as properties
	private RemoteWebDriver driver;
	
	//visible and enabled element but covered by other element like banner
	@FindBy(name ="q")
	private WebElement e;
	
	public Test28SKvisibleandenabled (RemoteWebDriver driver)
	   {
		this.driver=driver;
		//for lazy initialization (with some delay if required) of elements in current page
		AjaxElementLocatorFactory afdriver =new AjaxElementLocatorFactory(driver,20);
		PageFactory.initElements(afdriver, this);	
		}

	public void fillElement(String data)
	{
	   e.sendKeys(data);
	 
	}
	
	
	public static void main(String[] args)  throws Exception
	{
		//create object to our utilities class and call methods
		WebSiteUtilities uobj = new WebSiteUtilities();
		RemoteWebDriver driver = uobj.openBrowser("chrome");
		uobj.launchSite(driver,"https://www.flipkart.com",5000);
		//create object to page classes and call methods
		Test28SKvisibleandenabled pobj = new Test28SKvisibleandenabled(driver);
		pobj.fillElement("electronics");
		Thread.sleep(5000);
		//close site
		uobj.closeSite(driver);
		
		
	}

}
