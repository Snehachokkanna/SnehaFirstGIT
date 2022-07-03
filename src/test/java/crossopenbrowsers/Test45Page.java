package crossopenbrowsers;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Test45Page 
{
	//Elements as properties
	private RemoteWebDriver driver;
		
	@FindBy(how=How.XPATH,using="//button[text()='Forgot email?']")
	private WebElement e;
	public  Test45Page(RemoteWebDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	public boolean VerifyColor(String expected)
	{
		driver.manage().window().maximize();
		String actual = e.getCssValue("color");
		//if no attribute (or) no value to attribute (or) spelling mistake in attribute name
		//then getCssValue method return "null" . so ,we used try - catch block
		try
		{
			if(actual.equals(expected))
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
			System.out.println(ex.getMessage());
			return(false);
		}
	}
}
