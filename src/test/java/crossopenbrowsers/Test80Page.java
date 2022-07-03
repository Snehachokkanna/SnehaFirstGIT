package crossopenbrowsers;

import java.sql.Driver;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import net.bytebuddy.asm.Advice.OffsetMapping.ForOrigin.Renderer.ForReturnTypeName;
import net.bytebuddy.description.ModifierReviewable.OfAbstraction;

public class Test80Page {

	//elements as private properties private RemoteWebDriver driver;
	
	private RemoteWebDriver driver;

	@FindBy(xpath="//div[@data-testid='one-way-radio-button']")
	private WebElement oneway;


	@FindBy(xpath="//div[@data-testid='round-trip-radio-button']")
	private WebElement roundtrip;


	 @FindBy(xpath="//div[@data-testid='to-testID-origin']//input") 
	 private WebElement fromcity;


	@FindBy(xpath="//div[@data-testid='to-testID-destination']//input")
	private WebElement tocity;

	@FindBy (xpath="//div[contains(@data-testid,'departure')]")
	private WebElement dateofdeparture;
	

	@FindBys({
			@FindBy(xpath="//div[contains(@data-testid,'undefined-month')]") 
			})
	private List<WebElement> monthsblocks;
	
	@FindBy(xpath="//div[contains(@data-testid,'return')]") 
	private WebElement dateofreturn;

	@FindBy(xpath="//div[@data-testid='undefined-calendar-picker']/div[1]")
	private WebElement next;

	@FindBy(xpath="//div[@data-testid='home-page-flight-cta']") 
	private WebElement submit;

	@FindBys({ 	
		@FindBy(xpath="(//div[contains(@data-testid,'spicemax-child')])[1]/following::div[1]/div")
	})
	private List <WebElement> depatureflightslist;
	
	@FindBys({ 	
		@FindBy(xpath="(//div[contains(@data-testid,'spicemax-child')])[2]/following::div[1]/div")
			})
	private List <WebElement> returnflightslist;
	
