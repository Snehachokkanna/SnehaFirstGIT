package crossopenbrowsers;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class Dummypage

{
	private RemoteWebDriver driver;
	
	@FindBy(name ="q")
	private WebElement e;
	
	
	public Dummypage(RemoteWebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	public void fillField(String x)
	{
		e.sendKeys(x,Keys.ENTER);
	}

}
