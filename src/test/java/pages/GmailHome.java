package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

public class GmailHome {
	
	//Locator of elements as private properties
	
	private RemoteWebDriver driver;
	private By b1;
	private By b2;
	
	//constructor method
	public GmailHome(RemoteWebDriver driver)
	{
		this.driver=driver;
	     b1=By.name("identifier");
	     b2=By.xpath("//span[text()='Weiter']/parent::button");
	}
	//operational methods for operations and observations on elements
	
	public	void fillUid(String value)
		{
			driver.findElement(b1).sendKeys(value);
			
		}
	public void ClickNext()
	{
		driver.findElement(b2).click();
	}

}
