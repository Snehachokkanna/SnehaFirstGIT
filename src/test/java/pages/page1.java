package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.remote.RemoteWebDriver;

public class page1 
{
	
		private RemoteWebDriver driver;
		private By b1;
		private By b2;
		
		//define locators in public constructor method
		
	public page1(RemoteWebDriver driver)
	{
		this.driver = driver;
		b1 = By.name("q");
		b2= By.xpath("(//input[@aria-label='Google Search'])[2]");	
	}
	
	
	
	//public operational methods for operations and observations on elements
	public void fillSearchBox(String word) throws Exception
	{
		driver.findElement(b1).sendKeys(word);
		Thread.sleep(3000);
		driver.findElement(b1).sendKeys(Keys.ESCAPE);
	}
	
	public void clickSearch()
	{
		driver.findElement(b2).click();
	}
	
	public boolean titleValidation(String word)
	{
		if(driver.getTitle().startsWith(word))
		{
			return(true);
		}
		else
		{
			return (false);
		}
	}

}
