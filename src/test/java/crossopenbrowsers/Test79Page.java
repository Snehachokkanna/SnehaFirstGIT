package crossopenbrowsers;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class Test79Page {
 
	//elements as private properties
	private RemoteWebDriver driver;
	
	@FindBy(id="datepicker")
	private WebElement datepicker;
	
	@FindBy(xpath="//a[@title='Prev']") 
	private WebElement previous; 
	
	@FindBy(xpath="//a[@title='Next']")
	private WebElement next;

	@FindBy (className="ui-datepicker-month") 
	private WebElement currentmonth;

	@FindBy (className="ui-datepicker-year")
	private WebElement currentyear;

	@FindBys({
	@FindBy (xpath="//table[@class='ui-datepicker-calendar']/tbody//a")
	})
	private List<WebElement> daylinks;
	
	//constructor method
	public Test79Page(RemoteWebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	//operational methods
	public void openCalendar()
	{
		driver.switchTo().frame(0);
		datepicker.click();
	}
	
	public void selectDate(int year ,String month,int day)throws Exception
	{
		//year matching
		while(true) //infinite loop
		{
			String temp1 = currentyear.getText();
			int cy =Integer.parseInt(temp1);
			if(year<cy) // Expected year belongs to past (year : expected year)
			{
				previous.click();
				Thread.sleep(1000);
			}
			else if(year>cy) //expected year belongs to future
			{
				next.click();
				Thread.sleep(1000);
			}
			else //reach the target year ,(after expected year matched ,go to january)
			{
				 //month matching
				//month(come to January)
				while(true)
				{
					String cm = currentmonth.getText();
					if(!cm.equalsIgnoreCase("january"))
					{
						previous.click();
						Thread.sleep(1000);
					}
					else
					{
						break;
					}
					
				}
				//month (come to target month from january)
				while(true)
				{
					String cm = currentmonth.getText();
					if(!cm.equalsIgnoreCase(month))
					{
						next.click();
						Thread.sleep(1000);
						
					}
					else
					{
						break;
					}
				}
				break; //infinite loop break (coming out from year and month)
			}
		}	
				//day selection
				for(WebElement daylink:daylinks)
				{
					String temp = daylink.getText();
					int cd = Integer.parseInt(temp);
					if(cd==day)
					{
						daylink.click();
						Thread.sleep(1000);
						break;
					}
				}
		}
	}
	


	


