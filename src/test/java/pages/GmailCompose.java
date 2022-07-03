package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

public class GmailCompose {
	
	private RemoteWebDriver driver;
	private By b1;
	private By b2;
	private By b3;
	private By b4;
	private By b5;
	private By b6;
	
	 public GmailCompose(RemoteWebDriver driver) 
	
	{
		this.driver=driver;
		b1=By.xpath("//div[text()='Compose']");
		b2=By.name("to");
		b3=By.name("subjectbox");
		b4=By.xpath("//div[@aria-label='Message Body']");
		b5=By.name("Filedata");
		b6=By.xpath("//div[text()='Send']");
		
		}
	//operational methods for operations and observations on elements
	public void clickCompose()
	{
		driver.findElement(b1).click();
	}
	public void fillTo(String value)
	{
		driver.findElement(b2).sendKeys(value);
	}
	public void fillSubject(String value)
	{
		driver.findElement(b3).sendKeys(value);
	}
	public void fillBody (String value)
	{
		driver.findElement(b4).sendKeys(value);
	}
	public void fillAttachement(String filepath)
	{
		driver.findElement(b5).sendKeys(filepath);
	}
	public void clickSend()
	
	{
		driver.findElement(b6).click();
	}
}
