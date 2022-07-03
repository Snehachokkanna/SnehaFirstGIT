package crossopenbrowsers;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class Test49Page 
{
	//Elements as properties
	private RemoteWebDriver driver;
	
	@FindBy(name="email")
	private WebElement userid;
	
	@FindBy(name="pass")
	private WebElement pwd;
	
	@FindBy(name="login")
	private WebElement login;
	
	
	//@FindBy (xpath="//div[contains (text(), \"The email address or mobile number you entered isn't connected\")]")
	@FindBy(xpath ="//div[contains(text(),'Die eingegebenen E-Mail-Adresse oder Handynummer ist mit keinem Konto verknüpft.')]")
	private WebElement blankuiderr;
	
	//@FindBy (xpath="//div[contains (text(),\"The email address you entered isn't connected\")]") 
	@FindBy(xpath ="//div[contains(text(),'Die eingegebenen E-Mail-Adresse')]")
	private WebElement invaliduiderr;
	
	//@FindBy(linkText="Not you?")
	@FindBy(linkText = "Das bist du nicht?")
	private WebElement blankorinvalidpwderr;
	
	@FindBy(xpath="//div[@aria-label='Konto']/img") //Konto=account
	private WebElement profilepic;
	
	
	//@FindBy(xpath="//span[text()='Log Out']")
	@FindBy(xpath="//span[text()='Abmelden']")
	private WebElement logout;
	
	 public Test49Page(RemoteWebDriver driver) 
		
		{
			  this.driver=driver;
			  AjaxElementLocatorFactory afdriver=new AjaxElementLocatorFactory(driver,20);
			PageFactory.initElements(afdriver, this);
		}
		
		//operational methods to operate elements and observe elements
		public void fillUserid(String value)
		{
			driver.manage().window().maximize();
			userid.sendKeys(value);
		}
		public void fillPassword(String value)
		{
			pwd.sendKeys(value);
		}
		public void clickLogin()
		{
			login.click();
		}
		
		//Observations methods
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
		
		public boolean verifyBlankorInvalidpwdError()
		{
			try
			{
				if(blankorinvalidpwderr.isDisplayed())
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
		public boolean VerifyLogoutIsDisplayed()
		{
			try
			{
				profilepic.click();
				Thread.sleep(5000);
				if(logout.isDisplayed())
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
	
