package crossopenbrowsers;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.sun.corba.se.spi.orbutil.fsm.Action;
import com.sun.corba.se.spi.orbutil.fsm.FSM;
import com.sun.corba.se.spi.orbutil.fsm.Input;

public class Test46Page 
{
	//elements as properties
	
	private RemoteWebDriver driver;
	
	@FindBy(how=How.LINK_TEXT,using="Images")
	WebElement e;
	
	//Constructor method
	public Test46Page(RemoteWebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	//operational methods
	public void moveMouse()
	{
		driver.manage().window().maximize();
		Actions act = new Actions(driver);
		act.moveToElement(e).perform();				
	}
	public boolean verifyUnderlined()
	{
		String actual =e.getCssValue("text-decoration");
		//if no attribute (or) no value to attribute (or) spelling mistake in attribute name
		//then getCssValue method return "null" . so ,we used try - catch block
		try
		{
			if(actual.contains("underline"))
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