	//constuctor method
	public Test80Page(RemoteWebDriver driver)
	{
		
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	public void selectoneway()
	{
		oneway.click();
	}
	public void selectRoundTrip()
	{
		roundtrip.click();
	}
	public void setFromcity(String city)
	{
		fromcity.clear();
		fromcity.sendKeys(city);
	}
	public void setTocity(String city)
	{
		tocity.clear();
		tocity.sendKeys(city);
	}
	public void selectDate(int year,String monthname,int day)throws Exception
	{
		//matching the month &year
		for(WebElement monthblock : monthsblocks)
		{
			String temp=monthblock.getAttribute("data-testid");
			temp=temp.toLowerCase();
			monthname=monthname.toLowerCase();
			if(temp.contains(monthname)&&temp.contains(""+year))
			{
				while(true)
				{
					if(monthblock.isDisplayed())
					{
						
					monthblock.findElement(By.xpath(
							"descendant::div[@data-testid='undefined-calendar-day-"+day+"']")).click();	
					Thread.sleep(5000);
						break;
					}
					else
					{
						next.click();
						Thread.sleep(2000);
					}
				}
				break; //terminate from for each loop
			}
		}
	}
	public void setDateofDepature(int year,String monthname,int day) throws Exception
	{
		selectDate(year,monthname,day);
	}
	public void setDateofReturn(int year,String monthname,int day) throws Exception
	{
		dateofreturn.click(); //to close depature date calendar
		Thread.sleep(5000);
		dateofreturn.click(); //to open return date calendar
		Thread.sleep(5000);
		selectDate(year,monthname,day);
	}
	public void clickSearch()
	{
		submit.click(); //click on search
	}
	public int getCountofDepatureFlights()
	{
		return(depatureflightslist.size()); //count of depatureflights list
	}
	public int getCountofReturnFlights()
	{
		return(returnflightslist.size());
	}
	public int getDepatureFlightFare(int index)
	{
		/*WebElement e = depatureflightslist.get(index).findElement(By.xpath(
				"descendant::div[@data-testid='spicesaver-flight-select-radio-button-1']"
				+"/following-sibiling::div"));*/
		WebElement e = depatureflightslist.get(index).findElement(By.xpath("descendant::div[@data-testid='spicesaver-flight-select-radio-button-1']/following-sibling::div"));
		//div[@data-testid='spicesaver-flight-select-radio-button-1']/following-sibling::div
		String temp = (String)driver.executeScript("return(arguments[0].childNodes[1].textContent);",e);
		temp=temp.replace(",",""); //remove
		int fare =Integer.parseInt(temp);
		return(fare);			
	}
	public int getReturnFlightFare(int index)
	{
		/*WebElement e = returnflightslist.get(index).findElement(By.xpath(
				"descendant::div[@data-testid='spicesaver-flight-select-radio-button-1']"
				+"/following-sibiling::div"));*/
		WebElement e = returnflightslist.get(index).findElement(By.xpath("descendant::div[@data-testid='spicesaver-flight-select-radio-button-1']/following-sibling::div"));
		String temp = (String)driver.executeScript("return(arguments[0].childNodes[1].textContent);",e);
		temp=temp.replace(",","");
		int fare =Integer.parseInt(temp);
		return(fare);	
		
	}
	public List <Integer> getAlldepatureFlightsFares()
	{
		List<Integer> fares = new ArrayList<Integer>();
		for(WebElement flight:depatureflightslist)
		{
			WebElement e = flight.findElement(By.xpath("descendant::div[@data-testid='spicesaver-flight-select-radio-button-1']/following-sibling::div"));
			
			//WebElement e = flight.findElement(By.xpath("descendant::div[@data-testid='spicesaver-flight-select-radio-button-1']"
			//	+"/following-sibiling::div"));
			
			String temp = (String)driver.executeScript("return(arguments[0].childNodes[1].textContent);",e);
			temp=temp.replace(",","");
			int fare =Integer.parseInt(temp);
			fares.add(fare);
		}
		return(fares);
	}
	
	public List <Integer> getAllreturnFlightsFares()
	{
		List<Integer> fares = new ArrayList<Integer>();
		for(WebElement flight:returnflightslist)
		{
			WebElement e = flight.findElement(By.xpath("descendant::div[@data-testid='spicesaver-flight-select-radio-button-1']/following-sibling::div"));
			/*WebElement e = flight.findElement(By.xpath("descendant::div[@data-testid='spicesaver-flight-select-radio-button-1']"
					+"/following-sibiling::div"));*/
			String temp = (String)driver.executeScript("return(arguments[0].childNodes[1].textContent);",e);
			temp=temp.replace(",","");
			int fare =Integer.parseInt(temp);
			fares.add(fare);
		}
		return(fares);
	}
	public void selectLowestFaredDepatureFlight() throws Exception
	{
		List<Integer> fares =getAlldepatureFlightsFares();
		int flightrowindex=0;
		int lowestfare = fares.get(0);
		for(int i=1;i<fares.size();i++) //for 2nd fare to last fare
		{
			if(lowestfare>fares.get(i))
			{
				lowestfare = fares.get(i);
				flightrowindex=i;
			}
		}
		WebElement e = depatureflightslist.get(flightrowindex).findElement(By.xpath("descendant::div[@data-testid='spicesaver-flight-select-radio-button-1']"));
	//	System.out.println(lowestfare+"above scroll");// inserted by avi
		driver.executeScript("arguments[0].scrollIntoView()",e);
		System.out.println(lowestfare+" is the lowest fare in the depature flights");// inserted by avi
		Thread.sleep(3000);
		e.click();
		
				
	}
	public void selectHeighestFaredDepatureFlight() throws Exception
	{
		List<Integer> fares =getAlldepatureFlightsFares();
		int flightrowindex=0;
		int highestfare = fares.get(0);
		for(int i=1;i<fares.size();i++) //for 2nd fare to last fare
		{
			if(highestfare<fares.get(i))
			{
				highestfare = fares.get(i);
				flightrowindex=i;
			}
		}
	
		WebElement e = returnflightslist.get(flightrowindex).findElement(By.xpath("descendant::div[@data-testid='spicesaver-flight-select-radio-button-1']"));
		driver.executeScript("arguments[0].scrollIntoView()",e);
		System.out.println(highestfare+" is the highest fare in the depature flights");
		Thread.sleep(3000);
		e.click();			
	}
	public void selectLowestFaredReturnFlight() throws Exception
	{
		List<Integer> fares =getAllreturnFlightsFares();
		int flightrowindex=0;
		int lowestfare = fares.get(0);
		for(int i=1;i<fares.size();i++) //for 2nd fare to last fare
		{
			if(lowestfare>fares.get(i))
			{
				lowestfare = fares.get(i);
				flightrowindex=i;
			}
		}
		WebElement e = returnflightslist.get(flightrowindex).findElement(By.xpath("descendant::div[@data-testid='spicesaver-flight-select-radio-button-1']"));
		
		driver.executeScript("arguments[0].scrollIntoView()",e);
		System.out.println(lowestfare+" is the lowest fare in the return flights");
		Thread.sleep(3000);
		e.click();			
	}
	public void selectHeighestFaredReturnFlight() throws Exception
	{
		List<Integer> fares =getAllreturnFlightsFares();
		int flightrowindex=0;
		int highestfare = fares.get(0);
		for(int i=1;i<fares.size();i++) //for 2nd fare to last fare
		{
			if(highestfare<fares.get(i))
			{
				highestfare = fares.get(i);
				flightrowindex=i;
			}
		}
		WebElement e = returnflightslist.get(flightrowindex).findElement(By.xpath("descendant::div[@data-testid='spicesaver-flight-select-radio-button-1']"));
		
		driver.executeScript("arguments[0].scrollIntoView()",e);
		System.out.println(highestfare+ " is the highest fare in the return flights");
		Thread.sleep(3000);
		e.click();			
	}


	
}
