package pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocator;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class PFGmailHome 
{
	//elements as private properties
	
	private RemoteWebDriver driver;
	
	
	/*private RemoteWebDriver driver;
	private By b1;
	private By b2;
	
	//constructor method
	public GmailHome(RemoteWebDriver driver)
	{
		this.driver=driver;
	     b1=By.name("identifier");
	     b2=By.xpath("//span[text()='Weiter']/parent::button");
	}
	//operational methods for operations and observations on elements
	
	public	void fillUid(String value)
		{
			driver.findElement(b1).sendKeys(value);
			
		} */
	
	@FindBy(name="identifier") //userid
	private WebElement e1;
	
	@FindBy(xpath="//span[text()='Weiter']/parent::button")
	private WebElement e2;
	
	
	
	//constructor method
	public PFGmailHome(RemoteWebDriver driver)
	{
	  this.driver=driver;
	  AjaxElementLocatorFactory afdriver =new AjaxElementLocatorFactory(driver,20);
	  PageFactory.initElements(afdriver, this); //it will take care of driver.findelement it will intialize all the pages
	}
	
	//operational methods for operations and observations on elements
	
	public	void fillUid(String value)
	{
			e1.sendKeys(value);	
	}
	public void ClickNext()
	{
		e2.click();
	}

}
