package crossopenbrowsers;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;


public class Test44Page 
{
	//Elements as properties
	private RemoteWebDriver driver;
	
	@FindBy(how=How.NAME,using="q")
	private WebElement e;
	
	//Constructor method
	public Test44Page(RemoteWebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	//Operational Methods
	public boolean verifyMaxLength(int expected)
	{
		driver.manage().window().maximize();
		String temp = e.getAttribute("maxlength");
		//if no attribute (or) no value to attribute (or) spelling mistake in attribute name
		//then getAttribute() method return "null" . so ,we used try - catch block
		
		try 
		{
			int actual=Integer.parseInt(temp); //convert "String" value to "int" value
			
			if(actual==expected)
			{
				return(true);
			}
			else
			{
				return (false);
			}
		}
			catch(Exception ex)
			{
				//System.out.println(ex.getMessage());
				return(false);
			}
		}
	}



