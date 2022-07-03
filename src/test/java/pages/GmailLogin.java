package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

public class GmailLogin {
	
	//Locator of elements as private properties
	
		private RemoteWebDriver driver;
		private By b1;
		private By b2;
		
		//constructor method
		public GmailLogin(RemoteWebDriver driver)
		{
			this.driver=driver;
		     b1=By.name("password");
		     b2=By.xpath("//span[text()='Weiter']/parent::button");
		}
		//operational methods for operations and observations on elements
		
		public	void fillpwd(String value)
			{
				driver.findElement(b1).sendKeys(value);
				
			}
		public void ClickNext()
		{
			driver.findElement(b2).click();
		}

		

}
