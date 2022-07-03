package crossopenbrowsers;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class Test48Page 
{

	//Elements as properties
	private RemoteWebDriver driver;
	
	@FindBy(name="identifier")
	private WebElement userid;
	
	@FindBy(xpath = "//span[text()='Weiter']/parent::button")
	private WebElement useridnext;
	
	
	
	// 'Enter a email' in german
   
	//@FindBy(xpath="//div[starts-with(text(), 'Enter a Email')]") 
	@FindBy(xpath="//div[starts-with(text(), 'E-Mail-Adresse oder Telefonnummer eingeben')]") 
	private WebElement blankuiderr;
	
	
	//Couldn't find your Google Account or "text()= 'Enter a valid email or phone number
	//@FindBy (xpath="//div[text()=\"Couldn't find your Google Account\"or "
			//+"text()= 'Enter a valid email or phone number']")
	
	@FindBy(xpath = "//div[starts-with(text(),'Ihr Google-Konto wurde nicht gefunden') or starts-with(text(),'Gültige E-Mail-Adresse oder Telefonnummer eingeben')]")
	private WebElement invaliduiderr;
		
	@FindBy(name="password")
	private WebElement pwd;
	
	//constructor method
	
	public Test48Page(RemoteWebDriver driver)
	{
		this.driver=driver;
		AjaxElementLocatorFactory afdriver =new AjaxElementLocatorFactory(driver,20);
		PageFactory.initElements(afdriver, this);
	}
	
	//operational methods
	
	public void fillUserid(String value)
	{
		driver.manage().window().maximize();
		userid.sendKeys(value);
	}
	
	public void clickUserIdNext()
	{
		useridnext.click();
	}
	
	//Observations 
	
	public boolean verifyBlankuidError()
	{
		try
		{
			if(blankuiderr.isDisplayed())
			{
				return(true);
			}
			else
			{
				return(false);
			}
		}
		catch(Exception ex)
		{
			return(false);
		}
	}
	

	
	public boolean verifyInvaliduidError()
	{
		try
		{
			if(invaliduiderr.isDisplayed())
			{
				return(true);
			}
			else
			{
				return(false);
			}
		}
		catch(Exception ex)
		{
			return(false);
		}
	}
	
	public boolean verifyPasswordDisplayed()
	{
		try
		{
			if(pwd.isDisplayed())
			{
				return(true);
			}
			else
			{
				return(false);
			}
		}
		catch(Exception ex)
		{
			return(false);
		}
	}

}


