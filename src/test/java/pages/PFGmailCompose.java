package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class PFGmailCompose 
{
	//elements as private properties
	
	private RemoteWebDriver driver;

	
	
	@FindBy(xpath="//div[text()='Compose']")
	private WebElement e1;
	
	
	@FindBy(name="to")
    private WebElement e2;
    
    @FindBy(name="subjectbox")
    private WebElement e3;
    
    @FindBy(xpath="//div[@aria-label='Message Body']")
    private WebElement e4;
    
    @FindBy(name="Filedata")
    private WebElement e5;
    
    @FindBy(xpath="//div[text()='Send']")
    private WebElement e6;

     public PFGmailCompose(RemoteWebDriver driver) 
	
	{
		  this.driver=driver;
		  AjaxElementLocatorFactory afdriver =new AjaxElementLocatorFactory(driver,20);
		  PageFactory.initElements(afdriver, this);
	}
     
     public void clickCompose()
 	{
 		e1.click();
 	}
 	public void fillTo(String value)
 	{
 	   e2.sendKeys(value);
 	}
 	public void fillSubject(String value)
 	{
 		e3.sendKeys(value);
 	}
 	public void fillBody (String value)
 	{
 		e4.sendKeys(value);
 	}
 	public void fillAttachement(String filepath)
 	{
 		e5.sendKeys(filepath);
 	}
 	public void clickSend()
 	
 	{
 		e6.click();
 	}
 
	
}
