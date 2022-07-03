package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GooglePage 
{
	//properties
	public RemoteWebDriver driver;
	
	//Static Page (DOM cant change) element without @cacheLookup
	
	@FindBy(linkText = "Gmail")
	private WebElement mylink1;
	
	//static page (DOM can't change )element with @cacheLookup
	
	@FindBy(linkText = "Gmail")
	@CacheLookup
	private WebElement mylink2;
	
	//constructor method
	public GooglePage(RemoteWebDriver driver)
	{
		this.driver= driver;
		PageFactory.initElements(driver,this);
	}
	//Operational method
	public String getElement1Text()
	{
		return(mylink1.getText());
	}
	
	public String getElement2Text()
	{
		return(mylink2.getText());
	}
		
}
