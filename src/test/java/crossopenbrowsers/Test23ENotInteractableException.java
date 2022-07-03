package crossopenbrowsers;




import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class Test23ENotInteractableException 
{

	//Elements as properties
	private RemoteWebDriver driver;
		
	//Hidden Element	
	@FindBy(name="hiddenPassword")
	WebElement e;
		
	//constructor method 
	public Test23ENotInteractableException(RemoteWebDriver driver)
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
		uobj.launchSite(driver, "http://www.gmail.com",5000);
		//create object to page classes and call methods
		Test23ENotInteractableException pobj = new Test23ENotInteractableException(driver);
		pobj.clickElement();//"ElementNotInteractableException" exception will be raised
		Thread.sleep(5000);
		//close site
		uobj.closeSite(driver);
	}
		

}
