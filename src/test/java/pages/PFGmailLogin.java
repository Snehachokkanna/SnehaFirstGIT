package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class PFGmailLogin {
	
	//elements as private properties
	
	private RemoteWebDriver driver;
	
	@FindBy(name = "password")
	private WebElement e1;
	
	@FindBy(xpath="//span[text()='Weiter']/parent::button")
	private WebElement e2;
	
	
	
	//constructor method
	public PFGmailLogin(RemoteWebDriver driver)
	{
		  this.driver=driver;
		  AjaxElementLocatorFactory afdriver =new AjaxElementLocatorFactory(driver,20);
		  PageFactory.initElements(afdriver, this);
	}
	//operational methods for operations and observations on elements
	
	public	void fillpwd(String value)
		{
			e1.sendKeys(value);
			
		}
	public void ClickNext()
	{
		e2.click();
	}

}
