package crossopenbrowsers;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Test47Page
{
	//Elements as properties
	private RemoteWebDriver driver;
	
	@FindBy(how = How.XPATH,using="//img[@alt='Mountains']")
	private WebElement e;
	
	//constructor method
	public Test47Page(RemoteWebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	//operational methods
	public void moveMouse()
	{
		driver.manage().window().maximize();
		driver.switchTo().frame("iframeResult");
		Actions act =new Actions(driver);
		act.moveToElement(e).perform();
	}
	
	public boolean verifyOpacity()
	{
		String temp =e.getCssValue("opacity");
		//if no attribute (or) no value to attribute (or) spelling mistake in attribute name
		//then getCssValue method return "null" . so ,we used try - catch block
		try
		{
			int actual = Integer.parseInt(temp);
			if(actual==1)
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
